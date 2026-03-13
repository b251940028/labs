package lab5;
public class lab5 {
    public static double mean(double a, double b) {
        return (a + b) / 2;
    }
    public static double mean(double a, double b, double c) {
        return (a + b + c) / 3;
    }
    public static double mean(double a, double b, double c, double d) {
        return (a + b + c + d) / 4;
    }
    public static double mean(double a, double b, double c, double d, double e) {
        return (a + b + c + d + e) / 5;
    }
    public static double std(double a, double b) {
        double m = mean(a, b);
        return Math.sqrt(((a - m)*(a - m) + (b - m)*(b - m)) / 2);
    }
    public static double std(double a, double b, double c) {
        double m = mean(a, b, c);
        return Math.sqrt(((a-m)*(a-m) + (b-m)*(b-m) + (c-m)*(c-m)) / 3);
    }
    public static double std(double a, double b, double c, double d) {
        double m = mean(a, b, c, d);
        return Math.sqrt(((a-m)*(a-m) + (b-m)*(b-m) + (c-m)*(c-m) + (d-m)*(d-m)) / 4);
    }
    public static double std(double a, double b, double c, double d, double e) {
        double m = mean(a, b, c, d, e);
        return Math.sqrt(((a-m)*(a-m) + (b-m)*(b-m) + (c-m)*(c-m) + (d-m)*(d-m) + (e-m)*(e-m)) / 5);
    }
    public static double meanVar(double... x) {
        double sum = 0;
        for(double v : x) {
            sum += v;
        }
        return sum / x.length;
    }

    public static double stdVar(double... x) {
        double m = meanVar(x);
        double sum = 0;

        for(double v : x) {
            sum += (v - m) * (v - m);
        }

        return Math.sqrt(sum / x.length);
    }
}	