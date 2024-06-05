lexer grammar NewLogoLexer;

// constants:
CHAR_CONST: '\''.'\'';
STRING_CONST: '"'(.)*?'"';
NUMBER: [0-9]+;
TRUE
: 'True'
| 'true';
FALSE
: 'False'
| 'false';

// loops:
REPEAT            : 'repeat';
WHILE           : 'while';
RETURN          : 'return';
BREAK           : 'break';
IF              : 'if';
ELSE            : 'else';

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
PRINT          : 'print';

// variable types:
INT: 'int';
CHAR: 'char';
STRING: 'string';
BOOL: 'bool';
VOID: 'void';

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