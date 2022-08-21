class Solution {
    public void sortColors(int[] nums) {
        int j,temp;
        for(int i=1;i<nums.length;i++){
            j=i;
            while(j>0 && nums[j-1] > nums[j]){
                temp=nums[j];
                nums[j]=nums[j-1];
                nums[j-1]=temp;
                j=j-1;
            }
        }
    }
}