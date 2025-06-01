package OOPS;

public class GreetingsMain {

	public static void main(String[] args) {
	  
		Greetings s1=new Greetings();
		
		//no parameter and no return value 
		  s1.m1();   //-> m1 is the one of the method in Greetings class
		  
		  
		  
		  //no parameter and return value
		                         //Whenever there is a returning value /result then we need to hold/store in a variable
		  String s= s1.m2();
		  System.out.println(s);
		  
		//Takes parameter and  no return value  
		  s1.m3("Nikitha");
		  
		//Takes parameter and  return value  
              String M= s1.m4("ramya");
              System.out.println(M);
	}
}

