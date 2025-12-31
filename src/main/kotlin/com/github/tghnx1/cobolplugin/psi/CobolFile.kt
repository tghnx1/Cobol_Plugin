package com.github.tghnx1.cobolplugin.psi

import com.github.tghnx1.cobolplugin.CobolFileType
import com.github.tghnx1.cobolplugin.CobolLanguage
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.psi.FileViewProvider

class CobolFile(viewProvider: FileViewProvider)
    : PsiFileBase(viewProvider, CobolLanguage) {

    override fun getFileType() = CobolFileType

    override fun toString(): String = "Cobol File"
}
