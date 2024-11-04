package Heaps;

class MinHeap {
	private int[] pq;
	private int size;
	private final int CAPACITY;
	public MinHeap(final int CAPACITY) throws Exception { //Constructor
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
		if(i<=0 || pq[i] >= pq[parent]) return;
		swap(i,parent);
		upHeapify(parent);
	}
	private void downHeapify(int i) {
		if(i >= size-1) return;
		int childLeft = 2*i+1;
		int childRight = 2*i+2;
		int minIndx = i;
		if(childLeft<size && pq[childLeft]<pq[minIndx]) minIndx = childLeft;
		if(childRight<size && pq[childRight]<pq[minIndx]) minIndx = childRight;
		if(minIndx == i) return;
		swap(i, minIndx);
		downHeapify(minIndx);
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
 
public class MinHeapImplementationByArray {

	public static void main(String[] args) {
		try {
			MinHeap minHeap = new MinHeap(10);
			minHeap.add(3);
			minHeap.add(7);
			minHeap.add(0);
			minHeap.printHeap();
			System.out.println("Current Size: "+minHeap.size());
			System.out.println("Current Smallest Element: "+minHeap.peek());
			minHeap.add(-3);
			System.out.println("Current Size: "+minHeap.size());
			System.out.println("Current Smallest Element: "+minHeap.peek());
			System.out.println("Deleted value: "+minHeap.remove());
			System.out.println("Current Size: "+minHeap.size());
			minHeap.printHeap();
			System.out.println("Current Smallest Element: "+minHeap.peek());
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
