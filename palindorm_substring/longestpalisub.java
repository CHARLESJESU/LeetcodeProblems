package palindorm_substring;

import java.util.ArrayList;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> a = new ArrayList<>();

        // Add all elements from both arrays to list
        for (int i = 0; i < nums1.length; i++) {
            a.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            a.add(nums2[i]);
        }

        // Remove duplicates manually
        ArrayList<Integer> b = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            if (!b.contains(a.get(i))) {
                b.add(a.get(i));
            }
        }

        // Sort the list manually (Bubble sort)
        for (int i = 0; i < b.size() - 1; i++) {
            for (int j = i + 1; j < b.size(); j++) {
                if (b.get(i) > b.get(j)) {
                    int temp = b.get(i);
                    b.set(i, b.get(j));
                    b.set(j, temp);
                }
            }
        }

        // Find median
        int n = b.size();
        if (n == 0) return 0.0; // Handle edge case if array is empty

        if (n % 2 == 1) {
            return b.get(n / 2); // odd length
        } else {
            return (b.get(n / 2 - 1) + b.get(n / 2)) / 2.0; // even length
        }
    }
}

public class longestpalisub {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        double result = s.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median: " + result);
    }
}
