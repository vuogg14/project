package Hw5_22001666_LeMinhVuong.ex2;

public class TestMain {
    public static void main(String[] args) {
LinkedBinaryTree<String, LinkedBinaryTree.Node> linkedBinaryTree = new LinkedBinaryTree<>();
       LinkedBinaryTree.Node<String> root = linkedBinaryTree.addRoot("*");
        LinkedBinaryTree.Node<String> left = linkedBinaryTree.addLeft(root, "+");
        LinkedBinaryTree.Node<String> right = linkedBinaryTree.addRight(root, "-");
        LinkedBinaryTree.Node<String> leftOne =  linkedBinaryTree.addLeft(left, "/");
        LinkedBinaryTree.Node<String> rightOne = linkedBinaryTree.addRight(left, "3");
     LinkedBinaryTree.Node<String> leftLeftOne = linkedBinaryTree.addLeft(leftOne, "6");
     LinkedBinaryTree.Node<String> rightLeftOne = linkedBinaryTree.addRight(leftOne, "2");
     LinkedBinaryTree.Node<String> leftTwo  = linkedBinaryTree.addLeft(right, "7");
     LinkedBinaryTree.Node<String> rightTwo  = linkedBinaryTree.addRight(right, "4");

        System.out.println("+=================================================+");
        ExpressionTree<String> expressionTree = new ExpressionTree<>();
        System.out.println("Inorder");
        expressionTree.inorderPrint(root);
        System.out.println();
        System.out.println("Preorder");
        expressionTree.preorderPrint(root);
        System.out.println();
        System.out.println("Postorder");
        expressionTree.postorderPrint(root);
        System.out.println();

        System.out.println("==================================================");
        System.out.println(expressionTree.calculate());
    }
}
