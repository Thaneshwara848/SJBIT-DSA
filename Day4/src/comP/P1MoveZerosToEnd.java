package comP;
public class P1MoveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3, 12};
        int index = 0;
        // Move all non-zero elements to the front
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        // Fill remaining positions with zeros
        while (index < arr.length) {
            arr[index] = 0;
            index++;
        }
        // Print final array
        System.out.print("Output: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}



		
//			int[] arr = {0, 5, 0, 3, 12} ;
//			place all zro to last
//			plc all the zro to left


























