package comTree;

class IdenticalTrees {

    static boolean identical(Node t1, Node t2) {

        if (t1 == null && t2 == null)
            return true;

        if (t1 == null || t2 == null)
            return false;

        return t1.data == t2.data
                && identical(t1.left, t2.left)
                && identical(t1.right, t2.right);
    }

    public static void main(String[] args) {

        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);

        Node t2 = new Node(1);
        t2.left = new Node(2);
        t2.right = new Node(3);

        System.out.println(identical(t1, t2));
    }
}