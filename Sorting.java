import java.util.Arrays;

/**
 * 
 * @author Olivia Kahn
 *
 */
public class Sorting {
	public static void bubblesort(int [] arr) {
		int n = arr.length;
		for (int i = 0; i < n-1; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if (arr[j] > arr[j+1]) {
					// Swap without temporary variable
					arr[j] = arr[j] ^ arr[j+1];
					arr[j+1] = arr[j] ^ arr[j+1];
					arr[j] = arr[j] ^ arr[j+1];
				}
			}
		}
	}
	
	// Implement and reasearch about the insertionSort and SelectionSort
	
	// Source: https://www.javatpoint.com/insertion-sort-in-java
	public static void insertionsort(int [] arr) {
		for (int i = 1; i < arr.length; i++) {
			int temp = arr[i];
			int j = i-1;
			while((j > -1) && (arr[j] > temp)) {
				arr[j+1] = arr[j];
				j -= 1;
			}
			arr[j+1] = temp;
		}
	}
	
	// Source: https://www.javatpoint.com/selection-sort-in-java
	public static void selectionsort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int n = i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j] < arr[n]) {
					n = j;
				}
			}
			int temp = arr[n];
			arr[n] = arr[i];
			arr[i] = temp;
		}
	}
	
	
	public static void main(String[] args) {
		int [] numbers = {4, 1, 2, 3, 5};
		bubblesort(numbers);
		System.out.println(Arrays.toString(numbers));
		int[] numbers2 = {4, 1, 2, 3, 5};
		insertionsort(numbers2);
		System.out.println(Arrays.toString(numbers2));
		int[] numbers3 = {4, 1, 2, 3, 5};
		selectionsort(numbers3);
		System.out.println(Arrays.toString(numbers3));
		
	}
}
