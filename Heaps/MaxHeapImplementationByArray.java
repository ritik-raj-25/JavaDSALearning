package Heaps;

class MaxHeap {
	private int[] pq;
	private int size;
	private final int CAPACITY;
	public MaxHeap(final int CAPACITY) throws Exception { //Constructor
		if(CAPACITY <= 0) {
			throw new Exception("Invalid Capacity");
		}
		this.CAPACITY = CAPACITY;
		pq = new int[CAPACITY];
		size = 0;
	}
	
	public void swap(int i, int j) {
		int temp = pq[i];
		pq[i] = pq[j];
		pq[j] = temp;
	}
	private void upHeapify(int i) {
		int parent = (i-1)/2;
		if(i<=0 || pq[i] <= pq[parent]) return;
		swap(i,parent);
		upHeapify(parent);
	}
	private void downHeapify(int i) {
		if(i >= size-1) return;
		int childLeft = 2*i+1;
		int childRight = 2*i+2;
		int maxIndx = i;
		if(childLeft<size && pq[childLeft]>pq[maxIndx]) maxIndx = childLeft;
		if(childRight<size && pq[childRight]>pq[maxIndx]) maxIndx = childRight;
		if(maxIndx == i) return;
		swap(i, maxIndx);
		downHeapify(maxIndx);
	} 
	public void add(int ele) throws Exception{
		if(size == CAPACITY) {
			throw new Exception("Min-Heap is full...");
		}
		pq[size++] = ele;
		upHeapify(size-1);
	}
	public int peek() throws Exception{
		if(size == 0) {
			throw new Exception("Min-Heap is empty...");
		}
		return pq[0];
	}
	public int remove() throws Exception {
		if(size == 0) {
			throw new Exception("Min-Heap is empty");
		}
		int peek = pq[0];
		swap(0, size-1);
		--size;
		downHeapify(0);
		return peek;
	}
	public void printHeap() {
		System.out.print("Current Heap: ");
		for(int i=0; i<size; ++i) {
			System.out.print(pq[i]+" ");
		}
		System.out.println();
	}
	public int size() {
		return this.size;
	}
}
 
public class MaxHeapImplementationByArray {

	public static void main(String[] args) {
		try {
			MaxHeap maxHeap = new MaxHeap(10);
			maxHeap.add(3);
			maxHeap.add(7);
			maxHeap.add(0);
			maxHeap.printHeap();
			System.out.println("Current Size: "+maxHeap.size());
			System.out.println("Current Largest Element: "+maxHeap.peek());
			maxHeap.add(13);
			System.out.println("Current Size: "+maxHeap.size());
			System.out.println("Current Largest Element: "+maxHeap.peek());
			System.out.println("Deleted value: "+maxHeap.remove());
			System.out.println("Current Size: "+maxHeap.size());
			maxHeap.printHeap();
			System.out.println("Current Largest Element: "+maxHeap.peek());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}