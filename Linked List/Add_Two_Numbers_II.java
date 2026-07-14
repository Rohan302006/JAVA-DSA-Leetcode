class Solution 
{
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) 
    {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        while (l1 != null) 
        {
            s1.push(l1.val);
            l1 = l1.next;
        }

        while (l2 != null) 
        {
            s2.push(l2.val);
            l2 = l2.next;
        }

        int sum = 0;
        int carry = 0;
        ListNode ans = null;

        while (!s1.isEmpty() || !s2.isEmpty() || carry != 0) 
        {
            sum = carry;
            if (!s1.isEmpty()) 
            {
                sum += s1.peek();
                s1.pop();
            }

            if (!s2.isEmpty()) 
            {
                sum += s2.peek();
                s2.pop();
            }

            ListNode newNode = new ListNode(sum % 10);
            newNode.next = ans;
            ans = newNode;
            carry = sum / 10;

        }
        return ans;
    }
}