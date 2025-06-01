package OOPS;

public class EmployeeMainMethod {

	public static void main(String[] args) {
        //NOTE: here Employee as below is the classname of prevoius class that is employee
	//	 Employee emp1=new Employee();  //Objectcreation
/* 		 
		 emp1.employeeid=20;
		 emp1.name="Ramya";
		 emp1.role="Manager";
		 emp1.salary="20000";
		 emp1.printdata();
		 
		 Employee emp2=new Employee();
		 emp2.employeeid=40;
		 emp2.name="Ravi";
		 emp2.role="QAEngineer";
		 emp2.salary="30000";
		emp2.printdata();  	
		 
		 //second approch:Using method
		emp1.setemployeedata(10, "Rakesh", "Senoirmanager", 'A');
		//to print the data check in employee class
	    emp1.printdata();  //OUtput:10  Rakesh  Senoirmanager null A
		//->Here the output is one of the null because we didnot add in setemployeedata that is  salary check in employee class.
	 */	    
	   
		//Third approch: Using Constructor
		
		//Note: Here we cant use the above object creation because in employee class we created a constructormethod with parameters 
		//so in above object we dont have parameters so thats the reason we created another object with parameters.
	    Employee emp1=new Employee(10, "Suresh", "Senoirmanager", 'B');
        emp1.printdata();
	  //->Here the output is one of the null because we didnot add in setemployeedata that is  salary check in employee class.
	   //By using constructor we no need to call that method separately
	}

}
