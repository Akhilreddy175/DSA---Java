class Solution {
    public String minWindow(String s, String t) {

        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();

        // Frequency required from t
        for (char ch : t.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;

        int formed = 0;
        int required = need.size();

        int minLen = Integer.MAX_VALUE;
        int start = 0;

        while (right < s.length()) {

            char ch = s.charAt(right);

            // Add current character to window
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            // Character requirement satisfied
            if (need.containsKey(ch) &&
                window.get(ch).intValue() == need.get(ch).intValue()) {

                formed++;
            }

            // Window is valid
            while (formed == required) {

                // Update minimum
                if (right - left + 1 < minLen) {
                    minLen = right - left + 1;
                    start = left;
                }

                // Remove left character
                char leftChar = s.charAt(left);

                window.put(leftChar, window.get(leftChar) - 1);

                if (need.containsKey(leftChar) &&
                    window.get(leftChar) < need.get(leftChar)) {

                    formed--;
                }

                left++;
            }

            right++;
        }

        if (minLen == Integer.MAX_VALUE) {
            return "";
        }

        return s.substring(start, start + minLen);
    }
}






















/*class Solution {
    public String minWindow(String s, String t) {

        if(s.length() < t.length()){
            return "";
        }

        //char[] arr = s.toCharArray();

        int left = 0;
        int right = t.length()-1;

        int minlen = Integer.MAX_VALUE;

        while(right < s.length()){

            while((right-left)+1 >= t.length()){
                String sub = s.substring(left,right+1);

                boolean valid = true;

                for(char ch : t.toCharArray()){
                    
                    if(sub.indexOf(ch) < 0){
                        valid = false;
                    }
                }

                if(valid){
                    int len = sub.length();
                    minlen = Math.min(len,minlen);
                    left++;
                }
                else{
                    right++;
                }
            }

            right++;
        }

        if((right-left)+1 >= t.length()){
            return s.substring(left,right+1);
        }

        return "";
    }
}*/


