import java.util.Scanner;

class PasswordMaskingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = sc.nextLine();
        String masked = pass.substring(0, pass.length() - 2).replaceAll(".", "*") + pass.substring(pass.length() - 2);
        System.out.println(masked);
    }
}