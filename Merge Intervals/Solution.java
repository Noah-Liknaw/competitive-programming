class Solution {
    public int[][] merge(int[][] intervals) {
        //sort array
        Arrays.sort(intervals,(arr1,arr2) -> Integer.compare(arr1[0],arr2[0]));
        //check if input size is 1 0r 2(if it is don't do nothing)
        if(intervals.length <=1){
            return intervals;
        }
        else{
            //declare result array
        List<int[]> result = new ArrayList(); 
            //initalize and add current interval
            int[] currentInterval = new int[2];
            int begin = intervals[0][0];
            int end = intervals[0][1];  
            result.add(new int[]{begin,end});
            //loop through the interval
            for(int i=1;i<intervals.length;i++){
                if(end >= intervals[i][0]){
                    end=Math.max(intervals[i][1],end);
                    result.set(result.size()-1,new int[]{begin,end});
                }
                else{
                    begin=intervals[i][0];
                    end = intervals[i][1];
                    result.add(new int[]{begin,end});
                }
            }
            
        return result.toArray(new int[0][]);
    }
        }
        
}