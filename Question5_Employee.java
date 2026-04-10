import java.util.Scanner;

class employee {
    int empno;
    String ename;
    float basic, hra, da, netpay;
    
    public float Calculate() {
        return basic + hra + da;
    }
    
    public void havedata() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Employee Number: ");
        empno = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Employee Name: ");
        ename = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        basic = scanner.nextFloat();
        System.out.print("Enter HRA: ");
        hra = scanner.nextFloat();
        System.out.print("Enter DA: ");
        da = scanner.nextFloat();
        
        netpay = Calculate();
        scanner.close();
    }
    
    public void dispdata() {
        System.out.println("Employee Number: " + empno);
        System.out.println("Employee Name: " + ename);
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Net Pay: " + netpay);
    }
}

public class Question5_Employee {
    public static void main(String[] args) {
        employee emp = new employee();
        emp.havedata();
        System.out.println("\n=== Employee Details ===");
        emp.dispdata();
    }
}
