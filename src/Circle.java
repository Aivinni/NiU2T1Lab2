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
        area = calculateArea();
        System.out.println(area);
    }
}
