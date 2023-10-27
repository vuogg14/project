package Hw5_22001666_LeMinhVuong.lt1;

public class HeightOfTree {
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

    public static int heightTree(Node root){
        if(root == null){
            return 0;
        }
        int left, right;
        left = heightTree(root.left);
        right = heightTree(root.right);
        return Math.max(left, right) + 1;
    }
}
