class Solution {
    public String reverseWords(String s) {
        String [] words= s.split("\\s+");
        StringBuilder res=new StringBuilder();
        for(int i=0;i<words.length;i++){
            for(int j=0;j< words[i].length();j++){
                res.append(words[i].charAt(words[i].length()-j-1));
            }
            res.append(" ");
        }
        return res.toString().trim();
    }
}