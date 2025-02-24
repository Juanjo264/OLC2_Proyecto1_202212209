// Generated from c:/Users/juanj/Desktop/Compi 2/Proyecto 1/Clase4/api/Language.g4 by ANTLR 4.13.1
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
		T__31=32, T__32=33, TRUE=34, FALSE=35, INT=36, FLOAT=37, WS=38, CARACTER=39, 
		CADENA=40, ID=41, PIZQ=42, PDER=43, LLAVE_ABRE=44, LLAVE_CIERRA=45, CORCHETE_ABRE=46, 
		CORCHETE_CIERRA=47, IGUAL=48, DOSPUNTOS_IGUAL=49, MASIGUAL=50, MENOSIGUAL=51, 
		MASMAS=52, MENOSMENOS=53, LLINEAC=54, MULTILINEAC=55;
	public static final int
		RULE_program = 0, RULE_listainstrucciones = 1, RULE_variables = 2, RULE_instruccion = 3, 
		RULE_for = 4, RULE_cases = 5, RULE_defaultCase = 6, RULE_expr = 7, RULE_asignacion = 8, 
		RULE_print = 9, RULE_impresiones = 10, RULE_if = 11, RULE_tipo = 12;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "listainstrucciones", "variables", "instruccion", "for", "cases", 
			"defaultCase", "expr", "asignacion", "print", "impresiones", "if", "tipo"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'var'", "'[]'", "','", "';'", "'if'", "'else'", "'while'", "'switch'", 
			"'for'", "'range'", "'case'", "':'", "'default'", "'!'", "'-'", "'*'", 
			"'/'", "'%'", "'+'", "'>'", "'<'", "'>='", "'<='", "'=='", "'!='", "'&&'", 
			"'||'", "'prt'", "'int'", "'float64'", "'string'", "'bool'", "'rune'", 
			"'true'", "'false'", null, null, null, null, null, null, "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "'='", "':='", "'+='", "'-='", "'++'", "'--'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, "TRUE", "FALSE", 
			"INT", "FLOAT", "WS", "CARACTER", "CADENA", "ID", "PIZQ", "PDER", "LLAVE_ABRE", 
			"LLAVE_CIERRA", "CORCHETE_ABRE", "CORCHETE_CIERRA", "IGUAL", "DOSPUNTOS_IGUAL", 
			"MASIGUAL", "MENOSIGUAL", "MASMAS", "MENOSMENOS", "LLINEAC", "MULTILINEAC"
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
			setState(29);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96465233953698L) != 0)) {
				{
				{
				setState(26);
				listainstrucciones();
				}
				}
				setState(31);
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
		public ListainstruccionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listainstrucciones; }
	}

	public final ListainstruccionesContext listainstrucciones() throws RecognitionException {
		ListainstruccionesContext _localctx = new ListainstruccionesContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_listainstrucciones);
		try {
			setState(34);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(32);
				variables();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(33);
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
	public static class DeclaracionSliceContext extends VariablesContext {
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

	public final VariablesContext variables() throws RecognitionException {
		VariablesContext _localctx = new VariablesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_variables);
		int _la;
		try {
			setState(63);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new DeclaracionVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(36);
				match(T__0);
				setState(37);
				match(ID);
				setState(38);
				tipo();
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGUAL) {
					{
					setState(39);
					match(IGUAL);
					setState(40);
					expr(0);
					}
				}

				}
				break;
			case 2:
				_localctx = new DeclaracionSlicevacioContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(43);
				match(T__0);
				setState(44);
				match(ID);
				setState(45);
				match(T__1);
				setState(46);
				tipo();
				}
				break;
			case 3:
				_localctx = new DeclaracionSliceContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				match(ID);
				setState(48);
				match(IGUAL);
				setState(49);
				match(T__1);
				setState(50);
				tipo();
				setState(51);
				match(LLAVE_ABRE);
				setState(52);
				expr(0);
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(53);
					match(T__2);
					setState(54);
					expr(0);
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(60);
				match(LLAVE_CIERRA);
				setState(61);
				match(T__3);
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
		public TerminalNode PIZQ() { return getToken(LanguageParser.PIZQ, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PDER() { return getToken(LanguageParser.PDER, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public IfInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForInstruccionContext extends InstruccionContext {
		public ForContext for_() {
			return getRuleContext(ForContext.class,0);
		}
		public ForInstruccionContext(InstruccionContext ctx) { copyFrom(ctx); }
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruccion);
		int _la;
		try {
			setState(106);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				_localctx = new ExprecionInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(65);
				expr(0);
				}
				break;
			case 2:
				_localctx = new PrintInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(66);
				print();
				}
				break;
			case 3:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(67);
				asignacion();
				}
				break;
			case 4:
				_localctx = new BloqueInstruccionesContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(68);
				match(LLAVE_ABRE);
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96465233953698L) != 0)) {
					{
					{
					setState(69);
					listainstrucciones();
					}
					}
					setState(74);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(75);
				match(LLAVE_CIERRA);
				}
				break;
			case 5:
				_localctx = new IfInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(76);
				match(T__4);
				setState(77);
				match(PIZQ);
				setState(78);
				expr(0);
				setState(79);
				match(PDER);
				setState(80);
				instruccion();
				setState(83);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(81);
					match(T__5);
					setState(82);
					instruccion();
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new WhileInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(85);
				match(T__6);
				setState(86);
				match(PIZQ);
				setState(87);
				expr(0);
				setState(88);
				match(PDER);
				setState(89);
				instruccion();
				}
				break;
			case 7:
				_localctx = new SwitchInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(91);
				match(T__7);
				setState(92);
				expr(0);
				setState(93);
				match(LLAVE_ABRE);
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__10) {
					{
					{
					setState(94);
					cases();
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__12) {
					{
					setState(100);
					defaultCase();
					}
				}

				setState(103);
				match(LLAVE_CIERRA);
				}
				break;
			case 8:
				_localctx = new ForInstruccionContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				for_();
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
	public static class ForContext extends ParserRuleContext {
		public ForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for; }
	 
		public ForContext() { }
		public void copyFrom(ForContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForcondicionContext extends ForContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public ForcondicionContext(ForContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForincicializacionContext extends ForContext {
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public AsignacionContext asignacion() {
			return getRuleContext(AsignacionContext.class,0);
		}
		public VariablesContext variables() {
			return getRuleContext(VariablesContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public List<TerminalNode> MASMAS() { return getTokens(LanguageParser.MASMAS); }
		public TerminalNode MASMAS(int i) {
			return getToken(LanguageParser.MASMAS, i);
		}
		public List<TerminalNode> MENOSMENOS() { return getTokens(LanguageParser.MENOSMENOS); }
		public TerminalNode MENOSMENOS(int i) {
			return getToken(LanguageParser.MENOSMENOS, i);
		}
		public ForincicializacionContext(ForContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ForRangeContext extends ForContext {
		public List<TerminalNode> ID() { return getTokens(LanguageParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(LanguageParser.ID, i);
		}
		public TerminalNode DOSPUNTOS_IGUAL() { return getToken(LanguageParser.DOSPUNTOS_IGUAL, 0); }
		public TerminalNode LLAVE_ABRE() { return getToken(LanguageParser.LLAVE_ABRE, 0); }
		public TerminalNode LLAVE_CIERRA() { return getToken(LanguageParser.LLAVE_CIERRA, 0); }
		public List<ListainstruccionesContext> listainstrucciones() {
			return getRuleContexts(ListainstruccionesContext.class);
		}
		public ListainstruccionesContext listainstrucciones(int i) {
			return getRuleContext(ListainstruccionesContext.class,i);
		}
		public ForRangeContext(ForContext ctx) { copyFrom(ctx); }
	}

	public final ForContext for_() throws RecognitionException {
		ForContext _localctx = new ForContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_for);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				_localctx = new ForcondicionContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				match(T__8);
				setState(109);
				expr(0);
				setState(110);
				match(LLAVE_ABRE);
				setState(114);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96465233953698L) != 0)) {
					{
					{
					setState(111);
					listainstrucciones();
					}
					}
					setState(116);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(117);
				match(LLAVE_CIERRA);
				}
				break;
			case 2:
				_localctx = new ForincicializacionContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(119);
				match(T__8);
				setState(122);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(120);
					asignacion();
					}
					break;
				case 2:
					{
					setState(121);
					variables();
					}
					break;
				}
				setState(124);
				match(T__3);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 78872779472896L) != 0)) {
					{
					setState(125);
					expr(0);
					}
				}

				setState(128);
				match(T__3);
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 78872779472896L) != 0)) {
					{
					setState(129);
					expr(0);
					}
				}

				setState(135);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==MASMAS || _la==MENOSMENOS) {
					{
					{
					setState(132);
					_la = _input.LA(1);
					if ( !(_la==MASMAS || _la==MENOSMENOS) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(137);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(138);
				match(LLAVE_ABRE);
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96465233953698L) != 0)) {
					{
					{
					setState(139);
					listainstrucciones();
					}
					}
					setState(144);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(145);
				match(LLAVE_CIERRA);
				}
				break;
			case 3:
				_localctx = new ForRangeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(146);
				match(T__8);
				setState(147);
				match(ID);
				setState(148);
				match(T__2);
				setState(149);
				match(ID);
				setState(150);
				match(DOSPUNTOS_IGUAL);
				setState(151);
				match(T__9);
				setState(152);
				match(ID);
				setState(153);
				match(LLAVE_ABRE);
				setState(157);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 96465233953698L) != 0)) {
					{
					{
					setState(154);
					listainstrucciones();
					}
					}
					setState(159);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(160);
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
	public static class CasesContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ListainstruccionesContext listainstrucciones() {
			return getRuleContext(ListainstruccionesContext.class,0);
		}
		public CasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cases; }
	}

	public final CasesContext cases() throws RecognitionException {
		CasesContext _localctx = new CasesContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_cases);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(T__10);
			setState(164);
			expr(0);
			setState(165);
			match(T__11);
			setState(166);
			listainstrucciones();
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
		public ListainstruccionesContext listainstrucciones() {
			return getRuleContext(ListainstruccionesContext.class,0);
		}
		public DefaultCaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCase; }
	}

	public final DefaultCaseContext defaultCase() throws RecognitionException {
		DefaultCaseContext _localctx = new DefaultCaseContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_defaultCase);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__12);
			setState(169);
			match(T__11);
			setState(170);
			listainstrucciones();
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
	public static class CorchetesContext extends ExprContext {
		public TerminalNode CORCHETE_ABRE() { return getToken(LanguageParser.CORCHETE_ABRE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CORCHETE_CIERRA() { return getToken(LanguageParser.CORCHETE_CIERRA, 0); }
		public CorchetesContext(ExprContext ctx) { copyFrom(ctx); }
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
	public static class CadenaExpresionContext extends ExprContext {
		public TerminalNode CADENA() { return getToken(LanguageParser.CADENA, 0); }
		public CadenaExpresionContext(ExprContext ctx) { copyFrom(ctx); }
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
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(192);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PIZQ:
				{
				_localctx = new ParensContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(173);
				match(PIZQ);
				setState(174);
				expr(0);
				setState(175);
				match(PDER);
				}
				break;
			case CORCHETE_ABRE:
				{
				_localctx = new CorchetesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(177);
				match(CORCHETE_ABRE);
				setState(178);
				expr(0);
				setState(179);
				match(CORCHETE_CIERRA);
				}
				break;
			case T__13:
				{
				_localctx = new OperadorNegacionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(181);
				match(T__13);
				setState(182);
				((OperadorNegacionContext)_localctx).right = expr(15);
				}
				break;
			case T__14:
				{
				_localctx = new NegateContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(183);
				match(T__14);
				setState(184);
				expr(14);
				}
				break;
			case FLOAT:
				{
				_localctx = new FloatContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(185);
				match(FLOAT);
				}
				break;
			case INT:
				{
				_localctx = new IntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(186);
				match(INT);
				}
				break;
			case TRUE:
				{
				_localctx = new BoleanTrueExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(187);
				match(TRUE);
				}
				break;
			case FALSE:
				{
				_localctx = new BoleanFalseExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(188);
				match(FALSE);
				}
				break;
			case CARACTER:
				{
				_localctx = new CaracterExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(189);
				match(CARACTER);
				}
				break;
			case CADENA:
				{
				_localctx = new CadenaExpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(190);
				match(CADENA);
				}
				break;
			case ID:
				{
				_localctx = new IdexpresionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(191);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(214);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
					case 1:
						{
						_localctx = new MulDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(194);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(195);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__15 || _la==T__16) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(196);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ModContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(197);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(198);
						((ModContext)_localctx).op = match(T__17);
						setState(199);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(200);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(201);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__14 || _la==T__18) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(202);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new RelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(203);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(204);
						((RelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 15728640L) != 0)) ) {
							((RelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(205);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new EqualitysContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(206);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(207);
						((EqualitysContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__23 || _la==T__24) ) {
							((EqualitysContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(208);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new LogicosContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(209);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(210);
						((LogicosContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__25 || _la==T__26) ) {
							((LogicosContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(211);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(216);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,20,_ctx);
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
	public static class AsignarVarContext extends AsignacionContext {
		public Token signo;
		public TerminalNode ID() { return getToken(LanguageParser.ID, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode IGUAL() { return getToken(LanguageParser.IGUAL, 0); }
		public TerminalNode DOSPUNTOS_IGUAL() { return getToken(LanguageParser.DOSPUNTOS_IGUAL, 0); }
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

	public final AsignacionContext asignacion() throws RecognitionException {
		AsignacionContext _localctx = new AsignacionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_asignacion);
		int _la;
		try {
			setState(223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				_localctx = new AsignarVarContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(ID);
				setState(218);
				((AsignarVarContext)_localctx).signo = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==IGUAL || _la==DOSPUNTOS_IGUAL) ) {
					((AsignarVarContext)_localctx).signo = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(219);
				expr(0);
				}
				break;
			case 2:
				_localctx = new IncrementoContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(ID);
				setState(221);
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
				setState(222);
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
		enterRule(_localctx, 18, RULE_print);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			match(T__27);
			setState(226);
			match(PIZQ);
			setState(227);
			impresiones(0);
			setState(228);
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
		int _startState = 20;
		enterRecursionRule(_localctx, 20, RULE_impresiones, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(231);
			expr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(238);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ImpresionesContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_impresiones);
					setState(233);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(234);
					match(T__2);
					setState(235);
					expr(0);
					}
					} 
				}
				setState(240);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,22,_ctx);
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
		enterRule(_localctx, 22, RULE_if);
		try {
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(241);
				match(T__4);
				setState(242);
				expr(0);
				setState(243);
				match(LLAVE_ABRE);
				setState(244);
				listainstrucciones();
				setState(245);
				match(LLAVE_CIERRA);
				setState(251);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
				case 1:
					{
					setState(246);
					match(T__5);
					setState(247);
					match(LLAVE_ABRE);
					setState(248);
					listainstrucciones();
					setState(249);
					match(LLAVE_CIERRA);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(253);
				match(T__4);
				setState(254);
				expr(0);
				setState(255);
				match(LLAVE_ABRE);
				setState(256);
				listainstrucciones();
				setState(257);
				match(LLAVE_CIERRA);
				setState(258);
				match(T__5);
				setState(259);
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
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16642998272L) != 0)) ) {
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
		case 7:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 10:
			return impresiones_sempred((ImpresionesContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 13);
		case 1:
			return precpred(_ctx, 12);
		case 2:
			return precpred(_ctx, 11);
		case 3:
			return precpred(_ctx, 10);
		case 4:
			return precpred(_ctx, 9);
		case 5:
			return precpred(_ctx, 8);
		}
		return true;
	}
	private boolean impresiones_sempred(ImpresionesContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u00017\u010a\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0001\u0000\u0005\u0000\u001c\b\u0000\n\u0000\f\u0000\u001f"+
		"\t\u0000\u0001\u0001\u0001\u0001\u0003\u0001#\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002*\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u00028\b\u0002\n\u0002\f\u0002;\t\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002@\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003G\b\u0003\n\u0003\f\u0003J\t\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003T\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0005\u0003`\b\u0003\n\u0003\f\u0003c\t\u0003\u0001"+
		"\u0003\u0003\u0003f\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003"+
		"\u0003k\b\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005"+
		"\u0004q\b\u0004\n\u0004\f\u0004t\t\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004{\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u007f\b\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u0083"+
		"\b\u0004\u0001\u0004\u0005\u0004\u0086\b\u0004\n\u0004\f\u0004\u0089\t"+
		"\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u008d\b\u0004\n\u0004\f\u0004"+
		"\u0090\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004"+
		"\u009c\b\u0004\n\u0004\f\u0004\u009f\t\u0004\u0001\u0004\u0003\u0004\u00a2"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00c1\b\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0005\u0007\u00d5\b\u0007\n\u0007\f\u0007\u00d8\t\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00e0\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0005\n\u00ed\b\n\n\n\f\n\u00f0\t\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0003\u000b\u00fc\b\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u0106\b\u000b\u0001\f\u0001\f\u0001\f\u0000\u0002\u000e\u0014"+
		"\r\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u0000"+
		"\t\u0001\u000045\u0001\u0000\u0010\u0011\u0002\u0000\u000f\u000f\u0013"+
		"\u0013\u0001\u0000\u0014\u0017\u0001\u0000\u0018\u0019\u0001\u0000\u001a"+
		"\u001b\u0001\u000001\u0001\u000023\u0001\u0000\u001d!\u012b\u0000\u001d"+
		"\u0001\u0000\u0000\u0000\u0002\"\u0001\u0000\u0000\u0000\u0004?\u0001"+
		"\u0000\u0000\u0000\u0006j\u0001\u0000\u0000\u0000\b\u00a1\u0001\u0000"+
		"\u0000\u0000\n\u00a3\u0001\u0000\u0000\u0000\f\u00a8\u0001\u0000\u0000"+
		"\u0000\u000e\u00c0\u0001\u0000\u0000\u0000\u0010\u00df\u0001\u0000\u0000"+
		"\u0000\u0012\u00e1\u0001\u0000\u0000\u0000\u0014\u00e6\u0001\u0000\u0000"+
		"\u0000\u0016\u0105\u0001\u0000\u0000\u0000\u0018\u0107\u0001\u0000\u0000"+
		"\u0000\u001a\u001c\u0003\u0002\u0001\u0000\u001b\u001a\u0001\u0000\u0000"+
		"\u0000\u001c\u001f\u0001\u0000\u0000\u0000\u001d\u001b\u0001\u0000\u0000"+
		"\u0000\u001d\u001e\u0001\u0000\u0000\u0000\u001e\u0001\u0001\u0000\u0000"+
		"\u0000\u001f\u001d\u0001\u0000\u0000\u0000 #\u0003\u0004\u0002\u0000!"+
		"#\u0003\u0006\u0003\u0000\" \u0001\u0000\u0000\u0000\"!\u0001\u0000\u0000"+
		"\u0000#\u0003\u0001\u0000\u0000\u0000$%\u0005\u0001\u0000\u0000%&\u0005"+
		")\u0000\u0000&)\u0003\u0018\f\u0000\'(\u00050\u0000\u0000(*\u0003\u000e"+
		"\u0007\u0000)\'\u0001\u0000\u0000\u0000)*\u0001\u0000\u0000\u0000*@\u0001"+
		"\u0000\u0000\u0000+,\u0005\u0001\u0000\u0000,-\u0005)\u0000\u0000-.\u0005"+
		"\u0002\u0000\u0000.@\u0003\u0018\f\u0000/0\u0005)\u0000\u000001\u0005"+
		"0\u0000\u000012\u0005\u0002\u0000\u000023\u0003\u0018\f\u000034\u0005"+
		",\u0000\u000049\u0003\u000e\u0007\u000056\u0005\u0003\u0000\u000068\u0003"+
		"\u000e\u0007\u000075\u0001\u0000\u0000\u00008;\u0001\u0000\u0000\u0000"+
		"97\u0001\u0000\u0000\u00009:\u0001\u0000\u0000\u0000:<\u0001\u0000\u0000"+
		"\u0000;9\u0001\u0000\u0000\u0000<=\u0005-\u0000\u0000=>\u0005\u0004\u0000"+
		"\u0000>@\u0001\u0000\u0000\u0000?$\u0001\u0000\u0000\u0000?+\u0001\u0000"+
		"\u0000\u0000?/\u0001\u0000\u0000\u0000@\u0005\u0001\u0000\u0000\u0000"+
		"Ak\u0003\u000e\u0007\u0000Bk\u0003\u0012\t\u0000Ck\u0003\u0010\b\u0000"+
		"DH\u0005,\u0000\u0000EG\u0003\u0002\u0001\u0000FE\u0001\u0000\u0000\u0000"+
		"GJ\u0001\u0000\u0000\u0000HF\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000"+
		"\u0000IK\u0001\u0000\u0000\u0000JH\u0001\u0000\u0000\u0000Kk\u0005-\u0000"+
		"\u0000LM\u0005\u0005\u0000\u0000MN\u0005*\u0000\u0000NO\u0003\u000e\u0007"+
		"\u0000OP\u0005+\u0000\u0000PS\u0003\u0006\u0003\u0000QR\u0005\u0006\u0000"+
		"\u0000RT\u0003\u0006\u0003\u0000SQ\u0001\u0000\u0000\u0000ST\u0001\u0000"+
		"\u0000\u0000Tk\u0001\u0000\u0000\u0000UV\u0005\u0007\u0000\u0000VW\u0005"+
		"*\u0000\u0000WX\u0003\u000e\u0007\u0000XY\u0005+\u0000\u0000YZ\u0003\u0006"+
		"\u0003\u0000Zk\u0001\u0000\u0000\u0000[\\\u0005\b\u0000\u0000\\]\u0003"+
		"\u000e\u0007\u0000]a\u0005,\u0000\u0000^`\u0003\n\u0005\u0000_^\u0001"+
		"\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000"+
		"\u0000df\u0003\f\u0006\u0000ed\u0001\u0000\u0000\u0000ef\u0001\u0000\u0000"+
		"\u0000fg\u0001\u0000\u0000\u0000gh\u0005-\u0000\u0000hk\u0001\u0000\u0000"+
		"\u0000ik\u0003\b\u0004\u0000jA\u0001\u0000\u0000\u0000jB\u0001\u0000\u0000"+
		"\u0000jC\u0001\u0000\u0000\u0000jD\u0001\u0000\u0000\u0000jL\u0001\u0000"+
		"\u0000\u0000jU\u0001\u0000\u0000\u0000j[\u0001\u0000\u0000\u0000ji\u0001"+
		"\u0000\u0000\u0000k\u0007\u0001\u0000\u0000\u0000lm\u0005\t\u0000\u0000"+
		"mn\u0003\u000e\u0007\u0000nr\u0005,\u0000\u0000oq\u0003\u0002\u0001\u0000"+
		"po\u0001\u0000\u0000\u0000qt\u0001\u0000\u0000\u0000rp\u0001\u0000\u0000"+
		"\u0000rs\u0001\u0000\u0000\u0000su\u0001\u0000\u0000\u0000tr\u0001\u0000"+
		"\u0000\u0000uv\u0005-\u0000\u0000v\u00a2\u0001\u0000\u0000\u0000wz\u0005"+
		"\t\u0000\u0000x{\u0003\u0010\b\u0000y{\u0003\u0004\u0002\u0000zx\u0001"+
		"\u0000\u0000\u0000zy\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000"+
		"{|\u0001\u0000\u0000\u0000|~\u0005\u0004\u0000\u0000}\u007f\u0003\u000e"+
		"\u0007\u0000~}\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\u0082\u0005\u0004\u0000\u0000"+
		"\u0081\u0083\u0003\u000e\u0007\u0000\u0082\u0081\u0001\u0000\u0000\u0000"+
		"\u0082\u0083\u0001\u0000\u0000\u0000\u0083\u0087\u0001\u0000\u0000\u0000"+
		"\u0084\u0086\u0007\u0000\u0000\u0000\u0085\u0084\u0001\u0000\u0000\u0000"+
		"\u0086\u0089\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u008a\u0001\u0000\u0000\u0000"+
		"\u0089\u0087\u0001\u0000\u0000\u0000\u008a\u008e\u0005,\u0000\u0000\u008b"+
		"\u008d\u0003\u0002\u0001\u0000\u008c\u008b\u0001\u0000\u0000\u0000\u008d"+
		"\u0090\u0001\u0000\u0000\u0000\u008e\u008c\u0001\u0000\u0000\u0000\u008e"+
		"\u008f\u0001\u0000\u0000\u0000\u008f\u0091\u0001\u0000\u0000\u0000\u0090"+
		"\u008e\u0001\u0000\u0000\u0000\u0091\u00a2\u0005-\u0000\u0000\u0092\u0093"+
		"\u0005\t\u0000\u0000\u0093\u0094\u0005)\u0000\u0000\u0094\u0095\u0005"+
		"\u0003\u0000\u0000\u0095\u0096\u0005)\u0000\u0000\u0096\u0097\u00051\u0000"+
		"\u0000\u0097\u0098\u0005\n\u0000\u0000\u0098\u0099\u0005)\u0000\u0000"+
		"\u0099\u009d\u0005,\u0000\u0000\u009a\u009c\u0003\u0002\u0001\u0000\u009b"+
		"\u009a\u0001\u0000\u0000\u0000\u009c\u009f\u0001\u0000\u0000\u0000\u009d"+
		"\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e"+
		"\u00a0\u0001\u0000\u0000\u0000\u009f\u009d\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a2\u0005-\u0000\u0000\u00a1l\u0001\u0000\u0000\u0000\u00a1w\u0001"+
		"\u0000\u0000\u0000\u00a1\u0092\u0001\u0000\u0000\u0000\u00a2\t\u0001\u0000"+
		"\u0000\u0000\u00a3\u00a4\u0005\u000b\u0000\u0000\u00a4\u00a5\u0003\u000e"+
		"\u0007\u0000\u00a5\u00a6\u0005\f\u0000\u0000\u00a6\u00a7\u0003\u0002\u0001"+
		"\u0000\u00a7\u000b\u0001\u0000\u0000\u0000\u00a8\u00a9\u0005\r\u0000\u0000"+
		"\u00a9\u00aa\u0005\f\u0000\u0000\u00aa\u00ab\u0003\u0002\u0001\u0000\u00ab"+
		"\r\u0001\u0000\u0000\u0000\u00ac\u00ad\u0006\u0007\uffff\uffff\u0000\u00ad"+
		"\u00ae\u0005*\u0000\u0000\u00ae\u00af\u0003\u000e\u0007\u0000\u00af\u00b0"+
		"\u0005+\u0000\u0000\u00b0\u00c1\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005"+
		".\u0000\u0000\u00b2\u00b3\u0003\u000e\u0007\u0000\u00b3\u00b4\u0005/\u0000"+
		"\u0000\u00b4\u00c1\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005\u000e\u0000"+
		"\u0000\u00b6\u00c1\u0003\u000e\u0007\u000f\u00b7\u00b8\u0005\u000f\u0000"+
		"\u0000\u00b8\u00c1\u0003\u000e\u0007\u000e\u00b9\u00c1\u0005%\u0000\u0000"+
		"\u00ba\u00c1\u0005$\u0000\u0000\u00bb\u00c1\u0005\"\u0000\u0000\u00bc"+
		"\u00c1\u0005#\u0000\u0000\u00bd\u00c1\u0005\'\u0000\u0000\u00be\u00c1"+
		"\u0005(\u0000\u0000\u00bf\u00c1\u0005)\u0000\u0000\u00c0\u00ac\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b1\u0001\u0000\u0000\u0000\u00c0\u00b5\u0001\u0000"+
		"\u0000\u0000\u00c0\u00b7\u0001\u0000\u0000\u0000\u00c0\u00b9\u0001\u0000"+
		"\u0000\u0000\u00c0\u00ba\u0001\u0000\u0000\u0000\u00c0\u00bb\u0001\u0000"+
		"\u0000\u0000\u00c0\u00bc\u0001\u0000\u0000\u0000\u00c0\u00bd\u0001\u0000"+
		"\u0000\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00bf\u0001\u0000"+
		"\u0000\u0000\u00c1\u00d6\u0001\u0000\u0000\u0000\u00c2\u00c3\n\r\u0000"+
		"\u0000\u00c3\u00c4\u0007\u0001\u0000\u0000\u00c4\u00d5\u0003\u000e\u0007"+
		"\u000e\u00c5\u00c6\n\f\u0000\u0000\u00c6\u00c7\u0005\u0012\u0000\u0000"+
		"\u00c7\u00d5\u0003\u000e\u0007\r\u00c8\u00c9\n\u000b\u0000\u0000\u00c9"+
		"\u00ca\u0007\u0002\u0000\u0000\u00ca\u00d5\u0003\u000e\u0007\f\u00cb\u00cc"+
		"\n\n\u0000\u0000\u00cc\u00cd\u0007\u0003\u0000\u0000\u00cd\u00d5\u0003"+
		"\u000e\u0007\u000b\u00ce\u00cf\n\t\u0000\u0000\u00cf\u00d0\u0007\u0004"+
		"\u0000\u0000\u00d0\u00d5\u0003\u000e\u0007\n\u00d1\u00d2\n\b\u0000\u0000"+
		"\u00d2\u00d3\u0007\u0005\u0000\u0000\u00d3\u00d5\u0003\u000e\u0007\t\u00d4"+
		"\u00c2\u0001\u0000\u0000\u0000\u00d4\u00c5\u0001\u0000\u0000\u0000\u00d4"+
		"\u00c8\u0001\u0000\u0000\u0000\u00d4\u00cb\u0001\u0000\u0000\u0000\u00d4"+
		"\u00ce\u0001\u0000\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d5"+
		"\u00d8\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6"+
		"\u00d7\u0001\u0000\u0000\u0000\u00d7\u000f\u0001\u0000\u0000\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00da\u0005)\u0000\u0000\u00da\u00db"+
		"\u0007\u0006\u0000\u0000\u00db\u00e0\u0003\u000e\u0007\u0000\u00dc\u00dd"+
		"\u0005)\u0000\u0000\u00dd\u00de\u0007\u0007\u0000\u0000\u00de\u00e0\u0003"+
		"\u000e\u0007\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df\u00dc\u0001"+
		"\u0000\u0000\u0000\u00e0\u0011\u0001\u0000\u0000\u0000\u00e1\u00e2\u0005"+
		"\u001c\u0000\u0000\u00e2\u00e3\u0005*\u0000\u0000\u00e3\u00e4\u0003\u0014"+
		"\n\u0000\u00e4\u00e5\u0005+\u0000\u0000\u00e5\u0013\u0001\u0000\u0000"+
		"\u0000\u00e6\u00e7\u0006\n\uffff\uffff\u0000\u00e7\u00e8\u0003\u000e\u0007"+
		"\u0000\u00e8\u00ee\u0001\u0000\u0000\u0000\u00e9\u00ea\n\u0002\u0000\u0000"+
		"\u00ea\u00eb\u0005\u0003\u0000\u0000\u00eb\u00ed\u0003\u000e\u0007\u0000"+
		"\u00ec\u00e9\u0001\u0000\u0000\u0000\u00ed\u00f0\u0001\u0000\u0000\u0000"+
		"\u00ee\u00ec\u0001\u0000\u0000\u0000\u00ee\u00ef\u0001\u0000\u0000\u0000"+
		"\u00ef\u0015\u0001\u0000\u0000\u0000\u00f0\u00ee\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0005\u0005\u0000\u0000\u00f2\u00f3\u0003\u000e\u0007\u0000"+
		"\u00f3\u00f4\u0005,\u0000\u0000\u00f4\u00f5\u0003\u0002\u0001\u0000\u00f5"+
		"\u00fb\u0005-\u0000\u0000\u00f6\u00f7\u0005\u0006\u0000\u0000\u00f7\u00f8"+
		"\u0005,\u0000\u0000\u00f8\u00f9\u0003\u0002\u0001\u0000\u00f9\u00fa\u0005"+
		"-\u0000\u0000\u00fa\u00fc\u0001\u0000\u0000\u0000\u00fb\u00f6\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u0106\u0001\u0000"+
		"\u0000\u0000\u00fd\u00fe\u0005\u0005\u0000\u0000\u00fe\u00ff\u0003\u000e"+
		"\u0007\u0000\u00ff\u0100\u0005,\u0000\u0000\u0100\u0101\u0003\u0002\u0001"+
		"\u0000\u0101\u0102\u0005-\u0000\u0000\u0102\u0103\u0005\u0006\u0000\u0000"+
		"\u0103\u0104\u0003\u0016\u000b\u0000\u0104\u0106\u0001\u0000\u0000\u0000"+
		"\u0105\u00f1\u0001\u0000\u0000\u0000\u0105\u00fd\u0001\u0000\u0000\u0000"+
		"\u0106\u0017\u0001\u0000\u0000\u0000\u0107\u0108\u0007\b\u0000\u0000\u0108"+
		"\u0019\u0001\u0000\u0000\u0000\u0019\u001d\")9?HSaejrz~\u0082\u0087\u008e"+
		"\u009d\u00a1\u00c0\u00d4\u00d6\u00df\u00ee\u00fb\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}