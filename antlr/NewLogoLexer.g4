lexer grammar NewLogoLexer;

// loops:
REPEAT            : 'repeat';
WHILE           : 'while';
RETURN          : 'return';
BREAK           : 'break';
IF              : 'if';
ELSE            : 'else';
PRINT          : 'print';

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

// drawing:
FORWARD    : 'forward';
LTURN      : 'lturn';
RTURN      : 'rturn';
LINECOL   : 'linecol';
LINEWIDTH   : 'linewidth';
CHANGEBG   : 'changebg';
CLEAR       : 'clear';
ISBORDER    : 'isborder';

// constants:
NUMBER: [0-9]+;
CHAR_CONST: '\''[a-zA-Z0-9_!?.]'\'';
STRING_CONST: '"'[a-zA-Z0-9_!?.]*'"';
TRUE
: 'True'
| 'true';
FALSE
: 'False'
| 'false';

// variable types:
INT: 'int';
CHAR: 'char';
STRING: 'string';
BOOL: 'bool';

// brackets:
LBRACKET        : '(';
RBRACKET        : ')';
LCURLY          : '{';
RCURLY          : '}';

// variable:
VARIABLE: [a-zA-Z_][a-zA-Z0-9_]*;

// spaces:
WHITESPACE: [ \t]+ -> skip;
NEWLINE: ('\r\n'|'\n'|'\r') -> skip;

// comments
COMMENT: '//' .*? NEWLINE -> skip;