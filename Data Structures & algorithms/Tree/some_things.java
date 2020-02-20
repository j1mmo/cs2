/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ads2;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author jamessherlock-shaw
 */
public class Tree {
    private final TreeNode root;
    
    Tree(){
        TreeNode N = new TreeNode("N");
        TreeNode M = new TreeNode("M");
        
        TreeNode G = new TreeNode("G");
        TreeNode F = new TreeNode("F");
        
        TreeNode K = new TreeNode("K");
        TreeNode J = new TreeNode("J");
        
        TreeNode I = new TreeNode("I");
        
        TreeNode E = new TreeNode("E");
        TreeNode D = new TreeNode("D");
        
        TreeNode C = new TreeNode("C");
        TreeNode B = new TreeNode("B");
        TreeNode Z = new TreeNode("Z");
        
        root = new TreeNode("A");
        
        root.addChild(B);
        root.addChild(C);
        
        B.addChild(D);
        B.addChild(E);
        D.addChild(I);
        E.addChild(J);
        E.addChild(K);
        
        C.addChild(F);
        C.addChild(G);
        G.addChild(M);
        G.addChild(N);
    }
    TreeNode getRoot(){
        return root;
    }
    void DFS_PreOrder(TreeNode _root){
        if(_root != null){
            System.out.println(_root.getData());
            for(int i = 0; i <_root.getChildrenLength();i++){
                DFS_PreOrder(_root.getChild(i));
            }
        }
    }
    
    void BFS(){
        Queue queue = new LinkedList();
        TreeNode tracker = root;
        queue.add(tracker);
        while(!queue.isEmpty()){
            tracker = (TreeNode) queue.remove();
            System.out.println(tracker.getData());
            for(int i = 0; i < tracker.getChildrenLength();i++){
               if(tracker.getChild(i)!=null){
                   queue.add(tracker.getChild(i)); 
               }
            }
        }
    }
    int binaryTreeSize(TreeNode node){
        if(node == null){
            return 0;
        }
        else {
            int[] childrenSize = new int[node.getChildrenLength()];
            TreeNode[] children = new TreeNode[node.getChildrenLength()];
            for(int i = 0; i < children.length; i++){
                childrenSize[i] = binaryTreeSize(children[i]);
            }
            int max = 0;
            for(int i = 0; i < childrenSize.length;i++){
                if(childrenSize[i] > max) {
                    max = childrenSize[i];
                }
            }
            return max += 1;
        }
    }
    public String[] Tree2Array(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        String[] array = new String[binaryTreeSize(root)];
        TreeNode tracker = root;
        queue.add(root);
        while(!queue.isEmpty()){
            //tree2Array.add(tracker.getData());
            for(int i = 0; i < tracker.getChildrenLength();i++){
                if(tracker.getChild(i)!=null){
                    queue.add(tracker.getChild(i));
                }
            }
            tracker = queue.remove();
        }
        return array;
    }
}
    

