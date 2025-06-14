package Sorting;

public class CountingSort {
    public static void countSort(int[] arr){
        int n=arr.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            largest = Math.max(largest,arr[i]);
        }
        int[] count = new int[largest + 1];
        for(int i=0;i<n;i++){
            count[arr[i]]++;
        }
        //Sorting the array
        int j = 0;
        for(int i=0;i<count.length;i++){
            while(count[i] > 0){
                arr[j++] = i;
                count[i]--;
            }
        }
        //Printing the sorted array
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {4, 2, 2, 8, 3, 3, 1};
        countSort(arr);

    }
}
