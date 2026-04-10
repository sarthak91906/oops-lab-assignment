class RectangleQ6 {
    int length;
    int breadth;
    
    public RectangleQ6(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public int Area() {
        return length * breadth;
    }
}

public class Question6_Rectangle {
    public static void main(String[] args) {
        RectangleQ6 rect1 = new RectangleQ6(4, 5);
        RectangleQ6 rect2 = new RectangleQ6(5, 8);
        
        System.out.println("Area of first rectangle (4x5): " + rect1.Area());
        System.out.println("Area of second rectangle (5x8): " + rect2.Area());
    }
}
