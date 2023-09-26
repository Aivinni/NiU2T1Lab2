public class Circle {
    private double radius;
    private double area;
    public Circle(double r) {
        radius = r;
    }

    public void findArea() {
        area = (radius * radius) * Math.PI;
        System.out.println(area);
    }
}
