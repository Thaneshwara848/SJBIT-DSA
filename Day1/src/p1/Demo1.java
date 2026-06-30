package p1;
import java.util.Scanner;
public class Demo1 
{
	public static int reverse(int num)
	{
		int temp=num;
		int rev =0;
		while(temp!=0)
		{
			int ld = temp%10;
			rev=(rev*10)+ld;
			temp/=10;
		}
		return rev;
	}
	public static void main(String[] args) {
		
		int num=121;
		int rev=reverse(num);
		System.out.println("Reverse:"+rev);
		System.out.print("Is Palindrome:");
		System.out.print(rev==num);
	}
}
