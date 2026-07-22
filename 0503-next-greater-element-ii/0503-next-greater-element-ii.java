class Solution {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];

        for(int i=0;i<n;i++){
            int j;
            if(i != n-1){
                j=i+1;
            }else{
                j=0;
            }
            
            while(j != i){

                if(arr[j]>arr[i]){
                    ans[i] = arr[j];
                    break;
                }else{
                    if(j == n-1){
                        j=0;
                    }else{
                        j++;
                    }
                }
            }

            if(i == j){
                ans[i] = -1;
            }
        }
        return ans;
    }
}