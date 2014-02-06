
public class ProgramDemo {

	public static void main(String[] args) {
		
	
		Program p = new Program();
		//write this in a method
		p.decpart = new Declarations();
		p.body = new Block();
		
		Declaration d = new Declaration();
		d.t = new Type ("int");
		d.v = new Variable();
		d.v.id = new String("i");
		
		Assignment a = Assignment();
		a.target = new Variable();
		a.source = new Value(5);
		a.target.id = new String("i");

		System.out.println(p.display());
	}
}
