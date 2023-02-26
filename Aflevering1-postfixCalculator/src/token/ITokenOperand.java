package token;

public class ITokenOperand implements IToken<Integer> {

   private final Integer operand;

    public ITokenOperand(Integer operand) {
        this.operand = operand;
    }

    @Override
    public Integer getValue() {
        return operand;
    }
}
