public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        //F,B,A,D,C,E,G,I,H

        TreeNode f = new TreeNode('F'); //F,B,G,A,D,I,C,E,H
        TreeNode b = new TreeNode('B');
        TreeNode g = new TreeNode('G');
        TreeNode a = new TreeNode('A');
        TreeNode d = new TreeNode('D');
        TreeNode i = new TreeNode('I');
        TreeNode c = new TreeNode('C');
        TreeNode e = new TreeNode('E');
        TreeNode h = new TreeNode('H');

        f.left = b;
        f.right = g;

        b.left = a;
        b.right = d;

        d.left = c;
        d.right = e;

        g.right = i;

        i.left = h;

        System.out.println(sol.preorderTraversal(f));


//        ListNode node5 = new ListNode(5);
//        ListNode node4 = new ListNode(4,node5);
//        ListNode node3 = new ListNode(3,node4);
//        ListNode node2 = new ListNode(2,node3);
//        ListNode node1 = new ListNode(1,node2);
//
//        sol.removeNthFromEnd(node1, 2);
    }
}
