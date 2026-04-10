import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;
    
    public float Compute() {
        float amount = Days * Charges;
        if (amount > 11000) {
            amount = (float) (1.02 * amount);
        }
        return amount;
    }
    
    public void Getinfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Room Number: ");
        RNo = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Customer Name: ");
        Name = scanner.nextLine();
        System.out.print("Enter Charges per day: ");
        Charges = scanner.nextFloat();
        System.out.print("Enter Number of days: ");
        Days = scanner.nextInt();
        scanner.close();
    }
    
    public void DispInfo() {
        float amount = Compute();
        System.out.println("Room Number: " + RNo);
        System.out.println("Customer Name: " + Name);
        System.out.println("Charges per day: " + Charges);
        System.out.println("Number of days: " + Days);
        System.out.println("Total Amount: " + amount);
    }
}

public class Question4_Resort {
    public static void main(String[] args) {
        Resort resort = new Resort();
        resort.Getinfo();
        System.out.println("\n=== Resort Details ===");
        resort.DispInfo();
    }
}
