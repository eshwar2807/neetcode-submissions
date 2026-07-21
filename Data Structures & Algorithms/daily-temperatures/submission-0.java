class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> temp = new ArrayDeque <> ();
        int[] result = new int[temperatures.length];
        for (int i = 0; i<temperatures.length; i++){
            while ( !temp.isEmpty() && temperatures[i]>temperatures[temp.peek()] ){
                int p = temp.pop();
                result[p] = i-p;
            }
            temp.push(i);
        }
        return result;
    }
}
