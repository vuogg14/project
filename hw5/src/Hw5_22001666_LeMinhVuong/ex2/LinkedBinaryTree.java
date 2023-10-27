package Hw5_22001666_LeMinhVuong.ex2;

public class LinkedBinaryTree<E, T> implements BinaryTreeInterface<T> {

    protected static class Node<E> {
        protected E element;
        protected Node<E> parent;
        protected Node<E> left;
        protected Node<E> right;

        public Node(E element, Node<E> above, Node<E> leftChild, Node<E> rightChild) {
            this.element = element;
            this.parent = above;
            this.left = leftChild;
            this.right = rightChild;
        }
    }

    private int size = 0;
    public Node<E> root = null;

    public Node<E> addRoot(E element) {
        if (isEmpty()) {
            Node<E> current = new Node<>(element, null, null, null);
            root = current;
            size++;
            return root;
        }
        return root;
    }

    public Node<E> addLeft(Node p, E element) {
        if (p == null) {
            throw new IllegalArgumentException("Err!, Node null");
        }
        if (p.left != null) {
            throw new IllegalStateException("Err!, child left not null");
        }

        Node<E> childLeft = new Node<>(element, p, null, null);
        p.left = childLeft;
        size++;
        return childLeft;
    }

    public Node<E> addRight(Node p, E element) {
        if (p == null) {
            throw new IllegalArgumentException("Err!, Node null");
        }
        if (p.right != null) {
            throw new IllegalStateException("Err!, child right not null");
        }

        Node<E> childRight = new Node<>(element, p, null, null);
        p.right = childRight;
        size++;
        return childRight;
    }

    public void set(Node p, E element) {
        if (p == null) {
            throw new IllegalStateException("Err!, Node null");
        }
        p.element = element;
    }


    @Override
    public T root() {
        return (T) root.element;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int numChildren(T p) {
        Node<E> current = (Node<E>) p;
        if (current.left == null && current.right == null) {
            return 0;
        } else if (current.left == null || current.right == null) {
            return 1;
        }
        return 2;
    }

    @Override
    public T parent(T p) {
        if (p == null) {
            throw new IllegalStateException("p null");
        }
        Node<E> current = (Node<E>) p;
        if (current.parent == null) {
            throw new IllegalStateException("p not parent");
        }
        return (T) current.parent.element;
    }

    @Override
    public T left(T p) {
        if (p == null) {
            throw new IllegalStateException("p null");
        }
        Node<E> current = (Node<E>) p;
        return (T) current.left.element;
    }

    @Override
    public T right(T p) {
        if (p == null) {
            throw new IllegalStateException("p null");
        }
        Node<E> current = (Node<E>) p;
        return (T) current.right.element;
    }

    @Override
    public T sibling(T p) {
        Node<E> current = (Node<E>) p;
        Node<E> parent = current.parent;
        if (parent == null) {
            return null;
        }
        if (parent.left.equals(p)) {
            return (T) parent.right.element;
        } else {
            return (T) parent.left.element;
        }
    }

//    public void print(Node<E> node, int k){
//        if(node.right != null){
//            print(node.right, k + 2);
//        }
//
//        if(k == 0){
//            System.out.println(node.element);
//        } else {
//            for(int i = 0; i < k; i++){
//                System.out.print("  ");
//            }
//            System.out.println(node.element);
//        }
//
//        if(node.left != null){
//            print(node.left, k + 2);
//        }
//    }
//
//    public void print(){
//        print(root,0);
//    }
}
