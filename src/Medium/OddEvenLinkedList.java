package Medium;

public class OddEvenLinkedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public ListNode oddEvenList(ListNode node) {
        if(node==null){
            return null;
        }
        ListNode f=node;
        if(node.next==null){
            return node;
        }
        ListNode s=f.next;

        if(s.next==null){
            return node;
        }
        ListNode  t=s.next;

        ListNode marker =s;
        while(t!=null){
            f.next=s.next;
            s.next=t.next;
            f=t;
            s=t.next;
            if(t.next!=null&&t.next.next!=null){
                t=t.next.next;
            }else if(t.next==null){
                t=null;
            }

        }
        f.next=marker;
        return node;
    }
}
