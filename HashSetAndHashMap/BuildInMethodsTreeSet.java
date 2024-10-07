//TreeSet --> Ordered Set --> Sorted (Internally, it is implemented using BST)

package HashSetAndHashMap;

import java.util.TreeSet;

public class BuildInMethodsTreeSet {

	public static void main(String[] args) {
		//Declaration of HashSet
		TreeSet<Integer> set = new TreeSet<>();
		
		//Adding elements to the TreeSet --> TC: O(log(n))
		set.add(10); //If this set already contains the element, the call leaves the set unchanged and returns false.
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		
		//Printing the TreeSet
		System.out.println(set);
		
		//Removing the element from the TreeSet --> TC: O(log(n))
		set.remove(30); //returns true if the set contained the specified element, else false
		
		//Searching an element --> TC: O(log(n))
		System.out.println(set.contains(20));
		System.out.println(set.contains(100));
		
		//size of TreeSet
		System.out.println(set.size());
		
		//Convert TreeSet to Array
		Object[] arr = set.toArray();
		for(int i=0; i<arr.length; ++i) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		//Iterate in TreeSet --> Use for each loop
		for(int ele : set) {
			System.out.print(ele+" ");
		}
		System.out.println();
	}

}
