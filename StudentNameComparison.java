import java.util.Scanner;

class StudentNameComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        String n2 = sc.nextLine();

        if (n1.equals(n2))
            System.out.println("Case-sensitive: Same");
        else
            System.out.println("Case-sensitive: Different");

        if (n1.equalsIgnoreCase(n2))
            System.out.println("Case-insensitive: Same");
        else
            System.out.println("Case-insensitive: Different");
    }
}