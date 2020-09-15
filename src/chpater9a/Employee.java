package chpater9a;

public class Employee extends Person {
   String employeeId;
   String title;
   
   
public Employee() {
	super("AARJU");
		System.out.println("In Employee default Constructor");
	}

public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
	
}
