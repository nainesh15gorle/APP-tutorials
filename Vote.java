import java.util.Scanner;
class Vote{
public static void main(String[]args){
Scanner input=new Scanner(System.in);
int age;
System.out.println("enter the age:");
age=input.nextInt();
if(age>=18){
System.out.println("eligible to vote");
}else{
System.out.println("not eligible to vote");
}
input.close();
}
}