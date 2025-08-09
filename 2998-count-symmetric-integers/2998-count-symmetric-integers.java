class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count=0;
        for(int i=low;i<=high;i++){
           String num=i+"";
           int len=num.length();
           if(len%2!=0) continue;
           int sum1=0;
           int sum2=0;
           for(int j=0;j<len/2;j++){
           sum1+=num.charAt(j)+'0';
           sum2+=num.charAt(j+len/2)+'0';
            } if(sum1==sum2){
                count++;
            }
            }return count;
        }
    }
