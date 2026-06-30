package p3;

import java.util.Arrays;
import java.util.Scanner;
public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the array elements: ");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		int sum=0;
		for(int i=0;i<size;i++) {
			sum=sum+arr[i];
		}
		System.out.println("Sum: "+sum);
		System.out.println("Average: "+sum/size);
		Arrays.sort(arr);
		int min=arr[0];
		int max=arr[size-1];
		System.out.print("Max: "+max+" Min: "+min);
		System.out.println("==========");
//		int even[];
//		int odd=[];
//		print both even and odd 
//		count the even and odd 
	}
}






