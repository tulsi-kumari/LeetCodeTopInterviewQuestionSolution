package Medium;

public class ConstructTreeFromInorderAndPreOrder {

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

    class Solution {
        public TreeNode buildTree(int[] preorder, int[] inorder) {
            int n=preorder.length;
            if(n==0){
                return null;
            }
            TreeNode root=new TreeNode(preorder[0]);
            int ils=0;
            int ile=indexOf(inorder,preorder[0])-1;
            int pls=1;
            int ple=pls+(ile-ils);
            int irs=indexOf(inorder,preorder[0])+1;
            int ire=inorder.length-1;
            int prs=ple+1;
            int pre=preorder.length-1;
            root.left=help(pls,ple,preorder,ils,ile,inorder);
            root.right=help(prs,pre,preorder,irs,ire,inorder);
            return root;

        }
        public TreeNode help(int pi,int pj,int[] preorder,int ii,int ij, int[] inorder){
            if(pi>pj||ii>ij){
                return null;
            }
            TreeNode node=new TreeNode(preorder[pi]);
            int ils=ii;
            int ile=indexOf(inorder,preorder[pi])-1;
            int pls=pi+1;
            int ple=pls+(ile-ils);
            int irs=indexOf(inorder,preorder[pi])+1;
            int ire=ij;
            int prs=ple+1;
            int pre=prs+(ire-irs);
            node.left=help(pls,ple,preorder,ils,ile,inorder);
            node.right=help(prs,pre,preorder,irs,ire,inorder);
            return node;
        }
        public int indexOf(int[] arr,int x){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==x){
                    return i;
                }
            }
            return -1;
        }
    }

}
