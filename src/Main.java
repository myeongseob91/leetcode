public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();

        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4,node5);
        ListNode node3 = new ListNode(3,node4);
        ListNode node2 = new ListNode(2,node3);
        ListNode node1 = new ListNode(1,node2);

        sol.removeNthFromEnd(node1, 2);
    }
}
