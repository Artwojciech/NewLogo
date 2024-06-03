public class Value {
    public enum ValueType {
        INT,
        STRING,
        CHAR,
        BOOL
    }
    
    private final ValueType type;
    private String value;
    
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

    public void setValue(String value) {
        this.value = value;
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

    public static Value add(Value value1, Value value2) {
        if (value1.getType() == ValueType.INT && value2.getType() == ValueType.INT) {
            return new Value(value1.getInt() + value2.getInt());
        }
        else if (value1.getType() == ValueType.STRING && value2.getType() == ValueType.STRING) {
            return new Value(value1.getString() + value2.getString());
        }
        else if (value1.getType() == ValueType.CHAR && value2.getType() == ValueType.CHAR) {
            return new Value(value1.getChar() + value2.getChar());
        }
        else if (value1.getType() == ValueType.BOOL && value2.getType() == ValueType.BOOL) {
            return new Value(value1.getBool() || value2.getBool());
        }
        else {
            System.err.println("Cannot add values of different types!");
            return new Value(0);
        }
    }
    
    public static Value multiply(Value value1, Value value2) {
        if (value1.getType() == ValueType.INT && value2.getType() == ValueType.INT) {
            return new Value(value1.getInt() * value2.getInt());
        }
        else if (value1.getType() == ValueType.BOOL && value2.getType() == ValueType.BOOL) {
            return new Value(value1.getBool() && value2.getBool());
        }
        else {
            System.err.println("Cannot multiply values of these types!");
            return new Value(0);
        }
    }
    
    public static Value divide(Value value1, Value value2) {
        if (value1.getType() == ValueType.INT && value2.getType() == ValueType.INT) {
            return new Value(value1.getInt() / value2.getInt());
        }
        else {
            System.err.println("Cannot divide values of these types!");
            return new Value(0);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Value v) {
            return this.type == v.type && this.value.equals(v.value);
        }
        return false;
    }
}
