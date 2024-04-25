lexer grammar NewLogoLexer;

// constants:
NUMBER: [0-9]+;
CHAR_CONST: '\''[a-zA-Z_]'\'';
STRING_CONST: '"'[a-zA-Z_]*'"';
TRUE
: 'True'
| 'true';
FALSE
: 'False'
| 'false';


// operators:
PLUS:           '+';
MINUS:          '-';
MULTIPLY:       '*';
DIVIDE:         '/';
MODULO:         '%';
EQUAL:          '==';
NOT_EQUAL:      '!=';
LESSER_EQUAL:   '<=';
GREATER_EQUAL:  '>=';
LESSER:         '<';
GREATER:        '>';
OR:             '||';
AND:            '&&';
NOT:            '!';
ASSIGN:         '=';
INC_SELF:       '+=';
DEC_SELF:       '-=';
MUL_SELF:       '*=';
DIV_SELF:       '/=';
INCREMENT:      '++';
DECREMENT:      '--';
COMMA:           ',';
SEMICOLON:       ';';

// variable:
VARIABLE: [a-zA-Z_][a-zA-Z0-9_]*;

// variable types:
INT: 'int';
CHAR: 'char';
STRING: 'string';
BOOL: 'bool';


// drawing:
FORWARD    : 'forward';
LTURN      : 'lturn';
RTURN      : 'rturn';
LINECOL   : 'linecol';
LINEWIDTH   : 'linewidth';
CHANGEBACK   : 'changeback';
CLEAR       : 'clear';
ISBORDER    : 'isborder';

// brackets:
LBRACKET        : '(';
RBRACKET        : ')';
LCURLY          : '{';
RCURLY          : '}';

// spaces:
WHITESPACE: [ \t]+ -> skip;
NEWLINE: ('\r\n'|'\n'|'\r') -> skip;

// loops:
REPEAT            : 'repeat';
WHILE           : 'while';
RETURN          : 'return';
BREAK           : 'break';
IF              : 'if';
ELSE            : 'else';
PRINT          : 'print';

// comments
COMMENT: '//' .*? NEWLINE -> skip;