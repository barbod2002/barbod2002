import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class Sets_and_list {

	public static void main(String[] args) 
	{
		// Set is an unordered elements that are unique, meaning that a set cannot contain the same element twice 
		// ThreeSets is another thing that we can put instead of HashSet  that it will put the numbers in the organized order.
		//LinedHashSet another thing that we can put instead of HashSet it is faster.
		Set<Integer> new_set = new HashSet<Integer>();
		new_set.add(7);
		new_set.add(8);
		new_set.add(3);
		new_set.add(-8);
		
		boolean x = new_set.contains(3);
		//.contains() => if you put it in boolean function it will tell you if the object you are looking for is in the Set or not
		//.add() => it will add an object to the Set
		//.remove() => it will remove the object in the parentheses.
		//.clear() => it will delete every object in the set and make it empty
		//.isEmpty() =>if you put it in boolean function it will tell you whether the set is empty or not
		//.size() =>it will give you how many object is in the set, it works like length
		System.out.println(x);
		// you can see that it will be only one 7 because you can only have one of those 
		
		System.out.println(new_set);
		
		//For creating a list we use ArrayList
		//LinedArrayList another thing that we can put instead of ArrayList it is faster.
		ArrayList<String> Str_List = new ArrayList<String>();
		Str_List.add("Barbod");// add things to the list
		Str_List.add("Baran");
		Str_List.add("Shahram");
		Str_List.add("Nadereh");
		Str_List.get(0);// it will get the index
		System.out.println(Str_List);
		Str_List.set(1, "Shamsi khanom");//it will put the element which in here is the string instead of the index one
		System.out.println(Str_List);
		Str_List.subList(0, 1);// in this part you say which part of the list you want for example if you put (0,2) it means that you want elements of the list from 
		System.out.println(Str_List.subList(0, 2));
	}

}
