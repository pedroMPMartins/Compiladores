// Generated from CompSh.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class CompShParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, PIPE=8, EXCLAMATION=9, 
		LBRACK=10, RBRACK=11, COMMA=12, COLON=13, SEMI=14, TYPE=15, STORE=16, 
		IN=17, STDIN=18, STDOUT=19, STDERR=20, IF=21, THEN=22, ELSE=23, END=24, 
		LOOP=25, WHILE=26, DO=27, UNTIL=28, PLUS=29, MINUS=30, MULT=31, DIV=32, 
		EQ=33, NE=34, LT=35, LE=36, GT=37, GE=38, AND=39, OR=40, NOT=41, BOOLEAN=42, 
		ID=43, INTEGER=44, REAL=45, STRING=46, CHANNEL=47, LINE_COMMENT=48, COMMENT=49, 
		WS=50;
	public static final int
		RULE_program = 0, RULE_statement = 1, RULE_declaration = 2, RULE_assignment = 3, 
		RULE_input = 4, RULE_output = 5, RULE_pipeline = 6, RULE_redirect = 7, 
		RULE_command = 8, RULE_channel_selector = 9, RULE_execute_cmd = 10, RULE_store_cmd = 11, 
		RULE_ish_cmd = 12, RULE_expr = 13, RULE_condition = 14, RULE_loop = 15, 
		RULE_expr_list = 16;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "statement", "declaration", "assignment", "input", "output", 
			"pipeline", "redirect", "command", "channel_selector", "execute_cmd", 
			"store_cmd", "ish_cmd", "expr", "condition", "loop", "expr_list"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'^'", "'&'", "'?'", "'$'", "'!!'", "'('", "')'", "'|'", "'!'", 
			"'['", "']'", "','", "':'", "';'", null, "'store'", "'in'", "'stdin'", 
			"'stdout'", "'stderr'", "'if'", "'then'", "'else'", "'end'", "'loop'", 
			"'while'", "'do'", "'until'", "'+'", "'-'", "'*'", "'/'", "'='", "'/='", 
			"'<'", "'<='", "'>'", "'>='", "'and'", "'or'", "'not'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, "PIPE", "EXCLAMATION", 
			"LBRACK", "RBRACK", "COMMA", "COLON", "SEMI", "TYPE", "STORE", "IN", 
			"STDIN", "STDOUT", "STDERR", "IF", "THEN", "ELSE", "END", "LOOP", "WHILE", 
			"DO", "UNTIL", "PLUS", "MINUS", "MULT", "DIV", "EQ", "NE", "LT", "LE", 
			"GT", "GE", "AND", "OR", "NOT", "BOOLEAN", "ID", "INTEGER", "REAL", "STRING", 
			"CHANNEL", "LINE_COMMENT", "COMMENT", "WS"
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
	public String getGrammarFileName() { return "CompSh.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CompShParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(CompShParser.EOF, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CompShParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CompShParser.SEMI, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitProgram(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0)) {
				{
				{
				setState(34);
				statement();
				setState(36);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(35);
					match(SEMI);
					}
				}

				}
				}
				setState(42);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			match(EOF);
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
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public InputContext input() {
			return getRuleContext(InputContext.class,0);
		}
		public OutputContext output() {
			return getRuleContext(OutputContext.class,0);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public LoopContext loop() {
			return getRuleContext(LoopContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(52);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45);
				declaration();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				assignment();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(47);
				pipeline();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(48);
				input();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(49);
				output();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(50);
				condition();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(51);
				loop();
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
	public static class DeclarationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(CompShParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(CompShParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(CompShParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CompShParser.TYPE, 0); }
		public List<TerminalNode> COMMA() { return getTokens(CompShParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CompShParser.COMMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitDeclaration(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(ID);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(55);
				match(COMMA);
				setState(56);
				match(ID);
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(COLON);
			setState(63);
			match(TYPE);
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
	public static class AssignmentContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PIPE() { return getToken(CompShParser.PIPE, 0); }
		public TerminalNode ID() { return getToken(CompShParser.ID, 0); }
		public TerminalNode STORE() { return getToken(CompShParser.STORE, 0); }
		public TerminalNode IN() { return getToken(CompShParser.IN, 0); }
		public TerminalNode COLON() { return getToken(CompShParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CompShParser.TYPE, 0); }
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_assignment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			expr(0);
			setState(66);
			match(PIPE);
			setState(68);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STORE) {
				{
				setState(67);
				match(STORE);
				}
			}

			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(70);
				match(IN);
				}
			}

			setState(73);
			match(ID);
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(74);
				match(COLON);
				setState(75);
				match(TYPE);
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
	public static class InputContext extends ParserRuleContext {
		public TerminalNode STDIN() { return getToken(CompShParser.STDIN, 0); }
		public TerminalNode PIPE() { return getToken(CompShParser.PIPE, 0); }
		public TerminalNode STORE() { return getToken(CompShParser.STORE, 0); }
		public TerminalNode ID() { return getToken(CompShParser.ID, 0); }
		public TerminalNode STRING() { return getToken(CompShParser.STRING, 0); }
		public TerminalNode IN() { return getToken(CompShParser.IN, 0); }
		public TerminalNode COLON() { return getToken(CompShParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CompShParser.TYPE, 0); }
		public InputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterInput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitInput(this);
		}
	}

	public final InputContext input() throws RecognitionException {
		InputContext _localctx = new InputContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STDIN);
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==STRING) {
				{
				setState(79);
				match(STRING);
				}
			}

			setState(82);
			match(PIPE);
			setState(83);
			match(STORE);
			setState(85);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(84);
				match(IN);
				}
			}

			setState(87);
			match(ID);
			setState(90);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(88);
				match(COLON);
				setState(89);
				match(TYPE);
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
	public static class OutputContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(CompShParser.PIPE, 0); }
		public TerminalNode STDOUT() { return getToken(CompShParser.STDOUT, 0); }
		public TerminalNode STDERR() { return getToken(CompShParser.STDERR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public PipelineContext pipeline() {
			return getRuleContext(PipelineContext.class,0);
		}
		public Channel_selectorContext channel_selector() {
			return getRuleContext(Channel_selectorContext.class,0);
		}
		public OutputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterOutput(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitOutput(this);
		}
	}

	public final OutputContext output() throws RecognitionException {
		OutputContext _localctx = new OutputContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_output);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(92);
				expr(0);
				}
				break;
			case 2:
				{
				setState(93);
				pipeline();
				}
				break;
			}
			setState(97);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(96);
				channel_selector();
				}
				break;
			}
			setState(99);
			match(PIPE);
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==STDOUT || _la==STDERR) ) {
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
	public static class PipelineContext extends ParserRuleContext {
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> PIPE() { return getTokens(CompShParser.PIPE); }
		public TerminalNode PIPE(int i) {
			return getToken(CompShParser.PIPE, i);
		}
		public List<Channel_selectorContext> channel_selector() {
			return getRuleContexts(Channel_selectorContext.class);
		}
		public Channel_selectorContext channel_selector(int i) {
			return getRuleContext(Channel_selectorContext.class,i);
		}
		public PipelineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pipeline; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterPipeline(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitPipeline(this);
		}
	}

	public final PipelineContext pipeline() throws RecognitionException {
		PipelineContext _localctx = new PipelineContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pipeline);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__4:
			case EXCLAMATION:
			case STORE:
			case CHANNEL:
				{
				setState(102);
				command();
				}
				break;
			case T__5:
			case TYPE:
			case PLUS:
			case MINUS:
			case NOT:
			case BOOLEAN:
			case ID:
			case INTEGER:
			case REAL:
			case STRING:
				{
				setState(103);
				expr(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(106);
					match(PIPE);
					setState(108);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 284L) != 0)) {
						{
						setState(107);
						channel_selector();
						}
					}

					setState(112);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__4:
					case EXCLAMATION:
					case STORE:
					case CHANNEL:
						{
						setState(110);
						command();
						}
						break;
					case T__5:
					case TYPE:
					case PLUS:
					case MINUS:
					case NOT:
					case BOOLEAN:
					case ID:
					case INTEGER:
					case REAL:
					case STRING:
						{
						setState(111);
						expr(0);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(118);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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
	public static class RedirectContext extends ParserRuleContext {
		public Token src;
		public Token dest;
		public List<TerminalNode> CHANNEL() { return getTokens(CompShParser.CHANNEL); }
		public TerminalNode CHANNEL(int i) {
			return getToken(CompShParser.CHANNEL, i);
		}
		public RedirectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_redirect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterRedirect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitRedirect(this);
		}
	}

	public final RedirectContext redirect() throws RecognitionException {
		RedirectContext _localctx = new RedirectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_redirect);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			((RedirectContext)_localctx).src = match(CHANNEL);
			setState(120);
			match(T__0);
			setState(121);
			((RedirectContext)_localctx).dest = match(CHANNEL);
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
	public static class CommandContext extends ParserRuleContext {
		public Execute_cmdContext execute_cmd() {
			return getRuleContext(Execute_cmdContext.class,0);
		}
		public Ish_cmdContext ish_cmd() {
			return getRuleContext(Ish_cmdContext.class,0);
		}
		public Store_cmdContext store_cmd() {
			return getRuleContext(Store_cmdContext.class,0);
		}
		public RedirectContext redirect() {
			return getRuleContext(RedirectContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitCommand(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_command);
		try {
			setState(127);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EXCLAMATION:
				enterOuterAlt(_localctx, 1);
				{
				setState(123);
				execute_cmd();
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 2);
				{
				setState(124);
				ish_cmd();
				}
				break;
			case STORE:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
				store_cmd();
				}
				break;
			case CHANNEL:
				enterOuterAlt(_localctx, 4);
				{
				setState(126);
				redirect();
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
	public static class Channel_selectorContext extends ParserRuleContext {
		public TerminalNode PIPE() { return getToken(CompShParser.PIPE, 0); }
		public Channel_selectorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channel_selector; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterChannel_selector(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitChannel_selector(this);
		}
	}

	public final Channel_selectorContext channel_selector() throws RecognitionException {
		Channel_selectorContext _localctx = new Channel_selectorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_channel_selector);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 284L) != 0)) ) {
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
	public static class Execute_cmdContext extends ParserRuleContext {
		public List<TerminalNode> EXCLAMATION() { return getTokens(CompShParser.EXCLAMATION); }
		public TerminalNode EXCLAMATION(int i) {
			return getToken(CompShParser.EXCLAMATION, i);
		}
		public TerminalNode STRING() { return getToken(CompShParser.STRING, 0); }
		public TerminalNode ID() { return getToken(CompShParser.ID, 0); }
		public TerminalNode LBRACK() { return getToken(CompShParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(CompShParser.RBRACK, 0); }
		public Expr_listContext expr_list() {
			return getRuleContext(Expr_listContext.class,0);
		}
		public Execute_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execute_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExecute_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExecute_cmd(this);
		}
	}

	public final Execute_cmdContext execute_cmd() throws RecognitionException {
		Execute_cmdContext _localctx = new Execute_cmdContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_execute_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(EXCLAMATION);
			setState(132);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(133);
			match(EXCLAMATION);
			setState(139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LBRACK) {
				{
				setState(134);
				match(LBRACK);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 138540075745344L) != 0)) {
					{
					setState(135);
					expr_list();
					}
				}

				setState(138);
				match(RBRACK);
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
	public static class Store_cmdContext extends ParserRuleContext {
		public TerminalNode STORE() { return getToken(CompShParser.STORE, 0); }
		public TerminalNode ID() { return getToken(CompShParser.ID, 0); }
		public TerminalNode IN() { return getToken(CompShParser.IN, 0); }
		public TerminalNode COLON() { return getToken(CompShParser.COLON, 0); }
		public TerminalNode TYPE() { return getToken(CompShParser.TYPE, 0); }
		public Store_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterStore_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitStore_cmd(this);
		}
	}

	public final Store_cmdContext store_cmd() throws RecognitionException {
		Store_cmdContext _localctx = new Store_cmdContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_store_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(STORE);
			setState(143);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN) {
				{
				setState(142);
				match(IN);
				}
			}

			setState(145);
			match(ID);
			setState(148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLON) {
				{
				setState(146);
				match(COLON);
				setState(147);
				match(TYPE);
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
	public static class Ish_cmdContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(CompShParser.STRING, 0); }
		public TerminalNode ID() { return getToken(CompShParser.ID, 0); }
		public Ish_cmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ish_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterIsh_cmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitIsh_cmd(this);
		}
	}

	public final Ish_cmdContext ish_cmd() throws RecognitionException {
		Ish_cmdContext _localctx = new Ish_cmdContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_ish_cmd);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__4);
			setState(151);
			_la = _input.LA(1);
			if ( !(_la==ID || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(152);
			match(T__4);
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
	public static class ExprAddSubContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(CompShParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CompShParser.MINUS, 0); }
		public ExprAddSubContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprAddSub(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStringContext extends ExprContext {
		public TerminalNode STRING() { return getToken(CompShParser.STRING, 0); }
		public ExprStringContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprString(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprUnaryContext extends ExprContext {
		public Token sign;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode PLUS() { return getToken(CompShParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(CompShParser.MINUS, 0); }
		public TerminalNode NOT() { return getToken(CompShParser.NOT, 0); }
		public ExprUnaryContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprUnary(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprBooleanContext extends ExprContext {
		public TerminalNode BOOLEAN() { return getToken(CompShParser.BOOLEAN, 0); }
		public ExprBooleanContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprBoolean(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprBoolean(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprMultDivContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(CompShParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(CompShParser.DIV, 0); }
		public ExprMultDivContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprMultDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprMultDiv(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRealContext extends ExprContext {
		public TerminalNode REAL() { return getToken(CompShParser.REAL, 0); }
		public ExprRealContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprReal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprReal(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIntegerContext extends ExprContext {
		public TerminalNode INTEGER() { return getToken(CompShParser.INTEGER, 0); }
		public ExprIntegerContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprInteger(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprInteger(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprRelationalContext extends ExprContext {
		public Token op;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode GT() { return getToken(CompShParser.GT, 0); }
		public TerminalNode LT() { return getToken(CompShParser.LT, 0); }
		public TerminalNode GE() { return getToken(CompShParser.GE, 0); }
		public TerminalNode LE() { return getToken(CompShParser.LE, 0); }
		public TerminalNode EQ() { return getToken(CompShParser.EQ, 0); }
		public TerminalNode NE() { return getToken(CompShParser.NE, 0); }
		public ExprRelationalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprRelational(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprRelational(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprAndOrContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AND() { return getToken(CompShParser.AND, 0); }
		public TerminalNode OR() { return getToken(CompShParser.OR, 0); }
		public ExprAndOrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprAndOr(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprConvertTypeContext extends ExprContext {
		public TerminalNode TYPE() { return getToken(CompShParser.TYPE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprConvertTypeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprConvertType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprConvertType(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIDContext extends ExprContext {
		public TerminalNode ID() { return getToken(CompShParser.ID, 0); }
		public ExprIDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprID(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParContext extends ExprContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprParContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExprPar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExprPar(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
			case NOT:
				{
				_localctx = new ExprUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(155);
				((ExprUnaryContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2200633868288L) != 0)) ) {
					((ExprUnaryContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(156);
				expr(14);
				}
				break;
			case TYPE:
				{
				_localctx = new ExprConvertTypeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(TYPE);
				setState(158);
				match(T__5);
				setState(159);
				expr(0);
				setState(160);
				match(T__6);
				}
				break;
			case ID:
				{
				_localctx = new ExprIDContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(162);
				match(ID);
				}
				break;
			case BOOLEAN:
				{
				_localctx = new ExprBooleanContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				match(BOOLEAN);
				}
				break;
			case STRING:
				{
				_localctx = new ExprStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(164);
				match(STRING);
				}
				break;
			case INTEGER:
				{
				_localctx = new ExprIntegerContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(165);
				match(INTEGER);
				}
				break;
			case REAL:
				{
				_localctx = new ExprRealContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(REAL);
				}
				break;
			case T__5:
				{
				_localctx = new ExprParContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(167);
				match(T__5);
				setState(168);
				expr(0);
				setState(169);
				match(T__6);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(193);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(191);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
					case 1:
						{
						_localctx = new ExprMultDivContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(173);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(174);
						((ExprMultDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==MULT || _la==DIV) ) {
							((ExprMultDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(175);
						expr(14);
						}
						break;
					case 2:
						{
						_localctx = new ExprAddSubContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(176);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(177);
						((ExprAddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ExprAddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(178);
						expr(13);
						}
						break;
					case 3:
						{
						_localctx = new ExprRelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(179);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(180);
						((ExprRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) ) {
							((ExprRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(181);
						expr(12);
						}
						break;
					case 4:
						{
						_localctx = new ExprRelationalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(182);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(183);
						((ExprRelationalContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NE) ) {
							((ExprRelationalContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(184);
						expr(11);
						}
						break;
					case 5:
						{
						_localctx = new ExprAndOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(185);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(186);
						match(AND);
						setState(187);
						expr(10);
						}
						break;
					case 6:
						{
						_localctx = new ExprAndOrContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(188);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(189);
						match(OR);
						setState(190);
						expr(9);
						}
						break;
					}
					} 
				}
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
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
	public static class ConditionContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(CompShParser.IF, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode THEN() { return getToken(CompShParser.THEN, 0); }
		public TerminalNode END() { return getToken(CompShParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CompShParser.ELSE, 0); }
		public List<TerminalNode> SEMI() { return getTokens(CompShParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CompShParser.SEMI, i);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitCondition(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(196);
			match(IF);
			setState(197);
			expr(0);
			setState(198);
			match(THEN);
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0)) {
				{
				{
				setState(199);
				statement();
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SEMI) {
					{
					setState(200);
					match(SEMI);
					}
				}

				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(218);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(208);
				match(ELSE);
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0)) {
					{
					{
					setState(209);
					statement();
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(210);
						match(SEMI);
						}
					}

					}
					}
					setState(217);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(220);
			match(END);
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
	public static class LoopContext extends ParserRuleContext {
		public LoopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_loop; }
	 
		public LoopContext() { }
		public void copyFrom(LoopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopWhileDoContext extends LoopContext {
		public TerminalNode LOOP() { return getToken(CompShParser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(CompShParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(CompShParser.DO, 0); }
		public TerminalNode END() { return getToken(CompShParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CompShParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CompShParser.SEMI, i);
		}
		public LoopWhileDoContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterLoopWhileDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitLoopWhileDo(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopUntilContext extends LoopContext {
		public TerminalNode LOOP() { return getToken(CompShParser.LOOP, 0); }
		public TerminalNode UNTIL() { return getToken(CompShParser.UNTIL, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode END() { return getToken(CompShParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CompShParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CompShParser.SEMI, i);
		}
		public LoopUntilContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterLoopUntil(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitLoopUntil(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LoopWhileContext extends LoopContext {
		public TerminalNode LOOP() { return getToken(CompShParser.LOOP, 0); }
		public TerminalNode WHILE() { return getToken(CompShParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DO() { return getToken(CompShParser.DO, 0); }
		public TerminalNode END() { return getToken(CompShParser.END, 0); }
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(CompShParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(CompShParser.SEMI, i);
		}
		public LoopWhileContext(LoopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterLoopWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitLoopWhile(this);
		}
	}

	public final LoopContext loop() throws RecognitionException {
		LoopContext _localctx = new LoopContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_loop);
		int _la;
		try {
			setState(274);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new LoopUntilContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				match(LOOP);
				setState(229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0)) {
					{
					{
					setState(223);
					statement();
					setState(225);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(224);
						match(SEMI);
						}
					}

					}
					}
					setState(231);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(232);
				match(UNTIL);
				setState(233);
				expr(0);
				setState(234);
				match(END);
				}
				break;
			case 2:
				_localctx = new LoopWhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(236);
				match(LOOP);
				setState(237);
				match(WHILE);
				setState(238);
				expr(0);
				setState(239);
				match(DO);
				setState(246);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0)) {
					{
					{
					setState(240);
					statement();
					setState(242);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(241);
						match(SEMI);
						}
					}

					}
					}
					setState(248);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(249);
				match(END);
				}
				break;
			case 3:
				_localctx = new LoopWhileDoContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(251);
				match(LOOP);
				setState(256); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(252);
					statement();
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(253);
						match(SEMI);
						}
					}

					}
					}
					setState(258); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0) );
				setState(260);
				match(WHILE);
				setState(261);
				expr(0);
				setState(262);
				match(DO);
				setState(269);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 279277600080480L) != 0)) {
					{
					{
					setState(263);
					statement();
					setState(265);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==SEMI) {
						{
						setState(264);
						match(SEMI);
						}
					}

					}
					}
					setState(271);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(272);
				match(END);
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
	public static class Expr_listContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CompShParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CompShParser.COMMA, i);
		}
		public Expr_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).enterExpr_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CompShListener ) ((CompShListener)listener).exitExpr_list(this);
		}
	}

	public final Expr_listContext expr_list() throws RecognitionException {
		Expr_listContext _localctx = new Expr_listContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_expr_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(276);
			expr(0);
			setState(281);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(277);
				match(COMMA);
				setState(278);
				expr(0);
				}
				}
				setState(283);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 13:
			return expr_sempred((ExprContext)_localctx, predIndex);
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

	public static final String _serializedATN =
		"\u0004\u00012\u011d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0001\u0000\u0001\u0000\u0003\u0000%\b\u0000"+
		"\u0005\u0000\'\b\u0000\n\u0000\f\u0000*\t\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0003\u00015\b\u0001\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0005\u0002:\b\u0002\n\u0002\f\u0002=\t\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003E\b\u0003"+
		"\u0001\u0003\u0003\u0003H\b\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0003\u0003M\b\u0003\u0001\u0004\u0001\u0004\u0003\u0004Q\b\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0003\u0004V\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0003\u0004[\b\u0004\u0001\u0005\u0001\u0005\u0003"+
		"\u0005_\b\u0005\u0001\u0005\u0003\u0005b\b\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0003\u0006i\b\u0006\u0001\u0006"+
		"\u0001\u0006\u0003\u0006m\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"q\b\u0006\u0005\u0006s\b\u0006\n\u0006\f\u0006v\t\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b"+
		"\u0080\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003"+
		"\n\u0089\b\n\u0001\n\u0003\n\u008c\b\n\u0001\u000b\u0001\u000b\u0003\u000b"+
		"\u0090\b\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u0095\b"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\r"+
		"\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u00ac\b\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0005\r\u00c0\b\r\n"+
		"\r\f\r\u00c3\t\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0003\u000e\u00ca\b\u000e\u0005\u000e\u00cc\b\u000e\n\u000e\f\u000e"+
		"\u00cf\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u00d4\b"+
		"\u000e\u0005\u000e\u00d6\b\u000e\n\u000e\f\u000e\u00d9\t\u000e\u0003\u000e"+
		"\u00db\b\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u00e2\b\u000f\u0005\u000f\u00e4\b\u000f\n\u000f\f\u000f\u00e7"+
		"\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00f3"+
		"\b\u000f\u0005\u000f\u00f5\b\u000f\n\u000f\f\u000f\u00f8\t\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u00ff"+
		"\b\u000f\u0004\u000f\u0101\b\u000f\u000b\u000f\f\u000f\u0102\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f\u010a\b\u000f"+
		"\u0005\u000f\u010c\b\u000f\n\u000f\f\u000f\u010f\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0003\u000f\u0113\b\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0005"+
		"\u0010\u0118\b\u0010\n\u0010\f\u0010\u011b\t\u0010\u0001\u0010\u0000\u0001"+
		"\u001a\u0011\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016"+
		"\u0018\u001a\u001c\u001e \u0000\b\u0001\u0000\u0013\u0014\u0002\u0000"+
		"\u0002\u0004\b\b\u0002\u0000++..\u0002\u0000\u001d\u001e))\u0001\u0000"+
		"\u001f \u0001\u0000\u001d\u001e\u0001\u0000#&\u0001\u0000!\"\u0144\u0000"+
		"(\u0001\u0000\u0000\u0000\u00024\u0001\u0000\u0000\u0000\u00046\u0001"+
		"\u0000\u0000\u0000\u0006A\u0001\u0000\u0000\u0000\bN\u0001\u0000\u0000"+
		"\u0000\n^\u0001\u0000\u0000\u0000\fh\u0001\u0000\u0000\u0000\u000ew\u0001"+
		"\u0000\u0000\u0000\u0010\u007f\u0001\u0000\u0000\u0000\u0012\u0081\u0001"+
		"\u0000\u0000\u0000\u0014\u0083\u0001\u0000\u0000\u0000\u0016\u008d\u0001"+
		"\u0000\u0000\u0000\u0018\u0096\u0001\u0000\u0000\u0000\u001a\u00ab\u0001"+
		"\u0000\u0000\u0000\u001c\u00c4\u0001\u0000\u0000\u0000\u001e\u0112\u0001"+
		"\u0000\u0000\u0000 \u0114\u0001\u0000\u0000\u0000\"$\u0003\u0002\u0001"+
		"\u0000#%\u0005\u000e\u0000\u0000$#\u0001\u0000\u0000\u0000$%\u0001\u0000"+
		"\u0000\u0000%\'\u0001\u0000\u0000\u0000&\"\u0001\u0000\u0000\u0000\'*"+
		"\u0001\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000()\u0001\u0000\u0000"+
		"\u0000)+\u0001\u0000\u0000\u0000*(\u0001\u0000\u0000\u0000+,\u0005\u0000"+
		"\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-5\u0003\u0004\u0002\u0000"+
		".5\u0003\u0006\u0003\u0000/5\u0003\f\u0006\u000005\u0003\b\u0004\u0000"+
		"15\u0003\n\u0005\u000025\u0003\u001c\u000e\u000035\u0003\u001e\u000f\u0000"+
		"4-\u0001\u0000\u0000\u00004.\u0001\u0000\u0000\u00004/\u0001\u0000\u0000"+
		"\u000040\u0001\u0000\u0000\u000041\u0001\u0000\u0000\u000042\u0001\u0000"+
		"\u0000\u000043\u0001\u0000\u0000\u00005\u0003\u0001\u0000\u0000\u0000"+
		"6;\u0005+\u0000\u000078\u0005\f\u0000\u00008:\u0005+\u0000\u000097\u0001"+
		"\u0000\u0000\u0000:=\u0001\u0000\u0000\u0000;9\u0001\u0000\u0000\u0000"+
		";<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=;\u0001\u0000\u0000"+
		"\u0000>?\u0005\r\u0000\u0000?@\u0005\u000f\u0000\u0000@\u0005\u0001\u0000"+
		"\u0000\u0000AB\u0003\u001a\r\u0000BD\u0005\b\u0000\u0000CE\u0005\u0010"+
		"\u0000\u0000DC\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EG\u0001"+
		"\u0000\u0000\u0000FH\u0005\u0011\u0000\u0000GF\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000HI\u0001\u0000\u0000\u0000IL\u0005+\u0000\u0000"+
		"JK\u0005\r\u0000\u0000KM\u0005\u000f\u0000\u0000LJ\u0001\u0000\u0000\u0000"+
		"LM\u0001\u0000\u0000\u0000M\u0007\u0001\u0000\u0000\u0000NP\u0005\u0012"+
		"\u0000\u0000OQ\u0005.\u0000\u0000PO\u0001\u0000\u0000\u0000PQ\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RS\u0005\b\u0000\u0000SU\u0005\u0010"+
		"\u0000\u0000TV\u0005\u0011\u0000\u0000UT\u0001\u0000\u0000\u0000UV\u0001"+
		"\u0000\u0000\u0000VW\u0001\u0000\u0000\u0000WZ\u0005+\u0000\u0000XY\u0005"+
		"\r\u0000\u0000Y[\u0005\u000f\u0000\u0000ZX\u0001\u0000\u0000\u0000Z[\u0001"+
		"\u0000\u0000\u0000[\t\u0001\u0000\u0000\u0000\\_\u0003\u001a\r\u0000]"+
		"_\u0003\f\u0006\u0000^\\\u0001\u0000\u0000\u0000^]\u0001\u0000\u0000\u0000"+
		"_a\u0001\u0000\u0000\u0000`b\u0003\u0012\t\u0000a`\u0001\u0000\u0000\u0000"+
		"ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000cd\u0005\b\u0000\u0000"+
		"de\u0007\u0000\u0000\u0000e\u000b\u0001\u0000\u0000\u0000fi\u0003\u0010"+
		"\b\u0000gi\u0003\u001a\r\u0000hf\u0001\u0000\u0000\u0000hg\u0001\u0000"+
		"\u0000\u0000it\u0001\u0000\u0000\u0000jl\u0005\b\u0000\u0000km\u0003\u0012"+
		"\t\u0000lk\u0001\u0000\u0000\u0000lm\u0001\u0000\u0000\u0000mp\u0001\u0000"+
		"\u0000\u0000nq\u0003\u0010\b\u0000oq\u0003\u001a\r\u0000pn\u0001\u0000"+
		"\u0000\u0000po\u0001\u0000\u0000\u0000qs\u0001\u0000\u0000\u0000rj\u0001"+
		"\u0000\u0000\u0000sv\u0001\u0000\u0000\u0000tr\u0001\u0000\u0000\u0000"+
		"tu\u0001\u0000\u0000\u0000u\r\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000wx\u0005/\u0000\u0000xy\u0005\u0001\u0000\u0000yz\u0005/\u0000\u0000"+
		"z\u000f\u0001\u0000\u0000\u0000{\u0080\u0003\u0014\n\u0000|\u0080\u0003"+
		"\u0018\f\u0000}\u0080\u0003\u0016\u000b\u0000~\u0080\u0003\u000e\u0007"+
		"\u0000\u007f{\u0001\u0000\u0000\u0000\u007f|\u0001\u0000\u0000\u0000\u007f"+
		"}\u0001\u0000\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0011\u0001"+
		"\u0000\u0000\u0000\u0081\u0082\u0007\u0001\u0000\u0000\u0082\u0013\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084\u0085\u0007\u0002"+
		"\u0000\u0000\u0085\u008b\u0005\t\u0000\u0000\u0086\u0088\u0005\n\u0000"+
		"\u0000\u0087\u0089\u0003 \u0010\u0000\u0088\u0087\u0001\u0000\u0000\u0000"+
		"\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008a\u0001\u0000\u0000\u0000"+
		"\u008a\u008c\u0005\u000b\u0000\u0000\u008b\u0086\u0001\u0000\u0000\u0000"+
		"\u008b\u008c\u0001\u0000\u0000\u0000\u008c\u0015\u0001\u0000\u0000\u0000"+
		"\u008d\u008f\u0005\u0010\u0000\u0000\u008e\u0090\u0005\u0011\u0000\u0000"+
		"\u008f\u008e\u0001\u0000\u0000\u0000\u008f\u0090\u0001\u0000\u0000\u0000"+
		"\u0090\u0091\u0001\u0000\u0000\u0000\u0091\u0094\u0005+\u0000\u0000\u0092"+
		"\u0093\u0005\r\u0000\u0000\u0093\u0095\u0005\u000f\u0000\u0000\u0094\u0092"+
		"\u0001\u0000\u0000\u0000\u0094\u0095\u0001\u0000\u0000\u0000\u0095\u0017"+
		"\u0001\u0000\u0000\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098"+
		"\u0007\u0002\u0000\u0000\u0098\u0099\u0005\u0005\u0000\u0000\u0099\u0019"+
		"\u0001\u0000\u0000\u0000\u009a\u009b\u0006\r\uffff\uffff\u0000\u009b\u009c"+
		"\u0007\u0003\u0000\u0000\u009c\u00ac\u0003\u001a\r\u000e\u009d\u009e\u0005"+
		"\u000f\u0000\u0000\u009e\u009f\u0005\u0006\u0000\u0000\u009f\u00a0\u0003"+
		"\u001a\r\u0000\u00a0\u00a1\u0005\u0007\u0000\u0000\u00a1\u00ac\u0001\u0000"+
		"\u0000\u0000\u00a2\u00ac\u0005+\u0000\u0000\u00a3\u00ac\u0005*\u0000\u0000"+
		"\u00a4\u00ac\u0005.\u0000\u0000\u00a5\u00ac\u0005,\u0000\u0000\u00a6\u00ac"+
		"\u0005-\u0000\u0000\u00a7\u00a8\u0005\u0006\u0000\u0000\u00a8\u00a9\u0003"+
		"\u001a\r\u0000\u00a9\u00aa\u0005\u0007\u0000\u0000\u00aa\u00ac\u0001\u0000"+
		"\u0000\u0000\u00ab\u009a\u0001\u0000\u0000\u0000\u00ab\u009d\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a2\u0001\u0000\u0000\u0000\u00ab\u00a3\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ac\u00c1\u0001\u0000\u0000\u0000\u00ad\u00ae\n\r\u0000"+
		"\u0000\u00ae\u00af\u0007\u0004\u0000\u0000\u00af\u00c0\u0003\u001a\r\u000e"+
		"\u00b0\u00b1\n\f\u0000\u0000\u00b1\u00b2\u0007\u0005\u0000\u0000\u00b2"+
		"\u00c0\u0003\u001a\r\r\u00b3\u00b4\n\u000b\u0000\u0000\u00b4\u00b5\u0007"+
		"\u0006\u0000\u0000\u00b5\u00c0\u0003\u001a\r\f\u00b6\u00b7\n\n\u0000\u0000"+
		"\u00b7\u00b8\u0007\u0007\u0000\u0000\u00b8\u00c0\u0003\u001a\r\u000b\u00b9"+
		"\u00ba\n\t\u0000\u0000\u00ba\u00bb\u0005\'\u0000\u0000\u00bb\u00c0\u0003"+
		"\u001a\r\n\u00bc\u00bd\n\b\u0000\u0000\u00bd\u00be\u0005(\u0000\u0000"+
		"\u00be\u00c0\u0003\u001a\r\t\u00bf\u00ad\u0001\u0000\u0000\u0000\u00bf"+
		"\u00b0\u0001\u0000\u0000\u0000\u00bf\u00b3\u0001\u0000\u0000\u0000\u00bf"+
		"\u00b6\u0001\u0000\u0000\u0000\u00bf\u00b9\u0001\u0000\u0000\u0000\u00bf"+
		"\u00bc\u0001\u0000\u0000\u0000\u00c0\u00c3\u0001\u0000\u0000\u0000\u00c1"+
		"\u00bf\u0001\u0000\u0000\u0000\u00c1\u00c2\u0001\u0000\u0000\u0000\u00c2"+
		"\u001b\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c4"+
		"\u00c5\u0005\u0015\u0000\u0000\u00c5\u00c6\u0003\u001a\r\u0000\u00c6\u00cd"+
		"\u0005\u0016\u0000\u0000\u00c7\u00c9\u0003\u0002\u0001\u0000\u00c8\u00ca"+
		"\u0005\u000e\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000\u00c9\u00ca"+
		"\u0001\u0000\u0000\u0000\u00ca\u00cc\u0001\u0000\u0000\u0000\u00cb\u00c7"+
		"\u0001\u0000\u0000\u0000\u00cc\u00cf\u0001\u0000\u0000\u0000\u00cd\u00cb"+
		"\u0001\u0000\u0000\u0000\u00cd\u00ce\u0001\u0000\u0000\u0000\u00ce\u00da"+
		"\u0001\u0000\u0000\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00d0\u00d7"+
		"\u0005\u0017\u0000\u0000\u00d1\u00d3\u0003\u0002\u0001\u0000\u00d2\u00d4"+
		"\u0005\u000e\u0000\u0000\u00d3\u00d2\u0001\u0000\u0000\u0000\u00d3\u00d4"+
		"\u0001\u0000\u0000\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d1"+
		"\u0001\u0000\u0000\u0000\u00d6\u00d9\u0001\u0000\u0000\u0000\u00d7\u00d5"+
		"\u0001\u0000\u0000\u0000\u00d7\u00d8\u0001\u0000\u0000\u0000\u00d8\u00db"+
		"\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000\u0000\u0000\u00da\u00d0"+
		"\u0001\u0000\u0000\u0000\u00da\u00db\u0001\u0000\u0000\u0000\u00db\u00dc"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005\u0018\u0000\u0000\u00dd\u001d"+
		"\u0001\u0000\u0000\u0000\u00de\u00e5\u0005\u0019\u0000\u0000\u00df\u00e1"+
		"\u0003\u0002\u0001\u0000\u00e0\u00e2\u0005\u000e\u0000\u0000\u00e1\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e4"+
		"\u0001\u0000\u0000\u0000\u00e3\u00df\u0001\u0000\u0000\u0000\u00e4\u00e7"+
		"\u0001\u0000\u0000\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000\u00e5\u00e6"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e8\u0001\u0000\u0000\u0000\u00e7\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u001c\u0000\u0000\u00e9\u00ea"+
		"\u0003\u001a\r\u0000\u00ea\u00eb\u0005\u0018\u0000\u0000\u00eb\u0113\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ed\u0005\u0019\u0000\u0000\u00ed\u00ee\u0005"+
		"\u001a\u0000\u0000\u00ee\u00ef\u0003\u001a\r\u0000\u00ef\u00f6\u0005\u001b"+
		"\u0000\u0000\u00f0\u00f2\u0003\u0002\u0001\u0000\u00f1\u00f3\u0005\u000e"+
		"\u0000\u0000\u00f2\u00f1\u0001\u0000\u0000\u0000\u00f2\u00f3\u0001\u0000"+
		"\u0000\u0000\u00f3\u00f5\u0001\u0000\u0000\u0000\u00f4\u00f0\u0001\u0000"+
		"\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001\u0000"+
		"\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f7\u00f9\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u0018"+
		"\u0000\u0000\u00fa\u0113\u0001\u0000\u0000\u0000\u00fb\u0100\u0005\u0019"+
		"\u0000\u0000\u00fc\u00fe\u0003\u0002\u0001\u0000\u00fd\u00ff\u0005\u000e"+
		"\u0000\u0000\u00fe\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000"+
		"\u0000\u0000\u00ff\u0101\u0001\u0000\u0000\u0000\u0100\u00fc\u0001\u0000"+
		"\u0000\u0000\u0101\u0102\u0001\u0000\u0000\u0000\u0102\u0100\u0001\u0000"+
		"\u0000\u0000\u0102\u0103\u0001\u0000\u0000\u0000\u0103\u0104\u0001\u0000"+
		"\u0000\u0000\u0104\u0105\u0005\u001a\u0000\u0000\u0105\u0106\u0003\u001a"+
		"\r\u0000\u0106\u010d\u0005\u001b\u0000\u0000\u0107\u0109\u0003\u0002\u0001"+
		"\u0000\u0108\u010a\u0005\u000e\u0000\u0000\u0109\u0108\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0001\u0000\u0000\u0000\u010a\u010c\u0001\u0000\u0000"+
		"\u0000\u010b\u0107\u0001\u0000\u0000\u0000\u010c\u010f\u0001\u0000\u0000"+
		"\u0000\u010d\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000"+
		"\u0000\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u010d\u0001\u0000\u0000"+
		"\u0000\u0110\u0111\u0005\u0018\u0000\u0000\u0111\u0113\u0001\u0000\u0000"+
		"\u0000\u0112\u00de\u0001\u0000\u0000\u0000\u0112\u00ec\u0001\u0000\u0000"+
		"\u0000\u0112\u00fb\u0001\u0000\u0000\u0000\u0113\u001f\u0001\u0000\u0000"+
		"\u0000\u0114\u0119\u0003\u001a\r\u0000\u0115\u0116\u0005\f\u0000\u0000"+
		"\u0116\u0118\u0003\u001a\r\u0000\u0117\u0115\u0001\u0000\u0000\u0000\u0118"+
		"\u011b\u0001\u0000\u0000\u0000\u0119\u0117\u0001\u0000\u0000\u0000\u0119"+
		"\u011a\u0001\u0000\u0000\u0000\u011a!\u0001\u0000\u0000\u0000\u011b\u0119"+
		"\u0001\u0000\u0000\u0000\'$(4;DGLPUZ^ahlpt\u007f\u0088\u008b\u008f\u0094"+
		"\u00ab\u00bf\u00c1\u00c9\u00cd\u00d3\u00d7\u00da\u00e1\u00e5\u00f2\u00f6"+
		"\u00fe\u0102\u0109\u010d\u0112\u0119";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}