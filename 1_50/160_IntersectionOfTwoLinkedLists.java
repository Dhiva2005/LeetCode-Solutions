// Problem 160: Intersection of Two Linked Lists

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        ListNode PA = headA;
        ListNode PB = headB;

        while (PA != PB) {
            if (PA == null) {
                PA = headB;
            } else {
                PA = PA.next;
            }
            if (PB == null) {
                PB = headA;
            } else {
                PB = PB.next;
            }
        }
        return PA;
    }
}