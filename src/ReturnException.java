public class ReturnException extends RuntimeException {
    private final Value returnValue;

    public ReturnException(Value returnValue) {
        this.returnValue = returnValue;
    }

    public Value getReturnValue() {
        return returnValue;
    }
}