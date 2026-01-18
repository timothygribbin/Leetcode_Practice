package HashTable.DetectLinkedListCycle;

import java.util.HashSet;
/**
 * TESTED ON LEETCODE DIRECTLY
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        // Check if the LinkedList is empty or 1 node, there can never be a cycle if so
        if(head == null || head.next == null) return false;
        
        // Create a HashSet for O(1) access of nodes
        HashSet<ListNode> set = new HashSet<>();

        // Iterate thorugh the linked list and add an unseen node to the HashSet if it's new, if it's the same as any node in the HashSet then there is a cycle because we are seeing a node again
        while(head != null) {
            // Add to the set if it's not already in there
            if(!set.contains(head)) {
                set.add(head);
                head = head.next;
            }
            // Return true because we are seeing a node for the second time
            else {
                return true;
            }
        }

        // If head ever == null, then there isn't a cycle
        return false;
    }
}