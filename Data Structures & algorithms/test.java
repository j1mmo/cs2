package ads2;

public class HashMap implements HashMapInterface
{
  private int noofitems;
  private HashPair[] data;
  
  // variables to hold stats
  private int[] hits;
  
  public HashMap() {}

    
  // Initalise the hashmap using an array of the specificed array length
  // you can assume that it is safe to clear anything already in the hash map
  // when this function gets called and everything is reset
  public void InitHashMap(int initlen)
  {
    noofitems=0;
    // Task 2 - Step 1: Create your array to store hash pairs here...
    data = new HashPair[initlen];
    
    // Stats variables
    hits=new int[initlen];
    for (int i=0; i<initlen; i++)
      hits[i]=0;
  }
  
  // Task 2 - Step 2: Adds the {key, value} pair into the hash map
  public void AddItem(String key, String value)
  {
    //System.out.println("Adding: "+key+" "+value);
    int index=HashFunction(key);
    index %= data.length;
    // this line of code is used to build up a hit table hash index hits for stats
    ++hits[index%hits.length];

    // Task 2 - Step 3: Create the new HashPair item ready to put in out data structure
    HashPair temp = new HashPair(key, value);
    
    // Task 3:Check load factor here and resize if over 0.7
    
    
    // Task 2 - Step 4: Insert item into the data, but check and resolve collisions first
    while(data[index] != null){
        index++;
        index%=data.length;
    }
    data[index] = temp;
    // When you have this, implement the GetValue method
    
    
  }
  
  private int HashFunction(String key)
  {
    int x = 0;
    for(int i =0;i<key.length();i++){
        x += ((key.charAt(i) & 0x6D)*(i*3));
    }
    x%=100;
    return x;
  }
  
  
  
  // Task 2 - Step 5: returns the value component of the map that contains the key or null if it isn't found
  // this should be case sensitive
  public String GetValue(String key)
  {
    //Implement a corresponding get value method according to your collision resolution technique
    int index=HashFunction(key);
    index %= data.length;
    
    while(data[index]==null && !data[index].key.equals(key)){
        index++;
    }
    return data[index].value;
  }
  
  


  // Task 2 - Step 6:Deletes the {key, value} pair for key from the hash map if it exists
  // key is case sensitive
  public void DeleteItem(String key)
  {
    
  }
  
  


// Help function: Returns the number of items in the hash map
  public int GetNoOfItems()
  {
    return noofitems;
  }

  


  // Task 4
  // Returns the "index"th valid item in the collection
  // i.e. GetItem(0) returns the first valid item, GetItem(1) returns the second valid item, etc, 
  // up to GetNoOfItems()-1.
  public HashPair GetItem(int index)
  {
    return null;
  }
  
  
  
  
  
  public void DisplayStats()
  {
    // Display the top 10 index hashes and their counts
    int maxids[]=new int[10];
    for (int i=0; i<maxids.length; i++)
    {
      //maxids[i]=;
      int max=-1;
      for (int j=0; j<hits.length; j++)
      {
        if (hits[j]>max)
        {
          boolean found=false;
          for (int k=0; k<i && !found; k++)
            if (maxids[k]==j)
              found=true;
          
          if (!found)
          {
            max=hits[j];
            maxids[i]=j;
          }
        }
      }
    }
    
    for (int i=0; i<maxids.length; i++)
      System.out.println(maxids[i]+": "+hits[maxids[i]]);
  }  
}
