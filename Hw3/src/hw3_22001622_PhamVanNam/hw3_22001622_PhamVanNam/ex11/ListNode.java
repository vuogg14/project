package hw3_22001622_PhamVanNam.ex11;

public class ListNode {
    int val;
    public ListNode next;

    ListNode() {}
    public ListNode(int val) {this.val = val; }
    public ListNode(int val, ListNode next) {this.val = val; this.next = next; }

    public int getVal() {
        return val;
    }
}
