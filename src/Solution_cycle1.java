import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;

        while(current != null) {
            set.add(current);
            current = current.next;

            if(set.contains(current)) {
                return true;
            }
        }

        return false;
    }
}