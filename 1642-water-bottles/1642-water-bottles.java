class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int total = numBottles;
        int empty = numBottles;
        while (empty >= numExchange) {
            int newFull = empty / numExchange;
            total += newFull;
            empty = empty % numExchange + newFull;
        }
        return total;
    }
}