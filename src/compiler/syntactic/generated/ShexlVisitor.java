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

// Generated from C:/Users/Willy/Documents/github/thewilly/shex-lite/src/compiler/grammar\Shexl.g4 by ANTLR 4.8
package compiler.syntactic.generated;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ShexlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 *            operations with no return type.
 */
public interface ShexlVisitor<T> extends ParseTreeVisitor<T> {
    /**
     * Visit a parse tree produced by {@link ShexlParser#schema}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitSchema(ShexlParser.SchemaContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStatement(ShexlParser.StatementContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#definition_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitDefinition_statement(ShexlParser.Definition_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#base_definition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitBase_definition(ShexlParser.Base_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#start_definition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitStart_definition(ShexlParser.Start_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#prefix_definition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitPrefix_definition(ShexlParser.Prefix_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#shape_definition}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShape_definition(ShexlParser.Shape_definitionContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#import_statement}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitImport_statement(ShexlParser.Import_statementContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#shape_name}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShape_name(ShexlParser.Shape_nameContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#shape_invocation}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitShape_invocation(ShexlParser.Shape_invocationContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#constraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitConstraint(ShexlParser.ConstraintContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#triple_constraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitTriple_constraint(ShexlParser.Triple_constraintContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#node_constraint}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitNode_constraint(ShexlParser.Node_constraintContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#value_set_type}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitValue_set_type(ShexlParser.Value_set_typeContext ctx);

    /**
     * Visit a parse tree produced by {@link ShexlParser#cardinality}.
     *
     * @param ctx the parse tree
     * @return the visitor result
     */
    T visitCardinality(ShexlParser.CardinalityContext ctx);
}