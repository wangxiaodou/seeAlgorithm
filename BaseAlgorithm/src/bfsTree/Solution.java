package bfsTree; /**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.*;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    List<ListNode> res = new LinkedList<>();
    public ListNode[] listOfDepth(TreeNode tree) {
        if (tree == null) return null;
        ListNode head = new ListNode(tree.val);
        res.add(head);
        bfs(tree,new ListNode(-1));
        System.out.print(res);
        Queue<TreeNode> queue = new LinkedList<>();
        Stack stack= new Stack();
        TreeNode treeNode =  ((LinkedList<TreeNode>) queue).removeFirst();
        return res.toArray(new ListNode[]{});
    }
    // 深度有限遍历
    public void bfs(TreeNode tree,ListNode head){
        if (tree == null) return;
        ListNode tempHead = head;
        ListNode newNode = null;
        if(tree.left != null){
            ListNode temp = new ListNode(tree.left.val);
            tempHead.next = temp;
            tempHead = tempHead.next;
            newNode = new ListNode(-1);
            bfs(tree.left,newNode);
        }
        if(tree.right != null){
            ListNode temp = new ListNode(tree.right.val);
            tempHead.next=temp;
            tempHead = tempHead.next;
            if (newNode == null){
                 newNode = new ListNode(-1);
                bfs(tree.left,newNode);
            }
        }

        bfs(tree.right,newNode);
        res.add(head.next);

    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        tree.left = left;
        tree.right = right;
        TreeNode left1 = new TreeNode(4);
        TreeNode left2 = new TreeNode(5);
        left.left = left1;
        left.right = left2;
        TreeNode right2 = new TreeNode(7);
        right.right = right2;
        TreeNode left11 = new TreeNode(8);
        left1.left = left11;
        new Solution().zigzagLevelOrder(tree);
    }

        public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            LinkedList<List<Integer>> res = new LinkedList<List<Integer>>();
            StringBuffer sb = new StringBuffer();
            sb.reverse();
            if(root == null) return res;
            Queue<TreeNode> queue = new LinkedList<TreeNode>();
            LinkedList<Integer> sub = null;
            queue.add(root);
            boolean  isFromLeft = false;
            TreeNode temp = null;
            while(!queue.isEmpty()){
                sub = new LinkedList<Integer>();
                int size = queue.size();
                for(int i = 0;i < size ; i++){
                    temp = queue.poll();
                    sub.add(temp.val);
                    if(isFromLeft){
                        if(temp.left != null){
                            queue.add(temp.left);
                        }
                        if(temp.right != null){
                            queue.add(temp.right);
                        }
                    }else{
                        if(temp.right != null){
                            queue.add(temp.right);
                        }
                        if(temp.left != null){
                            queue.add(temp.left);
                        }
                    }
                }
                res.add(sub);
                isFromLeft = !isFromLeft;
            }

            return res;
        }
}