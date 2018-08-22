import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
        try {
           int count=0;
           String words="";
           String in="";
           ArrayList<String> wordsList=new ArrayList<String>();
           while(scan.hasNextLine()){
               if(count%2==0){
                    words=scan.nextLine();
                    String [] swords=words.split("\\s+|\\;");
                    for(int i=0;i<swords.length;i++){
                        wordsList.add(swords[i]);
                    }
                }else{
                    in=scan.nextLine();
                    for(int i=0;i<wordsList.size();i++){
                        if(wordsList.get(i).equals(in)){
                            if(i>0){
                                System.out.println(wordsList.get(i-1));
                            }
                        }
                    }
               }
           }
        }
        catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
    }
}