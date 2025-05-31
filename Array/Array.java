package Array;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter elements in the array:");
        int marks[]=new int[5];
        for(int i=0;i<marks.length;i++){
            marks[i]=sc.nextInt();
        }
        System.out.println("The elements in the array are:");
        for(int i=0;i<marks.length;i++){
            System.out.print(marks[i]+" ");
        }
        sc.close();
    }
}
