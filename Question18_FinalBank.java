class BankFinal {
    private static final double INTEREST_RATE = 5.5; // Fixed interest rate
    
    public double calculateInterest(double amount) {
        return amount * (INTEREST_RATE / 100);
    }
    
    public static double getInterestRate() {
        return INTEREST_RATE;
    }
    
    public void displayCustomerInterest(double principal, String customerName) {
        double interest = calculateInterest(principal);
        System.out.println("Customer: " + customerName);
        System.out.println("Principal Amount: $" + principal);
        System.out.println("Interest Rate: " + INTEREST_RATE + "%");
        System.out.println("Interest Earned: $" + interest);
        System.out.println("Total Amount: $" + (principal + interest));
        System.out.println();
    }
}

public class Question18_FinalBank {
    public static void main(String[] args) {
        BankFinal bank = new BankFinal();
        
        System.out.println("=== Bank Interest Calculation ===");
        System.out.println("Fixed Interest Rate: " + BankFinal.getInterestRate() + "%");
        System.out.println();
        
        bank.displayCustomerInterest(10000, "John Doe");
        bank.displayCustomerInterest(25000, "Jane Smith");
        bank.displayCustomerInterest(15000, "Bob Johnson");
        bank.displayCustomerInterest(5000, "Alice Brown");
    }
}
