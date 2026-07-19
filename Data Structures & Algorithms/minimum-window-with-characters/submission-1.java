class Solution {
    public String minWindow(String s, String t) {
        int bestlength = Integer.MAX_VALUE;
        int beststart = 0;
        int have = 0;
        int r = 0;
        Map<Character,Integer> need = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();
        for (int i = 0; i<t.length(); i++){
            need.put(t.charAt(i),need.getOrDefault(t.charAt(i),0)+1);
        }
        int required = need.size();
        for (int l = 0; l<s.length(); l++){
            char left = s.charAt(l);
            window.put(left,window.getOrDefault(left,0)+1);
            if(need.containsKey(left) && window.get(left).intValue()==need.get(left).intValue()){
                have++;
            }
            while(have==required){
                if(l-r+1<bestlength){
                    bestlength = l-r+1;
                    beststart = r;
                }
                char right = s.charAt(r);
                window.put(right,window.get(right)-1);
                if(need.containsKey(right) && window.get(right).intValue()<need.get(right).intValue()){
                have--;
            }
            r++;
            }
        }
        return bestlength == Integer.MAX_VALUE ? "" : s.substring(beststart,beststart+bestlength);
    }
}
