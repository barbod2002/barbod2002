import java.util.Scanner;


public class nested_statements {

	public static void main(String[] args) 
	{
		// IN this section we will make an application for ourselves.
		System.out.println("input your age");
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int age = Integer.parseInt(s);
		
		if(age >= 18 || age < 60)
		{
			System.out.println("you are an adult");
			System.out.println();
			System.out.println("whaere do you leave");
			String city = sc.nextLine();
			
			//we can put if statements inside an if statements
			if(city.equals("toronto"))
			{
				System.out.println("we live in the same city");
			}
			else
			{
				System.out.println("I personally don't care where do you leave");
			}
		}
		else if(age >=60)
		{
			System.out.println("you are a senior");
		}
		else
		{
			System.out.println("you are a kid");
		}

	}

}
