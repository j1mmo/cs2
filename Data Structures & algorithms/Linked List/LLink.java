public class LList
{
    // Default constructor
    private LNode root;
    private LNode tracker;
    public LList(String data)
    {
        root = new LNode(data,null);
        tracker = root;
    }
    public LList()
    {
        root = new LNode(null,null);
        tracker = root;
    }

    /* Return the number of items contained within this data structure.
     * Use recursion to count the number of nodes in the linked list */
    public int GetNoOfItems()
    {
        int i = 1;
        while(tracker.next != null){
            tracker = tracker.next;
            i++;
        }
        tracker = root;
        return i;
    }

    /* Returns the String value held at index (base zero) or null if the index
     * is out of bounds */
    public String GetItemByIndex(int index)
    {
        for(int i  = 0;tracker.next != null && i < index; i++){
            tracker = tracker.next;
        }
        tracker = root;
        return tracker.myData;
    }


    /* Adds value to the end of the data structure */
    public void AddItem(String value)
    {
        LNode node = new LNode(value, null);
        if(root.next == null){
            root.next = node;
        }else {
            while(null != tracker.next){
                tracker = tracker.next;
            }
            tracker.next = node;
            tracker = root;
        }
    }

    /* Inerts value into the data structure at index (base zero) or at the end
     * if there are less items in the data structure than index */
    public void InsertItem(int index, String value)
    {
        LNode node = new LNode(value, null);
        if( index == 0 ){
            node.next = root;
            root = node;
        }else{
            for(int i  = 0;tracker.next != null && i < index-1; i++){
                tracker = tracker.next;
            }
            node.next = tracker.next;
            tracker.next = node;
        }
        tracker = root;
    }

    /* Removes the item at index from the data structure - if index is out of
     * bounds then the data structure remains unchanged */
    public void DeleteItem(int index)
    {
        for(int i = 0; tracker.next != null && i < index- 1; i++){
            tracker = tracker.next;
        }
        
    }

    /*List all the items in the list as a String,
     *A useful format is Item0, Item1, Item2,..., Item n
     */
    public String ListAllIItem()
    {
        while(tracker.next != null){
            System.out.println(tracker.myData);
            tracker = tracker.next;
        }
        System.out.println(tracker.myData);
        return null;
    }


}
