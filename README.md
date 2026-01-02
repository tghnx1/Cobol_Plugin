# Cobol IntelliJ Plugin (Minimal Subset)

<!-- Plugin description -->
Minimal IntelliJ IDEA plugin providing basic COBOL language support.

Features:
- COBOL file type recognition (.cob)
- Lexer and parser generated via Grammar-Kit and JFlex
- Basic PSI structure
- Minimal syntax highlighting (identifiers, numbers, strings, operators)

This plugin is implemented as a test task and does not aim to be a full COBOL implementation.
<!-- Plugin description end -->

This project implements a **minimal IntelliJ IDEA plugin** that supports parsing and syntax highlighting for a **minimal subset of COBOL**, as required by **Task #2**.

The goal of the assignment is **not** to implement full COBOL support, but to demonstrate understanding of the IntelliJ language plugin pipeline:
lexer → parser → PSI → syntax highlighting.

---

## Implemented Features

### Language Support
- Custom `Cobol` language definition
- File type support for `.cob` and `.cbl`

### Lexer
- Implemented using **JFlex**
- Tokenizes the minimal set required to parse the provided COBOL example:
  - `NUMBER`
  - `IDENTIFIER`
  - `STRING_LITERAL`
  - `DOT`
  - `EQUALS`
  - `LPAREN`, `RPAREN`

### Parser & Grammar
- Grammar implemented using **IntelliJ Grammar Kit**
- Minimal grammar that correctly parses the provided COBOL code
- Line numbers (`01`, `02`, etc.) are parsed as part of the code, as required

### Syntax Highlighting
- Implemented via `SyntaxHighlighter`
- Highlighted elements:
  - Numbers
  - String literals
  - Identifiers
- Operators and punctuation use default styling

---

## Supported COBOL Example

The plugin correctly parses and highlights the following code:

```cobol
01 IDENTIFICATION DIVISION.
02 PROGRAM-ID. HELLO.
03 DATA DIVISION.
04 WORKING-STORAGE SECTION.
05 01 WS-A PIC 9(2) VALUE 0.
06 PROCEDURE DIVISION.
07 A-PARA.
08 PERFORM B-PARA VARYING WS-A FROM 2 BY 2 UNTIL WS-A=12
09 STOP RUN.
10 B-PARA.
11 DISPLAY 'B-PARA ' WS-A.
12 DISPLAY 'B-PARA'.
```

---

## Project Structure

```
src/
 └─ main/
     ├─ kotlin/
     │   └─ com/github/tghnx1/cobolplugin/
     │       ├─ highlighting/
     │       ├─ psi/
     │       ├─ CobolLanguage.kt
     │       ├─ CobolFileType.kt
     │       ├─ CobolLexerAdapter.kt
     │       └─ CobolParserDefinition.kt
     ├─ gen/        (generated parser/PSI)
     ├─ grammars/   (.bnf grammar)
     ├─ jflex/      (.flex lexer)
     └─ resources/
         └─ META-INF/plugin.xml
```

---

## Constraints & Notes

- Only libraries and tools from the IntelliJ tutorial are used
- No external or ready-made COBOL grammars were used
- The implementation intentionally remains **minimal**
- The focus is correctness, clarity, and alignment with the assignment requirements

---

## How to Run

1. Open the project in IntelliJ IDEA
2. Run **Run Plugin**
3. In the sandbox IDE, open a `.cob` or `.cbl` file
4. Paste the provided COBOL example and verify parsing and highlighting

---

## Assignment Context

This project was developed as a solution for **Task #2**:
> *Implement a minimal IntelliJ IDEA plugin that can parse a minimal subset of Cobol.*

---
