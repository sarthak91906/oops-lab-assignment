class BankingSystem {
    int balance = 1000;

    void withdraw(int amount) {
        synchronized (this) {
            balance -= amount;
            System.out.println("Balance: " + balance);
        }
    }

    public static void main(String[] args) {
        BankingSystem b = new BankingSystem();
        new Thread(() -> b.withdraw(200)).start();
        new Thread(() -> b.withdraw(300)).start();
    }
}