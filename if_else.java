import java.util.Scanner;

public class if_else {
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String input_String = sc.nextLine();
		
		// if() {}
		if (input_String.equals("hello"))
		{
			System.out.println("hello back");
		}
		// else if means if the first if statement didn't work use the next one. it's the same if statement but with the else before it. it is written as else if(){}
		else if (input_String.equals("shamsi jon"))
		{
			System.out.println("you are the sister of the best brother");
		}
		//else means if it was anything else but the if statements and else if statement use that function and it is written as else {}
		else
		{
			System.out.println("go to hell i don't know you");
		}
		
		
	}

}
