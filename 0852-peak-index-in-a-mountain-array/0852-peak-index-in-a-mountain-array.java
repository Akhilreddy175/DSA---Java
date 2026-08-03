class Solution {
    public int peakIndexInMountainArray(int[] arr) {


        int peak = (0+arr.length-1)/2;

        while(peak<arr.length-1){

            if(arr[peak] > arr[peak-1] && arr[peak] > arr[peak+1]){
                return peak;
            }

            if(arr[peak] > arr[peak+1] && arr[peak] < arr[peak-1]){
                peak--;
            }

            if(arr[peak] < arr[peak+1] && arr[peak] > arr[peak-1]){
                peak++;
            }
        }

        return -1;
    }
}