package hw3_22001622_PhamVanNam.ex11;

public class CheckPalindrome {
    public boolean isPalindrome(ListNode head) {
        ListNode mid = reverse(getMid(head));
        while (mid != null) {
            if (mid.val != head.val) return false;
            mid = mid.next;
            head = head.next;
        }
        return true;
    }

    public static ListNode getMid(ListNode head) {
        ListNode result = head, newNode = head;
        while (newNode != null) {
            if (newNode.next == null) {
                result = result.next;
                break;
            }
            result = result.next;
            newNode = newNode.next.next;

        }
        return result;

    }

    public static ListNode reverse(ListNode head) {
        ListNode nextNode, result = null;
        while (head != null) {
            nextNode = head.next;
            head.next = result;
            result = head;
            head = nextNode;
        }
        return result;
    }
}
