
package bankaccount;


public class ADS2Vector {
    // Place your "global" object varaibles here... what data do you need to store
    // to make a vector?
    private BankCustomer[] bankUserData;
    private int vectorLength = 0;
    private final int growby = 10;
  
  
    // This is your default constructor - initalise your object variables
    // to sensible values for a generic vector object
    public ADS2Vector()
    {
        bankUserData = new BankCustomer[10];
    }
    
    private boolean isMaximumCapacityReached(){
        return vectorLength == bankUserData.length;
    }
    private void expandVector(){
        BankCustomer[] bankUserDataCopy = new BankCustomer[bankUserData.length+growby];
        for(int i = 0; i < bankUserData.length; i++){
            bankUserDataCopy[i] = bankUserData[i];
        }
        bankUserData = bankUserDataCopy;
    }
    /* Returns the current capacity of the vector before it will need to resize again */
    public int GetCapacity()
    {
        return bankUserData.length;
    }


    /* Returns the number of items in the vector */
    public int GetNoOfItems()
    {
        return vectorLength - 1;
    }


    /* Returns the customer data held at index (base zero) or null if the index
     * is out of bounds */
    public BankCustomer GetItemByIndex(int index)
    {
        if(index < 0 || index > vectorLength){
            throw new IllegalStateException("Error: Out of range");
        }
        return bankUserData[index];
    }


    /* Returns true if the user ID passed in exists in the collection
     * use linear search and case sensitive search */
    public boolean ItemExists(String ID)
    {
        for(int i = 0; i < bankUserData.length; i++){
            if(ID.equals(bankUserData[i].getId())){
                return true;
            }
        }
        return false;
    }


    /* Adds value to the end of the data structure  
     * You need to check if the vector needs to grow or not 
    */
    public void AppendItem(BankCustomer value)
    {
        if(isMaximumCapacityReached()){
            expandVector();
        }
        bankUserData[vectorLength++] = value;
    }


    /* Inerts value into the data structure at index (base zero) or at the end
     * if there are less items in the data structure than index
     * You need to check if the vector needs to grow or not 
    */
    public void InsertItem(int index, BankCustomer value)
    {
        if(isMaximumCapacityReached()){
            expandVector();
        }
        for(int i = bankUserData.length - 1; i >= index ; i--){
            bankUserData[i+1] = bankUserData[i];
        }
        bankUserData[index] = value;
        vectorLength++;
    }
    public void printItems(){
        for(int i = 0; i < bankUserData.length; i++){
            System.out.println(bankUserData[i].getId()+"\t£"+bankUserData[i].getBalance());
        }
    }

    /* Removes the item at index from the data structure - if index is out of
     * bounds then the data structure remains unchanged 
     * You do not need to reduce the size of the vector during this operation
     */

    public void DeleteItem(int index)
    {
      for(int i = index; i < bankUserData.length-1; i++){
          bankUserData[i] = bankUserData[i+1];
      }
      vectorLength--;
    }
      
}
