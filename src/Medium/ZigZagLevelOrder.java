package Medium;
import java.util.*;
public class ZigZagLevelOrder {
    public static void main(String[] args) {

    }
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return  ans;
        }
        boolean flag=false;
        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            List<Integer> t=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                t.add(temp.val);
                if(temp.left!=null){
                    q.offer(temp.left);
                }
                if(temp.right!=null){
                    q.offer(temp.right);
                }
            }
            if(!flag){
                ans.add(t);
                flag=true;
            }else{
                Collections.reverse(t);
                ans.add(t);
                flag=false;
            }

        }
        return ans;
    }
}
