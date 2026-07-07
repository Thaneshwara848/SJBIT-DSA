package comTree;

class MaximumElement {

    static int findMax(Node root) {
        if (root == null) return Integer.MIN_VALUE;
        int left = findMax(root.left);
        int right = findMax(root.right);
        return Math.max(root.data, Math.max(left, right));
    }
    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(10);
        root.right = new Node(50);
        root.left.left = new Node(5);
        root.left.right = new Node(30);

        System.out.println("Maximum = " + findMax(root));
    }
}