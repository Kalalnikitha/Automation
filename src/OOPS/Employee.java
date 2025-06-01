package OOPS;

public class Employee {
	int employeeid;
	String name;
	String role;
	String salary;
	char Grade;

	void printdata() {
		System.out.println(employeeid + "  " + name + "  " + role + " " + salary + " " + Grade);
	}

//This method is storing data as varaibles (check the class varaibles as above)
	void setemployeedata(int newid, String fullname, String newrole, char EGrade) {
		employeeid = newid;
		name = fullname;
		role = newrole;
		Grade = EGrade;

	}

	// Using constructor
	//Classname and methodname should be same in constructor.
	Employee(int newid, String fullname, String newrole, char EGrade) {
		employeeid = newid;
		name = fullname;
		role = newrole;
		Grade = EGrade;
	}
}
