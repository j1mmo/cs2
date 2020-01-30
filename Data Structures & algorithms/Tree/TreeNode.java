package ads2;

public class TreeNode
{
  private final int initLengthOfChildren = 2;
  private String data;     // data about this node
  private TreeNode[] children;
  private TreeNode parent;
  private int index;
  // Add in variables to hold one or more child nodes
  
  // Add constructors
  TreeNode(int childrenCount, TreeNode _parent, String _data){
      children = new TreeNode[childrenCount];
      parent = _parent;
      data = _data;
      index = 0;
  }
  TreeNode(String _data){
      data = _data;
      index = 0;
      children = new TreeNode[initLengthOfChildren];
  }
  // Add extra setter and getter methods
  public void setChildren(TreeNode child){
      if(index < children.length-1)
        children[index++] = child;
  }
  public void setParent(TreeNode _parent){
      parent = _parent; 
  }
}
