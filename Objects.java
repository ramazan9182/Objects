
public class Objects {

	/**
	 * 
	 * object : instance of a class
	 * 
	 * @param args
	 */

	public static void main(String[] args) {

		// new operator --> gets instance of classes

		int value = 5;

		A a = new A();
		A a1 = new A();

//		A a;
//		a = new Scanner(System.in); // Illegal
//		a = new A();

		// . --> binding operator

		a.value = 4;
		a.quantity = 45;

		a1.value = 5;
		a1.quantity = 12;

		value = 14;
		
		changeValue(value);
		
//		System.out.println(value);
		
		
		changeValue2(a);
		
//		System.out.println(a.value);
		
		newValue(a);
		
		System.out.println(a.value);

		// pass-by-value
		
	}

	public static int changeValue(int value) {
		value = 678;
		return value;
	}
	
	public static void changeValue2(A x) {
		x.value = 4556;
	}
	
	public static void newValue(A a) {
		a = new A();
		a.value = 1333;
	}

}
