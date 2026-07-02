package com;
class A extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			try {
				System.out.println("I  :  " +  i );
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
class B extends Thread{
	public void run(){
		for(int j=0;j<=10;j++) {
			try {
				System.out.println("		J  :  " +  j );
				Thread.sleep(1000);
			} catch (Exception e) {
			}
		}
	}
}
//C : 10 : 10 sec : 30 sec 
public class Demo {
	public static void main(String[] args) {
		System.out.println("Hi Demo ");
		A a = new A();a.start();
		B b = new B();b.start();
	}
}
