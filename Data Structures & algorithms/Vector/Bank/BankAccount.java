package bankaccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class BankAccount {

    public static void main(String[] args) throws FileNotFoundException {
        //Load all the data to the underlying data structure
        ADS2Vector data = loadCustomerData();
        
        //Add more function here related to bank users such as add account, delete account...
        //Use your creativity. 
        
    }
    
    public static ADS2Vector loadCustomerData() throws FileNotFoundException{
        ADS2Vector BankDatabase = new ADS2Vector();
        try (Scanner scanner = new Scanner(new File("BankUserDataset.csv"))) {
        
            scanner.useDelimiter("\r\n");            
            while(scanner.hasNext()){
                String currentLine[] = scanner.next().split(",");
                String currentID = currentLine[0];
                double currentBalance = Double.parseDouble(currentLine[1]);
                System.out.println(currentID+"\t£"+currentBalance);
                
                //Load currentID and currentBalance into your initialised Vector 
                //one by one inside the loop. The loop will stop after reading the 
                //last data point in the file.
                BankCustomer current =  new BankCustomer(currentID,currentBalance);
                BankDatabase.AppendItem(current);
            }
        }
        return BankDatabase;
    }
  
}
