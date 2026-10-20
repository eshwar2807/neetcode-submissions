class MedianFinder {
    ArrayList<Integer> a = new ArrayList();
    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        a.add(num);
    }
    
    public double findMedian() {
        Collections.sort(a);
        int l = a.size();
        int m = l/2;
        if(m == l-m){
            return (a.get(m) + a.get(m-1))/2.0;
        }
        return (a.get(m));
    }
}
