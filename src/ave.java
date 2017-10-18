import java.util.Scanner;

public class ave {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double total = 0;
		double average;
		int counter = 0;
		
		while (counter < 10){
			double grade = input.nextDouble();
			total =total +grade;
			counter++;
		}
		average = total/10;
		System.out.println("Your average is " + average);
	}
}
