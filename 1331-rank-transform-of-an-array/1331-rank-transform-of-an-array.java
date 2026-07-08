class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int temp[]=arr.clone();
        Arrays.sort(temp);
        HashMap<Integer,Integer>map=new HashMap<>();
        int rank=1;
        for(int nums:temp){
            if(!map.containsKey(nums)){
                map.put(nums,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        return arr;
    }
}