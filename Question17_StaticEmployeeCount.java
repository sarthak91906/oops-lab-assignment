class EmployeeStatic {
    private String name;
    private int id;
    private static int employeeCount = 0;
    
    public EmployeeStatic(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public static int getEmployeeCount() {
        return employeeCount;
    }
    
    public void display() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}

public class Question17_StaticEmployeeCount {
    public static void main(String[] args) {
        System.out.println("Initial employee count: " + EmployeeStatic.getEmployeeCount());
        
        EmployeeStatic emp1 = new EmployeeStatic("John Doe", 101);
        EmployeeStatic emp2 = new EmployeeStatic("Jane Smith", 102);
        EmployeeStatic emp3 = new EmployeeStatic("Bob Johnson", 103);
        EmployeeStatic emp4 = new EmployeeStatic("Alice Brown", 104);
        EmployeeStatic emp5 = new EmployeeStatic("Charlie Wilson", 105);
        
        System.out.println("\n=== Employee Details ===");
        emp1.display();
        emp2.display();
        emp3.display();
        emp4.display();
        emp5.display();
        
        System.out.println("\nTotal number of employees: " + EmployeeStatic.getEmployeeCount());
    }
}
