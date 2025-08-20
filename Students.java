import java.util.Scanner;
class Student{
int rollNo;
String name;
int marks;
public Student(int r,String n,int m){
rollNo=r;
name=n;
marks=m;
}
void display(){
System.out.println("rollno:"+rollNo+"name:"+name+"marks:"+marks);
}
}
public class Students{
public static void main(String[]args){
Student s1=new Student(21,"nainesh",100);
Student s2=new Student(12,"tilak",101);
s1.display();
s2.display();
}
}