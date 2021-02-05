package com.gby.leetcode;

import java.util.Arrays;

/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 */
public class _剑指_Offer_06_从尾到头打印链表 {
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        }
        int length = 0;
        ListNode p = head;
        while (p != null) {
            length++;
            p = p.next;
        }
        int[] results = new int[length];
        int i = 0;
        while (head != null) {
            results[i++] = head.val;
            head = head.next;
        }
        int l = 0;
        int r = results.length - 1;
        while (l < r) {
            int temp = results[l];
            results[l] = results[r];
            results[r] = temp;
            l++;
            r--;
        }
        return results;
    }
}
