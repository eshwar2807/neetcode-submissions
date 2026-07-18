class Solution {
    public int maxArea(int[] heights) {
        int area = 0;
        int indexLeft = 0;
        int indexRight = heights.length-1;
        while(indexLeft<indexRight){
            int height = Math.min(heights[indexLeft], heights[indexRight]);
           area = Math.max(area, (indexRight-indexLeft)*height);
            if(heights[indexLeft]<heights[indexRight]){
                    ++indexLeft;
            }else{
                --indexRight;
            }
        }
        return area;

    }
}
