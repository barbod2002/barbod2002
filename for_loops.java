import java.util.Scanner;
public class for_loops {

	public static void main(String[] args) {
		// for loop is one of the most important part of coding so learn it really good
		// the for loop can really like solve for us,  for example,  I want to add one, and then I want to add  two to it. And then I want to add three to it,   
		//and four, and five and six, and like an infinite  amount of times I want to add to that variable.  things to x. And we could just keep copying and  pasting this down our program. But obviously,   
		//that's terribly inefficient in terms of a typing  standpoint. And at this moment by using For loops it will help us and do the job for us 
		
		// the wrong way to do it 
		// instead of doing x = x+1 so x +=1
		int x = 0;
		x += 1;
		x+=2;
		
		// right way
		// for loop is written as for() {}
		//first dealer the value and typically people use i, int i = 0 this means that i starts at 0 and the type is integer
		//next set a condition for i
		//i++ mean each time it runs add one to i
		
		for(int i = 0; i  <= 10; i++ )
		{
			System.out.println(i);
		}
		
		
		System.out.println();
		// mixing arrays with for loop
		
		// for getting the length of an array we say array.lenght without brackets
		int[] array_int = {10,9,2,8,2};
		int sum = 0;
		
		for(int i = 0; i < array_int.length; i++)
		{
			sum+= array_int[i];
			if(array_int[i] == 2)
			{
				System.out.println("found 2, it is at the index "+i);
			}
		}
		System.out.println(sum);
		
		
		
		System.out.println();
		// different kind of for loop which name is for each loop this is going to allow us to loop through the  elements of a list or a collection data type, and do something with those elements
		
		int[] array_int2 = {1,2,3,4,4,9,3};
		int count = 0;
		int index = 0;
		
		for(int elements:array_int2)
		{
			System.out.println(elements +" the index of this element in the list: "+index);
			index++;
			count++; // each time the loop runs it will add one so we will how many time this run 
		}
		System.out.println("How many times the loop has run: "+count);
		
		
		System.out.println();
		//getting input for name list and add them to the list
		Scanner sc = new Scanner(System.in);
		String[] names = new String[5];
		int totall = 0;
		
		for(int Y = 0; Y< names.length; Y++)
		{
			System.out.println("input a name: ");
			String input = sc.nextLine();
			names[Y]= input;
		}
		System.out.println();
		
		for(String n:names)
		{
			System.out.println(n);
		}
		
		
		System.out.println();
		//how we can break out of the loop --> with break
		
		for(int b=0; b<6; b++)
		{
			if (b == 3)
			{
				break;
			}
			else
			{
				System.out.println(b);
			}
		}

	}

}
