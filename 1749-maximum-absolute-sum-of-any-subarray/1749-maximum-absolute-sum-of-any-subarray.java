class Solution {
    public int maxAbsoluteSum(int[] arr) {

        int bestmaxend = arr[0];
        int bestminend = arr[0];
        int maxsum = arr[0];
        int minsum = arr[0];
        int res = Math.abs(arr[0]);

        for(int i=1;i<arr.length;i++){
            
            int r1 = arr[i];
            int r2 = bestmaxend + arr[i];

            int r3 = bestminend + arr[i];
            bestmaxend = Math.max(r1,r2);
            bestminend = Math.min(r1,r3);

            maxsum = Math.max(maxsum,bestmaxend);
            minsum = Math.min(minsum,bestminend);

            res = Math.max(res,Math.max(maxsum,Math.abs(minsum)));
        }

        return res;
    }
}