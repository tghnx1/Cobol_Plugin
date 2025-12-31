package com.github.tghnx1.cobolplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon

object CobolFileType : LanguageFileType(CobolLanguage) {

    override fun getName(): String = "Cobol"

    override fun getDescription(): String = "Cobol language file"

    override fun getDefaultExtension(): String = "cob"

    override fun getIcon(): Icon = CobolIcons.FILE

}
