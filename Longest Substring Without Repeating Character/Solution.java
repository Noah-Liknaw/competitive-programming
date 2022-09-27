class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s == null || s == ""){
            return 0;
        }
        
        int i=0,j=0,max=0;
        Set<Character> set = new HashSet<>();
        while(i<s.length()){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(j));
                ++j;
            }
            set.add(s.charAt(i));
            max=Math.max(max,i - j + 1);
            ++i;
        }
        return max;
    }
}