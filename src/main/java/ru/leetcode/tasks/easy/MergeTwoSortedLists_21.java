package ru.leetcode.tasks.easy;

import ru.leetcode.tasks.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class MergeTwoSortedLists_21 {
    public static void main(String[] args) {
        List<Integer> l1 = List.of(1, 4, 5, 7, 9, 18, 19, 20);
        List<Integer> l2 = List.of(1, 2, 3, 8, 11, 15);
        System.out.println(mergeTwoArrayLists(l1, l2));

        ListNode list1 = new ListNode(1,
                new ListNode(4, new ListNode(5, null)));
        ListNode list2 = new ListNode(1,
                new ListNode(3, new ListNode(4, null)));
        System.out.println(mergeTwoLists(list1, list2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode head = result;
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                result.next = new ListNode(list1.val);
                list1 = list1.next;
            } else {
                result.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            result = result.next;

            if (list1 == null) {
                result.next = list2;
            }
            if (list2 == null) {
                result.next = list1;
            }
        }

        return head.next;
    }

    public static List<Integer> mergeTwoArrayLists(List<Integer> list1, List<Integer> list2) {
        int i = 0;
        int j = 0;
        List<Integer> newList = new ArrayList<>();

        if (list1.isEmpty()) {
            return list2;
        }
        if (list2.isEmpty()) {
            return list1;
        }

        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                newList.add(list1.get(i));
                i++;
            } else {
                newList.add(list2.get(j));
                j++;
            }

            if (i == list1.size()) {
                while (j < list2.size()) {
                    newList.add(list2.get(j));
                    j++;
                }
            }
            if (j == list2.size()) {
                while (i < list1.size()) {
                    newList.add(list1.get(i));
                    i++;
                }
            }
        }
        return newList;
    }
}
