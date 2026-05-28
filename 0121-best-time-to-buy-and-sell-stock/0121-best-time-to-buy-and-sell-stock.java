class Solution {
    public int maxProfit(int[] arr) {
        int min = arr[0];
        int bestp = 0;

        for(int i=0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }

            int todayp  = arr[i] - min;
            if(todayp > bestp){
                bestp = todayp;
            }
        }

        return bestp;
    }
}