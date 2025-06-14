package Sorting;
import java.util.*;
public class InBuiltSort_algo {
    public static void inBuiltSort(Integer[] arr)
    {
        System.out.println("Array Before Sorting");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr);
        System.out.println("Array Sorting in Increasing Order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("Array Sorting in Decreasing Order:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
        // Sortint in range(Starting Index-Ending Index)
         Arrays.sort(arr,0,3);
        System.out.println("Array Sorting in Increasing Order in range of 0-3:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        } 
        System.out.println();
        Arrays.sort(arr,0,3,Collections.reverseOrder());
        System.out.println("Array Sorting in Decreasing Order in range of 0-3:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println(); 
    }
    public static void main(String[] args) {
        Integer [] arr={55,33,22,44,11};
        inBuiltSort(arr);

    }
}
