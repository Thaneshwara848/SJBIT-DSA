package com;

public class traffic {
	public static void main(String [] args) {
	int [] id = {1,2,3,4,5,6};
	int [] sal= {20000,30000,40000,50000,60000,40000};
	String[] dep= {"cs","cs","is","is","ds","ds"};
	int max1=0;
	int max2=0;
	int max3=0;
	int max=0;
	
	for(int i=0;i<sal.length;i++) {
		if(dep[i] == "cs") {
			max1=Math.max(sal[i],max1);
//			max=Math.max(sal[i],max1);
		}
		if(dep[i] == "is") {
			max2=Math.max(sal[i],max2);
//			max=Math.max(sal[i],max2);
		}
		if(dep[i] == "ds") {
			max3=Math.max(sal[i],max3);
//			max=Math.max(sal[i],max3);
		}
	}
	System.out.print("\the highest sal of cs:" +max1);
	System.out.print("\nthe highest sal of is:" +max2);
	System.out.println("\n the highest sal of ds:" + max3);
	System.out.println(max);
	
	
	
	
	
	
}
}