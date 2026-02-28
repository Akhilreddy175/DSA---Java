class Solution {
    public int maxArea(int[] height) {

        int l = 0;
        int r = height.length-1;
        int maxare = 0;

        while(l < r){

            int h = Math.min(height[l],height[r]);
            int w = r - l;

            int area = h*w;

            maxare = Math.max(maxare,area);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }

        return maxare;
    }
}