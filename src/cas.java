import java.nio.charset.MalformedInputException;

public class cas {
	public static void main(String[] args){
		int age;
		age=27;
				
		switch(age){
		case 15:
			System.out.println("you fall in love with someone");
			break;
		case 16:
			System.out.println("you break up with this guy");
			break;
		case 17:
			System.out.println("you decide to focus on schoolwork");
			break;
		case 18:
			System.out.println("you fail to enter the best college");
			break;
		case 19:
			System.out.println("you fall in love with another guy");
			break;
		default:
		System.out.println("go find a man before it is too late");
			break;
		}
					
	}
}
