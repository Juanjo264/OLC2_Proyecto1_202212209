grammar Language;

options { caseInsensitive = false; }

TRUE: 'true';
FALSE: 'false';
INT: [0-9]+;
FLOAT: [0-9]+'.'[0-9]+;
WS: [ \t\r\n]+ -> channel(HIDDEN);
CARACTER : '\'' . '\'' ; 
CADENA: ('"'|'\'') (~["\r\n] | '""')* ('"'|'\'') ;
ID: [a-zA-Z_][a-zA-Z0-9_]*;


PIZQ: '(';
PDER: ')';
LLAVE_ABRE: '{';
LLAVE_CIERRA: '}';
CORCHETE_ABRE: '[';
CORCHETE_CIERRA: ']';

IGUAL: '=';
DOSPUNTOS_IGUAL: ':=';
MASIGUAL: '+=';
MENOSIGUAL: '-=';
MASMAS: '++';
MENOSMENOS: '--';

LLINEAC: '//' ~[\r\n]* -> skip;
MULTILINEAC: '/*' .*? '*/' -> skip;


program: listainstrucciones* ;

listainstrucciones : variables |instruccion ;

variables: 'var' ID tipo (IGUAL expr)?  #declaracionVar 
| 'var' ID '[]' tipo #declaracionSlicevacio
| ID IGUAL '[]' tipo '{' expr (','expr)* '}' ';' #declaracionSlice
;

instruccion:  expr  #ExprecionInstruccion 
| print #PrintInstruccion
|	asignacion								# Assign
| '{' listainstrucciones* '}' #BloqueInstrucciones
| 'if' '(' expr ')' instruccion ('else' instruccion)? #IfInstruccion
| 'while' '(' expr ')' instruccion #WhileInstruccion
| 'switch'  expr  '{' cases* (defaultCase)? '}'  #SwitchInstruccion
| for  #ForInstruccion

;

for: 'for' expr '{' listainstrucciones* '}' #Forcondicion
| 'for' (asignacion | variables)? ';' expr? ';' expr? (MASMAS | MENOSMENOS)* '{' listainstrucciones* '}' #Forincicializacion
| 'for' ID ',' ID DOSPUNTOS_IGUAL 'range' ID '{' listainstrucciones* '}'  #ForRange
;

cases:
    'case' expr ':' listainstrucciones  
    ;

defaultCase:
    'default' ':' listainstrucciones  
    ;

expr:
	'(' expr ')'			# Parens
	| '[' expr ']' #Corchetes
	| '!' right=expr #operadorNegacion
	|'-' expr                   	  # Negate
	| expr op =  ('*' | '/') expr	# MulDiv
	| expr op = '%' expr	# Mod
	| expr  op = ('+' | '-') expr	# AddSub
	| expr	op = ('>' | '<' | '>=' | '<=' ) expr	# Relational
	| expr	op = ('==' | '!=') expr	# Equalitys
	| expr	op = ('&&' | '||' ) expr	# Logicos
	| FLOAT					      # Float
	| INT					      # Int
	| TRUE #boleanTrueExpresion
	| FALSE #boleanFalseExpresion
	| CARACTER #caracterExpresion
	| CADENA #cadenaExpresion
	| ID #Idexpresion
; 
						

asignacion: ID signo=(IGUAL | DOSPUNTOS_IGUAL) expr #asignarVar 
					|ID signo=(MASIGUAL | MENOSIGUAL) expr #incremento
					;

print: 'prt' PIZQ impresiones PDER ;

impresiones: impresiones ',' expr
	| expr;

if: 'if'  expr  LLAVE_ABRE listainstrucciones LLAVE_CIERRA ('else' LLAVE_ABRE listainstrucciones LLAVE_CIERRA)? 
  | 'if'  expr  LLAVE_ABRE listainstrucciones LLAVE_CIERRA 'else' if;



tipo: 'int'
| 'float64'
| 'string'
| 'bool'
| 'rune'
;




