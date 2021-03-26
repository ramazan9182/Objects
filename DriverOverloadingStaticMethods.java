
public class DriverOverloadingStaticMethods {

	public static int f() {
		return 0;
	}

	public static void main(String[] args) {
		
		OverloadingStaticMethods.f();
		
		f(); // calling any method
		
	}
}
