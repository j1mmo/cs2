/* This class is used within the LList data collection as the link nodes
 * This is a singly linked list
 */
public class LNode
{
    public String myData;
    public LNode next;
    public LNode(String data, LNode next){
        this.myData = data;
        this.next = next;
    }
    /* This method returns the String item of data held in this node */
    public String GetDataItem()
    {
        return myData;
    }

    /* This method returns the node immediately after this node in the list or null
     * if there is no such node. */
    public LNode GetNextNode()
    {
        return next;
    }
}
