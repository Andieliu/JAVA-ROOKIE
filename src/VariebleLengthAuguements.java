import javax.print.attribute.standard.PrinterLocation;

public class VariebleLengthAuguements {
	public static void main(String[] args){
		System.out.println(average(43,56,74,8));
	}
	public static int average(int...students){    //...means i dont know how many auguements i will make
		int total = 0;
		for(int x:students)
			total+=x;
		
		return total/students.length; //the sum of the numbers we put in/the number of numbers
	}
}
