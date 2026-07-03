package p1;
class A
{
	int a; // 0 
	A(){
	}
	void abc() {
//		only with body
	}
}
class B
{	
}
class C extends B,A // not 
{	
}
public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
	}
}
