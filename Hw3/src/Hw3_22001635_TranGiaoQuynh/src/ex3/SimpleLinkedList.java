package ex3;

public class SimpleLinkedList<T> {
    class Node {
        T data;
        Node next;
    }

    private Node top = null;
    private Node bot = null;
    private int n = 0;

    public void add(T data) {
        Node node = new Node();
        node.data = data;
        if(top != null){
            node.next = top;
            top = node;
            n++;
        } else {
            node.next = top;
            top = node;
            bot = top;
            n++;
        }
    }

    public void addBot(T data) {
        Node node = new Node();
        node.data = data;
        if(bot != null) {
            bot.next = node;
            bot = bot.next;
            n++;
        } else {
            node.next = top;
            top = node;
            bot = top;
            n++;
        }
    }

    public T get(int i) throws Exception {
        if(i < 0 || i > n){
            throw new Exception();
        } else {
            Node node = new Node();
            node = top;
            for (int j = 0; j < i ; j++) {
               node = node.next;
            }
            return node.data;
        }
    }

    public void set(int i, T data) throws Exception {
        if (i < 0 || i > n) {
            throw new Exception();
        } else {
            Node node = new Node();
            node = top;
            for (int j = 0; j < i; j++) {
                node = node.next;
            }
            node.data = data;
        }
    }

    public boolean isContain(T data) {
        Node node = new Node();
        node = top;
        for (int i = 0; i < n; i++) {
            if(node.data.equals(data)){
                return true;
            }
            node = node.next;
        }
        return false;
    }

    public int size() {
        return n;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public T removeTop() {
        Node node = new Node();
        node = top;
        top = node.next;
        n--;
        return node.data;
    }

    public T removeBot() {
        Node node = new Node();
        node = top;
        for (int i = 0; i < n-1; i++) {
            node = node.next;
        }
        bot = node;
        return node.data;
    }

    public void remove(T data) {
        Node node = new Node();
        node = top;
        if(node.data.equals(data)){
            removeTop();
            n--;
        }
        int count = 0;
        while (count < n-1){
            if(node.next.data.equals(data)){
                if (count == n-2) {
                    removeBot();
                    n--;
                } else {
                    node.next = node.next.next;
                    n--;
                }
            }
            count++;
            node = node.next;
        }
    }
    public void print() throws Exception {
        for (int i = 0; i < n; i++) {
            System.out.print("[" + get(i) + "] ");
        }
        System.out.println();
    }

}
