class Solution {
    public int findComplement(int num) {
        int bit=0;
        int result=0;
        int r=0;
        int bin=0;
        while(num>0){
            r = num % 2;
           num = num / 2;
           if(r==0){
            result=result+(int)Math.pow(2,bit);
            }
           bit++; 
        }
        return result;
    }
}