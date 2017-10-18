package Timesetting;

public class DisplayRegularTime {
	public static void main(String[] agrs){
			DisplayRegularTimeson TimesonObject = new DisplayRegularTimeson();
			System.out.println(TimesonObject.toMilitary());
			System.out.println(TimesonObject.toString());

			TimesonObject.setTime(13, 27, 6);   //why is the 6 is the same as "06"?
			System.out.println(TimesonObject.toMilitary());
			System.out.println(TimesonObject.toString());
	
	}
}
