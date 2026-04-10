class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public double add(double a, double b) {
        return a + b;
    }
}

public class Question9_Calculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Adding two integers (5 + 10): " + calc.add(5, 10));
        System.out.println("Adding three integers (5 + 10 + 15): " + calc.add(5, 10, 15));
        System.out.println("Adding two doubles (3.5 + 2.7): " + calc.add(3.5, 2.7));
    }
}
