package newfiles;

public class globalVariablesInNonStaticmethod {
	
    public void displayEmployeeInfo(int employeeId, String employeeName) {
    	System.out.println(employeeId + "\t" + employeeName + "\t");
    }

    public static void main(String[] args) {
    	globalVariablesInNonStaticmethod emp1 = new globalVariablesInNonStaticmethod();
        emp1.displayEmployeeInfo(1001, "Tom");

        globalVariablesInNonStaticmethod emp2 = new globalVariablesInNonStaticmethod();
        emp2.displayEmployeeInfo(1002, "Harry");
    }

    }




