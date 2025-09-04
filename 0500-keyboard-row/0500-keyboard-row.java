class Solution {
    public String[] findWords(String[] words) {
        ArrayList<String>list=new ArrayList<>();
        String a="qwertyuiop";
        String b="asdfghjkl";
        String c="zxcvbnm";
        for(String num:words){
            String temp=num.toLowerCase();
            boolean d=true;
            boolean e=true;
            boolean f=true;
            for(char ch:temp.toCharArray()){
             if(!a.contains(""+ch)){
                d=false;
            }
            if(!b.contains(""+ch)){
            e=false;}
              if(!c.contains(""+ch)){
                f=false;
              }}if(d||e||f){
                list.add(num);
              }
        }String arr[]=new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }return arr;
    }
}