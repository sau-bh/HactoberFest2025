class Solution {
    public ArrayList<Integer> leaders(int[] nums) {
        int n = nums.length;


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(nums[n-1]);
        int j = n-1;

        for(int i = n-1;i>=0;i--){
            if(nums[i] > nums[j]){
                arr.add(nums[i]);
                j = i;
            }
        }
        Collections.reverse(arr);
        return arr;
        
    }
}
