package abc;
import java.util.*;
public class BankFraudDetection {
	public static void main(String[] args) {

		int[] price = {7,1,4,5,6,7,9,2};
		int maxP = Integer.MIN_VALUE;
		int n = price.length;
		int buyP = Integer.MAX_VALUE;
		for(int i =0; i<price.length;i++)
		{
		  if(buyP<price[i]) {
			 int currP = price[i]-buyP;
			  maxP = Math.max(currP,maxP);
			  
		  }
		  else {
			  buyP = price[i];
		  }
		}
		System.out.println(maxP);
	}
}

	
	// Method to check duplicate transaction

