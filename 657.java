class Solution {
    public boolean judgeCircle(String moves) {
        if(moves.length()%2==0){
            int x =0;
            int y=0;
            for(int i=0;i<moves.length();i++){
                if(y>moves.length()/2 || x>moves.length()/2 ){
                    return false;
                }
                char c=moves.charAt(i);
                if(c=='U'){
                    y+=1;
                }else if(c == 'D'){
                    y+=-1;
                }else if(c == 'L'){
                    x+=-1;
                }else if(c == 'R'){
                    x+=+1;
                }
            }
        return x==0 && y==0;
        }else{
            return false;
        }
    }
}