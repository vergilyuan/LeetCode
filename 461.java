class Solution {
    public int hammingDistance(int x, int y) {
        String x2 = Integer.toBinaryString(x) ;
        String y2= Integer.toBinaryString(y);
        int l1=x2.length();
        int l2=y2.length();
        int count=0;
        int result=0;
        if(l1>l2){
            count=l1-l2;
            for(int i=0;i<l1;i++){
                if(i<count){
                    if(x2.charAt(i)=='1'){
                        result++;
                    }
                }else{
                    if(x2.charAt(i)!=y2.charAt(i-count)){
                        result++;
                    }
                }
            }
        }else{
            count=l2-l1;
            for(int i=0;i<l2;i++){
                if(i<count){
                    if(y2.charAt(i)=='1'){
                        result++;
                    }
                }else{
                    if(y2.charAt(i)!=x2.charAt(i-count)){
                        result++;
                    }
                }
            }
        }
        return result;
    }
}