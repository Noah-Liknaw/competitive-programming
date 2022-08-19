class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> result = new ArrayList<>();
        // Sorted list using selection sort
        int min;
        int temp;
        for(int k=0;k< nums.length-1;k++){
            min= k;
            for(int j=k+1;j< nums.length;j++){
                if(nums[j]<nums[min]){
                    min= j;
                }
            }
            if(min != k){
//                Swap
                temp=nums[k];
                nums[k]=nums[min];
                nums[min]=temp;
            }
        }
        // set index in result where target appeared
        for(int i=0;i< nums.length;i++){
            if(nums[i]== target){
                result.add(i);
            }
        }
        return result;
    }
}