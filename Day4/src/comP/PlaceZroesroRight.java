package comP;
import java.util.Scanner;
public class PlaceZroesroRight {
	static void move(int[] arr) {
		int k=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				arr[k++]=arr[i];
			}
		}
		while(k<arr.length) {
			arr[k++]=0;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		move(arr);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
}
