import antlr.NewLogoParser;
import org.antlr.v4.runtime.misc.Pair;

import java.util.ArrayList;

public class Func {
    NewLogoParser.StatementBlockContext block;
    Value.ValueType returnType;
    ArrayList<Pair<Value.ValueType, String>> parameters;
    
    public Func(NewLogoParser.StatementBlockContext block, Value.ValueType returnType, ArrayList<Pair<Value.ValueType, String>> parameters) {
        this.block = block;
        this.returnType = returnType;
        this.parameters = parameters;
    }
    
    public NewLogoParser.StatementBlockContext getBlock() {
        return block;
    }
    
    public Value.ValueType getReturnType() {
        return returnType;
    }
    
    public ArrayList<Pair<Value.ValueType, String>> getParameters() {
        return parameters;
    }
}
