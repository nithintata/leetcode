// Odd Even Linked List

class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head.next;
        ListNode tail = head;
        ListNode root = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        do {
            tail.next = head.next;
            head.next = head.next.next;
            head = head.next;
            tail = tail.next;
        }
        while (head != temp && head.next != temp);
        tail.next = null;
        return root;
    }
}
