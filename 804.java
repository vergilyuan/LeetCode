class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] alp={".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        String [] newword= new String [words.length];
        int count=0;
        for(int i=0;i<words.length;i++){
            String w="";
            for(int j=0;j<words[i].length();j++){
                int a=(int)words[i].charAt(j)-97;
                w=w+alp[a];
            }
            newword[i]=w;
        }
        int l=words.length;
        String [] unique = new String [l];
        for(int i=0;i<l;i++){
            unique[i]="";
        }
        for(int i = 0; i < l; i++){
            String temp = newword[i];
            int b = 0;
            for(int y = 0; y < l; y++){
                if(!unique[y].equals(temp)){
                b++;
            }
        }
        if(b == l){
            unique[count] = temp;
            count++;
        }
    }
    return count;
    }
}

class Solution2 {
    public int uniqueMorseRepresentations(String[] words) {
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.",
                         "....","..",".---","-.-",".-..","--","-.",
                         "---",".--.","--.-",".-.","...","-","..-",
                         "...-",".--","-..-","-.--","--.."};

        Set<String> seen = new HashSet();
        for (String word: words) {
            StringBuilder code = new StringBuilder();
            for (char c: word.toCharArray())
                code.append(MORSE[c - 'a']);
            seen.add(code.toString());
        }

        return seen.size();
    }
}