import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {

    public List<Character> preorderTraversal(TreeNode node) {
        List<Character> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack();

        stack.push(node);

        while (!stack.isEmpty()) {
            //Treenode node = stack.pop();
            list.add(stack.pop().val);

        }

        return list;
    }

//    public List<Character> preorderTraversal(TreeNode node) {
//        List<Character> list = new ArrayList<>();
//        if(node != null) {
//            list.add(node.val);
//            list.addAll(preorderTraversal(node.left));
//            list.addAll(preorderTraversal(node.right));
//        }
//        return list;
//    }
}

//class Solution {
//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        if(head.next == null) {
//            head = null;
//            return head;
//        }
//
//        ListNode start = new ListNode(0);
//        ListNode fast = start;
//        ListNode slow = start;
//        start.next = head;
//
//        for (int i = 0; i <= n; i++) {
//            fast = fast.next;
//        }
//
//        while (fast != null) {
//            fast = fast.next;
//            slow = slow.next;
//        }
//        slow.next = slow.next.next;
//
//        return start.next;
//    }
//}

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//        ListNode current = head;
//        if(head.next == null) {
//            head = null;
//            return head;
//        }
//
//        if(head.next.next == null) {
//            if(n==1){
//                head.next = null;
//            } else if(n==2){
//                head = head.next;
//
//            }
//            System.out.println(head.val);
//            return head;
//        }
//
//
//        loop:
//        while (current != null) {
//            ListNode cursor = current;
//            for (int i = 0; i <= n; i++) {
//                if(cursor.next != null) {
//                    cursor = cursor.next;
//                } else {
//                    current.next = current.next.next;
//                    break loop;
//                }
//            }
//            current = current.next;
//        }
//
//        return head;
//    }

//    public ListNode removeNthFromEnd(ListNode head, int n) {
//
//        ListNode current = head;
//        ListNode current3 = null;
//        loop:
//        while(current != null) {
//
//            ListNode current2 = current;
//            for (int i = 0; i <= 2; i++) {
//                if(current2.next != null) {
//                    current2 = current2.next;
//                } else {
//                    current = current.next.next;
//
//                }
//            }
//            current = current.next;
//
//        }
//
//        return null;
//    }
//}
