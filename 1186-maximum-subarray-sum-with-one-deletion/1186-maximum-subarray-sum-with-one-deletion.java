class Solution {
    public int maximumSum(int[] arr) {

        int nodelete = arr[0];
        int onedelete = Integer.MIN_VALUE;
        int res = arr[0];
        for(int i=1;i<arr.length;i++){

            int prevnodelete = nodelete;
            int prevonedelete = onedelete;

            nodelete = Math.max(arr[i], nodelete+arr[i]);

            int var;
            if(prevonedelete == Integer.MIN_VALUE){
                var = arr[i]; 
            }
            else{
                var = prevonedelete+arr[i];
            }

            onedelete = Math.max(var,prevnodelete);

            res = Math.max(res,Math.max(onedelete,nodelete));
        }

         return res;
    }
}