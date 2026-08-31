/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        if(head == null || head.next == null || head.next.next == null) {
            return new int[]{-1, -1};
        }
        ListNode prev = head;
        ListNode curr = head.next;
        ListNode nxt = head.next.next;

        int firstCIndx = -1;
        int prevCIndx = -1;
        int minDist = Integer.MAX_VALUE;
        int currIndx = 1;

        while(nxt != null) {
            boolean isLocalMaxima = (curr.val > prev.val) && (curr.val > nxt.val);
            boolean isLocalMinima = (curr.val < prev.val) && (curr.val < nxt.val);
            if(isLocalMaxima || isLocalMinima) {
                if(firstCIndx == -1) {
                    firstCIndx = currIndx;
                } else {
                    minDist = Math.min(minDist, currIndx - prevCIndx);
                }
                prevCIndx = currIndx;
            }
            prev = curr;
            curr = nxt;
            nxt = nxt.next;
            currIndx++;
        }
        if(prevCIndx == -1 || prevCIndx == firstCIndx) {
            return new int[]{-1, -1};
        }
        int maxDist = prevCIndx - firstCIndx;
        return new int[]{minDist, maxDist};
    }
}