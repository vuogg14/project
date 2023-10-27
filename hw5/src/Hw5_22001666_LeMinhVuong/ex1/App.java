package Hw5_22001666_LeMinhVuong.ex1;

import java.util.Arrays;


public class App {
    public static void main(String[] args) {
        ArrayBinaryTree<Integer, Integer> array = new ArrayBinaryTree<>();
        array.setRoot(2);
        array.setLeft(0, 3);
        array.setRight(0, 4);
        array.setRight(1, 4);
        array.setLeft(1, 10);
        array.setLeft(2, 11);
        array.setLeft(3, 12);
        System.out.println(Arrays.toString(array.data));
        System.out.println(array.left(3));
        System.out.println(array.root());
        System.out.println(array.parent(1));
        System.out.println(array.sibling(1));
        System.out.println();
        System.out.println();
        array.print();

        System.out.println("=======================================");

        LinkedBinaryTree<Integer, LinkedBinaryTree.Node> linkedBinaryTree = new LinkedBinaryTree<>();
        LinkedBinaryTree.Node<Integer> root = linkedBinaryTree.addRoot(2);
        LinkedBinaryTree.Node<Integer> left = linkedBinaryTree.addLeft(root, 10);
        LinkedBinaryTree.Node<Integer> right = linkedBinaryTree.addRight(root, 30);
        LinkedBinaryTree.Node<Integer> leftOne =  linkedBinaryTree.addLeft(left, 20);
        LinkedBinaryTree.Node<Integer> rightOne = linkedBinaryTree.addRight(left, 11);
        LinkedBinaryTree.Node<Integer> leftTwo = linkedBinaryTree.addLeft(right, 13);
        LinkedBinaryTree.Node<Integer> rightTwo = linkedBinaryTree.addRight(right, 14);


        System.out.println(linkedBinaryTree.left(left));
        System.out.println(linkedBinaryTree.sibling(left));
        System.out.println();
        System.out.println();
        linkedBinaryTree.print();
    }
}
