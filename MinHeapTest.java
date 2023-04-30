package Assignment9GroupProject;
/**
 * Name: Sulav Jung Hamal
 * Class: 2023 Spring Sem CS220. 
 * Related TO: Group Assignment 9
 * 
 * This is the min Heap class with the main function to test the isMinHeap() method that is described here. 
 * 
 */

public class MinHeapTest {

	/**
	 * This method check the given array is minheap or not. 
	 * @param arr is the array of values. 
	 * @return false if not minheap. True if minheap. 
	 */
	public static boolean isMinHeap(int[] arr) {
		// Length of the arry for the loop.
		int n = arr.length;

		// Looping through each index element upto the parent indexes.
		for (int i = 0; i <= (n / 2) - 1; i++) {

			// Calculating the left and right child of the parent indexes.
			int left = 2 * i + 1;
			int right = 2 * i + 2;

			// Checking if the left child is small than the parent. If so, it should return
			// false for minheap.
			if (left < n && arr[left] < arr[i]) {
				return false;
			}

			// Checking if the right child is small than the parent. If so, it should return
			// false for minheap.
			if (right < n && arr[right] < arr[i]) {
				return false;
			}
		}

		// if Everything ran through, than means the heap is minheap. Thus returning
		// true.
		return true;
	}

	// Main method to check the method that is created above.
	public static void main(String[] args) {
		int[] heap1 = { 13, 17, 22, 74, 81, 92, 44, 62, 2, 8, 16, 52 };
		int[] heap2 = { 2, 22, 16, 31, 54, 43, 80, 100, 77, 67};

		System.out.println(" ");
		System.out.println("Heap1 isMinHeap: ->" + isMinHeap(heap1));
		System.out.println("Heap2 isMinHeap: ->" + isMinHeap(heap2));
		System.out.println(" ");
	}

}
