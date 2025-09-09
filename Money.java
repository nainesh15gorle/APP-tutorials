class Employee {
    double baseSalary = 30000;  
    void calculateSalary() {
        System.out.println("Employee salary: " + baseSalary);
    }
}
class Manager extends Employee {
    double bonus = 10000;

    @Override
    void calculateSalary() {
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager salary: " + totalSalary);
    }
}
class Developer extends Employee {
    double overtimePay = 5000;

    @Override
    void calculateSalary() {
        double totalSalary = baseSalary + overtimePay;
        System.out.println("Developer salary: " + totalSalary);
    }
}
public class Money{
    public static void main(String[] args) {    
	Employee emp1 = new Manager(); 
    Employee emp2 = new Developer(); 
    emp1.calculateSalary();  
    emp2.calculateSalary();
    }
}