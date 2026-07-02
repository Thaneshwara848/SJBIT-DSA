package com;
public class HospitalEmergencyQueue {
	public static void main(String[] args) {
		String[] flightId = {"AI203","6E501","UK808","SG302","AI101	"};
		String[] destination = {"Delhi","Mumbai","Chennai","Hyderabad","Bangalore"};
		int[] time = {1430,930,2215,600,1230};
		for(int i=0;i<time.length-1;i++){
			for(int j=0;j<time.length-i-1;j++){
				if(time[j] > time[j+1]){
					int tempLevel = time[j];
					time[j] = time[j+1];
					time[j+1] = tempLevel;
					
					String tempId = flightId[j];
					flightId[j] = flightId[j+1];
					flightId[j+1] = tempId;
					
					String tempName = destination[j];
					destination[j] = destination[j+1];
					destination[j+1] = tempName;
				}
			}
		}
		System.out.println("Treatment Queue");
		for(int i=0;i<time.length;i++){
			System.out.println(time[i]+" "+flightId[i]+" Level-"+destination[i]);
		}
	}
}