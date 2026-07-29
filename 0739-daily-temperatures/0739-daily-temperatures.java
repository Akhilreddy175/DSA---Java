class Solution {
    public int[] dailyTemperatures(int[] arr) {

        int n = arr.length;
        int[] ans = new int[n];
        int i = n-1;
        ans[i] = 0;

        if(n == 1){
            return ans;
        }
        
        Stack<Integer> stack = new Stack<>();
        stack.push(i--);

        while(i >= 0){
            
            int top = arr[stack.peek()];
            if(top > arr[i]){
                ans[i] = stack.peek() - i;
                stack.push(i);
                i--;
            }else{
                stack.pop();
                if(stack.empty()){
                    ans[i] = 0;
                    stack.push(i);
                    i--;
                }
            }
        }

        return ans;
    }
}