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
            DrawingPanel.processCommand(panel, ctx.function().drawingFunction().getText(), ctx.callArguments().getText());
        }
    }
}
