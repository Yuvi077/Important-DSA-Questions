class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int ans[]=new int[nums.length];
        Stack<Integer> s = new Stack <>();
        int n= nums.length;
        for(int i=2*n-1;i>=0;i--){
            while(!s.isEmpty() && nums[s.peek()]<=nums[i%n]){
                s.pop();
            }
            ans[i%n]= s.isEmpty()? -1 : nums[s.peek()];
            s.push(i%n);
        }
        return ans;
        
    }
}