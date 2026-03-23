class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        int left = 0;
        int right = s.length() - 1;

        while(left < right){

            char LC = s.charAt(left);
            char RC = s.charAt(right);

            if(!Character.isLetterOrDigit(LC)){
                left++;
                continue;
            }

            if(!Character.isLetterOrDigit(RC)){
                right--;
                continue;
            }

            if(Character.toLowerCase(LC) != Character.toLowerCase(RC)){
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}