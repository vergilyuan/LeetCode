import java.util.Stack;

import java.util.Collections;


/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public List<Integer> postorder(Node root) {
       List<Integer> res=new ArrayList<Integer>();
       Stack<Node> s=new Stack<Node>();
       Stack<Integer> out=new Stack<Integer>();
       s.push(root);
       while(!s.empty()){
           Node p=s.pop();
           if(p!=null){
            out.push(p.val);
          
           if(p.children!=null && !p.children.isEmpty()){
               for(int i=0;i<p.children.size();i++){
                   if(p.children.get(i)!=null){
                   s.push(p.children.get(i));
                   }
               }
           }
           }
       }
       while(!out.empty()){
           res.add(out.pop());
       }
       return res; 
    }
}