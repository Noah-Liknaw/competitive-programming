class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0,j=0,temp,numOfelements;
        while(j<nums.length){
            if(nums[j] > nums[i]){
                i++;
                //swap
                temp=nums[i];
                nums[i]=nums[j];
                nums[j]= temp;
            }
            j++;
        }
        numOfelements = i+1;
        return numOfelements;
    }
}