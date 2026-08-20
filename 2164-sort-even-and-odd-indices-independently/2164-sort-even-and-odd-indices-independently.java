class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if(n == 2){
            return nums;
        }

        int[] odd = new int[n/2];
        int[] even = new int[(n+1)/2];

        int e = 0;
        int o = 0;

        for(int i=0;i<n;i++){
            if(i%2 == 0){
                even[e] = nums[i];
                e++;
            }else{
                odd[o] = nums[i];
                o++;
            }
        }

        Arrays.sort(even);
        Arrays.sort(odd);

        int[] result = new int[n];

        int i=0;
        int j=odd.length-1;
        int k=0;

        while(i<even.length && j >=0){
            result[k] = even[i];
            i++;
            k++;
            result[k] = odd[j];
            k++;
            j--;
        }

        while(i<even.length){
            result[k] = even[i];
            i++;
            k++;
        }

        while(j >= 0){
            result[k] = odd[j];
            k++;
            j--;
        }

        return result;
    }
}