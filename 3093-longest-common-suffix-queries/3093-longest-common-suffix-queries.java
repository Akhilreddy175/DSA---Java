import java.util.*;

class Solution {

    static class Node {
        Node[] next = new Node[26];
        int bestIndex = -1;
        int bestLen = Integer.MAX_VALUE;
    }

    Node root = new Node();

    private void update(Node node, int len, int idx) {
        if (node.bestIndex == -1 ||
            len < node.bestLen ||
            (len == node.bestLen && idx < node.bestIndex)) {
            node.bestLen = len;
            node.bestIndex = idx;
        }
    }

    private void insert(String word, int idx) {
        Node cur = root;
        int len = word.length();

        // IMPORTANT: update root too (empty suffix case)
        update(cur, len, idx);

        for (int i = word.length() - 1; i >= 0; i--) {
            int c = word.charAt(i) - 'a';
            if (cur.next[c] == null) {
                cur.next[c] = new Node();
            }
            cur = cur.next[c];
            update(cur, len, idx);
        }
    }

    private int query(String word) {
        Node cur = root;

        for (int i = word.length() - 1; i >= 0; i--) {
            int c = word.charAt(i) - 'a';
            if (cur.next[c] == null) break;
            cur = cur.next[c];
        }

        return cur.bestIndex; // always valid now
    }

    public int[] stringIndices(String[] wordsContainer, String[] wordsQuery) {

        for (int i = 0; i < wordsContainer.length; i++) {
            insert(wordsContainer[i], i);
        }

        int[] res = new int[wordsQuery.length];

        for (int i = 0; i < wordsQuery.length; i++) {
            res[i] = query(wordsQuery[i]);
        }

        return res;
    }
}