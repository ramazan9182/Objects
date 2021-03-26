
public class TreeConstructorCallsFromConstructor {
	
	static int count;
	int height;
	String name;
	
	public TreeConstructorCallsFromConstructor() {
		this("UNKNOWN",0);
	}

	public TreeConstructorCallsFromConstructor(String treeName) {
		this(treeName,0);
	}

	public TreeConstructorCallsFromConstructor(int initialHeight) {
		this("UNKNOWN", initialHeight);
		
	}

	public TreeConstructorCallsFromConstructor(String treeName, int initialHeight) {
		name = treeName;
		height = initialHeight;
		count++;
	}
	
	
	static void grow() {
		count++;
		// height ??? 
	}
}
