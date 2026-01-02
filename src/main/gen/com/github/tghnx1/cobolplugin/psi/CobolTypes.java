// This is a generated file. Not intended for manual editing.
package com.github.tghnx1.cobolplugin.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import com.github.tghnx1.cobolplugin.psi.impl.*;

public interface CobolTypes {

  IElementType ITEM = new CobolElementType("ITEM");

  IElementType DOT = new CobolTokenType("DOT");
  IElementType EQUALS = new CobolTokenType("EQUALS");
  IElementType IDENTIFIER = new CobolTokenType("IDENTIFIER");
  IElementType LPAREN = new CobolTokenType("LPAREN");
  IElementType NUMBER = new CobolTokenType("NUMBER");
  IElementType RPAREN = new CobolTokenType("RPAREN");
  IElementType STRING_LITERAL = new CobolTokenType("STRING_LITERAL");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ITEM) {
        return new ItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
