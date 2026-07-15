class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> r = new HashMap<>();
        for (String s : strs){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String f = new String(c);
            r.putIfAbsent(f,new ArrayList<>());
            r.get(f).add(s);
        }
        return new ArrayList<>(r.values());
    }
}
