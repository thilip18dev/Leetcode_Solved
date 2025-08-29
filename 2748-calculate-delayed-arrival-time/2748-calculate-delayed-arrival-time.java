class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        int ans=arrivalTime+delayedTime;
        return ans%24;
    }
}