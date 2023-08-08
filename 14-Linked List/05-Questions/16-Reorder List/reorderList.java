//https://leetcode.com/problems/reorder-list/
package Questions;

public class reorderList {
    public class ListNode {
      int val;
      ListNode next;
    ListNode() {}
      ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    public ListNode middleNode(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        while (fast!=null && fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public ListNode reverseList(ListNode head)
    {
        ListNode prev=null;
        ListNode current=head;
        ListNode nxt=null;
        while(current!=null)
        {
            nxt=current.next;
            current.next=prev;
            prev=current;
            current=nxt;
        }
        head=prev;
        return head;
    }
    public void reorderList(ListNode head) {
        if(head==null || head.next==null) return;
        ListNode mid=middleNode(head);
        ListNode hs=reverseList(mid);
        ListNode hf=head;
        while (hs!=null || hf!=null)
        {
            ListNode temp=hf.next;
            hf.next=hs;
            hf=temp;
            temp=hs.next;
            hs.next=hf;
            hs=temp;

        }
        if(hf!=null)
        {
            hf.next=null;
        }
    }

}
