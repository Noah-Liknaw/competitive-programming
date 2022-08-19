class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] countArray = new int[nums.length];
        for(int i=0;i< countArray.length;i++){
            countArray[i]=0;
            for(int j=0;j< nums.length;j++){
                if(nums[j] < nums[i]){
                    countArray[i]++;
                }
            }
        }

        return countArray;
    }
}