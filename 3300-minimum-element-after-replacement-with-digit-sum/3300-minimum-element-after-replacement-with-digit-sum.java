class Solution {
    public int minElement(int[] arr) {
        int n = arr.length;

        for(int i=0;i<n;i++){
            int num = arr[i];
            int sum = 0;

            while(num > 0){
                int digit = num % 10;
                sum += digit;
                num = num/10;
            }

            arr[i] = sum;
        }

        Arrays.sort(arr);

        return arr[0];

    }
}