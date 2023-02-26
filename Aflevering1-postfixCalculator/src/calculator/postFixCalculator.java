package calculator;

import linkedListQueue.LinkedListQueueADT;
import token.IToken;
import token.ITokenOperand;
import token.TokenOperator;

import java.util.ArrayList;

public class postFixCalculator implements IpostfixCalculatorADT {

    @Override
    public int evaluateExpression(ArrayList<IToken> tokenList) {

        int a = 0;
        int b = 0;

        LinkedListQueueADT<IToken> returnStack = new LinkedListQueueADT<>();

        for (IToken index : tokenList) {

            if (index instanceof ITokenOperand) {
                returnStack.push(index);
            }

            if (index instanceof TokenOperator) {
                switch (((TokenOperator) index).getValue()) {
                    case '+':
                        returnStack.push(new ITokenOperand(add((Integer) returnStack.pop().getValue(), (Integer) returnStack.pop().getValue())));
                        break;
                    case '-':
                        returnStack.push(new ITokenOperand(subtract((Integer) returnStack.pop().getValue(), (Integer) returnStack.pop().getValue())));
                        break;
                    case '/':
                        returnStack.push(new ITokenOperand(divide((Integer) returnStack.pop().getValue(), (Integer) returnStack.pop().getValue())));
                        break;
                    case '*':
                        returnStack.push(new ITokenOperand(multiply((Integer) returnStack.pop().getValue(), (Integer) returnStack.pop().getValue())));
                        break;
                }
            }
        }
        return (Integer) returnStack.pop().getValue();

    }


    private int add(int a, int b) {
        return a + b;
    }

    private int subtract(int a, int b) {
        return a - b;
    }

    private int divide(int a, int b) {
        return a / b;
    }

    private int multiply(int a, int b) {
        return a * b;
    }
}

