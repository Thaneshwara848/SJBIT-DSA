package p2;


abstract class A
{
	int a;
	A(){	
	}
	void abc() {
		// logic 
	}
	abstract void xyz();
// both abstract+ non absrt
}
class B
{	
}
class C extends B , A//not
{
}
public class Demo1 {
	public static void main(String[] args) {
		A a = new A();
	}
}
