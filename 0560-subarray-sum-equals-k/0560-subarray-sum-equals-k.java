class Solution {
    public int subarraySum(int[] arr, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);

        int i = 0;
        int sum = 0;
        int count = 0;

        while(i<arr.length){
            sum = sum+arr[i];
            int temp = sum - k;

            if(map.containsKey(temp)){
                count += map.get(temp);
            }

            map.put(sum,map.getOrDefault(sum,0)+1);
            i++;
        }

        return count;
    }
}