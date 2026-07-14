class Solution 
{
    public ListNode rotateRight(ListNode head, int k) 
    {

        if (head == null || k == 0)
            return head;

        ListNode tail = head;
        int len = 1;
        while (tail.next != null) 
        {
            len++;
            tail = tail.next;
        }

        if (k % len == 0)
            return head;

        k = k % len;

        tail.next = head;

        ListNode newLastNode = findNthLastNode(head, len - k);
        head = newLastNode.next;
        newLastNode.next = null;

        return head;
    }

    public ListNode findNthLastNode(ListNode head, int k) 
    {
        int count = 1;
        while (head != null) 
        {
            if (count == k)
            {
                return head;
            }
            count++;
            head = head.next;
        }
        return head;
    }
}