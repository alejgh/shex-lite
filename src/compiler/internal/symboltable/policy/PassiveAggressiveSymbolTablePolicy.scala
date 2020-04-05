/*
 * Short version for non-lawyers:
 *
 * The ShEx Lite Project is dual-licensed under GNU 3.0 and
 * MIT terms.
 *
 * Longer version:
 *
 * Copyrights in the ShEx Lite project are retained by their contributors. No
 * copyright assignment is required to contribute to the ShEx Lite project.
 *
 * Some files include explicit copyright notices and/or license notices.
 * For full authorship information, see the version control history.
 *
 * Except as otherwise noted (below and/or in individual files), ShEx Lite is
 * licensed under the GNU, Version 3.0 <LICENSE-GNU> or
 * <https://choosealicense.com/licenses/gpl-3.0/> or the MIT license
 * <LICENSE-MIT> or <http://opensource.org/licenses/MIT>, at your option.
 *
 * The ShEx Lite Project includes packages written by third parties.
 */

package compiler.internal.symboltable.policy

import java.util.Objects

import compiler.ast._
import compiler.internal.error._
import compiler.internal.symboltable.SymbolTable

private[compiler] object PassiveAggressiveSymbolTablePolicy extends SymbolTablePolicy {

  /**
   * Projects an insert action over the given symbol table.
   *
   * @param symbolTable to project the insert action over.
   * @param node        to insert in the given st.
   * @return an option object that if contains something means that the action will produce an event.
   */
  override def projectInsertAction(symbolTable: SymbolTable, node: ASTNode): Option[ErrType] = node match {
    case base: BaseDeclaration => projectSetBase(symbolTable, base)
    case start: StartDeclaration => projectSetStart(symbolTable, start)
    case prefix: PrefixDeclaration => projectInsertPrefix(symbolTable, prefix)
    case shape: ShapeDeclaration => projectInsertShape(symbolTable, shape)
    case _ => Option(NonValidActionErr)
  }

  private def projectSetBase(symbolTable: SymbolTable, node: BaseDeclaration): Option[ErrType] = {
    if(!symbolTable.getBase.getOrElse(null).iri.value.equals(symbolTable.DEFAULT_BASE)) {
      Option(BaseOverrideErr)
    } else {
      Option.empty
    }
  }

  private def projectSetStart(symbolTable: SymbolTable, node: StartDeclaration): Option[ErrType] = symbolTable.getStart match {
    case Right(_) => Option(StartOverrideErr)
    case _ => Option.empty
  }


  private def projectInsertPrefix(symbolTable: SymbolTable, prefix: PrefixDeclaration): Option[ErrType] =
    symbolTable.getPrefix(prefix.name).isRight match {
      case true => Option(PrefixOverrideErr)
      case false => Option.empty
  }

  private def projectInsertShape(symbolTable: SymbolTable, shape: ShapeDeclaration): Option[ErrType] =
    symbolTable.getShape(shape.name.content).isRight match {
      case true => Option(ShapeOverrideErr)
      case false => Option.empty
    }
}
