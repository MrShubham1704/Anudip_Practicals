	package LAB_6;
	
	
	public class BoubleSortAlgorithm {
		public static void main(String[] args) {
			int[] numbers = {8, 4, 3, 5, 6};
	
			bubbleSort(numbers);
	
			System.out.print("Sorted Integers: ");
			for (int num : numbers) {
				System.out.print(num + " ");
			}
		}
	
		public static void bubbleSort(int[] array) {
			int n = array.length;
			boolean swapped;
	
			for (int i = 0; i < n - 1; i++) {
				swapped = false;
	
				for (int j = 0; j < n - 1 - i; j++) {
					if (array[j] > array[j + 1]) {
						// Swap array[j] and array[j + 1]
						int temp = array[j];
						array[j] = array[j + 1];
						array[j + 1] = temp;
	
						swapped = true;
					}
				}
	
				// If no elements were swapped in the inner loop, then the array is already sorted
				if (!swapped) break;
			}
		}
	}
	
	
