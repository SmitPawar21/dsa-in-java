class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {

        List<List<Integer>> list = new ArrayList<>();

        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for(int i=0; i<nums1.length; i++)
        {
            set1.add(nums1[i]);
        }
        for(int i=0; i<nums2.length; i++)
        {
            set2.add(nums2[i]);
        }

        List<Integer> answer1 = new ArrayList<>();
        for(int element : set1)
        {
            if(!set2.contains(element))
            {
                answer1.add(element);
            }
        }

        List<Integer> answer2 = new ArrayList<>();
        for(int element : set2)
        {
            if(!set1.contains(element))
            {
                answer2.add(element);
            }
        }

        list.add(answer1);
        list.add(answer2);

        return list;
    }
}