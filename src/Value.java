public class Value {
    public enum ValueType {
        INT,
        STRING,
        CHAR,
        BOOL
    }
    
    private final ValueType type;
    private final String value;
    
    public Value(ValueType type, String value) {
        this.type = type;
        this.value = value;
    }
    public Value(int value) {
        this.type = ValueType.INT;
        this.value = Integer.toString(value);
    }
    public Value(String value) {
        this.type = ValueType.STRING;
        this.value = value;
    }
    public Value(char value) {
        this.type = ValueType.CHAR;
        this.value = Character.toString(value);
    }
    public Value(boolean value) {
        this.type = ValueType.BOOL;
        this.value = Boolean.toString(value);
    }
    
    public ValueType getType() {
        return type;
    }
    
    public String getValue() {
        return value;
    }
    
    public int getInt () {
        if (type != ValueType.INT) {
            System.err.println("Value is not an integer!");
            return 0;
        }
        
        try {
            return Integer.parseInt(value);
        }
        catch (NumberFormatException e) {
            System.err.println("Value is not an integer!");
            return 0;
        }
    }
    
    public String getString() {
        if (type != ValueType.STRING) {
            System.err.println("Value is not a string!");
            return "";
        }
        
        return value;
    }
    
    public char getChar() {
        if (type != ValueType.CHAR) {
            System.err.println("Value is not a char!");
            return '\0';
        }
        
        if (value.length() > 1) {
            System.err.println("Value is not a char!");
            return '\0';
        }
        
        return value.charAt(0);
    }
    
    public boolean getBool() {
        if (type != ValueType.BOOL) {
            System.err.println("Value is not a boolean!");
            return false;
        }
        
        return Boolean.parseBoolean(value);
    }
}
