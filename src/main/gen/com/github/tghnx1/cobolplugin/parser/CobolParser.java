// This is a generated file. Not intended for manual editing.
package com.github.tghnx1.cobolplugin.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static com.github.tghnx1.cobolplugin.psi.CobolTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class CobolParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return cobolFile(b, l + 1);
  }

  /* ********************************************************** */
  // item*
  static boolean cobolFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "cobolFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "cobolFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //         | NUMBER
  //         | DOT
  //         | EQUALS
  //         | STRING_LITERAL
  //         | LPAREN
  //         | RPAREN
  public static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEM, "<item>");
    r = consumeToken(b, IDENTIFIER);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, DOT);
    if (!r) r = consumeToken(b, EQUALS);
    if (!r) r = consumeToken(b, STRING_LITERAL);
    if (!r) r = consumeToken(b, LPAREN);
    if (!r) r = consumeToken(b, RPAREN);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
