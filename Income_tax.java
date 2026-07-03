/*calculate income tax for employee
    lakh        tax
    2.5-5.0     5%
    5.0-10.0    20%
    above 10.0  30%
*/
package basicjava;

import java.util.Scanner;

public class Income_tax {

	public static void main(String[] args) {
		String name;
		float salary;
		float tax1,tax2,tax3;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name ");
		name=sc.nextLine();
		
		System.out.println("Enter Your Annual Salary");
		salary=sc.nextFloat();
		
		tax1=(salary*5)/100;
		tax2=(salary*20)/100;
		tax3=(salary*30)/100;
		
		if(salary>=250000 && salary<=500000 ) {
			System.out.println(name+" you are in 5% tax slab & your annual tax is  "+ tax1 );
		}
		else if(salary>500000 && salary<=1000000) {
			System.out.println("you are in 20% tax slab & your annual tax is  "+tax2);
		}
		else if(salary>1000000){
			System.out.println("you are in 30% tax slab & your annual tax is  "+tax3);
		}
		else {
			System.out.println("you are not in tax slab");
		}
		
		sc.close();
	}

}
