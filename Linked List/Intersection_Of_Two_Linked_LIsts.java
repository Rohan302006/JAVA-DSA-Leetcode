public class Solution 
{
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) 
    {

        ListNode pointer1 = headA;
        ListNode pointer2 = headB;

        while (pointer1 != pointer2) 
        {
            if (pointer1 == null) 
            {
                pointer1 = headB;
            } 
            else 
            {
                pointer1 = pointer1.next;
            }

            if (pointer2 == null) 
            {
                pointer2 = headA;
            } 
            else 
            {
                pointer2 = pointer2.next;
            }
        }
        return pointer2;
    }
}