package comP;
public class BinarySearchVariant {
	 // Method to search key using binary search
	 public static int binarySearch(int[] arr, int key) {
		 int low = 0;
		 int high = arr.length - 1;
		 while (low <= high) {
		 int mid = low + (high - low) / 2;
			 if (arr[mid] == key) {
				 return mid; // key found
			 } else if (key > arr[mid]) {
				 low = mid + 1; // search right side
			 } 
			 else {
				 high = mid - 1; // search left side
			 }
		 }
		 return -1; // key not found
		 }
		 public static void main(String[] args) {
			 int[] employeeIds = {101, 105, 110, 120, 130, 150};
			 int searchId = 120;
			 int index = binarySearch(employeeIds, searchId);
			 if (index != -1) {
			 System.out.println("Employee ID found at index: " + index);
			 } else {
				 System.out.println("Employee ID not found");
			 }
	 }
}