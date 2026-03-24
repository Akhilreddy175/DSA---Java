class Solution {
    public int lengthOfLongestSubstring(String s) {

        int left = 0;
        int maxlen = 0;

        HashMap<Character, Integer> map = new HashMap<>();

        for(int right=0;right<s.length();right++){
            char in = s.charAt(right);

            map.put(in,map.getOrDefault(in,0)+1);
            while(map.get(in) > 1){
                char out = s.charAt(left);
                map.put(out, map.get(out)-1);
                if(map.get(out) == 0){
                    map.remove(out);
                }
                left++;
            }

            maxlen = Math.max(maxlen, (right-left) + 1);
        }

        return maxlen;
    }
}