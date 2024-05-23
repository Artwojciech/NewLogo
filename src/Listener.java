import DrawingTools.DrawingPanel;
import antlr.NewLogoParser;
import antlr.NewLogoParserBaseListener;

public class Listener extends NewLogoParserBaseListener {
    DrawingPanel panel;
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
                if(val.VARIABLE() != null) {
                    // Get the value of the variable
                }
                else if(val.STRING_CONST() != null || val.CHAR_CONST() != null) {
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
    
    
}
