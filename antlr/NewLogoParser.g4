parser grammar NewLogoParser;
options { tokenVocab=NewLogoLexer; }

program: funcDefinition* statement*;

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

brExpression: LBRACKET mathExpression RBRACKET;

mulExpression: (atom | brExpression | variable) (mulOp (atom | brExpression | variable))*;

mathExpression: mulExpression (sumOp mulExpression)*;


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

compVal
: NUMBER
| boolConst
| variable
| STRING_CONST
| CHAR_CONST
| mathExpression;

compExpression
: compVal compOp compVal;

logicOp
: AND
| OR;

logicBrExpression: LBRACKET logicExpression RBRACKET;

logicExpression: NOT? (compExpression | logicBrExpression | boolConst) (logicOp logicExpression)*;

// variables:
variable : VARIABLE;

varType
: INT
| BOOL
| CHAR
| STRING;

varDeclaration: varType variable (ASSIGN value)?;

value
: STRING_CONST
| CHAR_CONST
| variable
| mathExpression
| logicExpression;

selfOp
: INC_SELF
| DEC_SELF
| MUL_SELF
| DIV_SELF;

varAssign: variable ((ASSIGN value) | selfOp mathExpression);

incOrDec
: INCREMENT
| DECREMENT;

varIncrement: variable incOrDec;

// Functions:
argument: varType variable;

arguments: argument (COMMA argument)*;

funcDefinition: varType VARIABLE LBRACKET arguments RBRACKET LCURLY statement* RCURLY;

drawingFunction: FORWARD | RTURN | LTURN | LINECOL | LINEWIDTH | CHANGEBG | CLEAR | ISBORDER | PRINT;

function: VARIABLE | drawingFunction;

callArguments: (value (COMMA value)*)?;

functionCall: function LBRACKET callArguments RBRACKET;

//Loops and Ifs
statement
: (mathExpression | conditionalStatement | loopStatement | breakStatement | returnStatement | functionCall | varDeclaration | varAssign) SEMICOLON
| (conditionalStatement | loopStatement);

conditionalStatement : IF LBRACKET logicExpression RBRACKET LCURLY statement* RCURLY (ELSE LCURLY statement* RCURLY)?;

loopStatement : WHILE LBRACKET logicExpression RBRACKET LCURLY statement* RCURLY
         | REPEAT LBRACKET mathExpression RBRACKET LCURLY statement* RCURLY;

breakStatement : BREAK;

returnStatement : RETURN (mathExpression | conditionalStatement | STRING | CHAR | variable);

printStatement : PRINT mathExpression | PRINT logicExpression | PRINT STRING | PRINT CHAR ;
