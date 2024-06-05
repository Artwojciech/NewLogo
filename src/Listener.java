//No longer used, use visitor instead

/*import DrawingTools.DrawingPanel;
import antlr.NewLogoParser;
import antlr.NewLogoParserBaseListener;

import java.util.Hashtable;

public class Listener extends NewLogoParserBaseListener {
    DrawingPanel panel;
    Hashtable<String, Value> variables = new Hashtable<>();
    
    
    @Override
    public void enterProgram(NewLogoParser.ProgramContext ctx) {
        panel  = DrawingPanel.createPanel(800, 600);
    }

    @Override
    public void exitFunctionCall(NewLogoParser.FunctionCallContext ctx) {
        if(ctx.function().drawingFunction() != null) {
            if(ctx.callArguments().getChildCount() == 0) {
                System.err.println("No arguments for command!");
                return;
            }
            else if(ctx.callArguments().getChildCount() > 1) {
                System.err.println("Too many arguments for command!");
                return;
            }
            String argument = "";
            if(ctx.callArguments().getChild(0) instanceof NewLogoParser.ValueContext val) {
                if(val.variable() != null) {
                    if(variables.containsKey(val.variable().getText())) {
                        argument = variables.get(val.variable().getText()).getValue();
                    }
                    else {
                        System.err.println("Unknown value: " + val.variable().getText());
                        return;
                    }
                }
                else if(val.string() != null || val.CHAR_CONST() != null) {
                    argument = val.getText();
                    argument = argument.substring(1, argument.length()-1);
                }
                else {
                    argument = val.getText();
                }
            }
            
            DrawingPanel.processCommand(panel, ctx.function().drawingFunction().getText(), argument);
        }
    }

    @Override
    public void exitVarDeclaration(NewLogoParser.VarDeclarationContext ctx) {
        String varName = ctx.variable().getText();
        if(variables.containsKey(varName)) {
            System.err.println("Variable " + varName + " already declared!");
            return;
        }
        
        Value.ValueType type;
        if (ctx.varType().BOOL() != null) type = Value.ValueType.BOOL;
        else if (ctx.varType().INT() != null) type = Value.ValueType.INT;
        else if (ctx.varType().STRING() != null) type = Value.ValueType.STRING;
        else if (ctx.varType().CHAR() != null) type = Value.ValueType.CHAR;
        else {
            System.err.println("Unknown type!");
            return;
        }
        
        String value;
        if(ctx.value().variable() != null) {
            if(variables.containsKey(ctx.value().variable().getText())) {
                value = variables.get(ctx.value().variable().getText()).getValue();
            }
            else {
                System.err.println("Unknown value: " + ctx.value().variable().getText());
                return;
            }
        }
        else if(ctx.value().string() != null || ctx.value().CHAR_CONST() != null) {
            value = ctx.value().getText();
            value = value.substring(1, value.length()-1);
        }
        else {
            value = ctx.value().getText();
        }
        
        variables.put(varName, new Value(type, value));
    }
}*/
