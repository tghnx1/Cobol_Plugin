package com.github.tghnx1.cobolplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.github.tghnx1.cobolplugin.lexer.CobolLexerAdapter
import com.github.tghnx1.cobolplugin.parser.CobolParser
import com.github.tghnx1.cobolplugin.psi.CobolFile
import com.github.tghnx1.cobolplugin.psi.CobolTypes


class CobolParserDefinition : ParserDefinition {

    companion object {
        val FILE = IFileElementType(CobolLanguage)
    }

    override fun createLexer(project: Project?) = CobolLexerAdapter()

    override fun createParser(project: Project?): PsiParser = CobolParser()

    override fun getFileNodeType() = FILE

    override fun getWhitespaceTokens() = TokenSet.create(TokenType.WHITE_SPACE)

    override fun getCommentTokens() = TokenSet.EMPTY

    override fun getStringLiteralElements() = TokenSet.EMPTY

    override fun createElement(node: ASTNode): PsiElement =
        CobolTypes.Factory.createElement(node)


    override fun createFile(viewProvider: FileViewProvider): PsiFile =
        CobolFile(viewProvider)
}
