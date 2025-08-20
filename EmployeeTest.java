class Employee {
    int id;
    String name;
    int salary;
    Employee(int i, String nm, int sal) {
        id = i;
        name = nm;
        salary = sal;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee ep1 = new Employee(24, "nainesh", 243333);
        Employee ep2 = new Employee(123, "vansh", 43567);

        System.out.println("ID Name Salary");
        System.out.println(ep1.id + " " + ep1.name + " " + ep1.salary);
        System.out.println(ep2.id + " " + ep2.name + " " + ep2.salary);
    }
}