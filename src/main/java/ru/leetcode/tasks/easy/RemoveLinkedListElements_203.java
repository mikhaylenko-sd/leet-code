package ru.leetcode.tasks.easy;

import ru.leetcode.tasks.common.ListNode;

//https://leetcode.com/problems/remove-linked-list-elements/
public class RemoveLinkedListElements_203 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,
                new ListNode(6, new ListNode(6,
                        new ListNode(3, new ListNode(4,
                                new ListNode(5, new ListNode(6,
                                        null)))))));
        System.out.println(removeElements(head, 6));
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        ListNode result = head;
        while (head.next != null) {
            if (head.next.val == val) {
                head.next = head.next.next;
            } else {
                head = head.next;
            }
        }
        return result;
    }

//    public ListNode removeElements(ListNode head, int val) {
//        ListNode fakeHead = new ListNode(-1);
//        fakeHead.next = head;
//        ListNode curr = head, prev = fakeHead;
//        while (curr != null) {
//            if (curr.val == val) {
//                prev.next = curr.next;
//            } else {
//                prev = prev.next;
//            }
//            curr = curr.next;
//        }
//        return fakeHead.next;
//    }

}
