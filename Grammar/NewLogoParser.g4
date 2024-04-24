parser grammar NewLogoParser;
options { tokenVocab=NewLogoLexer; }

// Math:
sumOp
: PLUS
| MINUS;

mulOp
: MULTIPLY
| DIVIDE
| MODULO;

atom
: MINUS? NUMBER;

brExpression: LBRACKET expression RBRACKET;

mulExpression: (atom | brExpression | VARIABLE) (mulOp (atom | brExpression | VARIABLE))*;

expression: mulExpression (sumOp mulExpression)*;


// Boolean math:
boolConst
: TRUE
| FALSE;

compOp
: LESSER
| GREATER
| LESSER_EQUAL
| GREATER_EQUAL
| EQUAL
| NOT_EQUAL;

compExpression: (boolConst | VARIABLE) (compOp (boolConst | VARIABLE))?;

logicOp
: AND
| OR;

logicBrExpression: LBRACKET logicExpression RBRACKET;

logicExpression
: compExpression
| NOT? (expression | logicBrExpression) (logicOp expression)*;

// Variables:
varType
: INT
| BOOL
| CHAR
| STRING;

varDeclaration: varType VARIABLE;

value
: expression
| logicExpression
| STRING
| CHAR;

selfOp
: INC_SELF
| DEC_SELF
| MUL_SELF
| DIV_SELF;

varAssign: VARIABLE ((ASSIGN value) | selfOp expression);

incOrDec
: INCREMENT
| DECREMENT;

varIncrement: VARIABLE incOrDec;

// Functions:
argument: varType VARIABLE;

arguments: argument (COMMA argument)*;

funcDeclare: varType VARIABLE LBRACKET arguments RBRACKET LCURLY statement* RCURLY;

drawingFunction: FORWARD | RTURN | LTURN | LINECOL | LINEWIDTH | CHANGEBACK | CLEAR | ISBORDER;

function: VARIABLE | drawingFunction;

callArguments: value (COMMA value)*;

functionCall: function LBRACKET callArguments RBRACKET;

//Loops and Ifs
statement : expression | conditionalStatement | loopStatement | breakStatement | returnStatement ;

conditionalStatement : IF LBRACKET logicExpression RBRACKET LCURLY statement* RCURLY
           | IF LBRACKET logicExpression RBRACKET LCURLY statement* RCURLY ELSE LCURLY statement* RCURLY;

loopStatement : WHILE LBRACKET logicExpression RBRACKET LCURLY statement* RCURLY
         | REPEAT LBRACKET expression RBRACKET LCURLY statement* RCURLY;

breakStatement : BREAK;

returnStatement : RETURN expression;

printStatement : PRINT expression | PRINT logicExpression | PRINT STRING | PRINT CHAR ;
