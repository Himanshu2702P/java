package basicjava;

import java.util.Scanner;

public class Test_result {

	public static void main(String[] args) {
        byte m1,m2,m3;
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks of Subject1");
		m1=sc.nextByte();
		System.out.println("Enter your marks of Subject2");
        m2=sc.nextByte();
		System.out.println("Enter your marks of Subject3");
        m3=sc.nextByte();
        
        int avg =m1 + m2 + m3/3;
        int total = m1 +m2+m3;
        
        float percentage =(total/300.f)*100;
        
        if(avg>=40 && m1>=33 && m2>=33 && m3>=33) {
        	System.out.println("pass  ");
        }
        else {
        	System.out.println("Fail  " );
        }
        System.out.println("Total Marks  "+total+"/300");
        System.out.println(percentage + "  %");
        
        sc.close();
	}

}
