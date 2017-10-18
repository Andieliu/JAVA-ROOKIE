import java.util.Scanner;

class ppmeson {
	public static void main(String[] args){               //主方法  功能：执行引导，扫描手动输入		
		Scanner input = new Scanner(System.in);           //扫描导入手动输入内容
		ppme ppmeObject = new ppme();                     //设置插头ppmeObject
		
		System.out.println("Enter your name here: ");      //引导
		String name = input.nextLine();                    //设置变量name，即手动输入内容
		
		ppmeObject.simpleMessage(name);                    //将class ppmeson中的name量通过插头ppmeObject插入class ppme
		
	}
		
}