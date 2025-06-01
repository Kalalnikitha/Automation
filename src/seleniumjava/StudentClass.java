package seleniumjava;

public class StudentClass {
	static String name;
	static int rollNo;
	static long marks;
	public static void showdetails() {
	System.out.println("Name: " + name);
    System.out.println("Roll No: " + rollNo);
    System.out.println("Marks: " + marks);
    System.out.println();
	}
	public static void main(String[] args) {
		StudentClass S1=new StudentClass();
		S1.name="Radhika";
		S1.rollNo=345;
		S1.marks=89;
		
		StudentClass S2=new StudentClass();
		S2.name="Radhika";
		S2.rollNo=345;
		S2.marks=89;
		
	S1.showdetails();
	S2.showdetails();
	}

}
