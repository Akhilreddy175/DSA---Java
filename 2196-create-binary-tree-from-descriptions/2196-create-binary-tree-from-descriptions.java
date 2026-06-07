import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        Map<Integer, TreeNode> map = new HashMap<>();
        Set<Integer> children = new HashSet<>();

        for (int[] d : descriptions) {
            int parentVal = d[0];
            int childVal = d[1];
            boolean isLeft = d[2] == 1;

            map.putIfAbsent(parentVal, new TreeNode(parentVal));
            map.putIfAbsent(childVal, new TreeNode(childVal));

            TreeNode parentNode = map.get(parentVal);
            TreeNode childNode = map.get(childVal);

            if (isLeft) {
                parentNode.left = childNode;
            } else {
                parentNode.right = childNode;
            }

            children.add(childVal);
        }

        for (int parentVal : map.keySet()) {
            if (!children.contains(parentVal)) {
                return map.get(parentVal);
            }
        }

        return null;
    }
}