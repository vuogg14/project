package Hw5_22001666_LeMinhVuong.lt3;


public class SumOfLeftLeaves {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public int sumOfLeaves(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left != null && root.left.left == null && root.left.right == null) {
            return root.left.data+sumOfLeaves(root.right);
        }

        return sumOfLeaves(root.left) + sumOfLeaves(root.right);
    }
}
