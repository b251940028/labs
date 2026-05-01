package lab11;
public class Parallelogram implements Shape {
    private double base;   
    private double height; 
    public Parallelogram(double base, double height) {
        this.base = base;
        this.height = height;
    }
    @Override
    public double calculateArea() {
        return base * height;
    }
    @Override
    public void displayResult() {
        System.out.println("Параллелограммын талбай: " + calculateArea());
    }
}
