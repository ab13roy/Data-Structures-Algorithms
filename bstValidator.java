/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isValidBST(TreeNode root) {

        if(root == null){
            return true;
        }

        List<Integer> listInOrder = new ArrayList<>();
        listInOrder = inOrder(root, listInOrder);
        int i =0;
        do{
            if(i+1<listInOrder.size()){
                if(listInOrder.get(i) < listInOrder.get(i+1)){
                    i++;
                }
                else{
                    return false;
                }
            }
            else{
                break;
            }

        }while(i<listInOrder.size());
        return true;
    }

    public List<Integer> inOrder(TreeNode n, List<Integer> list){
        if(n == null){
            return null;
        }

        inOrder(n.left, list);
        System.out.println(n.val);
        list.add(n.val);
        inOrder(n.right, list);
        return list;
    }

}
