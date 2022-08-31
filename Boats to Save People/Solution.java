class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l=0,r=people.length-1,sum=0,boats=0;
        while(l<=r){
            sum=people[l]+people[r];
            if(sum > limit){
                r--;
                boats++;
            }
            else if (sum <= limit){
                boats++;
                r--;
                l++;
            }
        }
        return boats;
    }
}