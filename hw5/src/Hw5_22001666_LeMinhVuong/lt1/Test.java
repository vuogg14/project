package Hw5_22001666_LeMinhVuong.lt1;

public class Test {
    public static void main(String[] args) {
      HeightOfTree.Node root = new HeightOfTree.Node(2);
      root.left = new HeightOfTree.Node(10);
      root.left.left = new HeightOfTree.Node(20);
      root.left.left.left = new HeightOfTree.Node(30);
      root.right = new HeightOfTree.Node(15);

      System.out.println(HeightOfTree.heightTree(root));
    }
}
