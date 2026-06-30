class Solution {
    public long countCompleteDayPairs(int[] hours) {

        Map<Integer, Integer> map = new HashMap<>();
        long ans = 0;

        for (int h : hours) {
            int rem = h % 24;
            int complement = (24 - rem) % 24;
            
            ans += map.getOrDefault(complement, 0);
            map.put(rem, map.getOrDefault(rem, 0) + 1);
        }
        return ans;
    }
}