class Solution {
    public int fib(int n) {

        if(n <=1){
            return n;
        }

        HashMap<Integer,Integer> map = new HashMap<>();

        int pre = 0;
        int curr = 1;

        for(int i=2;i<=n;i++){
            int next = pre + curr;
            pre = curr;
            curr = next;

            map.put(i,curr);
        }

        return map.get(n);

    }
}