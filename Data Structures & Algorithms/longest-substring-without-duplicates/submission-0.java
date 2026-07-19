class Solution {
    public int lengthOfLongestSubstring(String s) {
        int result = 0;
        int r = 0;
        Set<Character> hash = new HashSet<>();
        for (int l = 0; l<s.length(); l++){
            while(hash.contains(s.charAt(l))){
                hash.remove(s.charAt(r));
                r++;
            }
            hash.add(s.charAt(l));
            result = Math.max(result,l-r+1);

        }

        return result;}
    }
