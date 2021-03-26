
public class PassByValue {

	public static void main(String[] args) {

		House house; // Only stores any House reference
		
		house = new House();
		house.no = 1;
		house = new House();
		
		House house2;
		house2 = new House();
		
		changeHouseNo(house);
		changeHouse(house);
		System.out.println(house.no);
		
		
		
	}

	public static void changeHouseNo(House house) {
		house.no = 98;
	}

	public static void changeHouse(House house) {
		house.no = 45;
		house = new House();
	}
}
