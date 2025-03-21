// Generated from /home/juanjo/compi2/OLC2_Proyecto1_202212209/Proyecto 1/api/Language.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class LanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		TRUE=46, FALSE=47, INT=48, FLOAT=49, WS=50, CARACTER=51, CADENA=52, ID=53, 
		PIZQ=54, PDER=55, LLAVE_ABRE=56, LLAVE_CIERRA=57, CORCHETE_ABRE=58, CORCHETE_CIERRA=59, 
		IGUAL=60, DOSPUNTOS_IGUAL=61, MASIGUAL=62, MENOSIGUAL=63, LLINEAC=64, 
		MULTILINEAC=65;
	public static final int
		RULE_program = 0, RULE_listainstrucciones = 1, RULE_variables = 2, RULE_fila = 3, 
		RULE_structdcl = 4, RULE_structBody = 5, RULE_funcdlc = 6, RULE_params = 7, 
		RULE_param = 8, RULE_instruccion = 9, RULE_cases = 10, RULE_defaultCase = 11, 
		RULE_expr = 12, RULE_camposStruct = 13, RULE_campoStruct = 14, RULE_call = 15, 
		RULE_args = 16, RULE_asignacion = 17, RULE_print = 18, RULE_impresiones = 19, 
		RULE_if = 20, RULE_tipo = 21;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "listainstrucciones", "variables", "fila", "structdcl", "structBody", 
			"funcdlc", "params", "param", "instruccion", "cases", "defaultCase", 
			"expr", "camposStruct", "campoStruct", "call", "args", "asignacion", 
			"print", "impresiones", "if", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'[]'", "','", "'[][]'", "'type'", "'struct'", "'func'", 
			"'break'", "'continue'", "'return'", "'if'", "'else'", "'while'", "'switch'", 
			"'for'", "';'", "'range'", "'case'", "':'", "'default'", "'!'", "'-'", 
			"'.'", "'*'", "'/'", "'%'", "'+'", "'>'", "'<'", "'>='", "'<='", "'=='", 
			"'!='", "'&&'", "'||'", "'new'", "'++'", "'--'", "'nil'", "'fmt.Println'", 
			"'int'", "'float64'", "'string'", "'bool'", "'rune'", "'true'", "'false'", 
			null, null, null, null, null, null, "'('", "')'", "'{'", "'}'", "'['", 
			"']'", "'='", "':='", "'+='", "'-='"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TRUE", "FALSE", 
			"INT", "FLOAT", "WS", "CARACTER", "CADENA", "ID", "PIZQ", "PDER", "LLAVE_ABRE", 
			"LLAVE_CIERRA", "CORCHETE_ABRE", "CORCHETE_CIERRA", "IGUAL", "DOSPUNTOS_IGUAL", 
			"MASIGUAL", "MENOSIGUAL", "LLINEAC", "MULTILINEAC"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Language.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106891840399142818L) != 0)) {
				{
				{
				setState(44);
				listainstrucciones();
				}
				}
				setState(49);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListainstruccionesContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public StructdclContext structdcl() {
			return getRuleContext(StructdclContext.class,0);
		}
		public FuncdlcContext funcdlc() {
			return getRuleContext(FuncdlcContext.class,0);
		}
		public ListainstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listainstrucciones; }
	}

	public final ListainstruccionesContext listainstrucciones() throws RecognitionException {
		ListainstruccionesContext _localctx = new ListainstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listainstrucciones);
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				instruccion();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				structdcl();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				funcdlc();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariablesContext extends ParserRuleContext {
		public VariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variables; }
	 
		public VariablesContext() { }
		public void copyFrom(VariablesContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionSlicevacioContext extends VariablesContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public DeclaracionSlicevacioContext(VariablesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionImplicitaContext extends VariablesContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode DOSPUNTOS_IGUAL() { return getToken(LanguageParser.DOSPUNTOS_IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionImplicitaContext(VariablesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionSliceContext extends VariablesContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode DOSPUNTOS_IGUAL() { return getToken(LanguageParser.DOSPUNTOS_IGUAL, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public DeclaracionSliceContext(VariablesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVarContext extends VariablesContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DeclaracionVarContext(VariablesContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionSlicemultiContext extends VariablesContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode DOSPUNTOS_IGUAL() { return getToken(LanguageParser.DOSPUNTOS_IGUAL, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public List<FilaContext> fila() {
			return getRuleContexts(FilaContext.class);
		}
		public FilaContext fila(int i) {
			return getRuleContext(FilaContext.class,i);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public DeclaracionSlicemultiContext(VariablesContext ctx) { copyFrom(ctx); }
	}

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			int _alt;
			setState(103);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new DeclaracionVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				match(T__0);
				setState(57);
				match(ID);
				setState(58);
				tipo();
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(59);
					match(IGUAL);
					setState(60);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new DeclaracionImplicitaContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(ID);
				setState(64);
				match(DOSPUNTOS_IGUAL);
				setState(65);
				expr(0);
				}
				break;
			case 3:
				_localctx = new DeclaracionSlicevacioContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				match(T__0);
				setState(67);
				match(ID);
				setState(68);
				match(T__1);
				setState(69);
				tipo();
				}
				break;
			case 4:
				_localctx = new DeclaracionSliceContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(70);
				match(ID);
				setState(71);
				match(DOSPUNTOS_IGUAL);
				setState(72);
				match(T__1);
				setState(73);
				tipo();
				setState(74);
				match(LLAVE_ABRE);
				setState(75);
				expr(0);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(76);
					match(T__2);
					setState(77);
					expr(0);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(83);
				match(LLAVE_CIERRA);
				}
				break;
			case 5:
				_localctx = new DeclaracionSlicemultiContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(85);
				match(ID);
				setState(86);
				match(DOSPUNTOS_IGUAL);
				setState(87);
				match(T__3);
				setState(88);
				tipo();
				setState(89);
				match(LLAVE_ABRE);
				setState(90);
				fila();
				setState(95);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(91);
						match(T__2);
						setState(92);
						fila();
						}
						} 
					}
					setState(97);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(98);
					match(T__2);
					}
				}

				setState(101);
				match(LLAVE_CIERRA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FilaContext extends ParserRuleContext {
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public FilaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fila; }
	}

	public final FilaContext fila() throws RecognitionException {
		FilaContext _localctx = new FilaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_fila);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			match(LLAVE_ABRE);
			setState(106);
			expr(0);
			setState(111);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(107);
					match(T__2);
					setState(108);
					expr(0);
					}
					} 
				}
				setState(113);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(115);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(114);
				match(T__2);
				}
			}

			setState(117);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructdclContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public List<StructBodyContext> structBody() {
			return getRuleContexts(StructBodyContext.class);
		}
		public StructBodyContext structBody(int i) {
			return getRuleContext(StructBodyContext.class,i);
		}
		public StructdclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structdcl; }
	}

	public final StructdclContext structdcl() throws RecognitionException {
		StructdclContext _localctx = new StructdclContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_structdcl);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			match(T__4);
			setState(120);
			match(ID);
			setState(121);
			match(T__5);
			setState(122);
			match(LLAVE_ABRE);
			setState(126);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9007199254741122L) != 0)) {
				{
				{
				setState(123);
				structBody();
				}
				}
				setState(128);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(129);
			match(LLAVE_CIERRA);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StructBodyContext extends ParserRuleContext {
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public FuncdlcContext funcdlc() {
			return getRuleContext(FuncdlcContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public StructBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_structBody; }
	}

	public final StructBodyContext structBody() throws RecognitionException {
		StructBodyContext _localctx = new StructBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_structBody);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(131);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				funcdlc();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(133);
				match(ID);
				setState(134);
				tipo();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncdlcContext extends ParserRuleContext {
		public List<TerminalNode> PIZQ() { return getTokens(LanguageParser.PIZQ); }
		public TerminalNode PIZQ(int i) {
			return getToken(LanguageParser.PIZQ, i);
		}
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public List<TerminalNode> PDER() { return getTokens(LanguageParser.PDER); }
		public TerminalNode PDER(int i) {
			return getToken(LanguageParser.PDER, i);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public FuncdlcContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcdlc; }
	}

	public final FuncdlcContext funcdlc() throws RecognitionException {
		FuncdlcContext _localctx = new FuncdlcContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_funcdlc);
		int _la;
		try {
			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(T__6);
				setState(138);
				match(PIZQ);
				setState(139);
				match(ID);
				setState(140);
				match(ID);
				setState(141);
				match(PDER);
				setState(142);
				match(ID);
				setState(143);
				match(PIZQ);
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(144);
					params();
					}
				}

				setState(147);
				match(PDER);
				setState(149);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9075918731476992L) != 0)) {
					{
					setState(148);
					tipo();
					}
				}

				setState(151);
				match(LLAVE_ABRE);
				setState(155);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106891840399142818L) != 0)) {
					{
					{
					setState(152);
					listainstrucciones();
					}
					}
					setState(157);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(158);
				match(LLAVE_CIERRA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(159);
				match(T__6);
				setState(160);
				match(ID);
				setState(161);
				match(PIZQ);
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(162);
					params();
					}
				}

				setState(165);
				match(PDER);
				setState(167);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9075918731476992L) != 0)) {
					{
					setState(166);
					tipo();
					}
				}

				setState(169);
				match(LLAVE_ABRE);
				setState(173);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106891840399142818L) != 0)) {
					{
					{
					setState(170);
					listainstrucciones();
					}
					}
					setState(175);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(176);
				match(LLAVE_CIERRA);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamsContext extends ParserRuleContext {
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_params);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			param();
			setState(184);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(180);
				match(T__2);
				setState(181);
				param();
				}
				}
				setState(186);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParamContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_param);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(ID);
			setState(188);
			tipo();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
	 
		public InstruccionContext() { }
		public void copyFrom(InstruccionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForincicializacionContext extends InstruccionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public ForincicializacionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BloqueInstruccionesContext extends InstruccionContext {
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public BloqueInstruccionesContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForCondicionContext extends InstruccionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ForCondicionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ReturnInstruccionContext extends InstruccionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ReturnInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class WhileInstruccionContext extends InstruccionContext {
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public WhileInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeContext extends InstruccionContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public TerminalNode DOSPUNTOS_IGUAL() { return getToken(LanguageParser.DOSPUNTOS_IGUAL, 0); }
		public InstruccionContext instruccion() {
			return getRuleContext(InstruccionContext.class,0);
		}
		public ForRangeContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BreakInstruccionContext extends InstruccionContext {
		public BreakInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ContinueInstruccionContext extends InstruccionContext {
		public ContinueInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprecionInstruccionContext extends InstruccionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprecionInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PrintInstruccionContext extends InstruccionContext {
		public PrintContext print() {
			return getRuleContext(PrintContext.class,0);
		}
		public PrintInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AssignContext extends InstruccionContext {
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public AssignContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SwitchInstruccionContext extends InstruccionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public List<CasesContext> cases() {
			return getRuleContexts(CasesContext.class);
		}
		public CasesContext cases(int i) {
			return getRuleContext(CasesContext.class,i);
		}
		public DefaultCaseContext defaultCase() {
			return getRuleContext(DefaultCaseContext.class,0);
		}
		public SwitchInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IfInstruccionContext extends InstruccionContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public IfInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_instruccion);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,25,_ctx) ) {
			case 1:
				_localctx = new ExprecionInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				expr(0);
				}
				break;
			case 2:
				_localctx = new BreakInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				match(T__7);
				}
				break;
			case 3:
				_localctx = new ContinueInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(192);
				match(T__8);
				}
				break;
			case 4:
				_localctx = new ReturnInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(193);
				match(T__9);
				setState(195);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(194);
					expr(0);
					}
					break;
				}
				}
				break;
			case 5:
				_localctx = new PrintInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(197);
				print();
				}
				break;
			case 6:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(198);
				asignacion();
				}
				break;
			case 7:
				_localctx = new BloqueInstruccionesContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(199);
				match(LLAVE_ABRE);
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106891840399142818L) != 0)) {
					{
					{
					setState(200);
					listainstrucciones();
					}
					}
					setState(205);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(206);
				match(LLAVE_CIERRA);
				}
				break;
			case 8:
				_localctx = new IfInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(207);
				match(T__10);
				setState(208);
				expr(0);
				setState(209);
				instruccion();
				setState(212);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(210);
					match(T__11);
					setState(211);
					instruccion();
					}
					break;
				}
				}
				break;
			case 9:
				_localctx = new WhileInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(214);
				match(T__12);
				setState(215);
				match(PIZQ);
				setState(216);
				expr(0);
				setState(217);
				match(PDER);
				setState(218);
				instruccion();
				}
				break;
			case 10:
				_localctx = new SwitchInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(220);
				match(T__13);
				setState(221);
				expr(0);
				setState(222);
				match(LLAVE_ABRE);
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__17) {
					{
					{
					setState(223);
					cases();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(230);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__19) {
					{
					setState(229);
					defaultCase();
					}
				}

				setState(232);
				match(LLAVE_CIERRA);
				}
				break;
			case 11:
				_localctx = new ForCondicionContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(234);
				match(T__14);
				setState(235);
				expr(0);
				setState(236);
				instruccion();
				}
				break;
			case 12:
				_localctx = new ForincicializacionContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(238);
				match(T__14);
				setState(241);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(239);
					asignacion();
					}
					break;
				case 2:
					{
					setState(240);
					variables();
					}
					break;
				}
				setState(243);
				match(T__15);
				setState(244);
				expr(0);
				setState(245);
				match(T__15);
				setState(246);
				expr(0);
				setState(247);
				instruccion();
				}
				break;
			case 13:
				_localctx = new ForRangeContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(249);
				match(T__14);
				setState(250);
				match(ID);
				setState(251);
				match(T__2);
				setState(252);
				match(ID);
				setState(253);
				match(DOSPUNTOS_IGUAL);
				setState(254);
				match(T__16);
				setState(255);
				match(ID);
				setState(256);
				instruccion();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_cases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(T__17);
			setState(260);
			expr(0);
			setState(261);
			match(T__18);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106891840399142818L) != 0)) {
				{
				{
				setState(262);
				listainstrucciones();
				}
				}
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCaseContext extends ParserRuleContext {
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_defaultCase);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(T__19);
			setState(269);
			match(T__18);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 106891840399142818L) != 0)) {
				{
				{
				setState(270);
				listainstrucciones();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqualitysContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public EqualitysContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CalleeContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CallContext> call() {
			return getRuleContexts(CallContext.class);
		}
		public CallContext call(int i) {
			return getRuleContext(CallContext.class,i);
		}
		public CalleeContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NewContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public NewContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LogicosContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LogicosContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoDecrementoContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IncrementoDecrementoContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ModContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoleanTrueExpresionContext extends ExprContext {
		public TerminalNode TRUE() { return getToken(LanguageParser.TRUE, 0); }
		public BoleanTrueExpresionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstanciaStructContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public CamposStructContext camposStruct() {
			return getRuleContext(CamposStructContext.class,0);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public InstanciaStructContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public MulDivContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AddSubContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParensContext extends ExprContext {
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public ParensContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class RelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public RelationalContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OperadorNegacionContext extends ExprContext {
		public ExprContext right;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public OperadorNegacionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntContext extends ExprContext {
		public TerminalNode INT() { return getToken(LanguageParser.INT, 0); }
		public IntContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CaracterExpresionContext extends ExprContext {
		public TerminalNode CARACTER() { return getToken(LanguageParser.CARACTER, 0); }
		public CaracterExpresionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NilExpresionContext extends ExprContext {
		public NilExpresionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ModuleFuncCallContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public ModuleFuncCallContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FloatContext extends ExprContext {
		public TerminalNode FLOAT() { return getToken(LanguageParser.FLOAT, 0); }
		public FloatContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IdexpresionContext extends ExprContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public IdexpresionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccesoSliceContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CORCHETE_ABRE() { return getToken(LanguageParser.CORCHETE_ABRE, 0); }
		public TerminalNode CORCHETE_CIERRA() { return getToken(LanguageParser.CORCHETE_CIERRA, 0); }
		public AccesoSliceContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CadenaExpresionContext extends ExprContext {
		public TerminalNode CADENA() { return getToken(LanguageParser.CADENA, 0); }
		public CadenaExpresionContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AccesoSliceMultiContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CORCHETE_ABRE() { return getTokens(LanguageParser.CORCHETE_ABRE); }
		public TerminalNode CORCHETE_ABRE(int i) {
			return getToken(LanguageParser.CORCHETE_ABRE, i);
		}
		public List<TerminalNode> CORCHETE_CIERRA() { return getTokens(LanguageParser.CORCHETE_CIERRA); }
		public TerminalNode CORCHETE_CIERRA(int i) {
			return getToken(LanguageParser.CORCHETE_CIERRA, i);
		}
		public AccesoSliceMultiContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NegateContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegateContext(ExprContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoleanFalseExpresionContext extends ExprContext {
		public TerminalNode FALSE() { return getToken(LanguageParser.FALSE, 0); }
		public BoleanFalseExpresionContext(ExprContext ctx) { copyFrom(ctx); }
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(277);
				match(PIZQ);
				setState(278);
				expr(0);
				setState(279);
				match(PDER);
				}
				break;
			case 2:
				{
				_localctx = new InstanciaStructContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(281);
				match(ID);
				setState(282);
				match(LLAVE_ABRE);
				setState(283);
				camposStruct();
				setState(284);
				match(LLAVE_CIERRA);
				}
				break;
			case 3:
				{
				_localctx = new OperadorNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(286);
				match(T__20);
				setState(287);
				((OperadorNegacionContext)_localctx).right = expr(21);
				}
				break;
			case 4:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(288);
				match(T__21);
				setState(289);
				expr(20);
				}
				break;
			case 5:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(290);
				match(FLOAT);
				}
				break;
			case 6:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(291);
				match(INT);
				}
				break;
			case 7:
				{
				_localctx = new NewContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(292);
				match(T__35);
				setState(293);
				match(ID);
				setState(294);
				match(PIZQ);
				setState(296);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34833146849525760L) != 0)) {
					{
					setState(295);
					args();
					}
				}

				setState(298);
				match(PDER);
				}
				break;
			case 8:
				{
				_localctx = new BoleanTrueExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(299);
				match(TRUE);
				}
				break;
			case 9:
				{
				_localctx = new BoleanFalseExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(300);
				match(FALSE);
				}
				break;
			case 10:
				{
				_localctx = new CaracterExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(301);
				match(CARACTER);
				}
				break;
			case 11:
				{
				_localctx = new CadenaExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(302);
				match(CADENA);
				}
				break;
			case 12:
				{
				_localctx = new IdexpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(303);
				match(ID);
				}
				break;
			case 13:
				{
				_localctx = new IncrementoDecrementoContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(304);
				match(ID);
				setState(305);
				_la = _input.LA(1);
				if ( !(_la==T__36 || _la==T__37) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 14:
				{
				_localctx = new NilExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(306);
				match(T__38);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(356);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(354);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(309);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(310);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(311);
						expr(19);
						}
						break;
					case 2:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(312);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(313);
						((ModContext)_localctx).op = match(T__25);
						setState(314);
						expr(18);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(315);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(316);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__21 || _la==T__26) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(317);
						expr(17);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(318);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(319);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4026531840L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(320);
						expr(16);
						}
						break;
					case 5:
						{
						_localctx = new EqualitysContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(321);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(322);
						((EqualitysContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__31 || _la==T__32) ) {
							((EqualitysContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(323);
						expr(15);
						}
						break;
					case 6:
						{
						_localctx = new LogicosContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(324);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(325);
						((LogicosContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__33 || _la==T__34) ) {
							((LogicosContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(326);
						expr(12);
						}
						break;
					case 7:
						{
						_localctx = new CalleeContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(327);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(329); 
						_errHandler.sync(this);
						_alt = 1;
						do {
							switch (_alt) {
							case 1:
								{
								{
								setState(328);
								call();
								}
								}
								break;
							default:
								throw new NoViableAltException(this);
							}
							setState(331); 
							_errHandler.sync(this);
							_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
						} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
						}
						break;
					case 8:
						{
						_localctx = new ModuleFuncCallContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(333);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(334);
						match(T__22);
						setState(335);
						match(ID);
						setState(336);
						match(PIZQ);
						setState(338);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34833146849525760L) != 0)) {
							{
							setState(337);
							args();
							}
						}

						setState(340);
						match(PDER);
						}
						break;
					case 9:
						{
						_localctx = new AccesoSliceMultiContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(341);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(342);
						match(CORCHETE_ABRE);
						setState(343);
						expr(0);
						setState(344);
						match(CORCHETE_CIERRA);
						setState(345);
						match(CORCHETE_ABRE);
						setState(346);
						expr(0);
						setState(347);
						match(CORCHETE_CIERRA);
						}
						break;
					case 10:
						{
						_localctx = new AccesoSliceContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(349);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(350);
						match(CORCHETE_ABRE);
						setState(351);
						expr(0);
						setState(352);
						match(CORCHETE_CIERRA);
						}
						break;
					}
					} 
				}
				setState(358);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CamposStructContext extends ParserRuleContext {
		public List<CampoStructContext> campoStruct() {
			return getRuleContexts(CampoStructContext.class);
		}
		public CampoStructContext campoStruct(int i) {
			return getRuleContext(CampoStructContext.class,i);
		}
		public CamposStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_camposStruct; }
	}

	public final CamposStructContext camposStruct() throws RecognitionException {
		CamposStructContext _localctx = new CamposStructContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_camposStruct);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(359);
			campoStruct();
			setState(364);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(360);
					match(T__2);
					setState(361);
					campoStruct();
					}
					} 
				}
				setState(366);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
			}
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__2) {
				{
				setState(367);
				match(T__2);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CampoStructContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CampoStructContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_campoStruct; }
	}

	public final CampoStructContext campoStruct() throws RecognitionException {
		CampoStructContext _localctx = new CampoStructContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_campoStruct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(ID);
			setState(371);
			match(T__18);
			setState(372);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CallContext extends ParserRuleContext {
		public CallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_call; }
	 
		public CallContext() { }
		public void copyFrom(CallContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class FuncCallContext extends CallContext {
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public ArgsContext args() {
			return getRuleContext(ArgsContext.class,0);
		}
		public FuncCallContext(CallContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GetContext extends CallContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public GetContext(CallContext ctx) { copyFrom(ctx); }
	}

	public final CallContext call() throws RecognitionException {
		CallContext _localctx = new CallContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_call);
		int _la;
		try {
			setState(381);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				_localctx = new FuncCallContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				match(PIZQ);
				setState(376);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 34833146849525760L) != 0)) {
					{
					setState(375);
					args();
					}
				}

				setState(378);
				match(PDER);
				}
				break;
			case T__22:
				_localctx = new GetContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(379);
				match(T__22);
				setState(380);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgsContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ArgsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_args; }
	}

	public final ArgsContext args() throws RecognitionException {
		ArgsContext _localctx = new ArgsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_args);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			expr(0);
			setState(388);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(384);
				match(T__2);
				setState(385);
				expr(0);
				}
				}
				setState(390);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsignacionContext extends ParserRuleContext {
		public AsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignacion; }
	 
		public AsignacionContext() { }
		public void copyFrom(AsignacionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignarSliceMultiContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public List<TerminalNode> CORCHETE_ABRE() { return getTokens(LanguageParser.CORCHETE_ABRE); }
		public TerminalNode CORCHETE_ABRE(int i) {
			return getToken(LanguageParser.CORCHETE_ABRE, i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> CORCHETE_CIERRA() { return getTokens(LanguageParser.CORCHETE_CIERRA); }
		public TerminalNode CORCHETE_CIERRA(int i) {
			return getToken(LanguageParser.CORCHETE_CIERRA, i);
		}
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public AsignarSliceMultiContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignarSliceCompletoContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public AsignarSliceCompletoContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignarVarContext extends AsignacionContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public AsignarVarContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IncrementoContext extends AsignacionContext {
		public Token signo;
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode MASIGUAL() { return getToken(LanguageParser.MASIGUAL, 0); }
		public TerminalNode MENOSIGUAL() { return getToken(LanguageParser.MENOSIGUAL, 0); }
		public IncrementoContext(AsignacionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AsignarSliceContext extends AsignacionContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TerminalNode CORCHETE_ABRE() { return getToken(LanguageParser.CORCHETE_ABRE, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode CORCHETE_CIERRA() { return getToken(LanguageParser.CORCHETE_CIERRA, 0); }
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public AsignarSliceContext(AsignacionContext ctx) { copyFrom(ctx); }
	}

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_asignacion);
		int _la;
		try {
			setState(430);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,40,_ctx) ) {
			case 1:
				_localctx = new IncrementoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(391);
				match(ID);
				setState(392);
				((IncrementoContext)_localctx).signo = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==MASIGUAL || _la==MENOSIGUAL) ) {
					((IncrementoContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(393);
				expr(0);
				}
				break;
			case 2:
				_localctx = new AsignarSliceContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(394);
				match(ID);
				setState(395);
				match(CORCHETE_ABRE);
				setState(396);
				expr(0);
				setState(397);
				match(CORCHETE_CIERRA);
				setState(398);
				match(IGUAL);
				setState(399);
				expr(0);
				}
				break;
			case 3:
				_localctx = new AsignarSliceMultiContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(401);
				match(ID);
				setState(402);
				match(CORCHETE_ABRE);
				setState(403);
				expr(0);
				setState(404);
				match(CORCHETE_CIERRA);
				setState(405);
				match(CORCHETE_ABRE);
				setState(406);
				expr(0);
				setState(407);
				match(CORCHETE_CIERRA);
				setState(408);
				match(IGUAL);
				setState(409);
				expr(0);
				}
				break;
			case 4:
				_localctx = new AsignarSliceCompletoContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(411);
				match(ID);
				setState(412);
				match(IGUAL);
				setState(413);
				match(T__1);
				setState(414);
				tipo();
				setState(415);
				match(LLAVE_ABRE);
				setState(416);
				expr(0);
				setState(421);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(417);
					match(T__2);
					setState(418);
					expr(0);
					}
					}
					setState(423);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(424);
				match(LLAVE_CIERRA);
				}
				break;
			case 5:
				_localctx = new AsignarVarContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(426);
				expr(0);
				setState(427);
				match(IGUAL);
				setState(428);
				expr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrintContext extends ParserRuleContext {
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public ImpresionesContext impresiones() {
			return getRuleContext(ImpresionesContext.class,0);
		}
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public PrintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_print; }
	}

	public final PrintContext print() throws RecognitionException {
		PrintContext _localctx = new PrintContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(T__39);
			setState(433);
			match(PIZQ);
			setState(434);
			impresiones(0);
			setState(435);
			match(PDER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ImpresionesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ImpresionesContext impresiones() {
			return getRuleContext(ImpresionesContext.class,0);
		}
		public ImpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_impresiones; }
	}

	public final ImpresionesContext impresiones() throws RecognitionException {
		return impresiones(0);
	}

	private ImpresionesContext impresiones(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ImpresionesContext _localctx = new ImpresionesContext(_ctx, _parentState);
		ImpresionesContext _prevctx = _localctx;
		int _startState = 38;
		enterRecursionRule(_localctx, 38, RULE_impresiones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(438);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(445);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImpresionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_impresiones);
					setState(440);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(441);
					match(T__2);
					setState(442);
					expr(0);
					}
					} 
				}
				setState(447);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,41,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> LLAVE_ABRE() { return getTokens(LanguageParser.LLAVE_ABRE); }
		public TerminalNode LLAVE_ABRE(int i) {
			return getToken(LanguageParser.LLAVE_ABRE, i);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public List<TerminalNode> LLAVE_CIERRA() { return getTokens(LanguageParser.LLAVE_CIERRA); }
		public TerminalNode LLAVE_CIERRA(int i) {
			return getToken(LanguageParser.LLAVE_CIERRA, i);
		}
		public IfContext if_() {
			return getRuleContext(IfContext.class,0);
		}
		public IfContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if; }
	}

	public final IfContext if_() throws RecognitionException {
		IfContext _localctx = new IfContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_if);
		try {
			setState(468);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(448);
				match(T__10);
				setState(449);
				expr(0);
				setState(450);
				match(LLAVE_ABRE);
				setState(451);
				listainstrucciones();
				setState(452);
				match(LLAVE_CIERRA);
				setState(458);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
				case 1:
					{
					setState(453);
					match(T__11);
					setState(454);
					match(LLAVE_ABRE);
					setState(455);
					listainstrucciones();
					setState(456);
					match(LLAVE_CIERRA);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				match(T__10);
				setState(461);
				expr(0);
				setState(462);
				match(LLAVE_ABRE);
				setState(463);
				listainstrucciones();
				setState(464);
				match(LLAVE_CIERRA);
				setState(465);
				match(T__11);
				setState(466);
				if_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 9075918731476992L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 19:
			return impresiones_sempred((ImpresionesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 18);
		case 1:
			return precpred(_ctx, 17);
		case 2:
			return precpred(_ctx, 16);
		case 3:
			return precpred(_ctx, 15);
		case 4:
			return precpred(_ctx, 14);
		case 5:
			return precpred(_ctx, 11);
		case 6:
			return precpred(_ctx, 23);
		case 7:
			return precpred(_ctx, 19);
		case 8:
			return precpred(_ctx, 13);
		case 9:
			return precpred(_ctx, 12);
		}
		return true;
	}
	private boolean impresiones_sempred(ImpresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001A\u01d9\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0001\u0000\u0005\u0000.\b\u0000\n\u0000\f\u00001\t\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u00017\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002>\b\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002O\b\u0002\n\u0002\f\u0002"+
		"R\t\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002"+
		"^\b\u0002\n\u0002\f\u0002a\t\u0002\u0001\u0002\u0003\u0002d\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0003\u0002h\b\u0002\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003n\b\u0003\n\u0003\f\u0003q\t\u0003\u0001"+
		"\u0003\u0003\u0003t\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004}\b\u0004\n\u0004"+
		"\f\u0004\u0080\t\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005\u0088\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u0092\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u0096\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u009a\b\u0006\n\u0006\f\u0006"+
		"\u009d\t\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0003\u0006\u00a4\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00a8\b"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ac\b\u0006\n\u0006\f\u0006"+
		"\u00af\t\u0006\u0001\u0006\u0003\u0006\u00b2\b\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00b7\b\u0007\n\u0007\f\u0007\u00ba\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00c4\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0005\t\u00ca\b\t\n\t\f\t"+
		"\u00cd\t\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u00d5"+
		"\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0005\t\u00e1\b\t\n\t\f\t\u00e4\t\t\u0001\t\u0003\t\u00e7\b"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0003\t\u00f2\b\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0102"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0005\n\u0108\b\n\n\n\f\n\u010b\t"+
		"\n\u0001\u000b\u0001\u000b\u0001\u000b\u0005\u000b\u0110\b\u000b\n\u000b"+
		"\f\u000b\u0113\t\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0129\b\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0134"+
		"\b\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0004\f\u014a\b\f\u000b\f\f\f\u014b\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0003\f\u0153\b\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0005\f\u0163\b\f\n\f\f\f\u0166\t\f\u0001\r\u0001\r\u0001\r"+
		"\u0005\r\u016b\b\r\n\r\f\r\u016e\t\r\u0001\r\u0003\r\u0171\b\r\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0179\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u017e\b"+
		"\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0183\b\u0010\n"+
		"\u0010\f\u0010\u0186\t\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0005\u0011\u01a4\b\u0011\n\u0011\f\u0011\u01a7\t\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011"+
		"\u01af\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0005\u0013\u01bc\b\u0013\n\u0013\f\u0013\u01bf\t\u0013\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01cb\b\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0003\u0014\u01d5\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0000"+
		"\u0002\u0018&\u0016\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0016\u0018\u001a\u001c\u001e \"$&(*\u0000\b\u0001\u0000%&\u0001\u0000"+
		"\u0018\u0019\u0002\u0000\u0016\u0016\u001b\u001b\u0001\u0000\u001c\u001f"+
		"\u0001\u0000 !\u0001\u0000\"#\u0001\u0000>?\u0003\u0000\'\')-55\u0216"+
		"\u0000/\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004g"+
		"\u0001\u0000\u0000\u0000\u0006i\u0001\u0000\u0000\u0000\bw\u0001\u0000"+
		"\u0000\u0000\n\u0087\u0001\u0000\u0000\u0000\f\u00b1\u0001\u0000\u0000"+
		"\u0000\u000e\u00b3\u0001\u0000\u0000\u0000\u0010\u00bb\u0001\u0000\u0000"+
		"\u0000\u0012\u0101\u0001\u0000\u0000\u0000\u0014\u0103\u0001\u0000\u0000"+
		"\u0000\u0016\u010c\u0001\u0000\u0000\u0000\u0018\u0133\u0001\u0000\u0000"+
		"\u0000\u001a\u0167\u0001\u0000\u0000\u0000\u001c\u0172\u0001\u0000\u0000"+
		"\u0000\u001e\u017d\u0001\u0000\u0000\u0000 \u017f\u0001\u0000\u0000\u0000"+
		"\"\u01ae\u0001\u0000\u0000\u0000$\u01b0\u0001\u0000\u0000\u0000&\u01b5"+
		"\u0001\u0000\u0000\u0000(\u01d4\u0001\u0000\u0000\u0000*\u01d6\u0001\u0000"+
		"\u0000\u0000,.\u0003\u0002\u0001\u0000-,\u0001\u0000\u0000\u0000.1\u0001"+
		"\u0000\u0000\u0000/-\u0001\u0000\u0000\u0000/0\u0001\u0000\u0000\u0000"+
		"0\u0001\u0001\u0000\u0000\u00001/\u0001\u0000\u0000\u000027\u0003\u0004"+
		"\u0002\u000037\u0003\u0012\t\u000047\u0003\b\u0004\u000057\u0003\f\u0006"+
		"\u000062\u0001\u0000\u0000\u000063\u0001\u0000\u0000\u000064\u0001\u0000"+
		"\u0000\u000065\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000\u0000"+
		"89\u0005\u0001\u0000\u00009:\u00055\u0000\u0000:=\u0003*\u0015\u0000;"+
		"<\u0005<\u0000\u0000<>\u0003\u0018\f\u0000=;\u0001\u0000\u0000\u0000="+
		">\u0001\u0000\u0000\u0000>h\u0001\u0000\u0000\u0000?@\u00055\u0000\u0000"+
		"@A\u0005=\u0000\u0000Ah\u0003\u0018\f\u0000BC\u0005\u0001\u0000\u0000"+
		"CD\u00055\u0000\u0000DE\u0005\u0002\u0000\u0000Eh\u0003*\u0015\u0000F"+
		"G\u00055\u0000\u0000GH\u0005=\u0000\u0000HI\u0005\u0002\u0000\u0000IJ"+
		"\u0003*\u0015\u0000JK\u00058\u0000\u0000KP\u0003\u0018\f\u0000LM\u0005"+
		"\u0003\u0000\u0000MO\u0003\u0018\f\u0000NL\u0001\u0000\u0000\u0000OR\u0001"+
		"\u0000\u0000\u0000PN\u0001\u0000\u0000\u0000PQ\u0001\u0000\u0000\u0000"+
		"QS\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000ST\u00059\u0000\u0000"+
		"Th\u0001\u0000\u0000\u0000UV\u00055\u0000\u0000VW\u0005=\u0000\u0000W"+
		"X\u0005\u0004\u0000\u0000XY\u0003*\u0015\u0000YZ\u00058\u0000\u0000Z_"+
		"\u0003\u0006\u0003\u0000[\\\u0005\u0003\u0000\u0000\\^\u0003\u0006\u0003"+
		"\u0000][\u0001\u0000\u0000\u0000^a\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000_`\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000bd\u0005\u0003\u0000\u0000cb\u0001\u0000\u0000\u0000"+
		"cd\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000ef\u00059\u0000\u0000"+
		"fh\u0001\u0000\u0000\u0000g8\u0001\u0000\u0000\u0000g?\u0001\u0000\u0000"+
		"\u0000gB\u0001\u0000\u0000\u0000gF\u0001\u0000\u0000\u0000gU\u0001\u0000"+
		"\u0000\u0000h\u0005\u0001\u0000\u0000\u0000ij\u00058\u0000\u0000jo\u0003"+
		"\u0018\f\u0000kl\u0005\u0003\u0000\u0000ln\u0003\u0018\f\u0000mk\u0001"+
		"\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000\u0000\u0000"+
		"op\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000"+
		"\u0000rt\u0005\u0003\u0000\u0000sr\u0001\u0000\u0000\u0000st\u0001\u0000"+
		"\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u00059\u0000\u0000v\u0007\u0001"+
		"\u0000\u0000\u0000wx\u0005\u0005\u0000\u0000xy\u00055\u0000\u0000yz\u0005"+
		"\u0006\u0000\u0000z~\u00058\u0000\u0000{}\u0003\n\u0005\u0000|{\u0001"+
		"\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000"+
		"\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000\u0000"+
		"\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u00059\u0000\u0000\u0082\t"+
		"\u0001\u0000\u0000\u0000\u0083\u0088\u0003\u0004\u0002\u0000\u0084\u0088"+
		"\u0003\f\u0006\u0000\u0085\u0086\u00055\u0000\u0000\u0086\u0088\u0003"+
		"*\u0015\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084\u0001\u0000"+
		"\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0088\u000b\u0001\u0000"+
		"\u0000\u0000\u0089\u008a\u0005\u0007\u0000\u0000\u008a\u008b\u00056\u0000"+
		"\u0000\u008b\u008c\u00055\u0000\u0000\u008c\u008d\u00055\u0000\u0000\u008d"+
		"\u008e\u00057\u0000\u0000\u008e\u008f\u00055\u0000\u0000\u008f\u0091\u0005"+
		"6\u0000\u0000\u0090\u0092\u0003\u000e\u0007\u0000\u0091\u0090\u0001\u0000"+
		"\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001\u0000"+
		"\u0000\u0000\u0093\u0095\u00057\u0000\u0000\u0094\u0096\u0003*\u0015\u0000"+
		"\u0095\u0094\u0001\u0000\u0000\u0000\u0095\u0096\u0001\u0000\u0000\u0000"+
		"\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009b\u00058\u0000\u0000\u0098"+
		"\u009a\u0003\u0002\u0001\u0000\u0099\u0098\u0001\u0000\u0000\u0000\u009a"+
		"\u009d\u0001\u0000\u0000\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b"+
		"\u009c\u0001\u0000\u0000\u0000\u009c\u009e\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009e\u00b2\u00059\u0000\u0000\u009f\u00a0"+
		"\u0005\u0007\u0000\u0000\u00a0\u00a1\u00055\u0000\u0000\u00a1\u00a3\u0005"+
		"6\u0000\u0000\u00a2\u00a4\u0003\u000e\u0007\u0000\u00a3\u00a2\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0001\u0000\u0000\u0000\u00a4\u00a5\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a7\u00057\u0000\u0000\u00a6\u00a8\u0003*\u0015\u0000"+
		"\u00a7\u00a6\u0001\u0000\u0000\u0000\u00a7\u00a8\u0001\u0000\u0000\u0000"+
		"\u00a8\u00a9\u0001\u0000\u0000\u0000\u00a9\u00ad\u00058\u0000\u0000\u00aa"+
		"\u00ac\u0003\u0002\u0001\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac"+
		"\u00af\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad"+
		"\u00ae\u0001\u0000\u0000\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af"+
		"\u00ad\u0001\u0000\u0000\u0000\u00b0\u00b2\u00059\u0000\u0000\u00b1\u0089"+
		"\u0001\u0000\u0000\u0000\u00b1\u009f\u0001\u0000\u0000\u0000\u00b2\r\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b8\u0003\u0010\b\u0000\u00b4\u00b5\u0005\u0003"+
		"\u0000\u0000\u00b5\u00b7\u0003\u0010\b\u0000\u00b6\u00b4\u0001\u0000\u0000"+
		"\u0000\u00b7\u00ba\u0001\u0000\u0000\u0000\u00b8\u00b6\u0001\u0000\u0000"+
		"\u0000\u00b8\u00b9\u0001\u0000\u0000\u0000\u00b9\u000f\u0001\u0000\u0000"+
		"\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u00055\u0000\u0000"+
		"\u00bc\u00bd\u0003*\u0015\u0000\u00bd\u0011\u0001\u0000\u0000\u0000\u00be"+
		"\u0102\u0003\u0018\f\u0000\u00bf\u0102\u0005\b\u0000\u0000\u00c0\u0102"+
		"\u0005\t\u0000\u0000\u00c1\u00c3\u0005\n\u0000\u0000\u00c2\u00c4\u0003"+
		"\u0018\f\u0000\u00c3\u00c2\u0001\u0000\u0000\u0000\u00c3\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c4\u0102\u0001\u0000\u0000\u0000\u00c5\u0102\u0003$\u0012"+
		"\u0000\u00c6\u0102\u0003\"\u0011\u0000\u00c7\u00cb\u00058\u0000\u0000"+
		"\u00c8\u00ca\u0003\u0002\u0001\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00cd\u0001\u0000\u0000\u0000\u00cb\u00c9\u0001\u0000\u0000\u0000"+
		"\u00cb\u00cc\u0001\u0000\u0000\u0000\u00cc\u00ce\u0001\u0000\u0000\u0000"+
		"\u00cd\u00cb\u0001\u0000\u0000\u0000\u00ce\u0102\u00059\u0000\u0000\u00cf"+
		"\u00d0\u0005\u000b\u0000\u0000\u00d0\u00d1\u0003\u0018\f\u0000\u00d1\u00d4"+
		"\u0003\u0012\t\u0000\u00d2\u00d3\u0005\f\u0000\u0000\u00d3\u00d5\u0003"+
		"\u0012\t\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d5\u0001\u0000"+
		"\u0000\u0000\u00d5\u0102\u0001\u0000\u0000\u0000\u00d6\u00d7\u0005\r\u0000"+
		"\u0000\u00d7\u00d8\u00056\u0000\u0000\u00d8\u00d9\u0003\u0018\f\u0000"+
		"\u00d9\u00da\u00057\u0000\u0000\u00da\u00db\u0003\u0012\t\u0000\u00db"+
		"\u0102\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u000e\u0000\u0000\u00dd"+
		"\u00de\u0003\u0018\f\u0000\u00de\u00e2\u00058\u0000\u0000\u00df\u00e1"+
		"\u0003\u0014\n\u0000\u00e0\u00df\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001"+
		"\u0000\u0000\u0000\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001"+
		"\u0000\u0000\u0000\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001"+
		"\u0000\u0000\u0000\u00e5\u00e7\u0003\u0016\u000b\u0000\u00e6\u00e5\u0001"+
		"\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8\u0001"+
		"\u0000\u0000\u0000\u00e8\u00e9\u00059\u0000\u0000\u00e9\u0102\u0001\u0000"+
		"\u0000\u0000\u00ea\u00eb\u0005\u000f\u0000\u0000\u00eb\u00ec\u0003\u0018"+
		"\f\u0000\u00ec\u00ed\u0003\u0012\t\u0000\u00ed\u0102\u0001\u0000\u0000"+
		"\u0000\u00ee\u00f1\u0005\u000f\u0000\u0000\u00ef\u00f2\u0003\"\u0011\u0000"+
		"\u00f0\u00f2\u0003\u0004\u0002\u0000\u00f1\u00ef\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f3\u00f4\u0005\u0010\u0000\u0000\u00f4\u00f5\u0003\u0018\f\u0000\u00f5"+
		"\u00f6\u0005\u0010\u0000\u0000\u00f6\u00f7\u0003\u0018\f\u0000\u00f7\u00f8"+
		"\u0003\u0012\t\u0000\u00f8\u0102\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005"+
		"\u000f\u0000\u0000\u00fa\u00fb\u00055\u0000\u0000\u00fb\u00fc\u0005\u0003"+
		"\u0000\u0000\u00fc\u00fd\u00055\u0000\u0000\u00fd\u00fe\u0005=\u0000\u0000"+
		"\u00fe\u00ff\u0005\u0011\u0000\u0000\u00ff\u0100\u00055\u0000\u0000\u0100"+
		"\u0102\u0003\u0012\t\u0000\u0101\u00be\u0001\u0000\u0000\u0000\u0101\u00bf"+
		"\u0001\u0000\u0000\u0000\u0101\u00c0\u0001\u0000\u0000\u0000\u0101\u00c1"+
		"\u0001\u0000\u0000\u0000\u0101\u00c5\u0001\u0000\u0000\u0000\u0101\u00c6"+
		"\u0001\u0000\u0000\u0000\u0101\u00c7\u0001\u0000\u0000\u0000\u0101\u00cf"+
		"\u0001\u0000\u0000\u0000\u0101\u00d6\u0001\u0000\u0000\u0000\u0101\u00dc"+
		"\u0001\u0000\u0000\u0000\u0101\u00ea\u0001\u0000\u0000\u0000\u0101\u00ee"+
		"\u0001\u0000\u0000\u0000\u0101\u00f9\u0001\u0000\u0000\u0000\u0102\u0013"+
		"\u0001\u0000\u0000\u0000\u0103\u0104\u0005\u0012\u0000\u0000\u0104\u0105"+
		"\u0003\u0018\f\u0000\u0105\u0109\u0005\u0013\u0000\u0000\u0106\u0108\u0003"+
		"\u0002\u0001\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0108\u010b\u0001"+
		"\u0000\u0000\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001"+
		"\u0000\u0000\u0000\u010a\u0015\u0001\u0000\u0000\u0000\u010b\u0109\u0001"+
		"\u0000\u0000\u0000\u010c\u010d\u0005\u0014\u0000\u0000\u010d\u0111\u0005"+
		"\u0013\u0000\u0000\u010e\u0110\u0003\u0002\u0001\u0000\u010f\u010e\u0001"+
		"\u0000\u0000\u0000\u0110\u0113\u0001\u0000\u0000\u0000\u0111\u010f\u0001"+
		"\u0000\u0000\u0000\u0111\u0112\u0001\u0000\u0000\u0000\u0112\u0017\u0001"+
		"\u0000\u0000\u0000\u0113\u0111\u0001\u0000\u0000\u0000\u0114\u0115\u0006"+
		"\f\uffff\uffff\u0000\u0115\u0116\u00056\u0000\u0000\u0116\u0117\u0003"+
		"\u0018\f\u0000\u0117\u0118\u00057\u0000\u0000\u0118\u0134\u0001\u0000"+
		"\u0000\u0000\u0119\u011a\u00055\u0000\u0000\u011a\u011b\u00058\u0000\u0000"+
		"\u011b\u011c\u0003\u001a\r\u0000\u011c\u011d\u00059\u0000\u0000\u011d"+
		"\u0134\u0001\u0000\u0000\u0000\u011e\u011f\u0005\u0015\u0000\u0000\u011f"+
		"\u0134\u0003\u0018\f\u0015\u0120\u0121\u0005\u0016\u0000\u0000\u0121\u0134"+
		"\u0003\u0018\f\u0014\u0122\u0134\u00051\u0000\u0000\u0123\u0134\u0005"+
		"0\u0000\u0000\u0124\u0125\u0005$\u0000\u0000\u0125\u0126\u00055\u0000"+
		"\u0000\u0126\u0128\u00056\u0000\u0000\u0127\u0129\u0003 \u0010\u0000\u0128"+
		"\u0127\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129"+
		"\u012a\u0001\u0000\u0000\u0000\u012a\u0134\u00057\u0000\u0000\u012b\u0134"+
		"\u0005.\u0000\u0000\u012c\u0134\u0005/\u0000\u0000\u012d\u0134\u00053"+
		"\u0000\u0000\u012e\u0134\u00054\u0000\u0000\u012f\u0134\u00055\u0000\u0000"+
		"\u0130\u0131\u00055\u0000\u0000\u0131\u0134\u0007\u0000\u0000\u0000\u0132"+
		"\u0134\u0005\'\u0000\u0000\u0133\u0114\u0001\u0000\u0000\u0000\u0133\u0119"+
		"\u0001\u0000\u0000\u0000\u0133\u011e\u0001\u0000\u0000\u0000\u0133\u0120"+
		"\u0001\u0000\u0000\u0000\u0133\u0122\u0001\u0000\u0000\u0000\u0133\u0123"+
		"\u0001\u0000\u0000\u0000\u0133\u0124\u0001\u0000\u0000\u0000\u0133\u012b"+
		"\u0001\u0000\u0000\u0000\u0133\u012c\u0001\u0000\u0000\u0000\u0133\u012d"+
		"\u0001\u0000\u0000\u0000\u0133\u012e\u0001\u0000\u0000\u0000\u0133\u012f"+
		"\u0001\u0000\u0000\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0132"+
		"\u0001\u0000\u0000\u0000\u0134\u0164\u0001\u0000\u0000\u0000\u0135\u0136"+
		"\n\u0012\u0000\u0000\u0136\u0137\u0007\u0001\u0000\u0000\u0137\u0163\u0003"+
		"\u0018\f\u0013\u0138\u0139\n\u0011\u0000\u0000\u0139\u013a\u0005\u001a"+
		"\u0000\u0000\u013a\u0163\u0003\u0018\f\u0012\u013b\u013c\n\u0010\u0000"+
		"\u0000\u013c\u013d\u0007\u0002\u0000\u0000\u013d\u0163\u0003\u0018\f\u0011"+
		"\u013e\u013f\n\u000f\u0000\u0000\u013f\u0140\u0007\u0003\u0000\u0000\u0140"+
		"\u0163\u0003\u0018\f\u0010\u0141\u0142\n\u000e\u0000\u0000\u0142\u0143"+
		"\u0007\u0004\u0000\u0000\u0143\u0163\u0003\u0018\f\u000f\u0144\u0145\n"+
		"\u000b\u0000\u0000\u0145\u0146\u0007\u0005\u0000\u0000\u0146\u0163\u0003"+
		"\u0018\f\f\u0147\u0149\n\u0017\u0000\u0000\u0148\u014a\u0003\u001e\u000f"+
		"\u0000\u0149\u0148\u0001\u0000\u0000\u0000\u014a\u014b\u0001\u0000\u0000"+
		"\u0000\u014b\u0149\u0001\u0000\u0000\u0000\u014b\u014c\u0001\u0000\u0000"+
		"\u0000\u014c\u0163\u0001\u0000\u0000\u0000\u014d\u014e\n\u0013\u0000\u0000"+
		"\u014e\u014f\u0005\u0017\u0000\u0000\u014f\u0150\u00055\u0000\u0000\u0150"+
		"\u0152\u00056\u0000\u0000\u0151\u0153\u0003 \u0010\u0000\u0152\u0151\u0001"+
		"\u0000\u0000\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0154\u0001"+
		"\u0000\u0000\u0000\u0154\u0163\u00057\u0000\u0000\u0155\u0156\n\r\u0000"+
		"\u0000\u0156\u0157\u0005:\u0000\u0000\u0157\u0158\u0003\u0018\f\u0000"+
		"\u0158\u0159\u0005;\u0000\u0000\u0159\u015a\u0005:\u0000\u0000\u015a\u015b"+
		"\u0003\u0018\f\u0000\u015b\u015c\u0005;\u0000\u0000\u015c\u0163\u0001"+
		"\u0000\u0000\u0000\u015d\u015e\n\f\u0000\u0000\u015e\u015f\u0005:\u0000"+
		"\u0000\u015f\u0160\u0003\u0018\f\u0000\u0160\u0161\u0005;\u0000\u0000"+
		"\u0161\u0163\u0001\u0000\u0000\u0000\u0162\u0135\u0001\u0000\u0000\u0000"+
		"\u0162\u0138\u0001\u0000\u0000\u0000\u0162\u013b\u0001\u0000\u0000\u0000"+
		"\u0162\u013e\u0001\u0000\u0000\u0000\u0162\u0141\u0001\u0000\u0000\u0000"+
		"\u0162\u0144\u0001\u0000\u0000\u0000\u0162\u0147\u0001\u0000\u0000\u0000"+
		"\u0162\u014d\u0001\u0000\u0000\u0000\u0162\u0155\u0001\u0000\u0000\u0000"+
		"\u0162\u015d\u0001\u0000\u0000\u0000\u0163\u0166\u0001\u0000\u0000\u0000"+
		"\u0164\u0162\u0001\u0000\u0000\u0000\u0164\u0165\u0001\u0000\u0000\u0000"+
		"\u0165\u0019\u0001\u0000\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000"+
		"\u0167\u016c\u0003\u001c\u000e\u0000\u0168\u0169\u0005\u0003\u0000\u0000"+
		"\u0169\u016b\u0003\u001c\u000e\u0000\u016a\u0168\u0001\u0000\u0000\u0000"+
		"\u016b\u016e\u0001\u0000\u0000\u0000\u016c\u016a\u0001\u0000\u0000\u0000"+
		"\u016c\u016d\u0001\u0000\u0000\u0000\u016d\u0170\u0001\u0000\u0000\u0000"+
		"\u016e\u016c\u0001\u0000\u0000\u0000\u016f\u0171\u0005\u0003\u0000\u0000"+
		"\u0170\u016f\u0001\u0000\u0000\u0000\u0170\u0171\u0001\u0000\u0000\u0000"+
		"\u0171\u001b\u0001\u0000\u0000\u0000\u0172\u0173\u00055\u0000\u0000\u0173"+
		"\u0174\u0005\u0013\u0000\u0000\u0174\u0175\u0003\u0018\f\u0000\u0175\u001d"+
		"\u0001\u0000\u0000\u0000\u0176\u0178\u00056\u0000\u0000\u0177\u0179\u0003"+
		" \u0010\u0000\u0178\u0177\u0001\u0000\u0000\u0000\u0178\u0179\u0001\u0000"+
		"\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a\u017e\u00057\u0000"+
		"\u0000\u017b\u017c\u0005\u0017\u0000\u0000\u017c\u017e\u00055\u0000\u0000"+
		"\u017d\u0176\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000"+
		"\u017e\u001f\u0001\u0000\u0000\u0000\u017f\u0184\u0003\u0018\f\u0000\u0180"+
		"\u0181\u0005\u0003\u0000\u0000\u0181\u0183\u0003\u0018\f\u0000\u0182\u0180"+
		"\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184\u0182"+
		"\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185!\u0001"+
		"\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187\u0188\u0005"+
		"5\u0000\u0000\u0188\u0189\u0007\u0006\u0000\u0000\u0189\u01af\u0003\u0018"+
		"\f\u0000\u018a\u018b\u00055\u0000\u0000\u018b\u018c\u0005:\u0000\u0000"+
		"\u018c\u018d\u0003\u0018\f\u0000\u018d\u018e\u0005;\u0000\u0000\u018e"+
		"\u018f\u0005<\u0000\u0000\u018f\u0190\u0003\u0018\f\u0000\u0190\u01af"+
		"\u0001\u0000\u0000\u0000\u0191\u0192\u00055\u0000\u0000\u0192\u0193\u0005"+
		":\u0000\u0000\u0193\u0194\u0003\u0018\f\u0000\u0194\u0195\u0005;\u0000"+
		"\u0000\u0195\u0196\u0005:\u0000\u0000\u0196\u0197\u0003\u0018\f\u0000"+
		"\u0197\u0198\u0005;\u0000\u0000\u0198\u0199\u0005<\u0000\u0000\u0199\u019a"+
		"\u0003\u0018\f\u0000\u019a\u01af\u0001\u0000\u0000\u0000\u019b\u019c\u0005"+
		"5\u0000\u0000\u019c\u019d\u0005<\u0000\u0000\u019d\u019e\u0005\u0002\u0000"+
		"\u0000\u019e\u019f\u0003*\u0015\u0000\u019f\u01a0\u00058\u0000\u0000\u01a0"+
		"\u01a5\u0003\u0018\f\u0000\u01a1\u01a2\u0005\u0003\u0000\u0000\u01a2\u01a4"+
		"\u0003\u0018\f\u0000\u01a3\u01a1\u0001\u0000\u0000\u0000\u01a4\u01a7\u0001"+
		"\u0000\u0000\u0000\u01a5\u01a3\u0001\u0000\u0000\u0000\u01a5\u01a6\u0001"+
		"\u0000\u0000\u0000\u01a6\u01a8\u0001\u0000\u0000\u0000\u01a7\u01a5\u0001"+
		"\u0000\u0000\u0000\u01a8\u01a9\u00059\u0000\u0000\u01a9\u01af\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0003\u0018\f\u0000\u01ab\u01ac\u0005<\u0000"+
		"\u0000\u01ac\u01ad\u0003\u0018\f\u0000\u01ad\u01af\u0001\u0000\u0000\u0000"+
		"\u01ae\u0187\u0001\u0000\u0000\u0000\u01ae\u018a\u0001\u0000\u0000\u0000"+
		"\u01ae\u0191\u0001\u0000\u0000\u0000\u01ae\u019b\u0001\u0000\u0000\u0000"+
		"\u01ae\u01aa\u0001\u0000\u0000\u0000\u01af#\u0001\u0000\u0000\u0000\u01b0"+
		"\u01b1\u0005(\u0000\u0000\u01b1\u01b2\u00056\u0000\u0000\u01b2\u01b3\u0003"+
		"&\u0013\u0000\u01b3\u01b4\u00057\u0000\u0000\u01b4%\u0001\u0000\u0000"+
		"\u0000\u01b5\u01b6\u0006\u0013\uffff\uffff\u0000\u01b6\u01b7\u0003\u0018"+
		"\f\u0000\u01b7\u01bd\u0001\u0000\u0000\u0000\u01b8\u01b9\n\u0002\u0000"+
		"\u0000\u01b9\u01ba\u0005\u0003\u0000\u0000\u01ba\u01bc\u0003\u0018\f\u0000"+
		"\u01bb\u01b8\u0001\u0000\u0000\u0000\u01bc\u01bf\u0001\u0000\u0000\u0000"+
		"\u01bd\u01bb\u0001\u0000\u0000\u0000\u01bd\u01be\u0001\u0000\u0000\u0000"+
		"\u01be\'\u0001\u0000\u0000\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0"+
		"\u01c1\u0005\u000b\u0000\u0000\u01c1\u01c2\u0003\u0018\f\u0000\u01c2\u01c3"+
		"\u00058\u0000\u0000\u01c3\u01c4\u0003\u0002\u0001\u0000\u01c4\u01ca\u0005"+
		"9\u0000\u0000\u01c5\u01c6\u0005\f\u0000\u0000\u01c6\u01c7\u00058\u0000"+
		"\u0000\u01c7\u01c8\u0003\u0002\u0001\u0000\u01c8\u01c9\u00059\u0000\u0000"+
		"\u01c9\u01cb\u0001\u0000\u0000\u0000\u01ca\u01c5\u0001\u0000\u0000\u0000"+
		"\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01d5\u0001\u0000\u0000\u0000"+
		"\u01cc\u01cd\u0005\u000b\u0000\u0000\u01cd\u01ce\u0003\u0018\f\u0000\u01ce"+
		"\u01cf\u00058\u0000\u0000\u01cf\u01d0\u0003\u0002\u0001\u0000\u01d0\u01d1"+
		"\u00059\u0000\u0000\u01d1\u01d2\u0005\f\u0000\u0000\u01d2\u01d3\u0003"+
		"(\u0014\u0000\u01d3\u01d5\u0001\u0000\u0000\u0000\u01d4\u01c0\u0001\u0000"+
		"\u0000\u0000\u01d4\u01cc\u0001\u0000\u0000\u0000\u01d5)\u0001\u0000\u0000"+
		"\u0000\u01d6\u01d7\u0007\u0007\u0000\u0000\u01d7+\u0001\u0000\u0000\u0000"+
		",/6=P_cgos~\u0087\u0091\u0095\u009b\u00a3\u00a7\u00ad\u00b1\u00b8\u00c3"+
		"\u00cb\u00d4\u00e2\u00e6\u00f1\u0101\u0109\u0111\u0128\u0133\u014b\u0152"+
		"\u0162\u0164\u016c\u0170\u0178\u017d\u0184\u01a5\u01ae\u01bd\u01ca\u01d4";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}