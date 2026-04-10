class EmployeeThis {
    private String name;
    private double salary;
    
    public EmployeeThis(String name, double salary) {
        this.name = name;  // Using 'this' to distinguish between instance variable and parameter
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee Salary: $" + this.salary);
    }
    
    public void updateSalary(double salary) {
        this.salary = salary;  // Using 'this' to refer to instance variable
        System.out.println("Updated salary for " + this.name + ": $" + this.salary);
    }
    
    public EmployeeThis getEmployee() {
        return this;  // Using 'this' to return current object
    }
}

public class Question20_ThisKeyword {
    public static void main(String[] args) {
        EmployeeThis emp1 = new EmployeeThis("John Doe", 75000);
        EmployeeThis emp2 = new EmployeeThis("Jane Smith", 82000);
        EmployeeThis emp3 = new EmployeeThis("Bob Johnson", 68000);
        
        System.out.println("=== Employee Details Using 'this' Keyword ===");
        emp1.displayDetails();
        System.out.println();
        
        emp2.displayDetails();
        emp2.updateSalary(85000);
        System.out.println();
        
        emp3.displayDetails();
        
        // Demonstrating returning 'this'
        EmployeeThis currentEmp = emp1.getEmployee();
        System.out.println("\nCurrent employee object: " + currentEmp.getClass().getSimpleName());
    }
}
