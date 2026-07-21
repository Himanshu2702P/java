//breaking and countinue using loop
package basicjava;

public class s8_java {

	public static void main(String[] args) {
		//for loop
	/*	for(int i=1;i<10;i++) {
			System.out.println(i);
			System.out.println("for loop");
			
			if(i==4) {
				System.out.println("breking loop");
			    break;
			}
		}*/
		
		//while loop
	/*	int i=1;
		while(i<5) {
			System.out.println(i);
			System.out.println("while loop");
			if(i==3) {
				System.out.println("loop ends");
				break;
			}
			i++;
		}*/
		
		//do while loop
		int i=1;
		do {
			System.out.println(i);
			System.out.println("do while loop");
			if(i==4) {
				System.out.println("loop ends");
				break;
			}
			i++;
		}
		while(i<5);
	}
}
