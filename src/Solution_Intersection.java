import java.util.HashSet;

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode current = headA;
        HashSet<ListNode> set = new HashSet<>();

        while (current != null) {
            set.add(current);
            current = current.next;
        }


        ListNode currentB = headB;
        while (currentB != null) {
            if(set.contains(currentB)) {

                return currentB;
            }
            currentB = currentB.next;
        }


        return null;
    }
}