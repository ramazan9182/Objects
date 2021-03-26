
public class DriverTreeConstructorCallsFromConstructor {

	
	public static void main(String[] args) {
		
		
		TreeConstructorCallsFromConstructor tree = new TreeConstructorCallsFromConstructor();
		System.out.println(tree.name);
		System.out.println(tree.height);
		
		TreeConstructorCallsFromConstructor tree2 = new TreeConstructorCallsFromConstructor("Special",90);
		System.out.println(tree2.name);
		System.out.println(tree2.height);
		
		System.out.println("Total " + tree.count + " tree(s)" );
		
		
		
	}
}
