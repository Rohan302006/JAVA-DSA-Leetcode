class Solution 
{ 
    public boolean closeStrings(String word1, String word2) 
    {

        if (word1.length() != word2.length()) 
        {
            return false;
        }

        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char ch : word1.toCharArray()) 
        {
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        }

        for (char ch : word2.toCharArray()) 
        {
            map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        }

        Set<Character> set1 = new HashSet<>(map1.keySet());
        Set<Character> set2 = new HashSet<>(map2.keySet());

        if (!set1.equals(set2)) 
        {
            return false;
        }

        List<Integer> freq1 = new ArrayList<>(map1.values());
        List<Integer> freq2 = new ArrayList<>(map2.values());

        Collections.sort(freq1);
        Collections.sort(freq2);

        return freq1.equals(freq2);
    }
}