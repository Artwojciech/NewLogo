import java.io.IOException;
import java.io.InputStream;

import antlr.NewLogoLexer;
import antlr.NewLogoParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


class Main {
    public static void main(String[] args) {
        try {
            InputStream inputStream = Main.class.getResourceAsStream("test.txt");

            Lexer lexer = new NewLogoLexer(CharStreams.fromStream(inputStream));
            TokenStream tokenStream = new CommonTokenStream(lexer);

            NewLogoParser parser = new NewLogoParser(tokenStream);
            ParseTree tree = parser.program();

            System.out.println(tree.toStringTree(parser));
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
