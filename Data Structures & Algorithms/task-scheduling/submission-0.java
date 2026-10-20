class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] array = new int[26];
        PriorityQueue<Integer> heap = new PriorityQueue<>((a,b)->b-a);
        Queue<int[]> q = new ArrayDeque<>();
        int time = 0;
        for(char i : tasks){
            array[i-'A']++;
        }
        for(int i : array){
            if (i!=0){
                heap.offer(i);
            }
        }
        while(!heap.isEmpty() || !q.isEmpty()){
            ++time;
            if(!heap.isEmpty()){
                int t = heap.poll()-1;
            if(t > 0 ){
                q.offer(new int[]{t,time+n});
            }
            }
            if(!q.isEmpty() && q.peek()[1]==time){
                heap.offer(q.poll()[0]);
            }
        }
        return time;
    }
}
