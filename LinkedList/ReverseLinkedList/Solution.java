package LinkedList.ReverseLinkedList;

class Solution {
    public ListNode reverseList(ListNode head) {

        // Check if the head is null and return null if so
        if(head == null) return null;

        // Make the current the next node
        ListNode current  = head.next;
        
        // Make the previous node the original head
        ListNode previous = head;

        // Set the original head's next node to null or the list will be circular
        previous.next = null;

        // Go through every node until the current node is null
        while(current != null) {

            // Preserve the next node
            ListNode next = current.next;

            // Set the current next node to the previous
            current.next = previous;

            // Set the previous to the current node
            previous = current;

            // Set the current node to the preserved next
            current = next;
        }

        // When current is null, the previous will be the new first node in the list
        return previous;
    }
}
