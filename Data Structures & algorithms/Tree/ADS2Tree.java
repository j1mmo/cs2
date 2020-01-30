package ads2;

public class ADS2Tree 
{
  private TreeNode root;  // the root of this tree
  
  // Add required constructors
  ADS2Tree(){
      root = new TreeNode("ROOT");
  }
  // Add extra setter and getter methods

  /**
   * A public method to add a child to a parent. You can use this method to build
   * a tree from its root.
   * @param parent the parent node of the tree. 
   * @param newChild the new child node to be attached.
   */
  public TreeNode getRoot(){
      return root;
  }
  public void addChild(TreeNode parent, TreeNode newChild)
  {
      parent.setChildren(newChild);
      newChild.setParent(parent);
  }
  public TreeNode{
      
  }
  
}
