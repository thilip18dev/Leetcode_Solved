class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        int k = primes.length;
        int[] ugly = new int[n];
        ugly[0] = 1;
        int[] idx = new int[k]; 
        long[] val = new long[k];
        for (int i = 0; i < k; i++)
            val[i] = primes[i];
        for (int i = 1; i < n; i++) {
            long nextUgly = Long.MAX_VALUE;
            for (int j = 0; j < k; j++) {
                nextUgly = Math.min(nextUgly, val[j]);
            }
            ugly[i] = (int) nextUgly;
            for (int j = 0; j < k; j++) {
                if (val[j] == nextUgly) {
                    idx[j]++;
                    val[j] = (long) ugly[idx[j]] * primes[j];
                }
            }
        }
        return ugly[n - 1];
    }
}