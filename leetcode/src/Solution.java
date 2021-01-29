import java.util.HashSet;
import java.util.Set;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    Set<Integer> set = new HashSet<Integer>();
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        ListNode pre = head;
        set.add(head.val);

        ListNode cur = head.next;
        while(cur != null){
            if (set.contains(cur.val)){
                pre.next = getNextVailNode(cur);
            }else{
                set.add(cur.val);
            }
            cur = cur.next;
            pre = cur;

        }
        return head;
    }

    public ListNode getNextVailNode(ListNode cur){
        if (cur == null) return cur;
        ListNode temp = cur.next;
        while(temp != null){
            if (!set.contains(temp.val)){
                set.add(temp.val);
                return temp;
            }
            temp = temp.next;
        }
        return temp;

    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(2);
        listNode.next = listNode1;
        ListNode listNode2 = new ListNode(2);
        listNode1.next = listNode2;
        new Solution().deleteDuplicates(listNode);
    }


}