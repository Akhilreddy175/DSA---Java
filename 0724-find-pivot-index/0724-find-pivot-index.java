class Solution {
    public int pivotIndex(int[] arr) {
        int total = 0;

        for (int num : arr) {
            total += num;
        }

        int leftSum = 0;

        for (int i = 0; i < arr.length; i++) {
            int rightSum = total - leftSum - arr[i];

            if (leftSum == rightSum) {
                return i;
            }

            leftSum += arr[i];
        }

        return -1;
    }
}