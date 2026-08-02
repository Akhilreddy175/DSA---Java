class Solution {
    public int maxPower(String s) {

        if(s.length() == 1){
            return 1;
        }
        
        int maxcount = 0;
        int count = 1;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)){
                count++;
            }
            else{
                if(count > maxcount){
                    maxcount = count;
                }
                count = 1;
            }
        }

        if(count > maxcount){
            return count;
        }
        return maxcount;
    }
}