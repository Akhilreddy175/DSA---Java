class Solution {
    public int lengthOfLongestSubstring(String s) {

       HashMap<Character, Integer> map = new HashMap<>();

       int left = 0;
       int maxlen = 0;

       for(int right = 0;right < s.length();right++){

            char rightchar = s.charAt(right);

            if(map.get(rightchar) == null){
                map.put(rightchar, 1);
            }
            else{
                map.put(rightchar, map.get(rightchar) + 1);
            }

            while(map.get(rightchar) > 1){
                char leftchar = s.charAt(left);
                map.put(leftchar,map.get(leftchar)-1);

                left++;
            }

            maxlen = Math.max(maxlen, right - left +1);
       }

       return maxlen;
    }
}