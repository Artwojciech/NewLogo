parser grammar NewLogoParser;
options { tokenVocab=NewLogoLexer; }

sumOp
: PLUS
| MINUS;

mulOp
: MULTIPLY
| DIVIDE
| MODULO;

atom: MINUS? NUMBER;

mulExpression
: atom (mulOp atom)*;

expression
: NUMBER
| mulExpression sumOp mulExpression;
