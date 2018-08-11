class Solution {
    public String reverseString(String s) {
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            res.append(s.charAt(s.length()-i-1));
        }
        return res.toString();
    }
}