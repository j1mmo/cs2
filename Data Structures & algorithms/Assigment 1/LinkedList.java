package ads2library;

//You MUST use doubly linked list for this implementation. You also need to use 
//tail recursion when traversaling through the list. 
//You may need to include some sub-classes and helper functions in this class.
public class LList {
    /**
     * [Task 2_1]
     */
    Node head;
    Node tail;
    Node n;
    /**
     * [Task 2_2]
     * This is your default constructor - initial your object variables 
     * to sensible values for a generic doubly linked list object
     */ 
    public LList(){
        head = new Node(null);
        tail = head;
        n = null;
    }
    
    /**
     * [Task 2_3]
     * @return the amount of items stored in the doubly linked list using tail recursion
     */
    public int GetNoOfItems(){
        return head.getNumberOfItems();
    }
    
    /**
     * [Task 2_4]
     * Return an book item by its ISBN from the doubly linked list using tail recursion.
     * @param isbn using book ISBN number to search the doubly linked list and locate the book
     * @return the Book item. Return NULL if the book cannot be found
     */
    public Book GetItemByISBN (String isbn){
        return tail.findBook(isbn);
    }
    
    /**
      * [Task 2_5]
      * Adds value to the tail of the doubly linked list.
      * @param item a Book item to be added in the doubly linked list
      */
    public void AddItem(Book item){
        Node node = new Node(item);
        
        tail.next = node;
        node.prev = tail;
        tail = node;
    }
    
    /**
     * [Task 2_6]
     * Inserts value into the data structure at index (base zero) or at the end
     * if there are less items in the data structure than index.
     * You need to use tail recursion for this task.
     * @param index the insertion location (base zero) of the doubly linked list
     * @param item a Book item to be inserted into the doubly linked list
     */
    public void InsertItem(int index, Book item){
        Node node = new Node(item);
        Node tracker;
        tracker = head.findIndex(index);
        if(tracker.equals(tail)){
            this.AddItem(item);
        }else{
            node.next = tracker;
            node.prev = tracker.prev;
            tracker.prev = node;
            node.prev.next = node;
        }
    }
    
    /**
     * [Task 2_7]
     * Removes the item from the data structure - if the isbn is not found
     * then the data structure remains unchanged. 
     * You need to use tail recursion for this task.
     * @param isbn using book ISBN number to search the doubly linked list and locate the book for deletion
     * @return true if the item can be found and be deleted. Return false if the isbn is not found
     * and the data structure remains unchanged. 
     */
    public boolean DeleteItemByISBN(String isbn){
        Node book;
        book = tail.findNodeBook(isbn);
        if(book == null){
            return false;
        }else{
            book.prev.next = book.next;
            book.next.prev = book.prev;
            book.next = null;
            book.prev = null;
            return true;
        }
        
    }
    public Book GetItemByIndex(int index)
    {
        Node tracker = head;
        for(int i  = 0;tracker.next != null && i < index; i++){
            tracker = tracker.next;
        }
        return tracker.book;
    }

}
