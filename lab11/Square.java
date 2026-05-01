package lab11;
public class Square implements Shape {
    private double side;
    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
    @Override
    public void displayResult() {
        System.out.println("Квадратын талбай: " + calculateArea());
    }
}
