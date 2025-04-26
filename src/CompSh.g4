grammar CompSh;

program: (statement ';'?)* EOF;

statement:
    declaration
    | assignment
    | pipeline
    | input
    | output
    | condition
    | loop
    ;

// Declarations
declaration: ID (COMMA ID)* COLON TYPE;

// Assignments
assignment:
    expr PIPE (STORE)? (IN)? ID (COLON TYPE)?;

// Input
input: STDIN (STRING)? PIPE STORE (IN)? ID (COLON TYPE)?;

// Output
output: (expr | pipeline) (channel_selector)? PIPE (STDOUT | STDERR);

// Execute pipeline with channels/redirects
pipeline:
    (command | expr) (PIPE (channel_selector)? (command | expr))*
    ;

redirect: src=CHANNEL '^' dest=CHANNEL;

command:
    execute_cmd
    | ish_cmd
    | store_cmd
    | redirect 
    ;

// Channel selectors
channel_selector: (PIPE | '&' | '?' | '$');

// Execute external program
execute_cmd: EXCLAMATION (STRING | ID) EXCLAMATION (LBRACK expr_list? RBRACK)?;

// Store command
store_cmd: STORE (IN)? ID (COLON TYPE)?;

// Execute ISH program
ish_cmd: '!!' (STRING | ID) '!!';


// Expressions
expr:
    sign=('+'|'-'|'not') expr           #ExprUnary
    | expr op=('*'|'/') expr            #ExprMultDiv
    | expr op=('+'|'-') expr            #ExprAddSub
    | expr op=('>'|'<'|'>='|'<=') expr  #ExprRelational
    | expr op=('='|'/=') expr           #ExprRelational
    | expr 'and' expr                   #ExprAndOr
    | expr 'or' expr                    #ExprAndOr
    | TYPE '(' expr ')'                 #ExprConvertType
    | ID                                #ExprID
    | BOOLEAN                           #ExprBoolean
    | STRING                            #ExprString
    | INTEGER                           #ExprInteger
    | REAL                              #ExprReal
    | '(' expr ')'                      #ExprPar
    ;

// Control structures
condition:
    IF expr THEN (statement SEMI?)* (ELSE (statement SEMI?)*)? END
    ;

loop:
    LOOP (statement SEMI?)* UNTIL expr END                           #LoopUntil
    | LOOP WHILE expr DO (statement SEMI?)* END                      #LoopWhile
    | LOOP (statement SEMI?)+ WHILE expr DO (statement SEMI?)* END    #LoopWhileDo
    ;

expr_list: expr (COMMA expr)*;

// Lexer rules

// Separators
PIPE: '|';
EXCLAMATION: '!';
LBRACK: '[';
RBRACK: ']';
COMMA: ',';
COLON: ':';
SEMI: ';';

// Types
TYPE: 'text' | 'integer' | 'real' | 'program';

// Keywords
STORE: 'store';
IN: 'in';
STDIN: 'stdin';
STDOUT: 'stdout';
STDERR: 'stderr';
IF: 'if';
THEN: 'then';
ELSE: 'else';
END: 'end';
LOOP: 'loop';
WHILE: 'while';
DO: 'do';
UNTIL: 'until';

// Operators
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';
EQ: '=';
NE: '/=';
LT: '<';
LE: '<=';
GT: '>';
GE: '>=';
AND: 'and';
OR: 'or';
NOT: 'not';



// Boolean
BOOLEAN: 'true' | 'false';

// Identifier
ID : LETTER (LETTER | DIGIT)*;

// Numbers
INTEGER: DIGIT+;
REAL: DIGIT+ (. DIGIT+)?; 

// Characters
STRING: '"' (ESC | .)*? '"';

// Channel
CHANNEL: [$|&?*-];


// Fragments
fragment LETTER: [a-zA-Z_];
fragment DIGIT: [0-9];
fragment ESC: '\\"';


// Comments
LINE_COMMENT: '#' .*? '\n' -> skip;
COMMENT: '#(' (COMMENT | .)*? '#)' -> skip; //allow multi-line comments


// Ignore white space
WS: [ \t\n\r]+ -> skip;














