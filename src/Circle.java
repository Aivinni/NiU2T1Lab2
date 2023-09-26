import java.awt.*;

public class Circle {
    private final double radius;
    private double area;
    public Circle(double r) {
        radius = r;
    }
    public double calculateArea() {
        area = (radius * radius) * Math.PI;
        return area;
    }
    public void findArea() {
        Rectangle rect1 = new Rectangle();
        area = rect1.getX() * rect1.getY();
        System.out.println(area);
    }
}
