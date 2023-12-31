//https://leetcode.com/problems/swap-nodes-in-pairs/description/
package Questions;

public class swapNodes {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prev=dummy;
        while (head!=null && head.next!=null)
        {
            ListNode firstNode=head;
            ListNode secondNode=head.next;

            prev.next=secondNode;
            firstNode.next=secondNode.next;
            secondNode.next=firstNode;

            prev=firstNode;
            head=firstNode.next;
        }
        return dummy.next;
    }
}
