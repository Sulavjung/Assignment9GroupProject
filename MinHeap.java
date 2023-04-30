package Assignment9GroupProject;
import java.util.Arrays;

/**
 * This is Min Heap class. 
 */
public class MinHeap {

	//private helper variables. 
    private int[] heap;
    private int size;

	//Min Heap of size 10. 
    public MinHeap() {
        heap = new int[10];
        size = 0;
    }

	/**
	 * This add method takes the value to store it in the heap and set it properly. 
	 * @param value is the value to be added in the heap. 
	 */
    public void add(int value) {
		//When the heap is full. 
        if (size == heap.length) {
            heap = Arrays.copyOf(heap, heap.length * 2);
        }
		//Add the element to the last of the array. 
        heap[size++] = value;

		//Re-minheapify the heap. 
        bubbleUp(size - 1);
    }

	/**
	 * This will help to heapify the heap in min heap pattern. 
	 * @param index is the index of the node being added. 
	 */
    private void bubbleUp(int index) {
		//Getting the parent index. 
        int parentIndex = (index - 1) / 2;

		//This is doing the recursion. Index>0 is the stop point here for the recursion and index is decreasing as well. 
        if (index > 0 && heap[index] < heap[parentIndex]) {
            swap(index, parentIndex);
            bubbleUp(parentIndex);
        }
    }

	/**
	 * This method is to swap two nodes. 
	 * @param index1 is the index of the node. 
	 * @param index2 is the index of the parent node usually. It doesn't matter which one is the parent index though.
	 */
    private void swap(int index1, int index2) {
		//Saving the value of the index1 to the temp to save the data.
        int temp = heap[index1];
        heap[index1] = heap[index2];
        heap[index2] = temp;
    }

    @Override
    public String toString() {
        return Arrays.toString(Arrays.copyOf(heap, size));
    }


	//Main method to test the Class. 
    public static void main(String[] args) {

		//Creating a instance of MinHeap object defined in the class above and adding the data given to us. 
        MinHeap heap = new MinHeap();
        heap.add(16);
        heap.add(22);
        heap.add(2);
        heap.add(77);
        heap.add(54);
        heap.add(43);
        heap.add(80);
        heap.add(100);
        heap.add(31);
        heap.add(67);

		//Printing out the min heap. 
        System.out.println(heap);
    }
}
