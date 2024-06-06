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
		CHAR_CONST=1, STRING_CONST=2, NUMBER=3, TRUE=4, FALSE=5, REPEAT=6, WHILE=7, 
		RETURN=8, BREAK=9, IF=10, ELSE=11, PLUS=12, MINUS=13, MULTIPLY=14, DIVIDE=15, 
		MODULO=16, EQUAL=17, NOT_EQUAL=18, LESSER_EQUAL=19, GREATER_EQUAL=20, 
		LESSER=21, GREATER=22, OR=23, AND=24, NOT=25, ASSIGN=26, INC_SELF=27, 
		DEC_SELF=28, MUL_SELF=29, DIV_SELF=30, INCREMENT=31, DECREMENT=32, COMMA=33, 
		SEMICOLON=34, FORWARD=35, LTURN=36, RTURN=37, LINECOL=38, LINEWIDTH=39, 
		CHANGEBG=40, CLEAR=41, ISBORDER=42, PRINT=43, INT=44, CHAR=45, STRING=46, 
		BOOL=47, VOID=48, LBRACKET=49, RBRACKET=50, LCURLY=51, RCURLY=52, VARIABLE=53, 
		WHITESPACE=54, NEWLINE=55, COMMENT=56;
	public static final int
		RULE_program = 0, RULE_sumOp = 1, RULE_mulOp = 2, RULE_atom = 3, RULE_brExpression = 4, 
		RULE_mulExpression = 5, RULE_mathExpression = 6, RULE_string = 7, RULE_boolConst = 8, 
		RULE_compOp = 9, RULE_compVal = 10, RULE_compExpression = 11, RULE_logicBrExpression = 12, 
		RULE_logicAndExpression = 13, RULE_logicExpression = 14, RULE_variable = 15, 
		RULE_varType = 16, RULE_varDeclaration = 17, RULE_value = 18, RULE_selfOp = 19, 
		RULE_varAssign = 20, RULE_varSelfOp = 21, RULE_incOrDec = 22, RULE_varIncrement = 23, 
		RULE_argument = 24, RULE_arguments = 25, RULE_funcDefinition = 26, RULE_drawingFunction = 27, 
		RULE_function = 28, RULE_callArguments = 29, RULE_functionCall = 30, RULE_statement = 31, 
		RULE_statementBlock = 32, RULE_conditionalStatement = 33, RULE_whileLoop = 34, 
		RULE_repeatLoop = 35, RULE_loopStatement = 36, RULE_breakStatement = 37, 
		RULE_returnStatement = 38;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "sumOp", "mulOp", "atom", "brExpression", "mulExpression", 
			"mathExpression", "string", "boolConst", "compOp", "compVal", "compExpression", 
			"logicBrExpression", "logicAndExpression", "logicExpression", "variable", 
			"varType", "varDeclaration", "value", "selfOp", "varAssign", "varSelfOp", 
			"incOrDec", "varIncrement", "argument", "arguments", "funcDefinition", 
			"drawingFunction", "function", "callArguments", "functionCall", "statement", 
			"statementBlock", "conditionalStatement", "whileLoop", "repeatLoop", 
			"loopStatement", "breakStatement", "returnStatement"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, null, null, null, null, "'repeat'", "'while'", "'return'", 
			"'break'", "'if'", "'else'", "'+'", "'-'", "'*'", "'/'", "'%'", "'=='", 
			"'!='", "'<='", "'>='", "'<'", "'>'", "'||'", "'&&'", "'!'", "'='", "'+='", 
			"'-='", "'*='", "'/='", "'++'", "'--'", "','", "';'", "'forward'", "'lturn'", 
			"'rturn'", "'linecol'", "'linewidth'", "'changebg'", "'clear'", "'isborder'", 
			"'print'", "'int'", "'char'", "'string'", "'bool'", "'void'", "'('", 
			"')'", "'{'", "'}'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CHAR_CONST", "STRING_CONST", "NUMBER", "TRUE", "FALSE", "REPEAT", 
			"WHILE", "RETURN", "BREAK", "IF", "ELSE", "PLUS", "MINUS", "MULTIPLY", 
			"DIVIDE", "MODULO", "EQUAL", "NOT_EQUAL", "LESSER_EQUAL", "GREATER_EQUAL", 
			"LESSER", "GREATER", "OR", "AND", "NOT", "ASSIGN", "INC_SELF", "DEC_SELF", 
			"MUL_SELF", "DIV_SELF", "INCREMENT", "DECREMENT", "COMMA", "SEMICOLON", 
			"FORWARD", "LTURN", "RTURN", "LINECOL", "LINEWIDTH", "CHANGEBG", "CLEAR", 
			"ISBORDER", "PRINT", "INT", "CHAR", "STRING", "BOOL", "VOID", "LBRACKET", 
			"RBRACKET", "LCURLY", "RCURLY", "VARIABLE", "WHITESPACE", "NEWLINE", 
			"COMMENT"
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
			setState(81);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(78);
					funcDefinition();
					}
					} 
				}
				setState(83);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,0,_ctx);
			}
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9851589825144776L) != 0)) {
				{
				{
				setState(84);
				statement();
				}
				}
				setState(89);
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
			setState(90);
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
			setState(92);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) ) {
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
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==MINUS) {
				{
				setState(94);
				match(MINUS);
				}
			}

			setState(97);
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
			setState(99);
			match(LBRACKET);
			setState(100);
			mathExpression();
			setState(101);
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
		public List<FunctionCallContext> functionCall() {
			return getRuleContexts(FunctionCallContext.class);
		}
		public FunctionCallContext functionCall(int i) {
			return getRuleContext(FunctionCallContext.class,i);
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
			setState(107);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(103);
				atom();
				}
				break;
			case 2:
				{
				setState(104);
				brExpression();
				}
				break;
			case 3:
				{
				setState(105);
				variable();
				}
				break;
			case 4:
				{
				setState(106);
				functionCall();
				}
				break;
			}
			setState(118);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 114688L) != 0)) {
				{
				{
				setState(109);
				mulOp();
				setState(114);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(110);
					atom();
					}
					break;
				case 2:
					{
					setState(111);
					brExpression();
					}
					break;
				case 3:
					{
					setState(112);
					variable();
					}
					break;
				case 4:
					{
					setState(113);
					functionCall();
					}
					break;
				}
				}
				}
				setState(120);
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
			setState(121);
			mulExpression();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				{
				setState(122);
				sumOp();
				setState(123);
				mulExpression();
				}
				}
				setState(129);
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
	public static class StringContext extends ParserRuleContext {
		public List<TerminalNode> STRING_CONST() { return getTokens(NewLogoParser.STRING_CONST); }
		public TerminalNode STRING_CONST(int i) {
			return getToken(NewLogoParser.STRING_CONST, i);
		}
		public List<TerminalNode> PLUS() { return getTokens(NewLogoParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(NewLogoParser.PLUS, i);
		}
		public List<TerminalNode> CHAR_CONST() { return getTokens(NewLogoParser.CHAR_CONST); }
		public TerminalNode CHAR_CONST(int i) {
			return getToken(NewLogoParser.CHAR_CONST, i);
		}
		public StringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringContext string() throws RecognitionException {
		StringContext _localctx = new StringContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_string);
		int _la;
		try {
			setState(146);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STRING_CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(130);
				match(STRING_CONST);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==CHAR_CONST || _la==PLUS) {
					{
					setState(134);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case PLUS:
						{
						setState(131);
						match(PLUS);
						setState(132);
						match(STRING_CONST);
						}
						break;
					case CHAR_CONST:
						{
						setState(133);
						match(CHAR_CONST);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case CHAR_CONST:
				enterOuterAlt(_localctx, 2);
				{
				setState(139);
				match(CHAR_CONST);
				setState(140);
				match(PLUS);
				setState(142); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(141);
					_la = _input.LA(1);
					if ( !(_la==CHAR_CONST || _la==STRING_CONST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					setState(144); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==CHAR_CONST || _la==STRING_CONST );
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
		enterRule(_localctx, 16, RULE_boolConst);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(148);
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
		enterRule(_localctx, 18, RULE_compOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 8257536L) != 0)) ) {
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
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CHAR_CONST() { return getToken(NewLogoParser.CHAR_CONST, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 20, RULE_compVal);
		try {
			setState(159);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
				boolConst();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(154);
				variable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(155);
				string();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(156);
				match(CHAR_CONST);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(157);
				mathExpression();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(158);
				functionCall();
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
		enterRule(_localctx, 22, RULE_compExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(161);
			compVal();
			setState(162);
			compOp();
			setState(163);
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
			setState(165);
			match(LBRACKET);
			setState(166);
			logicExpression();
			setState(167);
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
	public static class LogicAndExpressionContext extends ParserRuleContext {
		public CompExpressionContext compExpression() {
			return getRuleContext(CompExpressionContext.class,0);
		}
		public LogicBrExpressionContext logicBrExpression() {
			return getRuleContext(LogicBrExpressionContext.class,0);
		}
		public BoolConstContext boolConst() {
			return getRuleContext(BoolConstContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public TerminalNode NOT() { return getToken(NewLogoParser.NOT, 0); }
		public List<TerminalNode> AND() { return getTokens(NewLogoParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(NewLogoParser.AND, i);
		}
		public List<LogicAndExpressionContext> logicAndExpression() {
			return getRuleContexts(LogicAndExpressionContext.class);
		}
		public LogicAndExpressionContext logicAndExpression(int i) {
			return getRuleContext(LogicAndExpressionContext.class,i);
		}
		public LogicAndExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logicAndExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterLogicAndExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitLogicAndExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitLogicAndExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogicAndExpressionContext logicAndExpression() throws RecognitionException {
		LogicAndExpressionContext _localctx = new LogicAndExpressionContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_logicAndExpression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NOT) {
				{
				setState(169);
				match(NOT);
				}
			}

			setState(177);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				{
				setState(172);
				compExpression();
				}
				break;
			case 2:
				{
				setState(173);
				logicBrExpression();
				}
				break;
			case 3:
				{
				setState(174);
				boolConst();
				}
				break;
			case 4:
				{
				setState(175);
				variable();
				}
				break;
			case 5:
				{
				setState(176);
				functionCall();
				}
				break;
			}
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(179);
					match(AND);
					setState(180);
					logicAndExpression();
					}
					} 
				}
				setState(185);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
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
	public static class LogicExpressionContext extends ParserRuleContext {
		public List<LogicAndExpressionContext> logicAndExpression() {
			return getRuleContexts(LogicAndExpressionContext.class);
		}
		public LogicAndExpressionContext logicAndExpression(int i) {
			return getRuleContext(LogicAndExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(NewLogoParser.NOT, 0); }
		public List<TerminalNode> OR() { return getTokens(NewLogoParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(NewLogoParser.OR, i);
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
		enterRule(_localctx, 28, RULE_logicExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(186);
				match(NOT);
				}
				break;
			}
			setState(189);
			logicAndExpression();
			setState(194);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(190);
				match(OR);
				setState(191);
				logicAndExpression();
				}
				}
				setState(196);
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
		enterRule(_localctx, 30, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
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
		enterRule(_localctx, 32, RULE_varType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
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
		enterRule(_localctx, 34, RULE_varDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			varType();
			setState(202);
			variable();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(203);
				match(ASSIGN);
				setState(204);
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
		public StringContext string() {
			return getRuleContext(StringContext.class,0);
		}
		public TerminalNode CHAR_CONST() { return getToken(NewLogoParser.CHAR_CONST, 0); }
		public MathExpressionContext mathExpression() {
			return getRuleContext(MathExpressionContext.class,0);
		}
		public LogicExpressionContext logicExpression() {
			return getRuleContext(LogicExpressionContext.class,0);
		}
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
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
		enterRule(_localctx, 36, RULE_value);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				string();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(CHAR_CONST);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(209);
				mathExpression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(210);
				logicExpression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(211);
				functionCall();
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
		enterRule(_localctx, 38, RULE_selfOp);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2013265920L) != 0)) ) {
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
		enterRule(_localctx, 40, RULE_varAssign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			variable();
			setState(217);
			match(ASSIGN);
			setState(218);
			value();
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
	public static class VarSelfOpContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public SelfOpContext selfOp() {
			return getRuleContext(SelfOpContext.class,0);
		}
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public VarSelfOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varSelfOp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterVarSelfOp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitVarSelfOp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitVarSelfOp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VarSelfOpContext varSelfOp() throws RecognitionException {
		VarSelfOpContext _localctx = new VarSelfOpContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_varSelfOp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			variable();
			setState(221);
			selfOp();
			setState(222);
			value();
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
		enterRule(_localctx, 44, RULE_incOrDec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224);
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
		enterRule(_localctx, 46, RULE_varIncrement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			variable();
			setState(227);
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
		enterRule(_localctx, 48, RULE_argument);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(229);
			varType();
			setState(230);
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
		enterRule(_localctx, 50, RULE_arguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			argument();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(233);
				match(COMMA);
				setState(234);
				argument();
				}
				}
				setState(239);
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
		public TerminalNode VARIABLE() { return getToken(NewLogoParser.VARIABLE, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public ArgumentsContext arguments() {
			return getRuleContext(ArgumentsContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(NewLogoParser.LCURLY, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(NewLogoParser.RCURLY, 0); }
		public VarTypeContext varType() {
			return getRuleContext(VarTypeContext.class,0);
		}
		public TerminalNode VOID() { return getToken(NewLogoParser.VOID, 0); }
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
		enterRule(_localctx, 52, RULE_funcDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(242);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT:
			case CHAR:
			case STRING:
			case BOOL:
				{
				setState(240);
				varType();
				}
				break;
			case VOID:
				{
				setState(241);
				match(VOID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(244);
			match(VARIABLE);
			setState(245);
			match(LBRACKET);
			setState(246);
			arguments();
			setState(247);
			match(RBRACKET);
			setState(248);
			match(LCURLY);
			setState(249);
			statementBlock();
			setState(250);
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
		enterRule(_localctx, 54, RULE_drawingFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 17557826306048L) != 0)) ) {
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
		enterRule(_localctx, 56, RULE_function);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARIABLE:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
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
				setState(255);
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
		enterRule(_localctx, 58, RULE_callArguments);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9587707076288574L) != 0)) {
				{
				setState(258);
				value();
				setState(263);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(259);
					match(COMMA);
					setState(260);
					value();
					}
					}
					setState(265);
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
		enterRule(_localctx, 60, RULE_functionCall);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			function();
			setState(269);
			match(LBRACKET);
			setState(270);
			callArguments();
			setState(271);
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
		public VarIncrementContext varIncrement() {
			return getRuleContext(VarIncrementContext.class,0);
		}
		public VarSelfOpContext varSelfOp() {
			return getRuleContext(VarSelfOpContext.class,0);
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
		enterRule(_localctx, 62, RULE_statement);
		try {
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(283);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(273);
					mathExpression();
					}
					break;
				case 2:
					{
					setState(274);
					conditionalStatement();
					}
					break;
				case 3:
					{
					setState(275);
					loopStatement();
					}
					break;
				case 4:
					{
					setState(276);
					breakStatement();
					}
					break;
				case 5:
					{
					setState(277);
					returnStatement();
					}
					break;
				case 6:
					{
					setState(278);
					functionCall();
					}
					break;
				case 7:
					{
					setState(279);
					varDeclaration();
					}
					break;
				case 8:
					{
					setState(280);
					varAssign();
					}
					break;
				case 9:
					{
					setState(281);
					varIncrement();
					}
					break;
				case 10:
					{
					setState(282);
					varSelfOp();
					}
					break;
				}
				setState(285);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(289);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case IF:
					{
					setState(287);
					conditionalStatement();
					}
					break;
				case REPEAT:
				case WHILE:
					{
					setState(288);
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
	public static class StatementBlockContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public StatementBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterStatementBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitStatementBlock(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitStatementBlock(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementBlockContext statementBlock() throws RecognitionException {
		StatementBlockContext _localctx = new StatementBlockContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_statementBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(296);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9851589825144776L) != 0)) {
				{
				{
				setState(293);
				statement();
				}
				}
				setState(298);
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
	public static class ConditionalStatementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(NewLogoParser.IF, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public List<TerminalNode> LCURLY() { return getTokens(NewLogoParser.LCURLY); }
		public TerminalNode LCURLY(int i) {
			return getToken(NewLogoParser.LCURLY, i);
		}
		public List<StatementBlockContext> statementBlock() {
			return getRuleContexts(StatementBlockContext.class);
		}
		public StatementBlockContext statementBlock(int i) {
			return getRuleContext(StatementBlockContext.class,i);
		}
		public List<TerminalNode> RCURLY() { return getTokens(NewLogoParser.RCURLY); }
		public TerminalNode RCURLY(int i) {
			return getToken(NewLogoParser.RCURLY, i);
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
		enterRule(_localctx, 66, RULE_conditionalStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(IF);
			setState(300);
			match(LBRACKET);
			setState(301);
			value();
			setState(302);
			match(RBRACKET);
			setState(303);
			match(LCURLY);
			setState(304);
			statementBlock();
			setState(305);
			match(RCURLY);
			setState(311);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(306);
				match(ELSE);
				setState(307);
				match(LCURLY);
				setState(308);
				statementBlock();
				setState(309);
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
	public static class WhileLoopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(NewLogoParser.WHILE, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(NewLogoParser.LCURLY, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(NewLogoParser.RCURLY, 0); }
		public WhileLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhileLoopContext whileLoop() throws RecognitionException {
		WhileLoopContext _localctx = new WhileLoopContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_whileLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(WHILE);
			setState(314);
			match(LBRACKET);
			setState(315);
			value();
			setState(316);
			match(RBRACKET);
			setState(317);
			match(LCURLY);
			setState(318);
			statementBlock();
			setState(319);
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
	public static class RepeatLoopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(NewLogoParser.REPEAT, 0); }
		public TerminalNode LBRACKET() { return getToken(NewLogoParser.LBRACKET, 0); }
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
		}
		public TerminalNode RBRACKET() { return getToken(NewLogoParser.RBRACKET, 0); }
		public TerminalNode LCURLY() { return getToken(NewLogoParser.LCURLY, 0); }
		public StatementBlockContext statementBlock() {
			return getRuleContext(StatementBlockContext.class,0);
		}
		public TerminalNode RCURLY() { return getToken(NewLogoParser.RCURLY, 0); }
		public RepeatLoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatLoop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).enterRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof NewLogoParserListener ) ((NewLogoParserListener)listener).exitRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof NewLogoParserVisitor ) return ((NewLogoParserVisitor<? extends T>)visitor).visitRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepeatLoopContext repeatLoop() throws RecognitionException {
		RepeatLoopContext _localctx = new RepeatLoopContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_repeatLoop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			match(REPEAT);
			setState(322);
			match(LBRACKET);
			setState(323);
			value();
			setState(324);
			match(RBRACKET);
			setState(325);
			match(LCURLY);
			setState(326);
			statementBlock();
			setState(327);
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
	public static class LoopStatementContext extends ParserRuleContext {
		public WhileLoopContext whileLoop() {
			return getRuleContext(WhileLoopContext.class,0);
		}
		public RepeatLoopContext repeatLoop() {
			return getRuleContext(RepeatLoopContext.class,0);
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
		enterRule(_localctx, 72, RULE_loopStatement);
		try {
			setState(331);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WHILE:
				enterOuterAlt(_localctx, 1);
				{
				setState(329);
				whileLoop();
				}
				break;
			case REPEAT:
				enterOuterAlt(_localctx, 2);
				{
				setState(330);
				repeatLoop();
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
		enterRule(_localctx, 74, RULE_breakStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
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
		public ValueContext value() {
			return getRuleContext(ValueContext.class,0);
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
		enterRule(_localctx, 76, RULE_returnStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			match(RETURN);
			setState(337);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 9587707076288574L) != 0)) {
				{
				setState(336);
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

	public static final String _serializedATN =
		"\u0004\u00018\u0154\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0001\u0000\u0005\u0000"+
		"P\b\u0000\n\u0000\f\u0000S\t\u0000\u0001\u0000\u0005\u0000V\b\u0000\n"+
		"\u0000\f\u0000Y\t\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0003\u0003`\b\u0003\u0001\u0003\u0001\u0003\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0003\u0005l\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005s\b\u0005\u0005\u0005u\b\u0005\n\u0005"+
		"\f\u0005x\t\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005"+
		"\u0006~\b\u0006\n\u0006\f\u0006\u0081\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0005\u0007\u0087\b\u0007\n\u0007\f\u0007\u008a"+
		"\t\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0004\u0007\u008f\b\u0007"+
		"\u000b\u0007\f\u0007\u0090\u0003\u0007\u0093\b\u0007\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u00a0\b\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\r\u0003\r\u00ab\b\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0003\r\u00b2\b\r\u0001\r\u0001\r\u0005\r\u00b6\b\r\n\r\f\r"+
		"\u00b9\t\r\u0001\u000e\u0003\u000e\u00bc\b\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00c1\b\u000e\n\u000e\f\u000e\u00c4\t\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0003\u0011\u00ce\b\u0011\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u00d5\b\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0005\u0019\u00ec\b\u0019\n\u0019\f\u0019\u00ef\t\u0019"+
		"\u0001\u001a\u0001\u001a\u0003\u001a\u00f3\b\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0003\u001c\u0101\b\u001c"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0005\u001d\u0106\b\u001d\n\u001d"+
		"\f\u001d\u0109\t\u001d\u0003\u001d\u010b\b\u001d\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u011c\b\u001f\u0001\u001f\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0003\u001f\u0122\b\u001f\u0003\u001f\u0124\b\u001f\u0001"+
		" \u0005 \u0127\b \n \f \u012a\t \u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0003!\u0138\b!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0003$\u014c\b$\u0001"+
		"%\u0001%\u0001&\u0001&\u0003&\u0152\b&\u0001&\u0000\u0000\'\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJL\u0000\t\u0001\u0000\f\r\u0001\u0000\u000e\u0010"+
		"\u0001\u0000\u0001\u0002\u0001\u0000\u0004\u0005\u0001\u0000\u0011\u0016"+
		"\u0001\u0000,/\u0001\u0000\u001b\u001e\u0001\u0000\u001f \u0001\u0000"+
		"#+\u0162\u0000Q\u0001\u0000\u0000\u0000\u0002Z\u0001\u0000\u0000\u0000"+
		"\u0004\\\u0001\u0000\u0000\u0000\u0006_\u0001\u0000\u0000\u0000\bc\u0001"+
		"\u0000\u0000\u0000\nk\u0001\u0000\u0000\u0000\fy\u0001\u0000\u0000\u0000"+
		"\u000e\u0092\u0001\u0000\u0000\u0000\u0010\u0094\u0001\u0000\u0000\u0000"+
		"\u0012\u0096\u0001\u0000\u0000\u0000\u0014\u009f\u0001\u0000\u0000\u0000"+
		"\u0016\u00a1\u0001\u0000\u0000\u0000\u0018\u00a5\u0001\u0000\u0000\u0000"+
		"\u001a\u00aa\u0001\u0000\u0000\u0000\u001c\u00bb\u0001\u0000\u0000\u0000"+
		"\u001e\u00c5\u0001\u0000\u0000\u0000 \u00c7\u0001\u0000\u0000\u0000\""+
		"\u00c9\u0001\u0000\u0000\u0000$\u00d4\u0001\u0000\u0000\u0000&\u00d6\u0001"+
		"\u0000\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*\u00dc\u0001\u0000\u0000"+
		"\u0000,\u00e0\u0001\u0000\u0000\u0000.\u00e2\u0001\u0000\u0000\u00000"+
		"\u00e5\u0001\u0000\u0000\u00002\u00e8\u0001\u0000\u0000\u00004\u00f2\u0001"+
		"\u0000\u0000\u00006\u00fc\u0001\u0000\u0000\u00008\u0100\u0001\u0000\u0000"+
		"\u0000:\u010a\u0001\u0000\u0000\u0000<\u010c\u0001\u0000\u0000\u0000>"+
		"\u0123\u0001\u0000\u0000\u0000@\u0128\u0001\u0000\u0000\u0000B\u012b\u0001"+
		"\u0000\u0000\u0000D\u0139\u0001\u0000\u0000\u0000F\u0141\u0001\u0000\u0000"+
		"\u0000H\u014b\u0001\u0000\u0000\u0000J\u014d\u0001\u0000\u0000\u0000L"+
		"\u014f\u0001\u0000\u0000\u0000NP\u00034\u001a\u0000ON\u0001\u0000\u0000"+
		"\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000"+
		"\u0000\u0000RW\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TV\u0003"+
		">\u001f\u0000UT\u0001\u0000\u0000\u0000VY\u0001\u0000\u0000\u0000WU\u0001"+
		"\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000X\u0001\u0001\u0000\u0000"+
		"\u0000YW\u0001\u0000\u0000\u0000Z[\u0007\u0000\u0000\u0000[\u0003\u0001"+
		"\u0000\u0000\u0000\\]\u0007\u0001\u0000\u0000]\u0005\u0001\u0000\u0000"+
		"\u0000^`\u0005\r\u0000\u0000_^\u0001\u0000\u0000\u0000_`\u0001\u0000\u0000"+
		"\u0000`a\u0001\u0000\u0000\u0000ab\u0005\u0003\u0000\u0000b\u0007\u0001"+
		"\u0000\u0000\u0000cd\u00051\u0000\u0000de\u0003\f\u0006\u0000ef\u0005"+
		"2\u0000\u0000f\t\u0001\u0000\u0000\u0000gl\u0003\u0006\u0003\u0000hl\u0003"+
		"\b\u0004\u0000il\u0003\u001e\u000f\u0000jl\u0003<\u001e\u0000kg\u0001"+
		"\u0000\u0000\u0000kh\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lv\u0001\u0000\u0000\u0000mr\u0003\u0004\u0002"+
		"\u0000ns\u0003\u0006\u0003\u0000os\u0003\b\u0004\u0000ps\u0003\u001e\u000f"+
		"\u0000qs\u0003<\u001e\u0000rn\u0001\u0000\u0000\u0000ro\u0001\u0000\u0000"+
		"\u0000rp\u0001\u0000\u0000\u0000rq\u0001\u0000\u0000\u0000su\u0001\u0000"+
		"\u0000\u0000tm\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001"+
		"\u0000\u0000\u0000vw\u0001\u0000\u0000\u0000w\u000b\u0001\u0000\u0000"+
		"\u0000xv\u0001\u0000\u0000\u0000y\u007f\u0003\n\u0005\u0000z{\u0003\u0002"+
		"\u0001\u0000{|\u0003\n\u0005\u0000|~\u0001\u0000\u0000\u0000}z\u0001\u0000"+
		"\u0000\u0000~\u0081\u0001\u0000\u0000\u0000\u007f}\u0001\u0000\u0000\u0000"+
		"\u007f\u0080\u0001\u0000\u0000\u0000\u0080\r\u0001\u0000\u0000\u0000\u0081"+
		"\u007f\u0001\u0000\u0000\u0000\u0082\u0088\u0005\u0002\u0000\u0000\u0083"+
		"\u0084\u0005\f\u0000\u0000\u0084\u0087\u0005\u0002\u0000\u0000\u0085\u0087"+
		"\u0005\u0001\u0000\u0000\u0086\u0083\u0001\u0000\u0000\u0000\u0086\u0085"+
		"\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u0093"+
		"\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c"+
		"\u0005\u0001\u0000\u0000\u008c\u008e\u0005\f\u0000\u0000\u008d\u008f\u0007"+
		"\u0002\u0000\u0000\u008e\u008d\u0001\u0000\u0000\u0000\u008f\u0090\u0001"+
		"\u0000\u0000\u0000\u0090\u008e\u0001\u0000\u0000\u0000\u0090\u0091\u0001"+
		"\u0000\u0000\u0000\u0091\u0093\u0001\u0000\u0000\u0000\u0092\u0082\u0001"+
		"\u0000\u0000\u0000\u0092\u008b\u0001\u0000\u0000\u0000\u0093\u000f\u0001"+
		"\u0000\u0000\u0000\u0094\u0095\u0007\u0003\u0000\u0000\u0095\u0011\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0007\u0004\u0000\u0000\u0097\u0013\u0001"+
		"\u0000\u0000\u0000\u0098\u00a0\u0001\u0000\u0000\u0000\u0099\u00a0\u0003"+
		"\u0010\b\u0000\u009a\u00a0\u0003\u001e\u000f\u0000\u009b\u00a0\u0003\u000e"+
		"\u0007\u0000\u009c\u00a0\u0005\u0001\u0000\u0000\u009d\u00a0\u0003\f\u0006"+
		"\u0000\u009e\u00a0\u0003<\u001e\u0000\u009f\u0098\u0001\u0000\u0000\u0000"+
		"\u009f\u0099\u0001\u0000\u0000\u0000\u009f\u009a\u0001\u0000\u0000\u0000"+
		"\u009f\u009b\u0001\u0000\u0000\u0000\u009f\u009c\u0001\u0000\u0000\u0000"+
		"\u009f\u009d\u0001\u0000\u0000\u0000\u009f\u009e\u0001\u0000\u0000\u0000"+
		"\u00a0\u0015\u0001\u0000\u0000\u0000\u00a1\u00a2\u0003\u0014\n\u0000\u00a2"+
		"\u00a3\u0003\u0012\t\u0000\u00a3\u00a4\u0003\u0014\n\u0000\u00a4\u0017"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u00051\u0000\u0000\u00a6\u00a7\u0003"+
		"\u001c\u000e\u0000\u00a7\u00a8\u00052\u0000\u0000\u00a8\u0019\u0001\u0000"+
		"\u0000\u0000\u00a9\u00ab\u0005\u0019\u0000\u0000\u00aa\u00a9\u0001\u0000"+
		"\u0000\u0000\u00aa\u00ab\u0001\u0000\u0000\u0000\u00ab\u00b1\u0001\u0000"+
		"\u0000\u0000\u00ac\u00b2\u0003\u0016\u000b\u0000\u00ad\u00b2\u0003\u0018"+
		"\f\u0000\u00ae\u00b2\u0003\u0010\b\u0000\u00af\u00b2\u0003\u001e\u000f"+
		"\u0000\u00b0\u00b2\u0003<\u001e\u0000\u00b1\u00ac\u0001\u0000\u0000\u0000"+
		"\u00b1\u00ad\u0001\u0000\u0000\u0000\u00b1\u00ae\u0001\u0000\u0000\u0000"+
		"\u00b1\u00af\u0001\u0000\u0000\u0000\u00b1\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b7\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\u0018\u0000\u0000"+
		"\u00b4\u00b6\u0003\u001a\r\u0000\u00b5\u00b3\u0001\u0000\u0000\u0000\u00b6"+
		"\u00b9\u0001\u0000\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b7"+
		"\u00b8\u0001\u0000\u0000\u0000\u00b8\u001b\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00bc\u0005\u0019\u0000\u0000\u00bb"+
		"\u00ba\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00c2\u0003\u001a\r\u0000\u00be\u00bf"+
		"\u0005\u0017\u0000\u0000\u00bf\u00c1\u0003\u001a\r\u0000\u00c0\u00be\u0001"+
		"\u0000\u0000\u0000\u00c1\u00c4\u0001\u0000\u0000\u0000\u00c2\u00c0\u0001"+
		"\u0000\u0000\u0000\u00c2\u00c3\u0001\u0000\u0000\u0000\u00c3\u001d\u0001"+
		"\u0000\u0000\u0000\u00c4\u00c2\u0001\u0000\u0000\u0000\u00c5\u00c6\u0005"+
		"5\u0000\u0000\u00c6\u001f\u0001\u0000\u0000\u0000\u00c7\u00c8\u0007\u0005"+
		"\u0000\u0000\u00c8!\u0001\u0000\u0000\u0000\u00c9\u00ca\u0003 \u0010\u0000"+
		"\u00ca\u00cd\u0003\u001e\u000f\u0000\u00cb\u00cc\u0005\u001a\u0000\u0000"+
		"\u00cc\u00ce\u0003$\u0012\u0000\u00cd\u00cb\u0001\u0000\u0000\u0000\u00cd"+
		"\u00ce\u0001\u0000\u0000\u0000\u00ce#\u0001\u0000\u0000\u0000\u00cf\u00d5"+
		"\u0003\u000e\u0007\u0000\u00d0\u00d5\u0005\u0001\u0000\u0000\u00d1\u00d5"+
		"\u0003\f\u0006\u0000\u00d2\u00d5\u0003\u001c\u000e\u0000\u00d3\u00d5\u0003"+
		"<\u001e\u0000\u00d4\u00cf\u0001\u0000\u0000\u0000\u00d4\u00d0\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d1\u0001\u0000\u0000\u0000\u00d4\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5%\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0007\u0006\u0000\u0000\u00d7\'\u0001\u0000\u0000\u0000"+
		"\u00d8\u00d9\u0003\u001e\u000f\u0000\u00d9\u00da\u0005\u001a\u0000\u0000"+
		"\u00da\u00db\u0003$\u0012\u0000\u00db)\u0001\u0000\u0000\u0000\u00dc\u00dd"+
		"\u0003\u001e\u000f\u0000\u00dd\u00de\u0003&\u0013\u0000\u00de\u00df\u0003"+
		"$\u0012\u0000\u00df+\u0001\u0000\u0000\u0000\u00e0\u00e1\u0007\u0007\u0000"+
		"\u0000\u00e1-\u0001\u0000\u0000\u0000\u00e2\u00e3\u0003\u001e\u000f\u0000"+
		"\u00e3\u00e4\u0003,\u0016\u0000\u00e4/\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0003 \u0010\u0000\u00e6\u00e7\u0003\u001e\u000f\u0000\u00e71\u0001\u0000"+
		"\u0000\u0000\u00e8\u00ed\u00030\u0018\u0000\u00e9\u00ea\u0005!\u0000\u0000"+
		"\u00ea\u00ec\u00030\u0018\u0000\u00eb\u00e9\u0001\u0000\u0000\u0000\u00ec"+
		"\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed"+
		"\u00ee\u0001\u0000\u0000\u0000\u00ee3\u0001\u0000\u0000\u0000\u00ef\u00ed"+
		"\u0001\u0000\u0000\u0000\u00f0\u00f3\u0003 \u0010\u0000\u00f1\u00f3\u0005"+
		"0\u0000\u0000\u00f2\u00f0\u0001\u0000\u0000\u0000\u00f2\u00f1\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f4\u0001\u0000\u0000\u0000\u00f4\u00f5\u00055\u0000"+
		"\u0000\u00f5\u00f6\u00051\u0000\u0000\u00f6\u00f7\u00032\u0019\u0000\u00f7"+
		"\u00f8\u00052\u0000\u0000\u00f8\u00f9\u00053\u0000\u0000\u00f9\u00fa\u0003"+
		"@ \u0000\u00fa\u00fb\u00054\u0000\u0000\u00fb5\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fd\u0007\b\u0000\u0000\u00fd7\u0001\u0000\u0000\u0000\u00fe"+
		"\u0101\u00055\u0000\u0000\u00ff\u0101\u00036\u001b\u0000\u0100\u00fe\u0001"+
		"\u0000\u0000\u0000\u0100\u00ff\u0001\u0000\u0000\u0000\u01019\u0001\u0000"+
		"\u0000\u0000\u0102\u0107\u0003$\u0012\u0000\u0103\u0104\u0005!\u0000\u0000"+
		"\u0104\u0106\u0003$\u0012\u0000\u0105\u0103\u0001\u0000\u0000\u0000\u0106"+
		"\u0109\u0001\u0000\u0000\u0000\u0107\u0105\u0001\u0000\u0000\u0000\u0107"+
		"\u0108\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000\u0000\u0109"+
		"\u0107\u0001\u0000\u0000\u0000\u010a\u0102\u0001\u0000\u0000\u0000\u010a"+
		"\u010b\u0001\u0000\u0000\u0000\u010b;\u0001\u0000\u0000\u0000\u010c\u010d"+
		"\u00038\u001c\u0000\u010d\u010e\u00051\u0000\u0000\u010e\u010f\u0003:"+
		"\u001d\u0000\u010f\u0110\u00052\u0000\u0000\u0110=\u0001\u0000\u0000\u0000"+
		"\u0111\u011c\u0003\f\u0006\u0000\u0112\u011c\u0003B!\u0000\u0113\u011c"+
		"\u0003H$\u0000\u0114\u011c\u0003J%\u0000\u0115\u011c\u0003L&\u0000\u0116"+
		"\u011c\u0003<\u001e\u0000\u0117\u011c\u0003\"\u0011\u0000\u0118\u011c"+
		"\u0003(\u0014\u0000\u0119\u011c\u0003.\u0017\u0000\u011a\u011c\u0003*"+
		"\u0015\u0000\u011b\u0111\u0001\u0000\u0000\u0000\u011b\u0112\u0001\u0000"+
		"\u0000\u0000\u011b\u0113\u0001\u0000\u0000\u0000\u011b\u0114\u0001\u0000"+
		"\u0000\u0000\u011b\u0115\u0001\u0000\u0000\u0000\u011b\u0116\u0001\u0000"+
		"\u0000\u0000\u011b\u0117\u0001\u0000\u0000\u0000\u011b\u0118\u0001\u0000"+
		"\u0000\u0000\u011b\u0119\u0001\u0000\u0000\u0000\u011b\u011a\u0001\u0000"+
		"\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011e\u0005\"\u0000"+
		"\u0000\u011e\u0124\u0001\u0000\u0000\u0000\u011f\u0122\u0003B!\u0000\u0120"+
		"\u0122\u0003H$\u0000\u0121\u011f\u0001\u0000\u0000\u0000\u0121\u0120\u0001"+
		"\u0000\u0000\u0000\u0122\u0124\u0001\u0000\u0000\u0000\u0123\u011b\u0001"+
		"\u0000\u0000\u0000\u0123\u0121\u0001\u0000\u0000\u0000\u0124?\u0001\u0000"+
		"\u0000\u0000\u0125\u0127\u0003>\u001f\u0000\u0126\u0125\u0001\u0000\u0000"+
		"\u0000\u0127\u012a\u0001\u0000\u0000\u0000\u0128\u0126\u0001\u0000\u0000"+
		"\u0000\u0128\u0129\u0001\u0000\u0000\u0000\u0129A\u0001\u0000\u0000\u0000"+
		"\u012a\u0128\u0001\u0000\u0000\u0000\u012b\u012c\u0005\n\u0000\u0000\u012c"+
		"\u012d\u00051\u0000\u0000\u012d\u012e\u0003$\u0012\u0000\u012e\u012f\u0005"+
		"2\u0000\u0000\u012f\u0130\u00053\u0000\u0000\u0130\u0131\u0003@ \u0000"+
		"\u0131\u0137\u00054\u0000\u0000\u0132\u0133\u0005\u000b\u0000\u0000\u0133"+
		"\u0134\u00053\u0000\u0000\u0134\u0135\u0003@ \u0000\u0135\u0136\u0005"+
		"4\u0000\u0000\u0136\u0138\u0001\u0000\u0000\u0000\u0137\u0132\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138C\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005\u0007\u0000\u0000\u013a\u013b\u00051\u0000\u0000"+
		"\u013b\u013c\u0003$\u0012\u0000\u013c\u013d\u00052\u0000\u0000\u013d\u013e"+
		"\u00053\u0000\u0000\u013e\u013f\u0003@ \u0000\u013f\u0140\u00054\u0000"+
		"\u0000\u0140E\u0001\u0000\u0000\u0000\u0141\u0142\u0005\u0006\u0000\u0000"+
		"\u0142\u0143\u00051\u0000\u0000\u0143\u0144\u0003$\u0012\u0000\u0144\u0145"+
		"\u00052\u0000\u0000\u0145\u0146\u00053\u0000\u0000\u0146\u0147\u0003@"+
		" \u0000\u0147\u0148\u00054\u0000\u0000\u0148G\u0001\u0000\u0000\u0000"+
		"\u0149\u014c\u0003D\"\u0000\u014a\u014c\u0003F#\u0000\u014b\u0149\u0001"+
		"\u0000\u0000\u0000\u014b\u014a\u0001\u0000\u0000\u0000\u014cI\u0001\u0000"+
		"\u0000\u0000\u014d\u014e\u0005\t\u0000\u0000\u014eK\u0001\u0000\u0000"+
		"\u0000\u014f\u0151\u0005\b\u0000\u0000\u0150\u0152\u0003$\u0012\u0000"+
		"\u0151\u0150\u0001\u0000\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000"+
		"\u0152M\u0001\u0000\u0000\u0000\u001fQW_krv\u007f\u0086\u0088\u0090\u0092"+
		"\u009f\u00aa\u00b1\u00b7\u00bb\u00c2\u00cd\u00d4\u00ed\u00f2\u0100\u0107"+
		"\u010a\u011b\u0121\u0123\u0128\u0137\u014b\u0151";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}