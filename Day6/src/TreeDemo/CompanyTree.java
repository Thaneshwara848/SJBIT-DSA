package TreeDemo;
class Node {
	 String name;
	 Node left, right;
	 Node(String name) {
	 this.name = name;
	 }
}
public class CompanyTree {
	 public static void main(String[] args) {
	 Node root = new Node("CEO");
	 root.left = new Node("Manager A");
	 root.right = new Node("Manager B");
	 root.left.left = new Node("Developer 1");
	 root.left.right = new Node("Developer 2");
	 root.right.left = new Node("Tester 1");
	 root.right.right = new Node("Tester 2"); 
	 System.out.println("CEO : " + root.name);
	 System.out.println("Left Manager : " + root.left.name);
	 System.out.println("Right Manager : " + root.right.name);
	 System.out.println("Employee : " + root.left.left.name);
	 System.out.println("Employee : " + root.right.left.name);
	 }
}