import java.util.ArrayList;

class Solution {
    public String[] findWords(String[] words) {
        int x =0;
        int y=0;
        int z=0;
        ArrayList<String> arr=new ArrayList<String>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words[i].length();j++){
                int num=words[i].toLowerCase().charAt(j)-'a';
                if(num==4||num==8||num==14||num==15||num==16||num==17||num==19||num==20||num==22||num==24){
                    if(y==0&&z==0){
                        x++;
                    }else{
                        x++;
                        break;
                    }
                    
                }else if(num==0||num==3||num==5||num==6||num==7||num==9||num==10||num==11||num==18){
                    if(x==0&&z==0){
                        y++;
                    }else{
                        y++;
                        break;
                    }
                }else{
                    if(x==0&&y==0){
                        z++;
                    }else{
                        z++;
                        break;
                    }
                }
            }
            if(x>0 && y==0 && z==0){
                arr.add(words[i]);
            }
            if(x==0 && y>0 && z==0){
                arr.add(words[i]);
            }
            if(x==0 && y==0 && z>0){
                arr.add(words[i]);
            }
            x=0;
            y=0;
            z=0;
        }
        String [] res= new String [arr.size()];
        for(int i=0;i<arr.size();i++){
            res[i]=arr.get(i);
        }
        return res;
    }
    
}