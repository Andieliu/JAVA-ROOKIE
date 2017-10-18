package Timesetting;
public class construson {
	public static void main(String[] agrs){
		
		constru consObject = new constru();
		constru consObject2 = new constru(5);
		constru consObject3 = new constru(5,13);
		constru consObject4 = new constru(5,13,43);
		
		System.out.printf("%s\n", consObject.toMilitary());
		System.out.printf("%s\n", consObject2.toMilitary());
		System.out.printf("%s\n", consObject3.toMilitary());
		System.out.printf("%s\n", consObject4.toMilitary());  // s\n = String with a new line
		
	}

}
