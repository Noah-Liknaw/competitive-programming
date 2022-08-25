class Solution {
    public int[] rearrangeArray(int[] nums) {
        Arrays.sort(nums);
        int temp;
        if(nums.length%2 == 0){
            for(int i=0;i<nums.length;i=i+2){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        else{
            for(int i=0;i<nums.length-2;i=i+2){
                temp=nums[i];
                nums[i]=nums[i+1];
                nums[i+1]=temp;
            }
        }
        return nums;
    }
}