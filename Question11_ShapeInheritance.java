class ShapeQ11 {
    public void display() {
        System.out.println("This is a general shape.");
    }
}

class CircleQ11 extends ShapeQ11 {
    private double radius;
    
    public CircleQ11(double radius) {
        this.radius = radius;
    }
    
    public void displayArea() {
        double area = Math.PI * radius * radius;
        System.out.println("Circle area: " + area);
    }
}

class RectangleQ11 extends ShapeQ11 {
    private double length;
    private double width;
    
    public RectangleQ11(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    public void displayArea() {
        double area = length * width;
        System.out.println("Rectangle area: " + area);
    }
}

public class Question11_ShapeInheritance {
    public static void main(String[] args) {
        CircleQ11 circle = new CircleQ11(5.0);
        RectangleQ11 rectangle = new RectangleQ11(4.0, 6.0);
        
        System.out.println("=== Circle ===");
        circle.display();
        circle.displayArea();
        
        System.out.println("\n=== Rectangle ===");
        rectangle.display();
        rectangle.displayArea();
    }
}
