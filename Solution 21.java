class Solution {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode();
        dummy.next=head;
        swap(dummy);
        return dummy.next;
    }

    void swap(ListNode node){
        if(node==null){
            return;
        }

        ListNode first=node.next;
        ListNode second=null;
        if(first!=null){
            second=first.next;
        }

        if(second!=null){
            ListNode secondNext=second.next;
            second.next=first;
            node.next=second;
            first.next=secondNext;
            swap(first);
        }
    }
}
