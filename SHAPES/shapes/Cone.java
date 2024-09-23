package shapes;

public class Cone extends Shape {
    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    public double surface_area() {
        // PI*r(r + sqrt((h^2) + (r^2))) 
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        // (1/3)PI*(r^2)*h
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone:\n\tSurface Area: " + String.format("%.2f", surface_area()) + ", Volume: " + String.format("%.2f", volume());
    }
}