class Solution {
    public int maxSumTwoNoOverlap(int[] A, int L, int M) {
        return Math.max(calculate(A, L, M), calculate(A, M, L));
    }
    
    private int calculate(int[] A, int L, int M) {
        int sum = 0;
        int len = A.length;
        
        int[] prefixSum = new int[len];
        prefixSum[0] = A[0];
        for(int i = 1; i < len; i++) {
            prefixSum[i] = prefixSum[i-1] + A[i];
        }
        
        int[] leftSum = new int[len];
        leftSum[L-1] = prefixSum[L-1];
        for(int i = L; i < len; i++) {
            leftSum[i] = Math.max(leftSum[i-1], prefixSum[i] - prefixSum[i-L]);
        }
        
        int[] suffixSum = new int[len];
        suffixSum[len-1] = A[len-1];
        for(int i = len-2; i >= 0; i--) {
            suffixSum[i] = suffixSum[i+1] + A[i];
        }
         
        int[] rightSum = new int[len];
        rightSum[len-M] = suffixSum[len-M];
        for(int i = len-M-1; i >= 0; i--) {
            rightSum[i] = Math.max(rightSum[i+1], suffixSum[i] - suffixSum[i+M]);
        }
        
        
        int res = Integer.MIN_VALUE;
        for(int i = L-1; i <= len-M-1; i++) {
            res = Math.max(leftSum[i] + rightSum[i+1], res);
        }
        
        return res;
    } 
}
