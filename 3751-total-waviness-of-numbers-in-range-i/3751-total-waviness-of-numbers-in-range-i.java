class Solution {
    public int totalWaviness(int num1, int num2) {
        int totalWavinessSum = 0;
        
        // Iterate through every number in the inclusive range
        for (int i = num1; i <= num2; i++) {
            totalWavinessSum += calculateWaviness(i);
        }
        
        return totalWavinessSum;
    }
    
    // Helper method to compute waviness for a single number
    private int calculateWaviness(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        
        // Any number with fewer than 3 digits has a waviness of 0
        if (len < 3) {
            return 0;
        }
        
        int waviness = 0;
        
        // First and last digits cannot be peaks or valleys
        for (int i = 1; i < len - 1; i++) {
            char current = s.charAt(i);
            char prev = s.charAt(i - 1);
            char next = s.charAt(i + 1);
            
            // Check for Peak: strictly greater than both neighbors
            if (current > prev && current > next) {
                waviness++;
            }
            // Check for Valley: strictly less than both neighbors
            else if (current < prev && current < next) {
                waviness++;
            }
        }
        
        return waviness;
    }
}