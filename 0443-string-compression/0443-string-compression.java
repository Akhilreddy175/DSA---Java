class Solution {
    public int compress(char[] chars) {

        int count = 1;
        int write = 0;

        for (int i = 0; i < chars.length - 1; i++) {

            if (chars[i] == chars[i + 1]) {
                count++;
            } else {

                // Write character
                chars[write++] = chars[i];

                // Write count if greater than 1
                if (count > 1) {
                    String s = String.valueOf(count);

                    for (char c : s.toCharArray()) {
                        chars[write++] = c;
                    }
                }

                count = 1;
            }
        }

        // Process the last group
        chars[write++] = chars[chars.length - 1];

        if (count > 1) {
            String s = String.valueOf(count);

            for (char c : s.toCharArray()) {
                chars[write++] = c;
            }
        }

        return write;
    }
}