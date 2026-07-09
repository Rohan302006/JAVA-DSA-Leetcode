class Solution 
{
    public int pairSum(ListNode head) 
    {
        List<Integer> arr = new ArrayList<>();

        ListNode curr = head;

        while (curr != null) 
        {
            arr.add(curr.val);
            curr = curr.next;
        }

        int result = 0;
        int i = 0, j = arr.size() - 1;

        while (i < j) 
        {
            result = Math.max(result, (arr.get(i) + arr.get(j)));
            i++;
            j--;
        }
        return result;
    }
}