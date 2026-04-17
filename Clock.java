package lab9;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;
import java.time.format.DateTimeFormatter;
public class Clock {
    private int year;
    private int month;
    private int day;
    private int time;   
    private int minute;
    private int second;
    private LocalDateTime ldt;
    private DateTimeFormatter formatter;
    public Clock() {
        formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    }
    public void setClock(int y, int mon, int d, int t, int min, int s) {
        this.year = y;
        this.month = mon;
        this.day = d;
        this.time = t;
        this.minute = min;
        this.second = s;
        this.ldt = LocalDateTime.of(year, month, day, time, minute, second);
        System.out.println("Гараар тохируулах: " + ldt.format(formatter));
    }
    public void autoSetClock() {
        this.ldt = LocalDateTime.now();
        this.year = ldt.getYear();
        this.month = ldt.getMonthValue();
        this.day = ldt.getDayOfMonth();
        this.time = ldt.getHour();
        this.minute = ldt.getMinute();
        this.second = ldt.getSecond();
        System.out.println("Автоматаар тохируулах: " + ldt.format(formatter));
    }
    public void tickClock() {
        System.out.println("\nЦаг 1000 секунд ажиллаж эхэллээ");
        tickClock(1000); 
    }
    public void tickClock(int tick) {
        System.out.println("\n Цаг " + tick + " секунд ажиллаж эхэллээ");
        for (int i = 0; i < tick; i++) {
            System.out.println(ldt.format(formatter));
            ldt = ldt.plusSeconds(1); 
            try {
                TimeUnit.MILLISECONDS.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Цаг ажиллах үед алдаа гарлаа: " + e.getMessage());
            }
        }
        System.out.println("Цаг зогслоо.\n");
    }
}
	    
	    
	  