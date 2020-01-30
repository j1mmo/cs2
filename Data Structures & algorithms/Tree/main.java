package ads2;

public class Main
{
  public static void main(String[] args)
  {
    TreeNode node0 = new TreeNode("A");
    TreeNode node1 = new TreeNode("B");
    TreeNode node2 = new TreeNode("C");
    TreeNode node3 = new TreeNode("D");
    TreeNode node4 = new TreeNode("E");
    TreeNode node5 = new TreeNode("F");
    TreeNode node6 = new TreeNode("G");
    
    ADS2Tree tree = new ADS2Tree();
    
    tree.addChild(tree.getRoot(), node0);
    tree.addChild(node0, node1);
  }
  
  
}
