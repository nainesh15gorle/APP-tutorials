import java.util.Scanner;
class Numbercheck{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int number;
System.out.println("enter the number:");
number=input.nextInt();
if(number%2==0){
System.out.println("even");
}else{
System.out.println("odd");
}
input.close();
}
}