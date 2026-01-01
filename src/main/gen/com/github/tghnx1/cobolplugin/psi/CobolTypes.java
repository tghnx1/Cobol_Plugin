// This is a generated file. Not intended for manual editing.
package com.github.tghnx1.cobolplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tghnx1.cobolplugin.psi.impl.*;

public interface CobolTypes {

  IElementType LINE = new CobolElementType("LINE");
  IElementType STATEMENT = new CobolElementType("STATEMENT");

  IElementType DATA = new CobolTokenType("DATA");
  IElementType DIVISION = new CobolTokenType("DIVISION");
  IElementType DOT = new CobolTokenType("DOT");
  IElementType IDENTIFICATION = new CobolTokenType("IDENTIFICATION");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType LINE_NUMBER = new CobolTokenType("LINE_NUMBER");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType PROCEDURE = new CobolTokenType("PROCEDURE");
  IElementType PROGRAM_ID = new CobolTokenType("PROGRAM_ID");
  IElementType RUN = new CobolTokenType("RUN");
  IElementType SECTION = new CobolTokenType("SECTION");
  IElementType STOP = new CobolTokenType("STOP");
  IElementType WORKING_STORAGE = new CobolTokenType("WORKING_STORAGE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == LINE) {
        return new LineImpl(node);
      }
      else if (type == STATEMENT) {
        return new StatementImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
