package lab10;
public class Worker extends Person {
	 private String workerCode;      
	 private String departmentName;  
	 private String hireDate;        
	 public Worker(String lastName, String firstName, String registerNumber, String birthDate,
	               String workerCode, String departmentName, String hireDate) {
	     super(lastName, firstName, registerNumber, birthDate);
	     this.workerCode = workerCode;
	     this.departmentName = departmentName;
	     this.hireDate = hireDate;
	 }
	 public void info() {
	     super.info(); 
	     System.out.println("Ажилын газрын мэдээлэл");
	     System.out.println("Ажилтны код: " + workerCode);
	     System.out.println("Салбарын нэр: " + departmentName);
	     System.out.println("Ажилд орсон огноо: " + getYear(hireDate) + " оны " + getMonth(hireDate) + " сарын " + getDay(hireDate) + "-ны өдөр");
	     System.out.println("----------------------------\n");
	 }
	}