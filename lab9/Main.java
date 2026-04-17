package lab9;
public class Main {
    public static void main(String[] args) {
        Clock myClock = new Clock();
        System.out.println("Гараар тохируулах");
        myClock.setClock(2026, 4, 17, 12, 0, 0); 
        myClock.tickClock(5); 
        System.out.println("Автоматаар тохируулах");
        myClock.autoSetClock(); 
        myClock.tickClock(3); 
    }
}
