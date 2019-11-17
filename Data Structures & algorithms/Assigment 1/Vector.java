package ads2library;

//Your vector must be able to grown when it is full
//You may need to include some sub-classes and helper functions in this class.
public class Vector {
    
    private Book[] books;
    private int vectorLength = 0;
    private final int growth = 20;
    
  
    /**
     * [Task 1_2]
     * This is your default constructor - initial your object variables 
     * to sensible values for a generic vector object
     */ 
    public Vector(){
        books = new Book[100];
    }
    
    /**
     * [Task 1_3]
     * Return the number of items in the vector
     * @return the amount of items stored in the vector
     */
    public int GetNoOfItems(){
        return vectorLength;
    }
    
    /**
     * [Task 1_4]
     * Return an book item by its ISBN from the vector.
     * @param isbn using book ISBN number to search the vector and locate the book
     * @return the Book item. Return NULL if the book cannot be found
     */
    public Book GetItemByISBN (String isbn){
        for(int i = 0; i < vectorLength; i++){
            if(books[i].getIsbn().equals(isbn)){
                return books[i];
            }
        }
        return null;
    }
    
    /**
      * [Task 1_5]
      * Adds value to the data structure. Since it is a vector, it should be added 
      * at the end of the data structure (as known as "append")
      * @param item a Book item to be added in the vector
      */
    private void expandVector(){
        Book[] booksCopy = new Book[books.length+growth];
        System.arraycopy(books, 0, booksCopy, 0, books.length);
        books = booksCopy;
    }
    public void AddItem(Book item){
        if(books.length == vectorLength){
            expandVector();
        }
        books[vectorLength++] = item;
    }
    
    /**
     * [Task 1_6]
     * Inserts value into the data structure at index (base zero) or at the end
     * if there are less items in the data structure than index     * 
     * @param index the insertion location (base zero) of the vector
     * @param item a Book item to be inserted into the vector
     */
    private void InsertItem(int index, Book item){
        if(index >= vectorLength){
            AddItem(item);
        }
        else{
            for(int i = vectorLength - 1; i >= index ; i--){
                books[i+1] = books[i];
        }
        books[index] = item;
        vectorLength++;
        }
    }
    
    /**
     * [Task 1_7]
     * Removes the item from the data structure - if the isbn is not found
     * then the data structure remains unchanged. 
     * @param isbn using book ISBN number to search the vector and locate the book for deletion
     * @return true if the item can be found and be deleted. Return false if the isbn is not found
     * and the data structure remains unchanged. 
     */
    public boolean DeleteItemByISBN(String isbn){
        for(int i = 0; i < vectorLength; i++){
            if(books[i].getIsbn().equals(isbn)){
                for(int j = i; j < books.length-1; j++){
                    books[j] = books[j+1];
                }
                vectorLength--;
                return true;
            }
        }
        return false;
    } 
}
