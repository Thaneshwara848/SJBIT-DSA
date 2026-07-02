package com;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "aabbcddeffT";
        for (int i = 0; i < str.length(); i++) {
            boolean repeated = false;
            for (int j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }
            if (!repeated) {
       System.out.println("First Non-Repeating Character: " + str.charAt(i));
                return;
//       []
            }
        }
        System.out.println("No Non-Repeating Character Found.");
    }
}