package lab11;
public class Rectangle implements Shape {
    private double length;
    private double width;  

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
    @Override
    public void displayResult() {
        System.out.printf("Тэгш өнцөгтийн талбай (s=a*b) = %.2f\n", calculateArea());
    }
}
