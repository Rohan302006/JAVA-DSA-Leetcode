class Solution 
{
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        Map<String, List<String>> map = new HashMap<>();
        for (String word : strs) 
        {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String sorted_charArray_String = new String(charArray);

            if (!map.containsKey(sorted_charArray_String)) 
            {
                map.put(sorted_charArray_String, new ArrayList<>());
            }
            
            map.get(sorted_charArray_String).add(word);
        }

        return new ArrayList<>(map.values());
    }
}