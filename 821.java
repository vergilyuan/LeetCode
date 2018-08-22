import java.util.ArrayList;

class Solution {
    public int[] shortestToChar(String S, char C) {
        int [] shortest=new int [S.length()];
        List<Integer> index=new ArrayList<>();
        for(int i=0;i<S.length();i++){
            if(S.charAt(i)==C){
                index.add(i);
            }
        }
        for(int i=0;i<S.length();i++){
            int min=S.length();
            for(int j=0;j<index.size();j++){
                if(Math.abs(i-index.get(j))<min){
                    min=Math.abs(i-index.get(j));
                }
            }
            shortest[i]=min;
        }
        return shortest;
    }
}