package comP;
import java.util.*;

public class P2LongestSubstring {

    public static void main(String[] args) {

        String str = "abcabcbb";

        HashMap<Character, Integer> map = new HashMap<>();

        int start = 0;
        int maxLength = 0;

        for (int end = 0; end < str.length(); end++) {

            char ch = str.charAt(end);

            if (map.containsKey(ch) && map.get(ch) >= start) {
                start = map.get(ch) + 1;
            }

            map.put(ch, end);

            maxLength = Math.max(maxLength, end - start + 1);
        }

        System.out.println("Longest length = " + maxLength);
    }
}

/*
 * public class KthLargest {

    public static void main(String[] args) {

        int[] arr = {3,2,1,5,6,4};
        int k = 2;

        int answer = 0;

        for(int i = 0; i < k; i++) {

            int maxIndex = 0;

            for(int j = 1; j < arr.length; j++) {

                if(arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            answer = arr[maxIndex];
            arr[maxIndex] = Integer.MIN_VALUE;
        }

        System.out.println(answer);
    }
}
 * */
		