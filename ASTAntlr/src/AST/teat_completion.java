package AST;
import java.io.File;
import java.io.FileInputStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.Token;


public class teat_completion {
	public static void main(String[] args) throws Exception {
		System.out.println("parsing");
		
		FileInputStream fis = new FileInputStream(new File("for.java"));
		ANTLRInputStream input =new ANTLRInputStream(fis);
		int a = 1;
		JavaLexer lexer = new JavaLexer(input);
		int b =2;
		Token token = lexer.nextToken();
		while(token.getType() != JavaLexer.EOF) {
			System.err.println(token.getType() + token.getText());
			//token = lexer.nextToken();
		
		}
		
		


	}
}
