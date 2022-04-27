import java.util.Scanner;


public class While_loop {
	public static void main(String[] args) {
		//While loop is used for when you don't know how many time you want it t run 
		Scanner sc = new Scanner(System.in);
		System.out.println("Type in a number");
		int x = sc.nextInt();
		
		while(x != 10)
		{
			System.out.println("you messed up and i want to give u a hint: it is a two digit number and the first digit is 1");
			System.out.println();
			System.out.println("type a number");
			x = sc.nextInt();
		}
		
		//do while loop
		// we want to do the whole thing in one part
		
		int y;
		do
		{
			System.out.println("Type in your number");
			y = sc.nextInt();
		}while(y!=10);
		
		//another example
		String str;
		do
		{
			System.out.println("Type in your name:");
			str = sc.nextLine();
		}
		while(str.equals("Baran"));
	}

}
