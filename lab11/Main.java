package lab11;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Талбайг нь тооцоолох дүрсийн нэрийг оруул: ");
        String shapeName = scanner.nextLine();
        
        Shape shape = null;
        switch (shapeName.toLowerCase()) {
            case "square":
                System.out.print("Талын уртыг оруул (a): ");
                double side = scanner.nextDouble();
                shape = new Square(side);
                break;
                
            case "rectangle":
                System.out.print("Уртыг оруул (a): ");
                double length = scanner.nextDouble();
                System.out.print("Өргөнийг оруул (b): ");
                double width = scanner.nextDouble();
                shape = new Rectangle(length, width);
                break;
                
            case "triangle":
                System.out.print("Суурийн уртыг оруул (a): ");
                double tBase = scanner.nextDouble();
                System.out.print("Өндрийг оруул (h): ");
                double tHeight = scanner.nextDouble();
                shape = new Triangle(tBase, tHeight);
                break;
                
            case "trapezoid":
                System.out.print("Дээд суурийн уртыг оруул (a): ");
                double base1 = scanner.nextDouble();
                System.out.print("Доод суурийн уртыг оруул (b): ");
                double base2 = scanner.nextDouble();
                System.out.print("Өндрийг оруул (h): ");
                double trapHeight = scanner.nextDouble();
                shape = new Trapezoid(base1, base2, trapHeight);
                break;
                
            case "circle":
                System.out.print("Радиусыг оруул (r): ");
                double radius = scanner.nextDouble();
                shape = new Circle(radius);
                break;
                
            case "sector":
                System.out.print("Радиусыг оруул (r): ");
                double secRadius = scanner.nextDouble();
                System.out.print("Өнцгийг оруул (градусаар): ");
                double angle = scanner.nextDouble();
                shape = new Sector(secRadius, angle);
                break;
                
            case "ellipse":
                System.out.print("Их хагас тэнхлэгийн уртыг оруул (a): ");
                double a = scanner.nextDouble();
                System.out.print("Бага хагас тэнхлэгийн уртыг оруул (b): ");
                double b = scanner.nextDouble();
                shape = new Ellipse(a, b);
                break;
                
            case "parallelogram":
                System.out.print("Суурийн уртыг оруул (a): ");
                double pBase = scanner.nextDouble();
                System.out.print("Өндрийг оруул (h): ");
                double pHeight = scanner.nextDouble();
                shape = new Parallelogram(pBase, pHeight);
                break;
                
            default:
                System.out.println("Алдаа: Ийм дүрс олдсонгүй эсвэл нэрийг буруу бичсэн байна. (Жишээ нь: Square, Rectangle, Triangle гэх мэтээр бичнэ үү)");
                break;
        }
        if (shape != null) {
            shape.displayResult();
        }
        
        scanner.close();
    }
}