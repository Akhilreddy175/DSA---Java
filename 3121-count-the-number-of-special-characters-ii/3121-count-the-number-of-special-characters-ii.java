class Solution {
    public int numberOfSpecialChars(String word) {
        char[] arr = word.toCharArray();
        int n = arr.length;

        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){

            if(map.containsKey(arr[i])){
                if(arr[i] >= 'A' && arr[i] <= 'Z'){
                    continue;
                }
            }

            map.put(arr[i],i);
        }

        int count = 0;

        for(int i=65;i<=90;i++){
            int upper = map.getOrDefault((char)i,-1);
            int u = i+32;
            int lower = map.getOrDefault((char)u,-1);

            if(upper != -1 && lower != -1 ){
                if(lower < upper){
                    count++;
                }
            }
        }
        return count;
    }
}