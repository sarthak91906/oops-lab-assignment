abstract class Employee {
    protected String name;
    protected int id;
    protected double salary;
    
    public Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public abstract double calculateBonus();
    
    public void displayInfo() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: $" + salary);
    }
}

class Manager extends Employee {
    public Manager(String name, int id, double salary) {
        super(name, id, salary);
    }
    
    @Override
    public double calculateBonus() {
        return salary * 0.20; // 20% of salary
    }
}

class Developer extends Employee {
    private double projectIncentive;
    
    public Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id, salary);
        this.projectIncentive = projectIncentive;
    }
    
    @Override
    public double calculateBonus() {
        return (salary * 0.10) + projectIncentive; // 10% of salary plus project incentive
    }
}

public class Question13_EmployeePerformance {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        employees[0] = new Manager("John Smith", 101, 80000);
        employees[1] = new Developer("Alice Johnson", 102, 60000, 5000);
        employees[2] = new Manager("Bob Wilson", 103, 90000);
        
        System.out.println("=== Employee Performance Evaluation ===");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println("Bonus: $" + emp.calculateBonus());
            System.out.println("Total Compensation: $" + (emp.salary + emp.calculateBonus()));
            System.out.println();
        }
    }
}
