class Solution {
    public boolean isHappy(int n) {

        int sum = 0;
        HashSet<Integer> set = new HashSet<>();

        while(n > 0){
            int digit = n%10;
            sum = sum+digit*digit;

            n = n/10;
        }

        if(sum == 1)
            return true;
        
        while(set.add(sum)){
            int m = sum;
            sum = 0;
            while(m > 0){
                int digit = m%10;
                sum = sum+digit*digit;
                m = m/10;
            }

            if(sum == 1)
                return true;
        }

        return false;

    }
}