
public class condition_and_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 6;
		int y = 7;
		int z = 10;
		// < > == <= >= !=
		boolean compare_int = x == y; //comparing two numbers
		
		System.out.println(compare_int);
		
		//comparing Strings
		String str1 = "hello";
		String str2 = "hello";
		
		boolean compare_string = str1 == str2;
		// or a better way for comparing two strings in java is .equal() like str1.equal(str2);
		
		System.out.println(compare_string);
		
		//comparing two statements
		// && = and , || = or
		// in java it's not like python you cannot do x<y<z
		// if you put ! it makes the statement not that statement
		boolean comparing_many_things = x<y && y<z; 
		
		System.out.println(comparing_many_things);
		

	}

}
