package HashSetAndHashMap;

import java.util.HashSet;

public class BuildInMethodsHashSet {

	public static void main(String[] args) {
		//Declaration of HashSet
		HashSet<Integer> set = new HashSet<>();
		
		//Adding elements to the HashSet --> TC: O(1)
		set.add(10); //If this set already contains the element, the call leaves the set unchanged and returns false.
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		//Printing the HashSet
		System.out.println(set);
		
		//Removing the element from the HashSet --> TC: O(1)
		set.remove(30); //returns true if the set contained the specified element, else false
		
		//Searching an element --> TC: O(1)
		System.out.println(set.contains(20));
		System.out.println(set.contains(100));
		
		//size of the HashSet --> TC: O(1)
		System.out.println(set.size());
		
		//Convert HashSet to Array
		Object[] arr = set.toArray();
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Iterate in HashSet --> Use for each loop
		for(int ele : set) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}

}
