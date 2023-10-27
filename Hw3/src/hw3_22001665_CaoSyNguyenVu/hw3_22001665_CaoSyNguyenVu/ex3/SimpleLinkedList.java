package hw3_22001665_CaoSyNguyenVu.ex3;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void addTop(T data) {
        Node tmp = new Node();
        tmp.data = data;
        if(top == null){
            top = tmp;
            bot = top;
        } else {
            tmp.next = top;
            top = tmp;
        }
        n++;
    }

    public void addBot(T data) {
        Node tmp = new Node();
        tmp.data = data;
        if(top == null){
            top = tmp;
            bot = top;
        } else {
            bot.next = tmp;
            bot = bot.next;
        }
        n++;
    }

    public T get(int pos) {
        checkBoundaries(pos);
        Node tmp = top;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void set(int pos, T data) {
        checkBoundaries(pos);
        Node tmp = top;
        for (int i = 0; i < pos; i++) {
            tmp = tmp.next;
        }
        tmp.data = data;
    }

    public int size() {
        return n;
    }

    public T removeTop() {
        if (isEmpty()) return null;
        T data = top.data;
        top = top.next;
        n--;
        return data;
    }

    public T removeBot() {
        if (isEmpty()) return null;
        T data = bot.data;
        Node tmp = top;
        for (int i = 0; i < n - 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = null;
        bot = tmp;
        n--;
        return data;
    }

    public boolean isEmpty() {
        return n == 0;
    }

    public boolean isContain(T data) {
        Node tmp = top;
        for (int i = 0; i < n; i++) {
            if (tmp.data == data) return true;
        }
        return false;
    }

    public void remove(T data) {
        while (top.data == data) {
            top = top.next;
            n--;
        }

        Node tmp = new Node();
        for (int i = 0; i < n - 1; i++) {
            while (tmp.next.data == data){
                tmp.next = tmp.next.next;
            }
            tmp = tmp.next;
        }
    }

    private void checkBoundaries(int i) {
        if (i < 0 || i >= n) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }
    @Override
    public String toString(){
        StringBuilder builder = new StringBuilder();
        Node crr = top;
        for(int i = 0; i<n; i++){
            builder.append("[").append(crr.data).append("]");
            crr = crr.next;
        }
        return builder.toString();
    }
}