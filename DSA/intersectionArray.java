import java.util.ArrayList;
import java.util.List;
//leetcode soln
class intersectionArray {
    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> l = new ArrayList<>();

        for (int val : nums1) {
            boolean found = false;

            for (int x : nums2) {
                if (x == val) {
                    found = true;
                    break;
                }
            }

            if (found && !l.contains(val)) {
                l.add(val);
            }
        }

        int[] arr = new int[l.size()];

        for (int i = 0; i < l.size(); i++) {
            arr[i] = l.get(i);
        }

        return arr;
    }
}
