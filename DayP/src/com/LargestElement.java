package com;
import java.util.Scanner;
public class LargestElement {
	public static int FindLargestElement(int[] arr,int k) {
		for(int i=0;i<arr.length-1;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}	
		}
		return arr[arr.length-k];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {3,5,8,9,9,1,2};
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value of k:");
		int k = sc.nextInt();
		System.out.println(FindLargestElement(arr,k));
	}
}
