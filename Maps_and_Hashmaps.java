import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps_and_Hashmaps {
	public static void main(String[] args) {
		//Maps in java is dictionary in python
		//Map can be a String, a number, a char, a double and those are the keys and then those keys link us to a value
		Map m = new HashMap();
		m.put("tim", 5);// this means{tim=5}
		m.put("bob", "has two children");
		m.put(11, 1);
		
		//if you write down m.get(bob) the output should be "has two children"
		//we cannot have two same key value in our map
		System.out.println();
		
		//for using the TreeMap means that the keys have to be the same data type.
		//TreeMap unlike HashMap is in order
		Map Tree_map = new TreeMap();
		Tree_map.put("tim", 5);
		Tree_map.put("bob", "has two children");
		Tree_map.put("meet", "food");
		Tree_map.put("good mark", "study");
		
		System.out.println(Tree_map);
		
		//using linkedHashMap() will print the Map in the way that you put them first
		
		Map linkedhashmap = new LinkedHashMap();
		linkedhashmap.put("wine", "red");
		linkedhashmap.put("House", "big");
		linkedhashmap.put(11, "eleven");
		
		System.out.println(linkedhashmap);
		
		boolean Yes_or_no = linkedhashmap.containsValue("red");//.containsValue("red") will check if there is any value that is "red" in linkedhashmap
		System.out.println(Yes_or_no);
        Yes_or_no = linkedhashmap.containsKey(12);//.containsKey(12) will check if there is any Key that is 12 in linkedhashmap
		System.out.println(Yes_or_no);
		
		//.values() will return every value of the map
		//.keySet() will return every keys in the map
		//.clear() will delete every keys and values
		
		
		
		
		
		
		//example
		
		Map map = new HashMap();
		String str = "hello my name is Barbod and i am an iranian";
		//.toCharArray() put each word in a list therefore we can go through it alphabet by alphabet.
		
		for (char x:str.toCharArray())
		{
			if (map.containsKey(x))
			{
				int old = (int) map.get(x);
				map.put(x, old+1);
			}
			else
			{
				map.put(x, 1);
			}
		}
				
		
	}

}
