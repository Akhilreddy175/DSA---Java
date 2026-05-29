class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int left = 0;
        int right = k-1;

        
        int sum = 0;
        for(int i=left;i<=right;i++){
            sum += arr[i];
        }

        double avg = (double) sum / k;

        while(right<arr.length - 1){

            right++; // move right first
            sum += arr[right]; // add new element

            sum -= arr[left]; // remove old element
            left++;

            double tempavg = (double) sum / k;

            avg = Math.max(avg, tempavg);
        }

        return avg;
    }
}