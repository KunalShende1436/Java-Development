package Sorting;

public class InsertionSort {
    public static void insertionSort(int arr[]){
        int n=arr.length;
        System.out.println("Unsorted array is:");   
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        for(int i=1;i<n;i++)
        {
            int current=arr[i];
            int prev=i-1;
            //finding the position of current element
            while(prev>=0 && arr[prev]>current)
            {
                //shifting the elements
                arr[prev+1]=arr[prev];
                prev--;
            }
            //inserting the current element at its correct position
            arr[prev+1]=current;
        }
        System.out.println("Sorted array is:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr);
        int[] arr2 = {111,22, 31, 84, 56};
        insertionSort(arr2);
    }
}
