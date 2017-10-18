import java.util.Scanner;


public class apple{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna();
		System.out.println("Enter the name of my best girl ever here: ");
		String jenny = input.nextLine();
		tunaObject.setName(jenny);
		tunaObject.saying();
	}
}


