class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        boolean result = true;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++)
        {
            if(map.containsKey(arr[i]))
            {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);
            }
        }

        HashMap<Integer, Integer> resultMap = new HashMap<>();
        for(int key : map.keySet())
        {
            if(resultMap.containsKey(map.get(key)))
            {
                result = false;
                break;
            }
            else
            {
                resultMap.put(map.get(key), 1);
            }
        }
        return result;
    }
}