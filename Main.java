import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void getMAX(int [] tres,int [] value,int bag){
        double [] TPV=new double [tres.length];
        for(int i=0;i<tres.length;i++){
            TPV[i]=( (double) tres[i])/( (double)value[i]);
        }
       
        for(int i=0;i<tres.length-1;i++){
            for(int j=0;j<tres.length-1-i;j++){
            	double t1=TPV[j];
            	double t2=TPV[j+1];
                int a=tres[j];
                int b=tres[j+1];
                int index1=value[j];
                int index2=value[j+1];
                if(t2>=t1){
                	TPV[j]=t2;
                	TPV[j+1]=t1;
                    tres[j+1]=a;
                    tres[j]=b;
                    value[j+1]=index1;
                    value[j]=index2;
                }

            }
        }
        int result=0;
        for(int i=0;i<tres.length;i++){
        	
            bag=bag-value[i];
            if(bag>=0){
                result=result+tres[i];
            }else{
                break;
            }
        }
        
        System.out.println(result);
    }
    public static void main(String [] args){
        Scanner scan=new Scanner(System.in);
      
        try {
            int bag=-1;
            ArrayList<Integer>tres=new ArrayList<Integer>();
            ArrayList<Integer>value=new ArrayList<Integer>();
            int count=0;
            while(scan.hasNextLine()){
                String [] numList=scan.nextLine().split(",");
                if(count%3==0){
               
                    for(int i=0;i<numList.length;i++){
                        tres.add(Integer.parseInt(numList[i]));
                    }
                    count++;
                }
                else if(count%3==1){
                   
                    for(int i=0;i<numList.length;i++){
                        value.add(Integer.parseInt(numList[i]));
                    }
                    count++;
                }else if(count%3==2){
                    bag=Integer.parseInt(numList[0]);
                    count++;
                    int [] valueArray=new int[value.size()];
                    int [] tresArray=new int[tres.size()];
                    for(int i=0;i<value.size();i++){
                        valueArray[i]=value.get(i);
                    }
                    for(int i=0;i<tres.size();i++){
                        tresArray[i]=tres.get(i);
                    }
                    getMAX(tresArray, valueArray, bag);
                }
            }
           
            
            
        }
        catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}
    }
}