/**
 * @author Christelle
 * 
 */
public class ScannerDemo {

	private static String file1 = "/Users/juliegauthier/Desktop/Homework/prog1.jay";
	private static int counter = 1;


	public static void main(String args[]) {

		TokenStream ts = new TokenStream(file1);
		Token t;
		System.out.println(file1);

		while (!ts.isEndofFile()) {
			t = ts.nextToken();
			System.out.println("Token" + counter+ " Type: " + t.getType() + " Content: " + t.getValue());
			counter++;
		}
	}
}
