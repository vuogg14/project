package Hw5_22001666_LeMinhVuong.lt2;


public class Test {
    public static void main(String[] args) {
        CountLeavesBTree.Node root = new CountLeavesBTree.Node(10);
        root.left = new CountLeavesBTree.Node(10);
        root.left.left = new CountLeavesBTree.Node(20);
        root.left.left.left = new CountLeavesBTree.Node(30);
        root.right = new CountLeavesBTree.Node(15);
        root.right.left = new CountLeavesBTree.Node(16);
        root.right.right = new CountLeavesBTree.Node(16);


        System.out.println(CountLeavesBTree.countLeaves(root));
    }
}
