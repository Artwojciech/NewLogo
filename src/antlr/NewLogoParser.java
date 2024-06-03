// Generated from C:/Users/macie/OneDrive/Dokumenty/kompilatory/NewLogo/antlr/NewLogoParser.g4 by ANTLR 4.13.1
package antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class NewLogoParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REPEAT=1, WHILE=2, RETURN=3, BREAK=4, IF=5, ELSE=6, PLUS=7, MINUS=8, MULTIPLY=9, 
		DIVIDE=10, MODULO=11, EQUAL=12, NOT_EQUAL=13, LESSER_EQUAL=14, GREATER_EQUAL=15, 
		LESSER=16, GREATER=17, OR=18, AND=19, NOT=20, ASSIGN=21, INC_SELF=22, 
		DEC_SELF=23, MUL_SELF=24, DIV_SELF=25, INCREMENT=26, DECREMENT=27, COMMA=28, 
		SEMICOLON=29, FORWARD=30, LTURN=31, RTURN=32, LINECOL=33, LINEWIDTH=34, 
		CHANGEBG=35, CLEAR=36, ISBORDER=37, PRINT=38, NUMBER=39, CHAR_CONST=40, 
		STRING_CONST=41, TRUE=42, FALSE=43, INT=44, CHAR=45, STRING=46, BOOL=47, 
		LBRACKET=48, RBRACKET=49, LCURLY=50, RCURLY=51, VARIABLE=52, WHITESPACE=53, 
		NEWLINE=54, COMMENT=55;
	public static final int
		RULE_program = 0, RULE_sumOp = 1, RULE_mulOp = 2, RULE_atom = 3, RULE_brExpression = 4, 
		RULE_mulExpression = 5, RULE_mathExpression = 6, RULE_boolConst = 7, RULE_compOp = 8, 
		RULE_compVal = 9, RULE_compExpression = 10, RULE_logicOp = 11, RULE_logicBrExpression = 12, 
		RULE_logicExpression = 13, RULE_variable = 14, RULE_varType = 15, RULE_varDeclaration = 16, 
		RULE_value = 17, RULE_selfOp = 18, RULE_varAssign = 19, RULE_incOrDec = 20, 
		RULE_varIncrement = 21, RULE_argument = 22, RULE_arguments = 23, RULE_funcDefinition = 24, 
		RULE_drawingFunction = 25, RULE_function = 26, RULE_callArguments = 27, 
		RULE_functionCall = 28, RULE_statement = 29, RULE_conditionalStatement = 30, 
		RULE_loopStatement = 31, RULE_breakStatement = 32, RULE_returnStatement = 33, 
		RULE_printStatement = 34;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sumOp", "mulOp", "atom", "brExpression", "mulExpression", 
			"mathExpression", "boolConst", "compOp", "compVal", "compExpression", 
			"logicOp", "logicBrExpression", "logicExpression", "variable", "varType", 
			"varDeclaration", "value", "selfOp", "varAssign", "incOrDec", "varIncrement", 
			"argument", "arguments", "funcDefinition", "drawingFunction", "function", 
			"callArguments", "functionCall", "statement", "conditionalStatement", 
			"loopStatement", "breakStatement", "returnStatement", "printStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'repeat'", "'while'", "'return'", "'break'", "'if'", "'else'", 
			"'+'", "'-'", "'*'", "'/'", "'%'", "'=='", "'!='", "'<='", "'>='", "'<'", 
			"'>'", "'||'", "'&&'", "'!'", "'='", "'+='", "'-='", "'*='", "'/='", 
			"'++'", "'--'", "','", "';'", "'forward'", "'lturn'", "'rturn'", "'linecol'", 
			"'linewidth'", "'changebg'", "'clear'", "'isborder'", "'print'", null, 
			null, null, null, null, "'int'", "'char'", "'string'", "'bool'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REPEAT", "WHILE", "RETURN", "BREAK", "IF", "ELSE", "PLUS", "MINUS", 
			"MULTIPLY", "DIVIDE", "MODULO", "EQUAL", "NOT_EQUAL", "LESSER_EQUAL", 
			"GREATER_EQUAL", "LESSER", "GREATER", "OR", "AND", "NOT", "ASSIGN", "INC_SELF", 
			"DEC_SELF", "MUL_SELF", "DIV_SELF", "INCREMENT", "DECREMENT", "COMMA", 
			"SEMICOLON", "FORWARD", "LTURN", "RTURN", "LINECOL", "LINEWIDTH", "CHANGEBG", 
			"CLEAR", "ISBORDER", "PRINT", "NUMBER", "CHAR_CONST", "STRING_CONST", 
			"TRUE", "FALSE", "INT", "CHAR", "STRING", "BOOL", "LBRACKET", "RBRACKET", 
			"LCURLY", "RCURLY", "VARIABLE", "WHITESPACE", "NEWLINE", "COMMENT"
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(70);
					funcDefinition();
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5050055832633662L) != 0)) {
				{
				{
				setState(76);
				statement();
				}
				}
				setState(81);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterSumOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitSumOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitSumOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SumOpContext sumOp() throws RecognitionException {
		SumOpContext _localctx = new SumOpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_sumOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterMulOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitMulOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitMulOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulOpContext mulOp() throws RecognitionException {
		MulOpContext _localctx = new MulOpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_mulOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitAtom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitAtom(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_atom);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(86);
				match(MINUS);
				}
			}

			setState(89);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterBrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitBrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitBrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BrExpressionContext brExpression() throws RecognitionException {
		BrExpressionContext _localctx = new BrExpressionContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_brExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(LBRACKET);
			setState(92);
			mathExpression();
			setState(93);
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
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterMulExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitMulExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitMulExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MulExpressionContext mulExpression() throws RecognitionException {
		MulExpressionContext _localctx = new MulExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mulExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NUMBER:
				{
				setState(95);
				atom();
				}
				break;
			case LBRACKET:
				{
				setState(96);
				brExpression();
				}
				break;
			case VARIABLE:
				{
				setState(97);
				variable();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 3584L) != 0)) {
				{
				{
				setState(100);
				mulOp();
				setState(104);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
				case NUMBER:
					{
					setState(101);
					atom();
					}
					break;
				case LBRACKET:
					{
					setState(102);
					brExpression();
					}
					break;
				case VARIABLE:
					{
					setState(103);
					variable();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(110);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterMathExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitMathExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitMathExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MathExpressionContext mathExpression() throws RecognitionException {
		MathExpressionContext _localctx = new MathExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_mathExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			mulExpression();
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(112);
				sumOp();
				setState(113);
				mulExpression();
				}
				}
				setState(119);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterBoolConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitBoolConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitBoolConst(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolConstContext boolConst() throws RecognitionException {
		BoolConstContext _localctx = new BoolConstContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(120);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterCompOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitCompOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitCompOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompOpContext compOp() throws RecognitionException {
		CompOpContext _localctx = new CompOpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 258048L) != 0)) ) {
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
	public static class CompValContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(NewLogoParser.NUMBER, 0); }
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode STRING_CONST() { return getToken(NewLogoParser.STRING_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(NewLogoParser.CHAR_CONST, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public CompValContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compVal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterCompVal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitCompVal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitCompVal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompValContext compVal() throws RecognitionException {
		CompValContext _localctx = new CompValContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_compVal);
		try {
			setState(130);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124);
				match(NUMBER);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(125);
				boolConst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(126);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				match(STRING_CONST);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(128);
				match(CHAR_CONST);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(129);
				mathExpression();
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
	public static class CompExpressionContext extends ParserRuleContext {
		public List<CompValContext> compVal() {
			return getRuleContexts(CompValContext.class);
		}
		public CompValContext compVal(int i) {
			return getRuleContext(CompValContext.class,i);
		}
		public CompOpContext compOp() {
			return getRuleContext(CompOpContext.class,0);
		}
		public CompExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterCompExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitCompExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitCompExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompExpressionContext compExpression() throws RecognitionException {
		CompExpressionContext _localctx = new CompExpressionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_compExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			compVal();
			setState(133);
			compOp();
			setState(134);
			compVal();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterLogicOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitLogicOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitLogicOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicOpContext logicOp() throws RecognitionException {
		LogicOpContext _localctx = new LogicOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_logicOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterLogicBrExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitLogicBrExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitLogicBrExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicBrExpressionContext logicBrExpression() throws RecognitionException {
		LogicBrExpressionContext _localctx = new LogicBrExpressionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_logicBrExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(LBRACKET);
			setState(139);
			logicExpression();
			setState(140);
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
		public LogicBrExpressionContext logicBrExpression() {
			return getRuleContext(LogicBrExpressionContext.class,0);
		}
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public TerminalNode NOT() { return getToken(NewLogoParser.NOT, 0); }
		public List<LogicOpContext> logicOp() {
			return getRuleContexts(LogicOpContext.class);
		}
		public LogicOpContext logicOp(int i) {
			return getRuleContext(LogicOpContext.class,i);
		}
		public List<LogicExpressionContext> logicExpression() {
			return getRuleContexts(LogicExpressionContext.class);
		}
		public LogicExpressionContext logicExpression(int i) {
			return getRuleContext(LogicExpressionContext.class,i);
		}
		public LogicExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterLogicExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitLogicExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitLogicExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicExpressionContext logicExpression() throws RecognitionException {
		LogicExpressionContext _localctx = new LogicExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(142);
				match(NOT);
				}
			}

			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				{
				setState(145);
				compExpression();
				}
				break;
			case 2:
				{
				setState(146);
				logicBrExpression();
				}
				break;
			case 3:
				{
				setState(147);
				boolConst();
				}
				break;
			}
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(150);
					logicOp();
					setState(151);
					logicExpression();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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
	public static class VariableContext extends ParserRuleContext {
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
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
	public static class VarTypeContext extends ParserRuleContext {
		public TerminalNode INT() { return getToken(NewLogoParser.INT, 0); }
		public TerminalNode BOOL() { return getToken(NewLogoParser.BOOL, 0); }
		public TerminalNode CHAR() { return getToken(NewLogoParser.CHAR, 0); }
		public TerminalNode STRING() { return getToken(NewLogoParser.STRING, 0); }
		public VarTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterVarType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitVarType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitVarType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarTypeContext varType() throws RecognitionException {
		VarTypeContext _localctx = new VarTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 263882790666240L) != 0)) ) {
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(NewLogoParser.ASSIGN, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterVarDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitVarDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitVarDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			varType();
			setState(163);
			variable();
			setState(166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(164);
				match(ASSIGN);
				setState(165);
				value();
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
	public static class ValueContext extends ParserRuleContext {
		public TerminalNode STRING_CONST() { return getToken(NewLogoParser.STRING_CONST, 0); }
		public TerminalNode CHAR_CONST() { return getToken(NewLogoParser.CHAR_CONST, 0); }
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public ValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueContext value() throws RecognitionException {
		ValueContext _localctx = new ValueContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_value);
		try {
			setState(173);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168);
				match(STRING_CONST);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(CHAR_CONST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(170);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				mathExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(172);
				logicExpression();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterSelfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitSelfOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitSelfOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelfOpContext selfOp() throws RecognitionException {
		SelfOpContext _localctx = new SelfOpContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_selfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 62914560L) != 0)) ) {
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterVarAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitVarAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitVarAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarAssignContext varAssign() throws RecognitionException {
		VarAssignContext _localctx = new VarAssignContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			variable();
			setState(183);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASSIGN:
				{
				{
				setState(178);
				match(ASSIGN);
				setState(179);
				value();
				}
				}
				break;
			case INC_SELF:
			case DEC_SELF:
			case MUL_SELF:
			case DIV_SELF:
				{
				setState(180);
				selfOp();
				setState(181);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterIncOrDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitIncOrDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitIncOrDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IncOrDecContext incOrDec() throws RecognitionException {
		IncOrDecContext _localctx = new IncOrDecContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_incOrDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public IncOrDecContext incOrDec() {
			return getRuleContext(IncOrDecContext.class,0);
		}
		public VarIncrementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varIncrement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterVarIncrement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitVarIncrement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitVarIncrement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarIncrementContext varIncrement() throws RecognitionException {
		VarIncrementContext _localctx = new VarIncrementContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			variable();
			setState(188);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argument; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentContext argument() throws RecognitionException {
		ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190);
			varType();
			setState(191);
			variable();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentsContext arguments() throws RecognitionException {
		ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(193);
			argument();
			setState(198);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				argument();
				}
				}
				setState(200);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterFuncDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitFuncDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitFuncDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncDefinitionContext funcDefinition() throws RecognitionException {
		FuncDefinitionContext _localctx = new FuncDefinitionContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_funcDefinition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			varType();
			setState(202);
			match(VARIABLE);
			setState(203);
			match(LBRACKET);
			setState(204);
			arguments();
			setState(205);
			match(RBRACKET);
			setState(206);
			match(LCURLY);
			setState(210);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5050055832633662L) != 0)) {
				{
				{
				setState(207);
				statement();
				}
				}
				setState(212);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(213);
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
		public TerminalNode CHANGEBG() { return getToken(NewLogoParser.CHANGEBG, 0); }
		public TerminalNode CLEAR() { return getToken(NewLogoParser.CLEAR, 0); }
		public TerminalNode ISBORDER() { return getToken(NewLogoParser.ISBORDER, 0); }
		public TerminalNode PRINT() { return getToken(NewLogoParser.PRINT, 0); }
		public DrawingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drawingFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterDrawingFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitDrawingFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitDrawingFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DrawingFunctionContext drawingFunction() throws RecognitionException {
		DrawingFunctionContext _localctx = new DrawingFunctionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_drawingFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 548682072064L) != 0)) ) {
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionContext function() throws RecognitionException {
		FunctionContext _localctx = new FunctionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_function);
		try {
			setState(219);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(217);
				match(VARIABLE);
				}
				break;
			case FORWARD:
			case LTURN:
			case RTURN:
			case LINECOL:
			case LINEWIDTH:
			case CHANGEBG:
			case CLEAR:
			case ISBORDER:
			case PRINT:
				enterOuterAlt(_localctx, 2);
				{
				setState(218);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterCallArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitCallArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitCallArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentsContext callArguments() throws RecognitionException {
		CallArgumentsContext _localctx = new CallArgumentsContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 4802117035360512L) != 0)) {
				{
				setState(221);
				value();
				setState(226);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(222);
					match(COMMA);
					setState(223);
					value();
					}
					}
					setState(228);
					_errHandler.sync(this);
					_la = _input.LA(1);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(231);
			function();
			setState(232);
			match(LBRACKET);
			setState(233);
			callArguments();
			setState(234);
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
		public VarDeclarationContext varDeclaration() {
			return getRuleContext(VarDeclarationContext.class,0);
		}
		public VarAssignContext varAssign() {
			return getRuleContext(VarAssignContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_statement);
		try {
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(244);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
				case 1:
					{
					setState(236);
					mathExpression();
					}
					break;
				case 2:
					{
					setState(237);
					conditionalStatement();
					}
					break;
				case 3:
					{
					setState(238);
					loopStatement();
					}
					break;
				case 4:
					{
					setState(239);
					breakStatement();
					}
					break;
				case 5:
					{
					setState(240);
					returnStatement();
					}
					break;
				case 6:
					{
					setState(241);
					functionCall();
					}
					break;
				case 7:
					{
					setState(242);
					varDeclaration();
					}
					break;
				case 8:
					{
					setState(243);
					varAssign();
					}
					break;
				}
				setState(246);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(250);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(248);
					conditionalStatement();
					}
					break;
				case REPEAT:
				case WHILE:
					{
					setState(249);
					loopStatement();
					}
					break;
				default:
					throw new NoViableAltException(this);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterConditionalStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitConditionalStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitConditionalStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionalStatementContext conditionalStatement() throws RecognitionException {
		ConditionalStatementContext _localctx = new ConditionalStatementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(254);
			match(IF);
			setState(255);
			match(LBRACKET);
			setState(256);
			logicExpression();
			setState(257);
			match(RBRACKET);
			setState(258);
			match(LCURLY);
			setState(262);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5050055832633662L) != 0)) {
				{
				{
				setState(259);
				statement();
				}
				}
				setState(264);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(265);
			match(RCURLY);
			setState(275);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(266);
				match(ELSE);
				setState(267);
				match(LCURLY);
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5050055832633662L) != 0)) {
					{
					{
					setState(268);
					statement();
					}
					}
					setState(273);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(274);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterLoopStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitLoopStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitLoopStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LoopStatementContext loopStatement() throws RecognitionException {
		LoopStatementContext _localctx = new LoopStatementContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_loopStatement);
		int _la;
		try {
			setState(303);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(277);
				match(WHILE);
				setState(278);
				match(LBRACKET);
				setState(279);
				logicExpression();
				setState(280);
				match(RBRACKET);
				setState(281);
				match(LCURLY);
				setState(285);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5050055832633662L) != 0)) {
					{
					{
					setState(282);
					statement();
					}
					}
					setState(287);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(288);
				match(RCURLY);
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(REPEAT);
				setState(291);
				match(LBRACKET);
				setState(292);
				mathExpression();
				setState(293);
				match(RBRACKET);
				setState(294);
				match(LCURLY);
				setState(298);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5050055832633662L) != 0)) {
					{
					{
					setState(295);
					statement();
					}
					}
					setState(300);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(301);
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterBreakStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitBreakStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitBreakStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BreakStatementContext breakStatement() throws RecognitionException {
		BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(305);
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
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_returnStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterReturnStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitReturnStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitReturnStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ReturnStatementContext returnStatement() throws RecognitionException {
		ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_returnStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(RETURN);
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,28,_ctx) ) {
			case 1:
				{
				setState(308);
				mathExpression();
				}
				break;
			case 2:
				{
				setState(309);
				conditionalStatement();
				}
				break;
			case 3:
				{
				setState(310);
				match(STRING);
				}
				break;
			case 4:
				{
				setState(311);
				match(CHAR);
				}
				break;
			case 5:
				{
				setState(312);
				variable();
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
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterPrintStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitPrintStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitPrintStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrintStatementContext printStatement() throws RecognitionException {
		PrintStatementContext _localctx = new PrintStatementContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_printStatement);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(315);
				match(PRINT);
				setState(316);
				mathExpression();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(PRINT);
				setState(318);
				logicExpression();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(319);
				match(PRINT);
				setState(320);
				match(STRING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(321);
				match(PRINT);
				setState(322);
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
		"\u0004\u00017\u0146\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0001"+
		"\u0000\u0005\u0000H\b\u0000\n\u0000\f\u0000K\t\u0000\u0001\u0000\u0005"+
		"\u0000N\b\u0000\n\u0000\f\u0000Q\t\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0003\u0003\u0003X\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005c\b\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0003\u0005i\b\u0005\u0005\u0005k\b\u0005\n\u0005\f"+
		"\u0005n\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006t\b\u0006\n\u0006\f\u0006w\t\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003\t\u0083"+
		"\b\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0003\r\u0090\b\r\u0001\r\u0001\r\u0001\r\u0003"+
		"\r\u0095\b\r\u0001\r\u0001\r\u0001\r\u0005\r\u009a\b\r\n\r\f\r\u009d\t"+
		"\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u00a7\b\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u00ae\b\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00b8\b\u0013\u0001\u0014\u0001\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0005\u0017\u00c5\b\u0017\n\u0017\f\u0017\u00c8"+
		"\t\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0005\u0018\u00d1\b\u0018\n\u0018\f\u0018\u00d4\t\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a"+
		"\u0003\u001a\u00dc\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b"+
		"\u00e1\b\u001b\n\u001b\f\u001b\u00e4\t\u001b\u0003\u001b\u00e6\b\u001b"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u00f5\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u00fb\b\u001d\u0003\u001d\u00fd\b\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005"+
		"\u001e\u0105\b\u001e\n\u001e\f\u001e\u0108\t\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0005\u001e\u010e\b\u001e\n\u001e\f\u001e\u0111"+
		"\t\u001e\u0001\u001e\u0003\u001e\u0114\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u011c\b\u001f"+
		"\n\u001f\f\u001f\u011f\t\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u0129"+
		"\b\u001f\n\u001f\f\u001f\u012c\t\u001f\u0001\u001f\u0001\u001f\u0003\u001f"+
		"\u0130\b\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0003!\u013a\b!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0003\"\u0144\b\"\u0001\"\u0000\u0000#\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BD\u0000\t\u0001\u0000\u0007\b\u0001\u0000\t\u000b\u0001\u0000"+
		"*+\u0001\u0000\f\u0011\u0001\u0000\u0012\u0013\u0001\u0000,/\u0001\u0000"+
		"\u0016\u0019\u0001\u0000\u001a\u001b\u0001\u0000\u001e&\u0155\u0000I\u0001"+
		"\u0000\u0000\u0000\u0002R\u0001\u0000\u0000\u0000\u0004T\u0001\u0000\u0000"+
		"\u0000\u0006W\u0001\u0000\u0000\u0000\b[\u0001\u0000\u0000\u0000\nb\u0001"+
		"\u0000\u0000\u0000\fo\u0001\u0000\u0000\u0000\u000ex\u0001\u0000\u0000"+
		"\u0000\u0010z\u0001\u0000\u0000\u0000\u0012\u0082\u0001\u0000\u0000\u0000"+
		"\u0014\u0084\u0001\u0000\u0000\u0000\u0016\u0088\u0001\u0000\u0000\u0000"+
		"\u0018\u008a\u0001\u0000\u0000\u0000\u001a\u008f\u0001\u0000\u0000\u0000"+
		"\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a0\u0001\u0000\u0000\u0000"+
		" \u00a2\u0001\u0000\u0000\u0000\"\u00ad\u0001\u0000\u0000\u0000$\u00af"+
		"\u0001\u0000\u0000\u0000&\u00b1\u0001\u0000\u0000\u0000(\u00b9\u0001\u0000"+
		"\u0000\u0000*\u00bb\u0001\u0000\u0000\u0000,\u00be\u0001\u0000\u0000\u0000"+
		".\u00c1\u0001\u0000\u0000\u00000\u00c9\u0001\u0000\u0000\u00002\u00d7"+
		"\u0001\u0000\u0000\u00004\u00db\u0001\u0000\u0000\u00006\u00e5\u0001\u0000"+
		"\u0000\u00008\u00e7\u0001\u0000\u0000\u0000:\u00fc\u0001\u0000\u0000\u0000"+
		"<\u00fe\u0001\u0000\u0000\u0000>\u012f\u0001\u0000\u0000\u0000@\u0131"+
		"\u0001\u0000\u0000\u0000B\u0133\u0001\u0000\u0000\u0000D\u0143\u0001\u0000"+
		"\u0000\u0000FH\u00030\u0018\u0000GF\u0001\u0000\u0000\u0000HK\u0001\u0000"+
		"\u0000\u0000IG\u0001\u0000\u0000\u0000IJ\u0001\u0000\u0000\u0000JO\u0001"+
		"\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000LN\u0003:\u001d\u0000ML\u0001"+
		"\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000\u0000\u0000"+
		"OP\u0001\u0000\u0000\u0000P\u0001\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000RS\u0007\u0000\u0000\u0000S\u0003\u0001\u0000\u0000\u0000"+
		"TU\u0007\u0001\u0000\u0000U\u0005\u0001\u0000\u0000\u0000VX\u0005\b\u0000"+
		"\u0000WV\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000XY\u0001\u0000"+
		"\u0000\u0000YZ\u0005\'\u0000\u0000Z\u0007\u0001\u0000\u0000\u0000[\\\u0005"+
		"0\u0000\u0000\\]\u0003\f\u0006\u0000]^\u00051\u0000\u0000^\t\u0001\u0000"+
		"\u0000\u0000_c\u0003\u0006\u0003\u0000`c\u0003\b\u0004\u0000ac\u0003\u001c"+
		"\u000e\u0000b_\u0001\u0000\u0000\u0000b`\u0001\u0000\u0000\u0000ba\u0001"+
		"\u0000\u0000\u0000cl\u0001\u0000\u0000\u0000dh\u0003\u0004\u0002\u0000"+
		"ei\u0003\u0006\u0003\u0000fi\u0003\b\u0004\u0000gi\u0003\u001c\u000e\u0000"+
		"he\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000\u0000"+
		"\u0000ik\u0001\u0000\u0000\u0000jd\u0001\u0000\u0000\u0000kn\u0001\u0000"+
		"\u0000\u0000lj\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000m\u000b"+
		"\u0001\u0000\u0000\u0000nl\u0001\u0000\u0000\u0000ou\u0003\n\u0005\u0000"+
		"pq\u0003\u0002\u0001\u0000qr\u0003\n\u0005\u0000rt\u0001\u0000\u0000\u0000"+
		"sp\u0001\u0000\u0000\u0000tw\u0001\u0000\u0000\u0000us\u0001\u0000\u0000"+
		"\u0000uv\u0001\u0000\u0000\u0000v\r\u0001\u0000\u0000\u0000wu\u0001\u0000"+
		"\u0000\u0000xy\u0007\u0002\u0000\u0000y\u000f\u0001\u0000\u0000\u0000"+
		"z{\u0007\u0003\u0000\u0000{\u0011\u0001\u0000\u0000\u0000|\u0083\u0005"+
		"\'\u0000\u0000}\u0083\u0003\u000e\u0007\u0000~\u0083\u0003\u001c\u000e"+
		"\u0000\u007f\u0083\u0005)\u0000\u0000\u0080\u0083\u0005(\u0000\u0000\u0081"+
		"\u0083\u0003\f\u0006\u0000\u0082|\u0001\u0000\u0000\u0000\u0082}\u0001"+
		"\u0000\u0000\u0000\u0082~\u0001\u0000\u0000\u0000\u0082\u007f\u0001\u0000"+
		"\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0081\u0001\u0000"+
		"\u0000\u0000\u0083\u0013\u0001\u0000\u0000\u0000\u0084\u0085\u0003\u0012"+
		"\t\u0000\u0085\u0086\u0003\u0010\b\u0000\u0086\u0087\u0003\u0012\t\u0000"+
		"\u0087\u0015\u0001\u0000\u0000\u0000\u0088\u0089\u0007\u0004\u0000\u0000"+
		"\u0089\u0017\u0001\u0000\u0000\u0000\u008a\u008b\u00050\u0000\u0000\u008b"+
		"\u008c\u0003\u001a\r\u0000\u008c\u008d\u00051\u0000\u0000\u008d\u0019"+
		"\u0001\u0000\u0000\u0000\u008e\u0090\u0005\u0014\u0000\u0000\u008f\u008e"+
		"\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000\u0090\u0094"+
		"\u0001\u0000\u0000\u0000\u0091\u0095\u0003\u0014\n\u0000\u0092\u0095\u0003"+
		"\u0018\f\u0000\u0093\u0095\u0003\u000e\u0007\u0000\u0094\u0091\u0001\u0000"+
		"\u0000\u0000\u0094\u0092\u0001\u0000\u0000\u0000\u0094\u0093\u0001\u0000"+
		"\u0000\u0000\u0095\u009b\u0001\u0000\u0000\u0000\u0096\u0097\u0003\u0016"+
		"\u000b\u0000\u0097\u0098\u0003\u001a\r\u0000\u0098\u009a\u0001\u0000\u0000"+
		"\u0000\u0099\u0096\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000"+
		"\u0000\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000"+
		"\u0000\u009c\u001b\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000"+
		"\u0000\u009e\u009f\u00054\u0000\u0000\u009f\u001d\u0001\u0000\u0000\u0000"+
		"\u00a0\u00a1\u0007\u0005\u0000\u0000\u00a1\u001f\u0001\u0000\u0000\u0000"+
		"\u00a2\u00a3\u0003\u001e\u000f\u0000\u00a3\u00a6\u0003\u001c\u000e\u0000"+
		"\u00a4\u00a5\u0005\u0015\u0000\u0000\u00a5\u00a7\u0003\"\u0011\u0000\u00a6"+
		"\u00a4\u0001\u0000\u0000\u0000\u00a6\u00a7\u0001\u0000\u0000\u0000\u00a7"+
		"!\u0001\u0000\u0000\u0000\u00a8\u00ae\u0005)\u0000\u0000\u00a9\u00ae\u0005"+
		"(\u0000\u0000\u00aa\u00ae\u0003\u001c\u000e\u0000\u00ab\u00ae\u0003\f"+
		"\u0006\u0000\u00ac\u00ae\u0003\u001a\r\u0000\u00ad\u00a8\u0001\u0000\u0000"+
		"\u0000\u00ad\u00a9\u0001\u0000\u0000\u0000\u00ad\u00aa\u0001\u0000\u0000"+
		"\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ad\u00ac\u0001\u0000\u0000"+
		"\u0000\u00ae#\u0001\u0000\u0000\u0000\u00af\u00b0\u0007\u0006\u0000\u0000"+
		"\u00b0%\u0001\u0000\u0000\u0000\u00b1\u00b7\u0003\u001c\u000e\u0000\u00b2"+
		"\u00b3\u0005\u0015\u0000\u0000\u00b3\u00b8\u0003\"\u0011\u0000\u00b4\u00b5"+
		"\u0003$\u0012\u0000\u00b5\u00b6\u0003\f\u0006\u0000\u00b6\u00b8\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b2\u0001\u0000\u0000\u0000\u00b7\u00b4\u0001"+
		"\u0000\u0000\u0000\u00b8\'\u0001\u0000\u0000\u0000\u00b9\u00ba\u0007\u0007"+
		"\u0000\u0000\u00ba)\u0001\u0000\u0000\u0000\u00bb\u00bc\u0003\u001c\u000e"+
		"\u0000\u00bc\u00bd\u0003(\u0014\u0000\u00bd+\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u0003\u001e\u000f\u0000\u00bf\u00c0\u0003\u001c\u000e\u0000\u00c0"+
		"-\u0001\u0000\u0000\u0000\u00c1\u00c6\u0003,\u0016\u0000\u00c2\u00c3\u0005"+
		"\u001c\u0000\u0000\u00c3\u00c5\u0003,\u0016\u0000\u00c4\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c8\u0001\u0000\u0000\u0000\u00c6\u00c4\u0001\u0000"+
		"\u0000\u0000\u00c6\u00c7\u0001\u0000\u0000\u0000\u00c7/\u0001\u0000\u0000"+
		"\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003\u001e\u000f"+
		"\u0000\u00ca\u00cb\u00054\u0000\u0000\u00cb\u00cc\u00050\u0000\u0000\u00cc"+
		"\u00cd\u0003.\u0017\u0000\u00cd\u00ce\u00051\u0000\u0000\u00ce\u00d2\u0005"+
		"2\u0000\u0000\u00cf\u00d1\u0003:\u001d\u0000\u00d0\u00cf\u0001\u0000\u0000"+
		"\u0000\u00d1\u00d4\u0001\u0000\u0000\u0000\u00d2\u00d0\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d3\u0001\u0000\u0000\u0000\u00d3\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d5\u00d6\u00053\u0000\u0000"+
		"\u00d61\u0001\u0000\u0000\u0000\u00d7\u00d8\u0007\b\u0000\u0000\u00d8"+
		"3\u0001\u0000\u0000\u0000\u00d9\u00dc\u00054\u0000\u0000\u00da\u00dc\u0003"+
		"2\u0019\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000"+
		"\u0000\u0000\u00dc5\u0001\u0000\u0000\u0000\u00dd\u00e2\u0003\"\u0011"+
		"\u0000\u00de\u00df\u0005\u001c\u0000\u0000\u00df\u00e1\u0003\"\u0011\u0000"+
		"\u00e0\u00de\u0001\u0000\u0000\u0000\u00e1\u00e4\u0001\u0000\u0000\u0000"+
		"\u00e2\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e3\u00e6\u0001\u0000\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000"+
		"\u00e5\u00dd\u0001\u0000\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000"+
		"\u00e67\u0001\u0000\u0000\u0000\u00e7\u00e8\u00034\u001a\u0000\u00e8\u00e9"+
		"\u00050\u0000\u0000\u00e9\u00ea\u00036\u001b\u0000\u00ea\u00eb\u00051"+
		"\u0000\u0000\u00eb9\u0001\u0000\u0000\u0000\u00ec\u00f5\u0003\f\u0006"+
		"\u0000\u00ed\u00f5\u0003<\u001e\u0000\u00ee\u00f5\u0003>\u001f\u0000\u00ef"+
		"\u00f5\u0003@ \u0000\u00f0\u00f5\u0003B!\u0000\u00f1\u00f5\u00038\u001c"+
		"\u0000\u00f2\u00f5\u0003 \u0010\u0000\u00f3\u00f5\u0003&\u0013\u0000\u00f4"+
		"\u00ec\u0001\u0000\u0000\u0000\u00f4\u00ed\u0001\u0000\u0000\u0000\u00f4"+
		"\u00ee\u0001\u0000\u0000\u0000\u00f4\u00ef\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f0\u0001\u0000\u0000\u0000\u00f4\u00f1\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f5"+
		"\u00f6\u0001\u0000\u0000\u0000\u00f6\u00f7\u0005\u001d\u0000\u0000\u00f7"+
		"\u00fd\u0001\u0000\u0000\u0000\u00f8\u00fb\u0003<\u001e\u0000\u00f9\u00fb"+
		"\u0003>\u001f\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001"+
		"\u0000\u0000\u0000\u00fb\u00fd\u0001\u0000\u0000\u0000\u00fc\u00f4\u0001"+
		"\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fd;\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\u0005\u0000\u0000\u00ff\u0100\u00050\u0000"+
		"\u0000\u0100\u0101\u0003\u001a\r\u0000\u0101\u0102\u00051\u0000\u0000"+
		"\u0102\u0106\u00052\u0000\u0000\u0103\u0105\u0003:\u001d\u0000\u0104\u0103"+
		"\u0001\u0000\u0000\u0000\u0105\u0108\u0001\u0000\u0000\u0000\u0106\u0104"+
		"\u0001\u0000\u0000\u0000\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0109"+
		"\u0001\u0000\u0000\u0000\u0108\u0106\u0001\u0000\u0000\u0000\u0109\u0113"+
		"\u00053\u0000\u0000\u010a\u010b\u0005\u0006\u0000\u0000\u010b\u010f\u0005"+
		"2\u0000\u0000\u010c\u010e\u0003:\u001d\u0000\u010d\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u0111\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0112\u0001\u0000\u0000"+
		"\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0112\u0114\u00053\u0000\u0000"+
		"\u0113\u010a\u0001\u0000\u0000\u0000\u0113\u0114\u0001\u0000\u0000\u0000"+
		"\u0114=\u0001\u0000\u0000\u0000\u0115\u0116\u0005\u0002\u0000\u0000\u0116"+
		"\u0117\u00050\u0000\u0000\u0117\u0118\u0003\u001a\r\u0000\u0118\u0119"+
		"\u00051\u0000\u0000\u0119\u011d\u00052\u0000\u0000\u011a\u011c\u0003:"+
		"\u001d\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000"+
		"\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000"+
		"\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000"+
		"\u0000\u0000\u0120\u0121\u00053\u0000\u0000\u0121\u0130\u0001\u0000\u0000"+
		"\u0000\u0122\u0123\u0005\u0001\u0000\u0000\u0123\u0124\u00050\u0000\u0000"+
		"\u0124\u0125\u0003\f\u0006\u0000\u0125\u0126\u00051\u0000\u0000\u0126"+
		"\u012a\u00052\u0000\u0000\u0127\u0129\u0003:\u001d\u0000\u0128\u0127\u0001"+
		"\u0000\u0000\u0000\u0129\u012c\u0001\u0000\u0000\u0000\u012a\u0128\u0001"+
		"\u0000\u0000\u0000\u012a\u012b\u0001\u0000\u0000\u0000\u012b\u012d\u0001"+
		"\u0000\u0000\u0000\u012c\u012a\u0001\u0000\u0000\u0000\u012d\u012e\u0005"+
		"3\u0000\u0000\u012e\u0130\u0001\u0000\u0000\u0000\u012f\u0115\u0001\u0000"+
		"\u0000\u0000\u012f\u0122\u0001\u0000\u0000\u0000\u0130?\u0001\u0000\u0000"+
		"\u0000\u0131\u0132\u0005\u0004\u0000\u0000\u0132A\u0001\u0000\u0000\u0000"+
		"\u0133\u0139\u0005\u0003\u0000\u0000\u0134\u013a\u0003\f\u0006\u0000\u0135"+
		"\u013a\u0003<\u001e\u0000\u0136\u013a\u0005.\u0000\u0000\u0137\u013a\u0005"+
		"-\u0000\u0000\u0138\u013a\u0003\u001c\u000e\u0000\u0139\u0134\u0001\u0000"+
		"\u0000\u0000\u0139\u0135\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000"+
		"\u0000\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u0139\u0138\u0001\u0000"+
		"\u0000\u0000\u013aC\u0001\u0000\u0000\u0000\u013b\u013c\u0005&\u0000\u0000"+
		"\u013c\u0144\u0003\f\u0006\u0000\u013d\u013e\u0005&\u0000\u0000\u013e"+
		"\u0144\u0003\u001a\r\u0000\u013f\u0140\u0005&\u0000\u0000\u0140\u0144"+
		"\u0005.\u0000\u0000\u0141\u0142\u0005&\u0000\u0000\u0142\u0144\u0005-"+
		"\u0000\u0000\u0143\u013b\u0001\u0000\u0000\u0000\u0143\u013d\u0001\u0000"+
		"\u0000\u0000\u0143\u013f\u0001\u0000\u0000\u0000\u0143\u0141\u0001\u0000"+
		"\u0000\u0000\u0144E\u0001\u0000\u0000\u0000\u001eIOWbhlu\u0082\u008f\u0094"+
		"\u009b\u00a6\u00ad\u00b7\u00c6\u00d2\u00db\u00e2\u00e5\u00f4\u00fa\u00fc"+
		"\u0106\u010f\u0113\u011d\u012a\u012f\u0139\u0143";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}