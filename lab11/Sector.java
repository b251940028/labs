package lab11;
public class Sector implements Shape {
    private double radius; 
    private double angle;  
    public Sector(double radius, double angle) {
        this.radius = radius;
        this.angle = angle;
    }
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius * (angle / 360.0);
    }
    @Override
    public void displayResult() {
        System.out.println("Секторын талбай: " + calculateArea());
    }
}