import java.util.Scanner;

public class intro_to_objects {
	public static void main(String[] args) {
		//So an object essentially is just an instance of a certain data type. So we know we have data  types, like int strings, bool, scanners,   like all kinds of different things that we can  use, like ArrayList, hash table, hash, list, whatever, or hash map all that stuff, okay. And  those are all known as data types
		//public static void main(String[] args) is a base public method and it will always run
		Scanner sc = new Scanner(System.in);
		String string = sc.nextLine();
		
		Print_Barbod();
		Print_anything(string,3);
		System.out.println();
		System.out.println(add2(4));
		
	}
	
	public static void Print_Barbod()// if there is nothing in the Parentheses means put nothing when you want to call it
	{
		System.out.println("Barbod");
	}
	
	public static void Print_anything(String str, int x)
	{
		for(int i = 0; i<x ; i++)
		{
			System.out.println(str);
		}
		
	}
	
	public static int add2(int a) //with this kind of methods we have to put a return statement to run and 
	{
		return a+2;	
	}
}
