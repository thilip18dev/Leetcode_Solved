class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum=0;
        int rem=0;
        int a=x;
        while(x>0){
            rem=x%10;
            sum+=rem;
            x=x/10;
        }if(a%sum==0){
            return sum;
        }return -1;
    }
}