abstract class Payment {
    public abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
        System.out.println("Validating card details...");
        System.out.println("Charging card with 2% processing fee");
        System.out.println("Payment successful!");
    }
}

class UPIPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of $" + amount);
        System.out.println("Generating UPI request...");
        System.out.println("No processing fee");
        System.out.println("Payment successful!");
    }
}

class NetBankingPayment extends Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Processing net banking payment of $" + amount);
        System.out.println("Redirecting to bank portal...");
        System.out.println("1% processing fee applicable");
        System.out.println("Payment successful!");
    }
}

public class Question12_PaymentSystem {
    public static void main(String[] args) {
        Payment creditCard = new CreditCardPayment();
        Payment upi = new UPIPayment();
        Payment netBanking = new NetBankingPayment();
        
        System.out.println("=== Credit Card Payment ===");
        creditCard.pay(1000.0);
        
        System.out.println("\n=== UPI Payment ===");
        upi.pay(500.0);
        
        System.out.println("\n=== Net Banking Payment ===");
        netBanking.pay(750.0);
    }
}
