package Hw5_22001666_LeMinhVuong.ex1;

public class ArrayBinaryTree<E, T> implements BinaryTreeInterface<T> {
    public E[] data;

    private int n = 0;
    private int defaultSize = 100;

    public void setRoot(E element) {
        if(data[0] == null) {
            data[0] = element;
            n++;
        }
    }

    public void setLeft(int p, E element) {
        if (2 * p + 1 >= data.length) {
            System.out.println("Out of length");
            return;
        }
        if(data[2 * p + 1] == null) {
            data[2 * p + 1] = element;
            n++;
        }
    }

    public void setRight(int p, E element) {
        if (2 * p + 2 >= data.length) {
            System.out.println("Out of length");
        }
        if(data[2 * p + 2] == null) {
            data[2 * p + 2] = element;
            n++;
        }
    }

    public ArrayBinaryTree() {
        data = (E[]) new Object[defaultSize];

    }


    @Override
    public T root() {
        return (T) data[0];
    }

    @Override
    public int size() {
        return n;
    }

    @Override
    public boolean isEmpty() {
        return n == 0;
    }

    @Override
    public int numChildren(T p) {
        if (left(p) == null && right(p) == null) {
            return 0;
        } else if (left(p) == null || right(p) == null) {
            return 1;
        }
        return 2;
    }


    @Override
    public T parent(T p) {
        if ((int) p == 0) {
            return null;
        }
        return (T) data[(int) p / 2];
    }

    @Override
    public T left(T p) {
        if (2 * (int) p + 1 >= data.length) {
            return null;
        }
        return (T) data[2 * (int) p + 1];
    }

    @Override
    public T right(T p) {
        if (2 * (int) p + 2 >= data.length) {
            return null;
        }
        return (T) data[2 * (int) p + 2];
    }

    @Override
    public T sibling(T p) {
        int parent = (int) p / 2;
        if (parent(p) == null) {
            return null;
        }

        if (data[(int) p].equals(data[parent * 2 + 1])) {
            return (T) data[parent * 2 + 2];
        } else {
            return (T) data[parent * 2 + 1];
        }
    }

    public void print(int index, int k) {
        if(index >= n || data[index] == null) return;
        print(index * 2 + 2, k + 1);
        if(k == 0){
            System.out.println(data[index]);
        } else {
            for(int i = 0; i < k; i++){
                System.out.print("    ");
            }
            System.out.println(data[index]);
        }
            print(index * 2 + 1, k + 1);
    }

    public void print(){
        print( 0, 0);
    }

}
