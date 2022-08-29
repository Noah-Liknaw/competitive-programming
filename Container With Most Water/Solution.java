class Solution {
    public int maxArea(int[] height) {
        int l=0,r=height.length-1,maxArea=0;
        while(l <= r){
            maxArea = Math.max(Math.min(height[l],height[r]) * (r-l),maxArea);
            if(height[l] >= height[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return maxArea;
    } 
}