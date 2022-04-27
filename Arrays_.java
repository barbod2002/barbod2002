import java.util.Arrays;

public class Arrays_{

	public static void main(String[] args) {
		// Array is a collection of elements that is a set size
		// instead of putting a variable for each information you can have a list of them and from indexing get it out.
		// first you have to declare the type and everything in the array suppose to be the same type
		// 5 in the square brake define how long is your Array.
		int[] new_int_array = new int[5];
		String[] new_str_array = new String[5];
		// in my string array i want to have {"Tiffany","Barbod","Sahar","Grey","Jessica"}
		
		// index is a number that represent the position and it start from 0 to ..., I mean if the length of the array in 5 means the index of all the 5 items will be 0,1,2,3,4
		new_str_array[0]="Tiffany";//first element
		new_str_array[1]="Barbod";//second element
		new_str_array[2]="Sahar";//third element
		new_str_array[3]="Grey";//fourth element
		new_str_array[4]="Jessica";//fifth element
		
		String x = new_str_array[0];// x is equal to Tiffany
		System.out.println(x);
		
		//easier way to make an array
		String[] str_list = {"Baran","Maya","Sharlotte","Maryam","Sidra"};
		
		String str = str_list[2];// x is equal to Sharlotte
		System.out.println(str);
		
		//for sorting our array we use Arrays.sort(x,1,7) x is the name of the array and, 1 is from index 1 and 7 mean to index 7 and don't sort the rest just anything from index 1 to7, this method works only for integer arrays
		int[] New_array= {1,2,3,7,0,4,6,2,11,9,10};
		Arrays.sort(New_array,1,7);
		
		for(int i: New_array)
		{
			System.out.print(i+",");
		}
		
	
	}

}
