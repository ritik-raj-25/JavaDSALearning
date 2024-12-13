//TreeMap --> Ordered Map --> Sorted (Internally, it is implemented using BST)
package HashSetAndHashMap;

import java.util.TreeMap;

public class BuildInMethodTreeMap {
	public static void main(String[] args) {
		//Declaration of TreeMap
		//TreeMap <data_type key, data_type value> identifier_name;
		TreeMap <String,Integer> map = new TreeMap<>();
		
		//Insertion in map --> TC: O(log(n))
		map.put("Ritik", 1); //it returns the previous value associated with key, or null if there was no mapping for key.
		map.put("Anshu", 2);
		map.put("Ananya",3);
		map.put("Ankit", 4);
		map.put("Tripti",5);
		map.put("Sheetal",3); //It is possible have same value for different keys
		map.put("Ritik",6); //Keys are unique, so whenever we add already existing key it will update its value
		System.out.println(map);
		
		//Searching in TreeMap --> TC: O(log(n))
		System.out.println(map.containsKey("Ananya"));
		System.out.println(map.containsValue(4));
		
		//finding the size of TreeMap
		System.out.println("Size of the map:: "+map.size());
		
		//Removing/ Deleting in map --> TC: O(log(n))
		map.remove("Ritik"); //It returns the previous value associated with key, or null if there was no mapping for key.
		System.out.println(map);
		
		//map.get(key) --> Returns the value to which the specified key is mapped,or null if this map contains no mapping for the key.
		int val = map.get("Ananya");
		System.out.println(val);
		
		//Iterating in TreeMap
		for(String key : map.keySet()) {
			val = map.get(key);
			System.out.print(key+"-->"+val+" ");
		}
		System.out.println();
		
		System.out.print("Values of map :");
		for(int ele : map.values()){
			System.out.print(ele+" ");
		}
		System.out.println();
		
		for(Object obj : map.entrySet()) {
			System.out.print(obj+" ");
		}
		System.out.println();
	}
}