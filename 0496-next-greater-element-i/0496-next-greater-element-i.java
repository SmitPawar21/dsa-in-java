class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for(int i=0; i<nums1.length; i++) {
            int n = -1;
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    n = j;
                    break;
                }
            }
            int k = n;
            if(k == nums2.length - 1) {
                nums1[i] = -1;
            }
            else {
                while(k < nums2.length) {
                    if(nums2[k] > nums2[n]) {
                        break;
                    }
                    k++;
                }
                if(k == nums2.length) {
                    nums1[i] = -1;
                }
                else {
                    nums1[i] = nums2[k];
                }
            }
        }

        return nums1;
    }
}