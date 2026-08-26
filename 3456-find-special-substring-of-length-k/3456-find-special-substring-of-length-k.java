class Solution {
    public boolean hasSpecialSubstring(String s, int k) {

        char[] a = s.toCharArray();

        int left = 0;
        int right = k - 1;

        while (right < a.length) {

            int i = left;
            boolean valid = true;

            // Check all k characters are the same
            while (i <= right) {
                if (a[i] != a[left]) {
                    valid = false;
                    break;
                }
                i++;
            }

            if (valid) {

                // Check character before the substring
                if (left != 0 && a[left] == a[left - 1]) {
                    valid = false;
                }

                // Check character after the substring
                if (right != a.length - 1 && a[right] == a[right + 1]) {
                    valid = false;
                }

                if (valid) {
                    return true;
                }
            }

            left++;
            right++;
        }

        return false;
    }
}