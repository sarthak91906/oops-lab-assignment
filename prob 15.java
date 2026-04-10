class BankApplication {
    static void process() throws Exception {
        if (true)
            throw new Exception();
        System.out.println("Transaction processed");
    }

    public static void main(String[] args) {
        try {
            process();
            System.out.println("Transaction processed");
        } catch (Exception e) {
            System.out.println("Exception handled in main");
        }
    }
}