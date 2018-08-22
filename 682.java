import java.util.ArrayList;

class Solution {
    public int calPoints(String[] ops) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("D")){
                arr.add(arr.get(arr.size()-1)*2);
            }else if(ops[i].equals("C")){
                arr.remove(arr.size()-1);
            }else if(ops[i].equals("+")){
                arr.add(arr.get(arr.size()-1)+arr.get(arr.size()-2));
            }else{
                arr.add(Integer.parseInt(ops[i]));
            }
        }
        int sum=0;
        for(int i=0;i<arr.size();i++){
            sum=sum+arr.get(i);
        }
        return sum;
    }
}