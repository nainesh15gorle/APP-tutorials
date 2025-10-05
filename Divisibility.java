import java.util.Scanner;
class Divisibility{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int number;
System.out.println("enter the number:");
number=input.nextInt();
if(number%3==0){
System.out.println("it is divisible");
}else{
System.out.println(" It is not divisible");
}
input.close();
}
}