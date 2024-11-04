package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicsOfHeap {

	public static void main(String[] args) {
		//Min-Heap 
		//Declaration of Min-Heap
		System.out.println("Min-Heap:");
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		
		//Adding element to Min-Heap --> TC = O(log(n))
		minHeap.add(10);
		System.out.println(minHeap);
		minHeap.add(3);
		System.out.println(minHeap);
		minHeap.add(5);
		System.out.println(minHeap);
		
		//Deleting element from Min-Heap --> TC = O(log(n))
		System.out.println("Deleted element: "+minHeap.remove());
		System.out.println(minHeap);
		
		//Viewing element --> TC = O(1)
		System.out.println("Front-Most element: "+minHeap.peek());
		System.out.println(minHeap);
		System.out.println();
		
		
		//Max-Heap 
		//Declaration of Max-Heap
		System.out.println("Max-Heap:");
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
		
		//Adding element to Max-Heap --> TC = O(log(n))
		maxHeap.add(10);
		System.out.println(maxHeap);
		maxHeap.add(3);
		System.out.println(maxHeap);
		maxHeap.add(5);
		System.out.println(maxHeap);
		
		//Deleting element from Max-Heap --> TC = O(log(n))
		System.out.println("Deleted element: "+maxHeap.remove());
		System.out.println(maxHeap);
		
		//Viewing element --> TC = O(1)
		System.out.println("Front-Most element: "+maxHeap.peek());
		System.out.println(maxHeap);
		System.out.println();		
		
	}

}
