/*
 * Data Structures and algorithms 2
 * Searching Algorithms
 */
package week2;

/**
 *
 * @author b8045796
 */
public class SearchingArray {
    public SearchingArray(){}
    
    public boolean R_isSorted(int[] array, int index){
        //recursive check if an array is sorted
        if(array == null){
            System.err.println("error: empty array");
            return false;
        }
        if(index == array.length-1) return true;
        else if (array[index]>array[index+1]) return false;
        else return R_isSorted (array, index +1);
    }
    
    public boolean I_isSorted(int a[]){
        //Iterative check if an array is sorted
        for(int i = 1;i < a.length; i++){
            if(a[i-1] > a[i]) return false;
        }
        return true;
    }
    public int LinearSearch(int a[], int search){
        //Linear search to find an integer search
        for(int i = 0; i < a.length; i++){
            if(a[i] == search){
                return i;
            }
        }
        return -1;
    }
    public int I_binarySearch(int a[], int search){
        //linear binary search to find an integer search
        int left = 0;
        int right = a.length -1;
        while(left <= right){
            int mid = (left+right)/2;
            if(a[mid] > search)
                right = mid - 1;
            else if(a[mid] < search){
                left = mid + 1;
            }
            else return a[mid];
        }
        return -1;
    }
    public int R_binarySearch(int data[], int search, int low, int high){
        //recusive binary search to find an integer search
        int mid = ((high+low)/2);
        if(high<low) return -1;
        if(search < data[mid]) return R_binarySearch(data, search, low, mid-1);
        if(search > data[mid]) return R_binarySearch(data, search, mid+1, high);
        if(search == data[mid]) return mid;
        return -1;
    }
}
