abstract class ShapeAbstract {
    public abstract double calculate_area();
    
    public void display_info() {
        System.out.println("This is a shape.");
    }
}

class CircleAbstract extends ShapeAbstract {
    private double radius;
    
    public CircleAbstract(double radius) {
        this.radius = radius;
    }
    
    @Override
    public double calculate_area() {
        return Math.PI * radius * radius;
    }
}

class RectangleAbstract extends ShapeAbstract {
    private double length;
    private double width;
    
    public RectangleAbstract(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double calculate_area() {
        return length * width;
    }
}

public class Question7_AbstractShape {
    public static void main(String[] args) {
        CircleAbstract circle = new CircleAbstract(5.0);
        RectangleAbstract rectangle = new RectangleAbstract(4.0, 6.0);
        
        circle.display_info();
        System.out.println("Circle area: " + circle.calculate_area());
        
        rectangle.display_info();
        System.out.println("Rectangle area: " + rectangle.calculate_area());
        
        // ShapeAbstract shape = new ShapeAbstract(); // This would cause compilation error
        // System.out.println("Cannot instantiate abstract class directly");
    }
}
