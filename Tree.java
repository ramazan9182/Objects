
public class Tree {
	String name;
	int height;

	// Constructor (Method) Overloading

	public Tree() {
		System.out.println("A tree is created with height value  0 (zero) ");
		height = 0;
	}

	public Tree(String treeName) {
		name = treeName;
	}

	public Tree(int initialHeight) {
		System.out.println("A tree is created with height value : " + initialHeight);
		height = initialHeight;
	}

	public Tree(String treeName, int initialHeight) {
		name = treeName;
		height = initialHeight;
	}
	
	public Tree(int initialHeight, String treeName) {
		name = treeName;
		height = initialHeight;
	}
	
	/**
	 * INSTANCE METHODS
	 * 
	 */
	
	void grow() {
		this.height++;
	}
	
	void setHeight(int height) {
		this.height = height;
	}

	int getHeight() {
		return this.height;
	}
	
}
