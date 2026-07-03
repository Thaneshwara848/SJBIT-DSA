package com;
import java.util.HashSet;
public class Demo1 {
	public static void main(String[] args) {
		String s="abcdefabc";
		System.out.print(longest(s));
	}
	public static int longest(String s) {
		int j=0,max=0;
		HashSet<Character> set = new HashSet<>();
		for(int i=0;i<s.length();i++) {
			char curr=s.charAt(i);
			while(set.contains(curr)) {
				set.remove(s.charAt(j++));
			}
			set.add(curr);
			max=Math.max(max,i-j+1);
		}
		
		return max;
	}
}