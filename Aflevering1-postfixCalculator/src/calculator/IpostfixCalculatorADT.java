package calculator;

import token.IToken;

import java.util.ArrayList;

public interface IpostfixCalculatorADT {
int evaluateExpression (ArrayList<IToken> tokenList);


}
