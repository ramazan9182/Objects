
public class DriverTreeInstance {
	
	public static void main(String[] args) {
		
		
		Tree tree = new Tree();
		
		tree.grow();
		
		System.out.println("Now, tree has " + tree.getHeight() + " height !");
		
		tree.grow();
		
		System.out.println("Now, tree has " + tree.getHeight() + " height !");
		
		tree.grow();
		
		System.out.println("Now, tree has " + tree.getHeight() + " height !");
		
		tree.setHeight(1);
		
		System.out.println("Now, tree has " + tree.getHeight() + " height !");
		
		
		Tree tree1 = new Tree();
		
		tree1.grow();
		tree1.grow();
		
		System.out.println("Now, tree1 has " + tree1.getHeight() + " height !");
		
		System.out.println("But tree has " + tree.getHeight() + " height !");
		
	}

}
