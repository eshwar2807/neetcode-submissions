class Solution {
    public int characterReplacement(String s, int k) {
        int result = 0;
        int maxf = 0;
        int[] c = new int[26];
        int r = 0;
        for (int l = 0; l<s.length(); l++){
            c[s.charAt(l)-'A']++;
            maxf = Math.max(maxf,c[s.charAt(l)-'A']);
            while(l-r+1-maxf>k){
                c[s.charAt(r)-'A']--;
                r++;
            }
            result = Math.max(result, l-r+1);
        }
        return result;
    }
}
