public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        // If either are null they cannot intersect
        if(headA == null || headB == null) return null;

        // Pointers from each list start
        ListNode a = headA;
        ListNode b = headB;

        // In all cases, they will either meet at null after at most m + n steps, or will have an intersection
        while(a != b) {
            // If we reach the end of listA, we switch to listB
            a = (a != null) ? a.next : headB;
            // If we reach the end of listB, we switch to listB
            b = (b != null) ? b.next : headA;
        }

        // Return a, which will either be null or the intersection point
        return a;
    }
}
