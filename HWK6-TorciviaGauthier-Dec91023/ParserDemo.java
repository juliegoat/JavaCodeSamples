public class ParserDemo {

	private static String file1 = "Users/juliegauthier/Downloads/GIVEN 2/PARSER/prog2.jay";

	public static void main(String[] args) {
		
		//lexical analysis
		TokenStream tStream = new TokenStream(file1);
		System.out.println("test1");
		
		//syntactical analysis
		ConcreteSyntax cSyntax = new ConcreteSyntax(tStream);
		System.out.println("test2");
		
		//
		Program p = cSyntax.program();
		System.out.println(p.display());
		System.out.println("test");
	}

}
