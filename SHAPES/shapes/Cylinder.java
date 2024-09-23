package shapes;

public class Cylinder extends Shape {
    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        // 2(PI*r^2) + (2PI*r*h) 
        return (2 * Math.PI * radius * radius) + (2 * Math.PI * radius * height);
    }

    @Override
    public double volume() {
        // PI*r^2*h
        return Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cylinder:\n\tSurface Area: " + 
        String.format("%.2f", surface_area()) + 
        ", Volume: " + String.format("%.2f", volume());
    }
}