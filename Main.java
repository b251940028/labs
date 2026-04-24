package lab10;
public class Main {
    public static void main(String[] args) {
        Worker worker1 = new Worker(
            "Ганболд", "Батчулуун", "УУ99051511", "1999-05-15", 
            "P.IT13", "Эрдэнэт цогцолбор дээд сургууль", "2023-09-01"    
        );
        Worker worker2 = new Worker(
            "Дорж", "Сүрэн", "ЧЖ85121200", "1985-12-12",
            "P.IT13", "Эрдэнэт цогцолбор дээд сургууль", "2010-03-15"
        );
        worker1.info();
        worker2.info();
    }
}
