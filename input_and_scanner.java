import java.util.Scanner;// what you have to import for getting input


public class input_and_scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); // the base of scanner
		
		// getting input in String method
		String scanned_str = sc.next();// this is what allows us to get String input from user
		
		// getting input in integer method
		int scanned_int = sc.nextInt();// this is what allows us to get integer input from user
		
		//getting input in boolean method
		boolean scanned_bool = sc.nextBoolean();// this is what allows us to get boolean input from user
		
		//getting input in double method
		double scanned_decimal = sc.nextDouble();// this is what allows us to get double input from user
		
		
		//How to change the type of String input into an integer input
		int changin_to_integer = Integer.parseInt(scanned_str);

	}

}
