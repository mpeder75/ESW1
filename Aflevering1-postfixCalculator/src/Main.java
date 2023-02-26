import calculator.IpostfixCalculatorADT;
import calculator.postFixCalculator;
import token.IToken;
import token.ITokenOperand;
import token.TokenOperator;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        IpostfixCalculatorADT calc = new postFixCalculator();

        ArrayList<IToken> tokenList = new ArrayList<>();

        tokenList.add(new ITokenOperand(5));
        tokenList.add(new ITokenOperand(7));
        tokenList.add(new TokenOperator('+'));
        tokenList.add(new ITokenOperand(7));
        tokenList.add(new TokenOperator('*'));

        System.out.println(calc.evaluateExpression(tokenList) == 84);

        tokenList.set(2,new TokenOperator('f'));
        tokenList.set(4,new TokenOperator('g'));

        System.out.println(calc.evaluateExpression(tokenList) == 84);



    }


}