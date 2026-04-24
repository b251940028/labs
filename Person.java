package lab10;
public class Person {
    protected String lastName;       
    protected String firstName;      
    protected String registerNumber; 
    protected String birthDate;      
    public Person(String lastName, String firstName, String registerNumber, String birthDate) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.registerNumber = registerNumber;
        this.birthDate = birthDate;
    }
    protected String getFullName(String lastName, String firstName) {
        String initial = lastName.substring(0, 1).toUpperCase();
        return initial + "." + firstName;
    }
    protected int getYear(String date) {
        String[] parts = date.split("-");
        return Integer.parseInt(parts[0]);
    }
    protected int getMonth(String date) {
        String[] parts = date.split("-");
        return Integer.parseInt(parts[1]);
    }
    protected int getDay(String date) {
        String[] parts = date.split("-");
        return Integer.parseInt(parts[2]);
    }
    protected void info() {
        System.out.println("Хувь хүний үндсэн мэдээлэл");
        System.out.println("Овог, нэр: " + getFullName(lastName, firstName));
        System.out.println("Регистерийн дугаар: " + registerNumber);
        System.out.println("Төрсөн огноо: " + getYear(birthDate) + " оны " + getMonth(birthDate) + " сарын " + getDay(birthDate) + "-ны өдөр");
    }
}