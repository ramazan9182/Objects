

class House {
	int no;
	Window window2 = new Window(2);
	
	House() {
		System.out.println("House is created");
		window3 = new Window(1312);
	}
	
	Window window1 = new Window(1);
	void specialHouseMethod() {
		System.out.println("special house method");
	}
	Window window3 = new Window(3);
}
