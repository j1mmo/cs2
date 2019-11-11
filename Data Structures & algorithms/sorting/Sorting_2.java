  
package sortingnames;

//Since we are comparing strings, you need to use StringA.compareToIgnoreCase(StringB)
//to sort items under alphabetical order
public class Sorting {
    
    //Create a sorting algorithm using Insertion Sort
    public static void InsertionSort(String[] data)
    {
        for(int i = 1; i < data.length; i++){
            int j = i;
            while(j > 0 && data[j-1].compareToIgnoreCase(data[j]) > 0){
                swap(data, j);
                j--;
            }
        }
    }
    public static void swap(String[] data,int index){
        String temp = data[index];
        data[index] = data[index-1];
        data[index-1] = temp;
    }
    
    //Create a sorting algorithm using Meger Sort
    public static void MergeSort(String[] data){
        Sort(data,0,data.length-1);
    }
    
    private static void Sort(String[] data,int l,int r) {
    if (l>=r) return;
    int m = (l+r)/2; 

    Sort(data, l, m) ;
    Sort(data, m+1, r); 

    Merge(data, l, m, r);
    }
    public static void QuickSort(String[] data,int left, int right){
        if(left < right){
            int pi = partition(data, left, right);
            
           QuickSort (data, left, pi-1);
           QuickSort (data, pi+1, right);
        }
    }
    private static int partition(String[] data, int left,int right){
        String pivot = data[right];
        int i = left;
        for(int j = i;j<right;j++){
            if(data[j].compareToIgnoreCase(pivot) <0){
                String temp = data[i];
                data[i] = data[j];
                data[j] = temp;
                i++;
            }
        }
        String temp = data[right];
        data[right] = data[i];
        data[i] = temp;
        return i;
    }
    private static void Merge(String[] data,int l, int m, int r)
    {
        int dataLeft = m-l+1; //Get length of subarray 1
        int dataRight = r-m; //Get length of subarray 2
        int i,j,k;
        
        String[] a1 = new String[dataLeft];
        String[] a2 = new String[dataRight];
        for(i = 0; i < dataLeft;i++){
            a1[i] = data[i+l];
        }
        for(i = 0; i < dataRight;i++){
            a2[i] = data[i+m+1];
        }
        
        i=0;
        j=0;
        k=l;
        
        while(i < dataLeft && j < dataRight){
            if(a1[i].compareToIgnoreCase(a2[j]) < 0){
                data[k++]=a1[i++];
            }else{
                data[k++]=a2[j++];
            }
        }
        while (i < dataLeft){
            data[k++]=a1[i++];
        }
        while(j < dataRight){
            data[k++]=a2[j++];
        }
    }


    
    //Create some other private helper functions.
    
}
