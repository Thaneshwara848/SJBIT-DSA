package p1;

public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {2,2,1,2,3,2,2};
		int major =0;
		for(int i=0;i<arr.length;i++) {
			int currmajor =0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					currmajor++;
					major = Math.max(currmajor, major);
				}
			}
		}
		if(major>arr.length/2) {
			System.out.println(arr[major]+" "+major);
		}
		else {
			System.out.println("does not exist");
		}
		
	}
	
}







