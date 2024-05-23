public class Value {
    public enum ValueType {
        INT,
        STRING,
        CHAR,
        BOOL
    }
    
    private ValueType type;
    private String value;
    
    public Value(ValueType type, String value) {
        this.type = type;
        this.value = value;
    }
    
    public ValueType getType() {
        return type;
    }
    
    public String getValue() {
        return value;
    }
}
