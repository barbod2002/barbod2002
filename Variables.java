
public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intiger = 10;
		double decimals =18.9;
		boolean t_or_f = true;
		char charecter = 't'; // you have to use single quotation for char and put only one character (char stand for character)
		String str = "use double quotation"; // use only double quotation for string
		
		
		System.out.println("Hiiiiiiiii");
		
		// you can declare the variable and then later put the value
		int example;
		example = 100;
				
		// adding or multiplying or etc the variables
				
		int x = 3;
		int y = 2;
		int z = 7;
		
		int sum = z*x/y;
		System.out.println(sum);
		
		// how to do power
		double power = Math.pow(y,z);//the variable suppose to be double 
		System.out.println(power);
		
		
		// type casting
		//whenever you want to change a vriable's value you do type casting for example whenever you need the whole decimal value and you need to change to variable type from integer to double you use type casting
		double type_casting = x/(double)y; // the result would be 1.0 if neither x or y are double so we add a (double) to x or y therefore the result would be 1.5
		System.out.println(type_casting);
		
		
		//remainder operator (it gives the remainder of the operation)
		double remainder = 56%7.5;
		System.out.println(remainder);
	}

}
