class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        int i=0;

        while(i<s.length()){

            char ch = s.charAt(i);

            if(stack.isEmpty()){
                stack.push(ch);
                i++;
                continue;
            }

            char top = stack.peek();

            if(top == ch){
                stack.pop();
                i++;
                continue;
            }
            stack.push(ch);
            i++;
        }

        StringBuilder str = new StringBuilder();
        for(char ch:stack){
            str.append(ch);
        }
        return str.toString();
    }
}