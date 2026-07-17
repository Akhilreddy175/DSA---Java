class Solution {
    public boolean isPowerOfTwo(int n) {

        if(n <= 0){
            return false;
        }

        while(n%2 == 0){
            n = n/2;
        }
        /*
        int count = 0;
        for(int i=0;i<n;i++){
            if(Math.pow(2,i) == n){
                count++;
            }
        }

        if(count==1){
            return true;
        }
*/
        return n==1;
    }
}