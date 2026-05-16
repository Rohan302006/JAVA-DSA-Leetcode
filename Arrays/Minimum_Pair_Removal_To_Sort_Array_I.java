class Solution {
    public int minimumPairRemoval(int[] nums) {
        int count = 0;
        List<Integer> arr = new ArrayList<>();

        for (int n : nums) {
            arr.add(n);
        }

        while (!isSorted(arr)) {
            int MinSum = Integer.MAX_VALUE;
            int index = 0;
            for (int i = 0; i < arr.size() - 1; i++) {
                int sum = arr.get(i) + arr.get(i + 1);

                if (sum < MinSum) {
                    MinSum = sum;
                    index = i;
                }
            }

            arr.set(index, MinSum);

            arr.remove(index + 1);

            count++;
        }
        return count;
    }

    private boolean isSorted(List<Integer> arr) {
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i) < arr.get(i - 1)) {
                return false;
            }
        }
        return true;
    }
}