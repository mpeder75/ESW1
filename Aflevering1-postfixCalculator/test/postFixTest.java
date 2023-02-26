import calculator.IpostfixCalculatorADT;
import calculator.postFixCalculator;
import linkedListQueue.ILinkedListADT;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;
import org.junit.runners.JUnit4;
import token.IToken;
import token.ITokenOperand;
import token.TokenOperator;

import java.util.ArrayList;
import java.util.List;

public class postFixTest {

    private IpostfixCalculatorADT calc;

    @Before
    private void setup ()
    {
       calc = new postFixCalculator();
    }

    @Test
    public void testCorrectInput() {

        ArrayList<IToken> tokenList = new ArrayList<>();

        tokenList.add(new ITokenOperand(5));
        tokenList.add(new ITokenOperand(7));
        tokenList.add(new TokenOperator('+'));
        tokenList.add(new ITokenOperand(7));
        tokenList.add(new TokenOperator('*'));

        assert(calc.evaluateExpression(tokenList) == 54);
    }

    @Test
    public void testWrongInput() {

        ArrayList<IToken> tokenList = new ArrayList<>();

        tokenList.add(new ITokenOperand(5));
        tokenList.add(new ITokenOperand(7));
        tokenList.add(new TokenOperator('f'));
        tokenList.add(new ITokenOperand(7));
        tokenList.add(new TokenOperator('g'));

        assert(calc.evaluateExpression(tokenList) == 54);
    }




}
