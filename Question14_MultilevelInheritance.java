class Person {
    public void role() {
        System.out.println("I am a person");
    }
}

class EmployeeML extends Person {
    @Override
    public void role() {
        System.out.println("I am an employee");
    }
}

class ManagerML extends EmployeeML {
    @Override
    public void role() {
        System.out.println("I am a manager");
    }
}

public class Question14_MultilevelInheritance {
    public static void main(String[] args) {
        Person person = new Person();
        EmployeeML employee = new EmployeeML();
        ManagerML manager = new ManagerML();
        
        System.out.println("=== Multilevel Inheritance Demo ===");
        person.role();
        employee.role();
        manager.role();
        
        System.out.println("\n=== Runtime Polymorphism Demo ===");
        Person p1 = new EmployeeML();
        Person p2 = new ManagerML();
        
        p1.role(); // Calls Employee's role()
        p2.role(); // Calls Manager's role()
    }
}
