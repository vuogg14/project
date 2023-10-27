package Hw5_22001666_LeMinhVuong.lt3;

public class App {
    public static void main(String[] args) {
        SumOfLeftLeaves.Node root = new SumOfLeftLeaves.Node(1);
        root.left = new SumOfLeftLeaves.Node(10);
        root.left.left = new SumOfLeftLeaves.Node(20);
        root.left.left.left = new SumOfLeftLeaves.Node(30);
        root.right = new SumOfLeftLeaves.Node(15);
        root.right.left = new SumOfLeftLeaves.Node(16);
        root.right.right = new SumOfLeftLeaves.Node(16);

        SumOfLeftLeaves sumOfLeftLeaves = new SumOfLeftLeaves();
        System.out.println(sumOfLeftLeaves.sumOfLeaves(root));
    }
}
