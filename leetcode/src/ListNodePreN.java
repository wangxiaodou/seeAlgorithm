import java.util.List;

/**
 * 反转前N个节点
 */
public class ListNodePreN {

    ListNode successor = null;
    public ListNode reverse(ListNode head,int n){
        // 思路快慢指针找到那个点，然后
        if(head == null || n == 1) {
            successor = head.next;
            return head;
        }

        ListNode temp = reverse(head.next,n-1);
        head.next.next = head;
        head.next = successor;
        return temp;
    }

    public static void main(String[] args) {
        ListNode listNode5 = new ListNode(5,null);
        ListNode listNode4 = new ListNode(4,listNode5);
        ListNode listNode3 = new ListNode(3,listNode4);
        ListNode listNode2 = new ListNode(2,listNode3);
        ListNode listNode = new ListNode(1,listNode2);
        ListNode listNode1 = new ListNodePreN().reverse(listNode,2,4);

        while(listNode1 != null){
            System.out.println(listNode1.val);
            listNode1 = listNode1.next;
        }
    }


    public ListNode reverse(ListNode head,int m, int n){
        // 思路快慢指针找到那个点，然后
        if(m == 1) {
            return reverse(head,n);
        }
        head.next = reverse(head.next,m-1,n-1);
        return head;
    }

}
