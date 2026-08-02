class Solution {
    public String decodeString(String s) {
        
        StringBuilder ans = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        for(char ch:s.toCharArray()){

            if(ch != ']'){
                stack.push(ch);
                continue;
            }else{
                StringBuilder str = new StringBuilder();
                // while(!(Character.isDigit(stack.peek()))){
                //     str.append(stack.pop());
                // }
                while(stack.peek() != '['){
                    str.append(stack.pop());
                }
                stack.pop();
                str.reverse();

                //char c = stack.pop();
                //int num = c - '0';

                StringBuilder numStr = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    numStr.append(stack.pop());
                }

                numStr.reverse();
                int num = Integer.parseInt(numStr.toString());
                
                while(num > 0){
                    for (char c : str.toString().toCharArray()) {
                        stack.push(c);
                    }
                    num--;
                }
            }
        }

        while (!stack.isEmpty()) {
            ans.append(stack.pop());
        }

        return ans.reverse().toString();
    }
}