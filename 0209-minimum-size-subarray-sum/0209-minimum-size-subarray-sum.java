class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        
        int left = 0;
        int right = 0;

        int sum=0;
        int minlen = Integer.MAX_VALUE;

        while(right <nums.length){
            sum += nums[right];

            while(sum >= target){
                int len = (right - left)+1;
                minlen = Math.min(len, minlen);
                sum = sum-nums[left];
                left++;
            }


            right++;
        }

        if(minlen == Integer.MAX_VALUE){
            return 0;
        }

        return minlen;
    }
}