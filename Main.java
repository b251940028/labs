package lab5; 
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Хэдэн тоон дээр статистик үйлдэл хийх вэ (2-5): ");
			int n = sc.nextInt();
			double a[] = new double[n];
			for(int i = 0; i < n; i++) {
			    System.out.printf("%d-р тоог оруул: ", i + 1);
			    a[i] = sc.nextDouble();
			}
			double mean1 = 0, std1 = 0;
			if(n == 2) {
			    mean1 = Statistics.mean(a[0], a[1]);
			    std1 = Statistics.std(a[0], a[1]);
			}
			else if(n == 3) {
			    mean1 = Statistics.mean(a[0], a[1]);
			    std1 = Statistics.std(a[0], a[1]);
			}
			else if(n == 4) {
			    mean1 = Statistics.mean(a[0], a[1]);
			    std1 = Statistics.std(a[0], a[1]);
			}
			else if(n == 5) {
			    mean1 = Statistics.mean(a[0], a[1]);
			    std1 = Statistics.std(a[0], a[1]);
			}
			double mean2 = Statistics.meanVar(a);
			double std2 = Statistics.stdVar(a);
			System.out.println("\n--- Overloading method ---");
			System.out.println("Mean = " + mean1);
			System.out.println("Standard Deviation = " + std1);
			System.out.println("\n--- Varargs method ---");
			System.out.println("Mean = " + mean2);
			System.out.println("Standard Deviation = " + std2);
		}
    }
}
