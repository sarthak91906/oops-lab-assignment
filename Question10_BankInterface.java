interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    @Override
    public double getInterestRate() {
        return 7.2;
    }
}

class ICICI implements Bank {
    @Override
    public double getInterestRate() {
        return 6.8;
    }
}

public class Question10_BankInterface {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();
        
        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
