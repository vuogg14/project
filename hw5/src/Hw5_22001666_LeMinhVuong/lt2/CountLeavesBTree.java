package Hw5_22001666_LeMinhVuong.lt2;


public class CountLeavesBTree {
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

    static int count;

    public static int countLeaves(Node node){
        if(node == null){
            return 0;
        }
        if(node.left == null && node.right == null){
            return count ++;
        }
        countLeaves(node.left);
        countLeaves(node.right);
        return count;
    }


}
