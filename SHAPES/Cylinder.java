public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        // 2πr² + 2πrh 
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * height;
    }

    @Override
    public double volume() {
        // πr²h
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder - Surface Area: " + surface_area() + ", Volume: " + volume();
    }
}