package calculator;

import linkedListQueue.LinkedListQueueADT;
import token.IToken;

import java.util.ArrayList;

public class postFixCalculator implements IpostfixCalculatorADT {

    @Override
    public int evaluateExpression(ArrayList<IToken> tokenList) {

        LinkedListQueueADT<IToken> returnStack = new LinkedListQueueADT<>();

        for (IToken index : tokenList) {
            if (index.getClass() == Character.class) {
                return 0;
            }
        }

    }

}

