package newfiles;

public class SimpleProgram {

	public static void main(String[] args) {
      System.out.println("My name is nikitha");
      //declaring the variables and assigning the values to array.
      String a[] = {"Lavanya", "Nikitha","Ramya","Lavanya"};
      //finding the length of an array.
      System.out.println(a.length);  
      // Read the specific value from the array.
      System.out.println(a[2]);
      System.out.println();
      //finding a multiple values from the array.
      //Approach=1
      for(int i=0; i<=a.length-1;i++) {
    	  System.out.println(a[i]);
      }
      System.out.println();
      //Approach=2 (enhanced for loop)
      for(String x:a) {
    	  System.out.println(x);
      }
      
	}

}
