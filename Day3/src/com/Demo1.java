package com;

public class Demo1 {

	public static void main(String[] args) {
		String name1="Suresh";
		String name2= "Suresh";
		String name3="suresh";

		String name4=new String("Suresh");
		String name5=new String("Suresh");
		String name6=  new String("Suresh");
		String name7="Suresh";
//		System.out.println(name1==name2);//true 
//		System.out.println(name1==name3);// false
//		System.out.println(name1==name4);// false
//		System.out.println(name4==name5);// false
//		System.out.println(name4.equals(name5));//true
//		System.out.println(name7==name6);		// false
//		System.out.println(name7.equals(name6));	// true
//		= 			: int a =10 ;
//		== 			: check refrences 
//		equalse		: check the content 
		
String name=  new String("suREsH iS a devEloPer");
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.length());
System.out.println(name.trim());
System.out.println(name.trim().length());
System.out.println(name.endsWith("r"));
System.out.println(name.startsWith("z"));
System.out.println("========");
String []words=name.split(" ");
for(String wrd:words) {
	System.out.println(wrd.toUpperCase()+" : "+wrd.length());
}


		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
