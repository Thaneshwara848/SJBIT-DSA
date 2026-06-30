package p2;

public class Demo2 {

    public static int reverse(int num) {

        int temp = Math.abs(num);   // Handle negative numbers
        int rev = 0;

        while (temp != 0) {

            int ld = temp % 10;

            // Overflow check
            if (rev > (Integer.MAX_VALUE - ld) / 10) {
                System.out.println("Reverse exceeds Integer range.");
                return 0;
            }

            rev = (rev * 10) + ld;
            temp /= 10;
        }

        return (num < 0) ? -rev : rev;
    }

    public static boolean isPalindrome(int num) {

        // Negative numbers are not palindrome
        if (num < 0)
            return false;

        return num == reverse(num);
    }

    public static void main(String[] args) {

        int[] testCases = {
                121,
                12321,
                123,
                100,
                1010,
                0,
                7,
                -121,
                -123,
                2147447412,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE
        };

        for (int num : testCases) {

            System.out.println("---------------------------");
            System.out.println("Number      : " + num);

            int rev = reverse(num);

            System.out.println("Reverse     : " + rev);
            System.out.println("Palindrome  : " + isPalindrome(num));
        }
    }
}