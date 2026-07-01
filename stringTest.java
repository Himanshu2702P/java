package basicjava;

public class stringTest {

	public static void main(String[] args) {

		// String s1 = "HIMANSHU PANCHAL";
		// s1= s1.toLowerCase();
		// System.out.println(s1);
	
		String letter = "Dear <|name|>, Thanks a Lot ";
		letter = letter.replace("<|name|>", "Himanshu");
		System.out.println(letter);
	}

}
