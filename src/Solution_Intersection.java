import java.util.HashSet;

public class Solution_Intersection {
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


/*

public class Main {
    public static void main(String[] args) {
        //A node
        ListNode node0 = new ListNode(0);
        ListNode node1 = new ListNode(1);


        //B node
        ListNode node00 = new ListNode(0);
        ListNode node01 = new ListNode(1);
        ListNode node02 = new ListNode(2);

        //common node
        ListNode node10 = new ListNode(0);
        ListNode node11 = new ListNode(1);
        ListNode node12 = new ListNode(2);

        node0.next = node1;

        node00.next = node01;
        node01.next = node02;

        node1.next = node10;
        node02.next = node10;

        node10.next = node11;
        node11.next = node12;

        Solution sol = new Solution();
        sol.getIntersectionNode(node0,node10);


    }
}

 */