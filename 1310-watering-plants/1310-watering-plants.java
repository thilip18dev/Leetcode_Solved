class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int n=plants.length;
        int cap=capacity;
        int steps=0;
        for(int i=0;i<n;i++){
          if(plants[i]<=capacity){
             steps+=1;
             capacity-=plants[i];
          }else{
            steps+=i*2+1;
            capacity=cap-plants[i];
          }
        }return steps;
        
    }
}