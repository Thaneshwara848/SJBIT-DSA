package p3;
interface I{
	int a=100;// must init
	I(){}// no 
	abstract void abc() ;
}
interface J 
{

}
interface K extends J , I
{
}
public class Demo1 {
	public static void main(String[] args) {
		I i = new I();//no
	}
}
