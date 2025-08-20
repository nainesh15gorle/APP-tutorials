import java.util.Scanner;
public class Increment{
	public static void main(String[] args){
		int num=7;
		System.out.println("The post increment");
		System.out.println(" The value of post increment is " + num++);
		System.out.println("The value is" + num);
		
		System.out.println("The pre increment" );
		System.out.println(" The value of pre increment " + ++num);
		System.out.println("The value is" + num);
		 
	}
}