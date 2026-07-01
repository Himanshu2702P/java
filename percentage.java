package basicjava;

import java.util.Scanner;

public class percentage {

	public static void main(String[] args) {
		System.out.println("Enter roll number");
		Scanner sc = new Scanner(System.in);
	    int number =sc.nextInt();
	   
	    System.out.println(number);
	    
	    System.out.println("Enter Subject Marks");
	    float subject1 = sc.nextFloat();
	    float subject2 = sc.nextFloat();
	    float subject3 = sc.nextFloat();
	    float subject4 = sc.nextFloat();
	    float subject5 = sc.nextFloat();
	    
	    float Total=subject1+subject2+subject3+subject4+subject5;
	    System.out.println(Total + " Marks");
	    
	    float percentage =100*(Total/500); 
	    
	    System.out.println(percentage+"%");
	    sc.close();
	}

}
