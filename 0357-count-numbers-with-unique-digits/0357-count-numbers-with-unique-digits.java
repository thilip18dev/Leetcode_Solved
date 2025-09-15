class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0)
            return 1;
        int total = 10;
        int product = 9;
        for (int i = 2; i <= n && i <= 10; i++) {
            product *= (10 - (i - 1));
            total += product;
        }
        return total;
    }
}