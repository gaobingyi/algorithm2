package com.gby.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-list/
 */
public class _148_Sort_List {
    /**
     * Time - O(nlogn) - fast than 99.98% ???
     * Space - O(n) - less than 86.77% ???
     *
     * @param head
     * @return
     */
    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        int[] nums = new int[length];
        int i = 0;
        p = head;
        while (p != null) {
            nums[i++] = p.val;
            p = p.next;
        }
        Arrays.sort(nums);
        p = head;
        i = 0;
        while (p != null) {
            p.val = nums[i++];
            p = p.next;
        }
        return head;
    }
}
