
public class arraysInMeth {
	public static void main(String[] args){
		int andie[]={3,4,5,6,7};
		change(andie);
		
		
		for(int y:andie)
			System.out.println(y);
	}
	
	public static void change(int x[]){
		for(int counter=0;counter<x.length;counter++)
			x[counter]+=5;
	}
}
