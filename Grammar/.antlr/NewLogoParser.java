// Generated from c:/Users/macie/OneDrive/Dokumenty/kompilatory/NewLogo/Grammar/NewLogoParser.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NewLogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, CHAR_CONST=2, STRING_CONST=3, TRUE=4, FALSE=5, PLUS=6, MINUS=7, 
		MULTIPLY=8, DIVIDE=9, MODULO=10, EQUAL=11, NOT_EQUAL=12, LESSER_EQUAL=13, 
		GREATER_EQUAL=14, LESSER=15, GREATER=16, OR=17, AND=18, NOT=19, ASSIGN=20, 
		INC_SELF=21, DEC_SELF=22, MUL_SELF=23, DIV_SELF=24, INCREMENT=25, DECREMENT=26, 
		COMMA=27, SEMICOLON=28, VARIABLE=29, INT=30, CHAR=31, STRING=32, BOOL=33, 
		FORWARD=34, LTURN=35, RTURN=36, LINECOL=37, LINEWIDTH=38, CHANGEBACK=39, 
		CLEAR=40, ISBORDER=41, LBRACKET=42, RBRACKET=43, LCURLY=44, RCURLY=45, 
		WHITESPACE=46, NEWLINE=47, REPEAT=48, WHILE=49, RETURN=50, BREAK=51, IF=52, 
		ELSE=53, PRINT=54, COMMENT=55;
	public static final int
		RULE_program = 0, RULE_sumOp = 1, RULE_mulOp = 2, RULE_atom = 3, RULE_brExpression = 4, 
		RULE_mulExpression = 5, RULE_mathExpression = 6, RULE_boolConst = 7, RULE_compOp = 8, 
		RULE_compExpression = 9, RULE_logicOp = 10, RULE_logicBrExpression = 11, 
		RULE_logicExpression = 12, RULE_varType = 13, RULE_varDeclaration = 14, 
		RULE_value = 15, RULE_selfOp = 16, RULE_varAssign = 17, RULE_incOrDec = 18, 
		RULE_varIncrement = 19, RULE_argument = 20, RULE_arguments = 21, RULE_funcDefinition = 22, 
		RULE_drawingFunction = 23, RULE_function = 24, RULE_callArguments = 25, 
		RULE_functionCall = 26, RULE_statement = 27, RULE_conditionalStatement = 28, 
		RULE_loopStatement = 29, RULE_breakStatement = 30, RULE_returnStatement = 31, 
		RULE_printStatement = 32;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sumOp", "mulOp", "atom", "brExpression", "mulExpression", 
			"mathExpression", "boolConst", "compOp", "compExpression", "logicOp", 
			"logicBrExpression", "logicExpression", "varType", "varDeclaration", 
			"value", "selfOp", "varAssign", "incOrDec", "varIncrement", "argument", 
			"arguments", "funcDefinition", "drawingFunction", "function", "callArguments", 
			"functionCall", "statement", "conditionalStatement", "loopStatement", 
			"breakStatement", "returnStatement", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'+'", "'-'", "'*'", "'/'", "'%'", 
			"'=='", "'!='", "'<='", "'>='", "'<'", "'>'", "'||'", "'&&'", "'!'", 
			"'='", "'+='", "'-='", "'*='", "'/='", "'++'", "'--'", "','", "';'", 
			null, "'int'", "'char'", "'string'", "'bool'", "'forward'", "'lturn'", 
			"'rturn'", "'linecol'", "'linewidth'", "'changeback'", "'clear'", "'isborder'", 
			"'('", "')'", "'{'", "'}'", null, null, "'repeat'", "'while'", "'return'", 
			"'break'", "'if'", "'else'", "'print'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "NUMBER", "CHAR_CONST", "STRING_CONST", "TRUE", "FALSE", "PLUS", 
			"MINUS", "MULTIPLY", "DIVIDE", "MODULO", "EQUAL", "NOT_EQUAL", "LESSER_EQUAL", 
			"GREATER_EQUAL", "LESSER", "GREATER", "OR", "AND", "NOT", "ASSIGN", "INC_SELF", 
			"DEC_SELF", "MUL_SELF", "DIV_SELF", "INCREMENT", "DECREMENT", "COMMA", 
			"SEMICOLON", "VARIABLE", "INT", "CHAR", "STRING", "BOOL", "FORWARD", 
			"LTURN", "RTURN", "LINECOL", "LINEWIDTH", "CHANGEBACK", "CLEAR", "ISBORDER", 
			"LBRACKET", "RBRACKET", "LCURLY", "RCURLY", "WHITESPACE", "NEWLINE", 
			"REPEAT", "WHILE", "RETURN", "BREAK", "IF", "ELSE", "PRINT", "COMMENT"
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
	public String getGrammarFileName() { return "NewLogoParser.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public NewLogoParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public List<FuncDefinitionContext> funcDefinition() {
			return getRuleContexts(FuncDefinitionContext.class);
		}
		public FuncDefinitionContext funcDefinition(int i) {
			return getRuleContext(FuncDefinitionContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
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
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) {
				{
				{
				setState(66);
				funcDefinition();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(75);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8734503728054402L) != 0)) {
				{
				{
				setState(72);
				statement();
				}
				}
				setState(77);
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
	public static class SumOpContext extends ParserRuleContext {
		public TerminalNode PLUS() { return getToken(NewLogoParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(NewLogoParser.MINUS, 0); }
		public SumOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sumOp; }
	}

	public final SumOpContext sumOp() throws RecognitionException {
		SumOpContext _localctx = new SumOpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sumOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			_la = _input.LA(1);
			if ( !(_la==PLUS || _la==MINUS) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class MulOpContext extends ParserRuleContext {
		public TerminalNode MULTIPLY() { return getToken(NewLogoParser.MULTIPLY, 0); }
		public TerminalNode DIVIDE() { return getToken(NewLogoParser.DIVIDE, 0); }
		public TerminalNode MODULO() { return getToken(NewLogoParser.MODULO, 0); }
		public MulOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulOp; }
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class AtomContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NewLogoParser.NUMBER, 0); }
		public TerminalNode MINUS() { return getToken(NewLogoParser.MINUS, 0); }
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(82);
				match(MINUS);
				}
			}

			setState(85);
			match(NUMBER);
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
	public static class BrExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public BrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_brExpression; }
	}

	public final BrExpressionContext brExpression() throws RecognitionException {
		BrExpressionContext _localctx = new BrExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(LBRACKET);
			setState(88);
			mathExpression();
			setState(89);
			match(RBRACKET);
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
	public static class MulExpressionContext extends ParserRuleContext {
		public List<AtomContext> atom() {
			return getRuleContexts(AtomContext.class);
		}
		public AtomContext atom(int i) {
			return getRuleContext(AtomContext.class,i);
		}
		public List<BrExpressionContext> brExpression() {
			return getRuleContexts(BrExpressionContext.class);
		}
		public BrExpressionContext brExpression(int i) {
			return getRuleContext(BrExpressionContext.class,i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(NewLogoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(NewLogoParser.VARIABLE, i);
		}
		public List<MulOpContext> mulOp() {
			return getRuleContexts(MulOpContext.class);
		}
		public MulOpContext mulOp(int i) {
			return getRuleContext(MulOpContext.class,i);
		}
		public MulExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mulExpression; }
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mulExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMBER:
			case MINUS:
				{
				setState(91);
				atom();
				}
				break;
			case LBRACKET:
				{
				setState(92);
				brExpression();
				}
				break;
			case VARIABLE:
				{
				setState(93);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(104);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1792L) != 0)) {
				{
				{
				setState(96);
				mulOp();
				setState(100);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUMBER:
				case MINUS:
					{
					setState(97);
					atom();
					}
					break;
				case LBRACKET:
					{
					setState(98);
					brExpression();
					}
					break;
				case VARIABLE:
					{
					setState(99);
					match(VARIABLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(106);
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
	public static class MathExpressionContext extends ParserRuleContext {
		public List<MulExpressionContext> mulExpression() {
			return getRuleContexts(MulExpressionContext.class);
		}
		public MulExpressionContext mulExpression(int i) {
			return getRuleContext(MulExpressionContext.class,i);
		}
		public List<SumOpContext> sumOp() {
			return getRuleContexts(SumOpContext.class);
		}
		public SumOpContext sumOp(int i) {
			return getRuleContext(SumOpContext.class,i);
		}
		public MathExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mathExpression; }
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			mulExpression();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(108);
				sumOp();
				setState(109);
				mulExpression();
				}
				}
				setState(115);
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
	public static class BoolConstContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(NewLogoParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(NewLogoParser.FALSE, 0); }
		public BoolConstContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolConst; }
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompOpContext extends ParserRuleContext {
		public TerminalNode LESSER() { return getToken(NewLogoParser.LESSER, 0); }
		public TerminalNode GREATER() { return getToken(NewLogoParser.GREATER, 0); }
		public TerminalNode LESSER_EQUAL() { return getToken(NewLogoParser.LESSER_EQUAL, 0); }
		public TerminalNode GREATER_EQUAL() { return getToken(NewLogoParser.GREATER_EQUAL, 0); }
		public TerminalNode EQUAL() { return getToken(NewLogoParser.EQUAL, 0); }
		public TerminalNode NOT_EQUAL() { return getToken(NewLogoParser.NOT_EQUAL, 0); }
		public CompOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compOp; }
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class CompExpressionContext extends ParserRuleContext {
		public List<BoolConstContext> boolConst() {
			return getRuleContexts(BoolConstContext.class);
		}
		public BoolConstContext boolConst(int i) {
			return getRuleContext(BoolConstContext.class,i);
		}
		public List<TerminalNode> VARIABLE() { return getTokens(NewLogoParser.VARIABLE); }
		public TerminalNode VARIABLE(int i) {
			return getToken(NewLogoParser.VARIABLE, i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpression; }
	}

	public final CompExpressionContext compExpression() throws RecognitionException {
		CompExpressionContext _localctx = new CompExpressionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TRUE:
			case FALSE:
				{
				setState(120);
				boolConst();
				}
				break;
			case VARIABLE:
				{
				setState(121);
				match(VARIABLE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(129);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 129024L) != 0)) {
				{
				setState(124);
				compOp();
				setState(127);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TRUE:
				case FALSE:
					{
					setState(125);
					boolConst();
					}
					break;
				case VARIABLE:
					{
					setState(126);
					match(VARIABLE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
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
	public static class LogicOpContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(NewLogoParser.AND, 0); }
		public TerminalNode OR() { return getToken(NewLogoParser.OR, 0); }
		public LogicOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicOp; }
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			_la = _input.LA(1);
			if ( !(_la==OR || _la==AND) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class LogicBrExpressionContext extends ParserRuleContext {
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public LogicBrExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicBrExpression; }
	}

	public final LogicBrExpressionContext logicBrExpression() throws RecognitionException {
		LogicBrExpressionContext _localctx = new LogicBrExpressionContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicBrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LBRACKET);
			setState(134);
			logicExpression();
			setState(135);
			match(RBRACKET);
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
	public static class LogicExpressionContext extends ParserRuleContext {
		public CompExpressionContext compExpression() {
			return getRuleContext(CompExpressionContext.class,0);
		}
		public List<MathExpressionContext> mathExpression() {
			return getRuleContexts(MathExpressionContext.class);
		}
		public MathExpressionContext mathExpression(int i) {
			return getRuleContext(MathExpressionContext.class,i);
		}
		public LogicBrExpressionContext logicBrExpression() {
			return getRuleContext(LogicBrExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(NewLogoParser.NOT, 0); }
		public List<LogicOpContext> logicOp() {
			return getRuleContexts(LogicOpContext.class);
		}
		public LogicOpContext logicOp(int i) {
			return getRuleContext(LogicOpContext.class,i);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicExpression);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				compExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(138);
					match(NOT);
					}
				}

				setState(143);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(141);
					mathExpression();
					}
					break;
				case 2:
					{
					setState(142);
					logicBrExpression();
					}
					break;
				}
				setState(150);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OR || _la==AND) {
					{
					{
					setState(145);
					logicOp();
					setState(146);
					mathExpression();
					}
					}
					setState(152);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NewLogoParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(NewLogoParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(NewLogoParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(NewLogoParser.STRING, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(155);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16106127360L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarDeclarationContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_varDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			varType();
			setState(158);
			match(VARIABLE);
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
	public static class ValueContext extends ParserRuleContext {
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode STRING_CONST() { return getToken(NewLogoParser.STRING_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(NewLogoParser.CHAR_CONST, 0); }
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_value);
		try {
			setState(165);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(160);
				mathExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(161);
				logicExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(162);
				match(STRING_CONST);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(163);
				match(CHAR_CONST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(164);
				match(VARIABLE);
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
	public static class SelfOpContext extends ParserRuleContext {
		public TerminalNode INC_SELF() { return getToken(NewLogoParser.INC_SELF, 0); }
		public TerminalNode DEC_SELF() { return getToken(NewLogoParser.DEC_SELF, 0); }
		public TerminalNode MUL_SELF() { return getToken(NewLogoParser.MUL_SELF, 0); }
		public TerminalNode DIV_SELF() { return getToken(NewLogoParser.DIV_SELF, 0); }
		public SelfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selfOp; }
	}

	public final SelfOpContext selfOp() throws RecognitionException {
		SelfOpContext _localctx = new SelfOpContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_selfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31457280L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarAssignContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public SelfOpContext selfOp() {
			return getRuleContext(SelfOpContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(NewLogoParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarAssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varAssign; }
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(VARIABLE);
			setState(175);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(170);
				match(ASSIGN);
				setState(171);
				value();
				}
				}
				break;
			case INC_SELF:
			case DEC_SELF:
			case MUL_SELF:
			case DIV_SELF:
				{
				setState(172);
				selfOp();
				setState(173);
				mathExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
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
	public static class IncOrDecContext extends ParserRuleContext {
		public TerminalNode INCREMENT() { return getToken(NewLogoParser.INCREMENT, 0); }
		public TerminalNode DECREMENT() { return getToken(NewLogoParser.DECREMENT, 0); }
		public IncOrDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_incOrDec; }
	}

	public final IncOrDecContext incOrDec() throws RecognitionException {
		IncOrDecContext _localctx = new IncOrDecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_incOrDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !(_la==INCREMENT || _la==DECREMENT) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class VarIncrementContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public IncOrDecContext incOrDec() {
			return getRuleContext(IncOrDecContext.class,0);
		}
		public VarIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIncrement; }
	}

	public final VarIncrementContext varIncrement() throws RecognitionException {
		VarIncrementContext _localctx = new VarIncrementContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(VARIABLE);
			setState(180);
			incOrDec();
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
	public static class ArgumentContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(182);
			varType();
			setState(183);
			match(VARIABLE);
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
	public static class ArgumentsContext extends ParserRuleContext {
		public List<ArgumentContext> argument() {
			return getRuleContexts(ArgumentContext.class);
		}
		public ArgumentContext argument(int i) {
			return getRuleContext(ArgumentContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NewLogoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NewLogoParser.COMMA, i);
		}
		public ArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arguments; }
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			argument();
			setState(190);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(186);
				match(COMMA);
				setState(187);
				argument();
				}
				}
				setState(192);
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
	public static class FuncDefinitionContext extends ParserRuleContext {
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(NewLogoParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(NewLogoParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public FuncDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcDefinition; }
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			varType();
			setState(194);
			match(VARIABLE);
			setState(195);
			match(LBRACKET);
			setState(196);
			arguments();
			setState(197);
			match(RBRACKET);
			setState(198);
			match(LCURLY);
			setState(202);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8734503728054402L) != 0)) {
				{
				{
				setState(199);
				statement();
				}
				}
				setState(204);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(205);
			match(RCURLY);
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
	public static class DrawingFunctionContext extends ParserRuleContext {
		public TerminalNode FORWARD() { return getToken(NewLogoParser.FORWARD, 0); }
		public TerminalNode RTURN() { return getToken(NewLogoParser.RTURN, 0); }
		public TerminalNode LTURN() { return getToken(NewLogoParser.LTURN, 0); }
		public TerminalNode LINECOL() { return getToken(NewLogoParser.LINECOL, 0); }
		public TerminalNode LINEWIDTH() { return getToken(NewLogoParser.LINEWIDTH, 0); }
		public TerminalNode CHANGEBACK() { return getToken(NewLogoParser.CHANGEBACK, 0); }
		public TerminalNode CLEAR() { return getToken(NewLogoParser.CLEAR, 0); }
		public TerminalNode ISBORDER() { return getToken(NewLogoParser.ISBORDER, 0); }
		public DrawingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawingFunction; }
	}

	public final DrawingFunctionContext drawingFunction() throws RecognitionException {
		DrawingFunctionContext _localctx = new DrawingFunctionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_drawingFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4380866641920L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public DrawingFunctionContext drawingFunction() {
			return getRuleContext(DrawingFunctionContext.class,0);
		}
		public FunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function; }
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_function);
		try {
			setState(211);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(209);
				match(VARIABLE);
				}
				break;
			case FORWARD:
			case LTURN:
			case RTURN:
			case LINECOL:
			case LINEWIDTH:
			case CHANGEBACK:
			case CLEAR:
			case ISBORDER:
				enterOuterAlt(_localctx, 2);
				{
				setState(210);
				drawingFunction();
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
	public static class CallArgumentsContext extends ParserRuleContext {
		public List<ValueContext> value() {
			return getRuleContexts(ValueContext.class);
		}
		public ValueContext value(int i) {
			return getRuleContext(ValueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(NewLogoParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(NewLogoParser.COMMA, i);
		}
		public CallArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArguments; }
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			value();
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(214);
				match(COMMA);
				setState(215);
				value();
				}
				}
				setState(220);
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
	public static class FunctionCallContext extends ParserRuleContext {
		public FunctionContext function() {
			return getRuleContext(FunctionContext.class,0);
		}
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public CallArgumentsContext callArguments() {
			return getRuleContext(CallArgumentsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			function();
			setState(222);
			match(LBRACKET);
			setState(223);
			callArguments();
			setState(224);
			match(RBRACKET);
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
	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SEMICOLON() { return getToken(NewLogoParser.SEMICOLON, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public LoopStatementContext loopStatement() {
			return getRuleContext(LoopStatementContext.class,0);
		}
		public BreakStatementContext breakStatement() {
			return getRuleContext(BreakStatementContext.class,0);
		}
		public ReturnStatementContext returnStatement() {
			return getRuleContext(ReturnStatementContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(226);
				mathExpression();
				}
				break;
			case 2:
				{
				setState(227);
				conditionalStatement();
				}
				break;
			case 3:
				{
				setState(228);
				loopStatement();
				}
				break;
			case 4:
				{
				setState(229);
				breakStatement();
				}
				break;
			case 5:
				{
				setState(230);
				returnStatement();
				}
				break;
			case 6:
				{
				setState(231);
				functionCall();
				}
				break;
			}
			setState(234);
			match(SEMICOLON);
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
	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NewLogoParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(NewLogoParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(NewLogoParser.LCURLY, i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(NewLogoParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(NewLogoParser.RCURLY, i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(NewLogoParser.ELSE, 0); }
		public ConditionalStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionalStatement; }
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(IF);
			setState(237);
			match(LBRACKET);
			setState(238);
			logicExpression();
			setState(239);
			match(RBRACKET);
			setState(240);
			match(LCURLY);
			setState(244);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8734503728054402L) != 0)) {
				{
				{
				setState(241);
				statement();
				}
				}
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(247);
			match(RCURLY);
			setState(257);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(248);
				match(ELSE);
				setState(249);
				match(LCURLY);
				setState(253);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8734503728054402L) != 0)) {
					{
					{
					setState(250);
					statement();
					}
					}
					setState(255);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(256);
				match(RCURLY);
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
	public static class LoopStatementContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NewLogoParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(NewLogoParser.LCURLY, 0); }
		public TerminalNode RCURLY() { return getToken(NewLogoParser.RCURLY, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode REPEAT() { return getToken(NewLogoParser.REPEAT, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LoopStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loopStatement; }
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_loopStatement);
		int _la;
		try {
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(259);
				match(WHILE);
				setState(260);
				match(LBRACKET);
				setState(261);
				logicExpression();
				setState(262);
				match(RBRACKET);
				setState(263);
				match(LCURLY);
				setState(267);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8734503728054402L) != 0)) {
					{
					{
					setState(264);
					statement();
					}
					}
					setState(269);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(270);
				match(RCURLY);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(272);
				match(REPEAT);
				setState(273);
				match(LBRACKET);
				setState(274);
				mathExpression();
				setState(275);
				match(RBRACKET);
				setState(276);
				match(LCURLY);
				setState(280);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 8734503728054402L) != 0)) {
					{
					{
					setState(277);
					statement();
					}
					}
					setState(282);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(283);
				match(RCURLY);
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
	public static class BreakStatementContext extends ParserRuleContext {
		public TerminalNode BREAK() { return getToken(NewLogoParser.BREAK, 0); }
		public BreakStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_breakStatement; }
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			match(BREAK);
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
	public static class ReturnStatementContext extends ParserRuleContext {
		public TerminalNode RETURN() { return getToken(NewLogoParser.RETURN, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public ConditionalStatementContext conditionalStatement() {
			return getRuleContext(ConditionalStatementContext.class,0);
		}
		public TerminalNode STRING() { return getToken(NewLogoParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(NewLogoParser.CHAR, 0); }
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(289);
			match(RETURN);
			setState(295);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
			case 1:
				{
				setState(290);
				mathExpression();
				}
				break;
			case 2:
				{
				setState(291);
				conditionalStatement();
				}
				break;
			case 3:
				{
				setState(292);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(293);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(294);
				match(VARIABLE);
				}
				break;
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
	public static class PrintStatementContext extends ParserRuleContext {
		public TerminalNode PRINT() { return getToken(NewLogoParser.PRINT, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public TerminalNode STRING() { return getToken(NewLogoParser.STRING, 0); }
		public TerminalNode CHAR() { return getToken(NewLogoParser.CHAR, 0); }
		public PrintStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStatement; }
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_printStatement);
		try {
			setState(305);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(297);
				match(PRINT);
				setState(298);
				mathExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(299);
				match(PRINT);
				setState(300);
				logicExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(301);
				match(PRINT);
				setState(302);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(303);
				match(PRINT);
				setState(304);
				match(CHAR);
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

	public static final String _serializedATN =
		"\u0004\u00017\u0134\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0001\u0000\u0005\u0000D\b\u0000"+
		"\n\u0000\f\u0000G\t\u0000\u0001\u0000\u0005\u0000J\b\u0000\n\u0000\f\u0000"+
		"M\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0003\u0003T\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"_\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005"+
		"e\b\u0005\u0005\u0005g\b\u0005\n\u0005\f\u0005j\t\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0005\u0006p\b\u0006\n\u0006\f\u0006s\t"+
		"\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t"+
		"{\b\t\u0001\t\u0001\t\u0001\t\u0003\t\u0080\b\t\u0003\t\u0082\b\t\u0001"+
		"\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0003\f\u008c\b\f\u0001\f\u0001\f\u0003\f\u0090\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0005\f\u0095\b\f\n\f\f\f\u0098\t\f\u0003\f\u009a\b\f\u0001\r"+
		"\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00a6\b\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0003\u0011\u00b0\b\u0011\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0005\u0015\u00bd\b\u0015\n\u0015\f\u0015\u00c0\t\u0015"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u00c9\b\u0016\n\u0016\f\u0016\u00cc\t\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u00d4\b\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0005\u0019\u00d9"+
		"\b\u0019\n\u0019\f\u0019\u00dc\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u00e9\b\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0005\u001c\u00f3\b\u001c\n\u001c\f\u001c\u00f6\t\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u00fc\b\u001c\n\u001c\f\u001c"+
		"\u00ff\t\u001c\u0001\u001c\u0003\u001c\u0102\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u010a"+
		"\b\u001d\n\u001d\f\u001d\u010d\t\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d"+
		"\u0117\b\u001d\n\u001d\f\u001d\u011a\t\u001d\u0001\u001d\u0001\u001d\u0003"+
		"\u001d\u011e\b\u001d\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0003\u001f\u0128\b\u001f\u0001"+
		" \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0001 \u0003 \u0132\b \u0001"+
		" \u0000\u0000!\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@\u0000\t\u0001\u0000\u0006\u0007"+
		"\u0001\u0000\b\n\u0001\u0000\u0004\u0005\u0001\u0000\u000b\u0010\u0001"+
		"\u0000\u0011\u0012\u0001\u0000\u001e!\u0001\u0000\u0015\u0018\u0001\u0000"+
		"\u0019\u001a\u0001\u0000\")\u013d\u0000E\u0001\u0000\u0000\u0000\u0002"+
		"N\u0001\u0000\u0000\u0000\u0004P\u0001\u0000\u0000\u0000\u0006S\u0001"+
		"\u0000\u0000\u0000\bW\u0001\u0000\u0000\u0000\n^\u0001\u0000\u0000\u0000"+
		"\fk\u0001\u0000\u0000\u0000\u000et\u0001\u0000\u0000\u0000\u0010v\u0001"+
		"\u0000\u0000\u0000\u0012z\u0001\u0000\u0000\u0000\u0014\u0083\u0001\u0000"+
		"\u0000\u0000\u0016\u0085\u0001\u0000\u0000\u0000\u0018\u0099\u0001\u0000"+
		"\u0000\u0000\u001a\u009b\u0001\u0000\u0000\u0000\u001c\u009d\u0001\u0000"+
		"\u0000\u0000\u001e\u00a5\u0001\u0000\u0000\u0000 \u00a7\u0001\u0000\u0000"+
		"\u0000\"\u00a9\u0001\u0000\u0000\u0000$\u00b1\u0001\u0000\u0000\u0000"+
		"&\u00b3\u0001\u0000\u0000\u0000(\u00b6\u0001\u0000\u0000\u0000*\u00b9"+
		"\u0001\u0000\u0000\u0000,\u00c1\u0001\u0000\u0000\u0000.\u00cf\u0001\u0000"+
		"\u0000\u00000\u00d3\u0001\u0000\u0000\u00002\u00d5\u0001\u0000\u0000\u0000"+
		"4\u00dd\u0001\u0000\u0000\u00006\u00e8\u0001\u0000\u0000\u00008\u00ec"+
		"\u0001\u0000\u0000\u0000:\u011d\u0001\u0000\u0000\u0000<\u011f\u0001\u0000"+
		"\u0000\u0000>\u0121\u0001\u0000\u0000\u0000@\u0131\u0001\u0000\u0000\u0000"+
		"BD\u0003,\u0016\u0000CB\u0001\u0000\u0000\u0000DG\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FK\u0001\u0000\u0000"+
		"\u0000GE\u0001\u0000\u0000\u0000HJ\u00036\u001b\u0000IH\u0001\u0000\u0000"+
		"\u0000JM\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000KL\u0001\u0000"+
		"\u0000\u0000L\u0001\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000\u0000"+
		"NO\u0007\u0000\u0000\u0000O\u0003\u0001\u0000\u0000\u0000PQ\u0007\u0001"+
		"\u0000\u0000Q\u0005\u0001\u0000\u0000\u0000RT\u0005\u0007\u0000\u0000"+
		"SR\u0001\u0000\u0000\u0000ST\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000"+
		"\u0000UV\u0005\u0001\u0000\u0000V\u0007\u0001\u0000\u0000\u0000WX\u0005"+
		"*\u0000\u0000XY\u0003\f\u0006\u0000YZ\u0005+\u0000\u0000Z\t\u0001\u0000"+
		"\u0000\u0000[_\u0003\u0006\u0003\u0000\\_\u0003\b\u0004\u0000]_\u0005"+
		"\u001d\u0000\u0000^[\u0001\u0000\u0000\u0000^\\\u0001\u0000\u0000\u0000"+
		"^]\u0001\u0000\u0000\u0000_h\u0001\u0000\u0000\u0000`d\u0003\u0004\u0002"+
		"\u0000ae\u0003\u0006\u0003\u0000be\u0003\b\u0004\u0000ce\u0005\u001d\u0000"+
		"\u0000da\u0001\u0000\u0000\u0000db\u0001\u0000\u0000\u0000dc\u0001\u0000"+
		"\u0000\u0000eg\u0001\u0000\u0000\u0000f`\u0001\u0000\u0000\u0000gj\u0001"+
		"\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000"+
		"i\u000b\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000kq\u0003\n\u0005"+
		"\u0000lm\u0003\u0002\u0001\u0000mn\u0003\n\u0005\u0000np\u0001\u0000\u0000"+
		"\u0000ol\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000"+
		"\u0000\u0000qr\u0001\u0000\u0000\u0000r\r\u0001\u0000\u0000\u0000sq\u0001"+
		"\u0000\u0000\u0000tu\u0007\u0002\u0000\u0000u\u000f\u0001\u0000\u0000"+
		"\u0000vw\u0007\u0003\u0000\u0000w\u0011\u0001\u0000\u0000\u0000x{\u0003"+
		"\u000e\u0007\u0000y{\u0005\u001d\u0000\u0000zx\u0001\u0000\u0000\u0000"+
		"zy\u0001\u0000\u0000\u0000{\u0081\u0001\u0000\u0000\u0000|\u007f\u0003"+
		"\u0010\b\u0000}\u0080\u0003\u000e\u0007\u0000~\u0080\u0005\u001d\u0000"+
		"\u0000\u007f}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080"+
		"\u0082\u0001\u0000\u0000\u0000\u0081|\u0001\u0000\u0000\u0000\u0081\u0082"+
		"\u0001\u0000\u0000\u0000\u0082\u0013\u0001\u0000\u0000\u0000\u0083\u0084"+
		"\u0007\u0004\u0000\u0000\u0084\u0015\u0001\u0000\u0000\u0000\u0085\u0086"+
		"\u0005*\u0000\u0000\u0086\u0087\u0003\u0018\f\u0000\u0087\u0088\u0005"+
		"+\u0000\u0000\u0088\u0017\u0001\u0000\u0000\u0000\u0089\u009a\u0003\u0012"+
		"\t\u0000\u008a\u008c\u0005\u0013\u0000\u0000\u008b\u008a\u0001\u0000\u0000"+
		"\u0000\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000"+
		"\u0000\u008d\u0090\u0003\f\u0006\u0000\u008e\u0090\u0003\u0016\u000b\u0000"+
		"\u008f\u008d\u0001\u0000\u0000\u0000\u008f\u008e\u0001\u0000\u0000\u0000"+
		"\u0090\u0096\u0001\u0000\u0000\u0000\u0091\u0092\u0003\u0014\n\u0000\u0092"+
		"\u0093\u0003\f\u0006\u0000\u0093\u0095\u0001\u0000\u0000\u0000\u0094\u0091"+
		"\u0001\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\u009a"+
		"\u0001\u0000\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u0089"+
		"\u0001\u0000\u0000\u0000\u0099\u008b\u0001\u0000\u0000\u0000\u009a\u0019"+
		"\u0001\u0000\u0000\u0000\u009b\u009c\u0007\u0005\u0000\u0000\u009c\u001b"+
		"\u0001\u0000\u0000\u0000\u009d\u009e\u0003\u001a\r\u0000\u009e\u009f\u0005"+
		"\u001d\u0000\u0000\u009f\u001d\u0001\u0000\u0000\u0000\u00a0\u00a6\u0003"+
		"\f\u0006\u0000\u00a1\u00a6\u0003\u0018\f\u0000\u00a2\u00a6\u0005\u0003"+
		"\u0000\u0000\u00a3\u00a6\u0005\u0002\u0000\u0000\u00a4\u00a6\u0005\u001d"+
		"\u0000\u0000\u00a5\u00a0\u0001\u0000\u0000\u0000\u00a5\u00a1\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a2\u0001\u0000\u0000\u0000\u00a5\u00a3\u0001\u0000"+
		"\u0000\u0000\u00a5\u00a4\u0001\u0000\u0000\u0000\u00a6\u001f\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0007\u0006\u0000\u0000\u00a8!\u0001\u0000\u0000"+
		"\u0000\u00a9\u00af\u0005\u001d\u0000\u0000\u00aa\u00ab\u0005\u0014\u0000"+
		"\u0000\u00ab\u00b0\u0003\u001e\u000f\u0000\u00ac\u00ad\u0003 \u0010\u0000"+
		"\u00ad\u00ae\u0003\f\u0006\u0000\u00ae\u00b0\u0001\u0000\u0000\u0000\u00af"+
		"\u00aa\u0001\u0000\u0000\u0000\u00af\u00ac\u0001\u0000\u0000\u0000\u00b0"+
		"#\u0001\u0000\u0000\u0000\u00b1\u00b2\u0007\u0007\u0000\u0000\u00b2%\u0001"+
		"\u0000\u0000\u0000\u00b3\u00b4\u0005\u001d\u0000\u0000\u00b4\u00b5\u0003"+
		"$\u0012\u0000\u00b5\'\u0001\u0000\u0000\u0000\u00b6\u00b7\u0003\u001a"+
		"\r\u0000\u00b7\u00b8\u0005\u001d\u0000\u0000\u00b8)\u0001\u0000\u0000"+
		"\u0000\u00b9\u00be\u0003(\u0014\u0000\u00ba\u00bb\u0005\u001b\u0000\u0000"+
		"\u00bb\u00bd\u0003(\u0014\u0000\u00bc\u00ba\u0001\u0000\u0000\u0000\u00bd"+
		"\u00c0\u0001\u0000\u0000\u0000\u00be\u00bc\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0001\u0000\u0000\u0000\u00bf+\u0001\u0000\u0000\u0000\u00c0\u00be"+
		"\u0001\u0000\u0000\u0000\u00c1\u00c2\u0003\u001a\r\u0000\u00c2\u00c3\u0005"+
		"\u001d\u0000\u0000\u00c3\u00c4\u0005*\u0000\u0000\u00c4\u00c5\u0003*\u0015"+
		"\u0000\u00c5\u00c6\u0005+\u0000\u0000\u00c6\u00ca\u0005,\u0000\u0000\u00c7"+
		"\u00c9\u00036\u001b\u0000\u00c8\u00c7\u0001\u0000\u0000\u0000\u00c9\u00cc"+
		"\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001\u0000\u0000\u0000\u00ca\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cb\u00cd\u0001\u0000\u0000\u0000\u00cc\u00ca"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005-\u0000\u0000\u00ce-\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0007\b\u0000\u0000\u00d0/\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0005\u001d\u0000\u0000\u00d2\u00d4\u0003.\u0017\u0000"+
		"\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d41\u0001\u0000\u0000\u0000\u00d5\u00da\u0003\u001e\u000f\u0000\u00d6"+
		"\u00d7\u0005\u001b\u0000\u0000\u00d7\u00d9\u0003\u001e\u000f\u0000\u00d8"+
		"\u00d6\u0001\u0000\u0000\u0000\u00d9\u00dc\u0001\u0000\u0000\u0000\u00da"+
		"\u00d8\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db"+
		"3\u0001\u0000\u0000\u0000\u00dc\u00da\u0001\u0000\u0000\u0000\u00dd\u00de"+
		"\u00030\u0018\u0000\u00de\u00df\u0005*\u0000\u0000\u00df\u00e0\u00032"+
		"\u0019\u0000\u00e0\u00e1\u0005+\u0000\u0000\u00e15\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e9\u0003\f\u0006\u0000\u00e3\u00e9\u00038\u001c\u0000\u00e4"+
		"\u00e9\u0003:\u001d\u0000\u00e5\u00e9\u0003<\u001e\u0000\u00e6\u00e9\u0003"+
		">\u001f\u0000\u00e7\u00e9\u00034\u001a\u0000\u00e8\u00e2\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e3\u0001\u0000\u0000\u0000\u00e8\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e5\u0001\u0000\u0000\u0000\u00e8\u00e6\u0001\u0000\u0000"+
		"\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000\u00e9\u00ea\u0001\u0000\u0000"+
		"\u0000\u00ea\u00eb\u0005\u001c\u0000\u0000\u00eb7\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u00054\u0000\u0000\u00ed\u00ee\u0005*\u0000\u0000\u00ee\u00ef"+
		"\u0003\u0018\f\u0000\u00ef\u00f0\u0005+\u0000\u0000\u00f0\u00f4\u0005"+
		",\u0000\u0000\u00f1\u00f3\u00036\u001b\u0000\u00f2\u00f1\u0001\u0000\u0000"+
		"\u0000\u00f3\u00f6\u0001\u0000\u0000\u0000\u00f4\u00f2\u0001\u0000\u0000"+
		"\u0000\u00f4\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f7\u0001\u0000\u0000"+
		"\u0000\u00f6\u00f4\u0001\u0000\u0000\u0000\u00f7\u0101\u0005-\u0000\u0000"+
		"\u00f8\u00f9\u00055\u0000\u0000\u00f9\u00fd\u0005,\u0000\u0000\u00fa\u00fc"+
		"\u00036\u001b\u0000\u00fb\u00fa\u0001\u0000\u0000\u0000\u00fc\u00ff\u0001"+
		"\u0000\u0000\u0000\u00fd\u00fb\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001"+
		"\u0000\u0000\u0000\u00fe\u0100\u0001\u0000\u0000\u0000\u00ff\u00fd\u0001"+
		"\u0000\u0000\u0000\u0100\u0102\u0005-\u0000\u0000\u0101\u00f8\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u01029\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u00051\u0000\u0000\u0104\u0105\u0005*\u0000\u0000\u0105"+
		"\u0106\u0003\u0018\f\u0000\u0106\u0107\u0005+\u0000\u0000\u0107\u010b"+
		"\u0005,\u0000\u0000\u0108\u010a\u00036\u001b\u0000\u0109\u0108\u0001\u0000"+
		"\u0000\u0000\u010a\u010d\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000"+
		"\u0000\u0000\u010b\u010c\u0001\u0000\u0000\u0000\u010c\u010e\u0001\u0000"+
		"\u0000\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010e\u010f\u0005-\u0000"+
		"\u0000\u010f\u011e\u0001\u0000\u0000\u0000\u0110\u0111\u00050\u0000\u0000"+
		"\u0111\u0112\u0005*\u0000\u0000\u0112\u0113\u0003\f\u0006\u0000\u0113"+
		"\u0114\u0005+\u0000\u0000\u0114\u0118\u0005,\u0000\u0000\u0115\u0117\u0003"+
		"6\u001b\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117\u011a\u0001\u0000"+
		"\u0000\u0000\u0118\u0116\u0001\u0000\u0000\u0000\u0118\u0119\u0001\u0000"+
		"\u0000\u0000\u0119\u011b\u0001\u0000\u0000\u0000\u011a\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u011c\u0005-\u0000\u0000\u011c\u011e\u0001\u0000\u0000"+
		"\u0000\u011d\u0103\u0001\u0000\u0000\u0000\u011d\u0110\u0001\u0000\u0000"+
		"\u0000\u011e;\u0001\u0000\u0000\u0000\u011f\u0120\u00053\u0000\u0000\u0120"+
		"=\u0001\u0000\u0000\u0000\u0121\u0127\u00052\u0000\u0000\u0122\u0128\u0003"+
		"\f\u0006\u0000\u0123\u0128\u00038\u001c\u0000\u0124\u0128\u0005 \u0000"+
		"\u0000\u0125\u0128\u0005\u001f\u0000\u0000\u0126\u0128\u0005\u001d\u0000"+
		"\u0000\u0127\u0122\u0001\u0000\u0000\u0000\u0127\u0123\u0001\u0000\u0000"+
		"\u0000\u0127\u0124\u0001\u0000\u0000\u0000\u0127\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u0126\u0001\u0000\u0000\u0000\u0128?\u0001\u0000\u0000\u0000"+
		"\u0129\u012a\u00056\u0000\u0000\u012a\u0132\u0003\f\u0006\u0000\u012b"+
		"\u012c\u00056\u0000\u0000\u012c\u0132\u0003\u0018\f\u0000\u012d\u012e"+
		"\u00056\u0000\u0000\u012e\u0132\u0005 \u0000\u0000\u012f\u0130\u00056"+
		"\u0000\u0000\u0130\u0132\u0005\u001f\u0000\u0000\u0131\u0129\u0001\u0000"+
		"\u0000\u0000\u0131\u012b\u0001\u0000\u0000\u0000\u0131\u012d\u0001\u0000"+
		"\u0000\u0000\u0131\u012f\u0001\u0000\u0000\u0000\u0132A\u0001\u0000\u0000"+
		"\u0000\u001dEKS^dhqz\u007f\u0081\u008b\u008f\u0096\u0099\u00a5\u00af\u00be"+
		"\u00ca\u00d3\u00da\u00e8\u00f4\u00fd\u0101\u010b\u0118\u011d\u0127\u0131";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}