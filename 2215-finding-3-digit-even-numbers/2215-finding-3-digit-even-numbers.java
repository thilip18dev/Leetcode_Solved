class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int n=digits.length;
        Set<Integer>set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                for(int k=0;k<n;k++){
                    if(i!=j&&j!=k&&k!=i){
                        int a=digits[i];
                        int b=digits[j];
                        int c=digits[k];
                        if(a!=0&&c%2==0){
                            int num=a*100+b*10+c;
                            set.add(num);
                        }
                    }
                }
            }
        }List<Integer>list=new ArrayList<>(set);
        Collections.sort(list);
        int arr[]=new int[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }return arr;
    }
}