import java.util.HashSet;

public class Solution {
    public ListNode detectCycle(ListNode head) {

        HashSet<ListNode> set = new HashSet<>();

        ListNode current = head;

        while(current != null) {
            set.add(current);
            current = current.next;

            if(set.contains(current)) {
                return current;
            }
        }

        return null;
    }
}

/*

//test case : 1
        ListNode node0 = new ListNode(3);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(4);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        node3.next = node1;

        //test case : 2
//        ListNode node20 = new ListNode(1);
//        ListNode node21 = new ListNode(2);

        //test case : 3
//        ListNode node30 = new ListNode(1);



        Solution sol = new Solution();
        System.out.println(sol.detectCycle(node0).val);
 */