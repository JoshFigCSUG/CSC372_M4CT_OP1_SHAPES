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
        // πr(r + √(h² + r²)) 
        double slantHeight = Math.sqrt(height * height + radius * radius);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    public double volume() {
        // (1/3)πr²h
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    @Override
    public String toString() {
        return "Cone - Surface Area: " + surface_area() + ", Volume: " + volume();
    }
}