package token;

public class TokenOperator implements IToken<Character> {

    private final Character operator;

    public TokenOperator(char operator) {
        this.operator = operator;
    }

    @Override
    public Character getValue() {
        return operator;
    }


}
