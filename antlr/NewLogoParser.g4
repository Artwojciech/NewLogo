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

string: STRING_CONST (PLUS STRING_CONST|CHAR_CONST)*
| CHAR_CONST PLUS (STRING_CONST|CHAR_CONST)+;

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

compVal:
| boolConst
| variable
| string
| CHAR_CONST
| mathExpression
| functionCall;

compExpression
: compVal compOp compVal;

logicBrExpression: LBRACKET logicExpression RBRACKET;

logicAndExpression: NOT? (compExpression | logicBrExpression | boolConst | variable) (AND logicAndExpression)*;

logicExpression: NOT? logicAndExpression (OR logicAndExpression)*;

// variables:
variable : VARIABLE;

varType
: INT
| BOOL
| CHAR
| STRING;

varDeclaration: varType variable (ASSIGN value)?;

value
: string
| CHAR_CONST
| mathExpression
| logicExpression
| functionCall;

selfOp
: INC_SELF
| DEC_SELF
| MUL_SELF
| DIV_SELF;

varAssign: variable ASSIGN value;

varSelfOp: variable selfOp value;

incOrDec
: INCREMENT
| DECREMENT;

varIncrement: variable incOrDec;

// Functions:
argument: varType variable;

arguments: argument (COMMA argument)*;

funcDefinition: (varType | VOID) VARIABLE LBRACKET arguments RBRACKET LCURLY statementBlock RCURLY;

drawingFunction: FORWARD | RTURN | LTURN | LINECOL | LINEWIDTH | CHANGEBG | CLEAR | ISBORDER | PRINT;

function: VARIABLE | drawingFunction;

callArguments: (value (COMMA value)*)?;

functionCall: function LBRACKET callArguments RBRACKET;

//Loops and Ifs
statement
: (mathExpression | conditionalStatement | loopStatement | breakStatement | returnStatement | functionCall | varDeclaration | varAssign | varIncrement | varSelfOp) SEMICOLON
| (conditionalStatement | loopStatement);

statementBlock: statement*;

conditionalStatement : IF LBRACKET value RBRACKET LCURLY statementBlock RCURLY (ELSE LCURLY statementBlock RCURLY)?;

whileLoop : WHILE LBRACKET value RBRACKET LCURLY statementBlock RCURLY;

repeatLoop : REPEAT LBRACKET value RBRACKET LCURLY statementBlock RCURLY;

loopStatement : whileLoop | repeatLoop;

breakStatement : BREAK;

returnStatement : RETURN value;
