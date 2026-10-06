class Solution {
    public int lengthOfLongestSubstring(String s) {
      Map<Character, Integer> hm = new HashMap<>();
      int i = 0;
      int l = 0;
      int count = 0;
      for(char c : s.toCharArray()){
        if(hm.containsKey(c) && hm.get(c)>=l){
            l = hm.get(c)+1;
        }
        hm.put(c,i);
        i++;
        count = Math.max(count,i-l);
      }
      return count;
    }

}
