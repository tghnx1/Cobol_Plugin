package com.github.tghnx1.cobolplugin.psi

import com.github.tghnx1.cobolplugin.CobolLanguage
import com.intellij.psi.tree.IElementType

class CobolTokenType(debugName: String) : IElementType(debugName, CobolLanguage) {
    override fun toString(): String = "CobolTokenType." + super.toString()
}
