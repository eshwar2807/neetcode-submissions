class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> maps = new HashMap<>();
        Map<Character, Integer> mapt = new HashMap<>();
        if (s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            if(maps.containsKey(c)){
                int count = maps.get(c);
                maps.put(c, ++count);
            }else{
                maps.put(c,1);
            }
            
        }
        for(int i=0; i<t.length(); i++){
            char c = t.charAt(i);
            if(mapt.containsKey(c)){
                int count = mapt.get(c);
                mapt.put(c, ++count);
            }else{
                mapt.put(c,1);

            }
        }
        return maps.equals(mapt);

    }}

