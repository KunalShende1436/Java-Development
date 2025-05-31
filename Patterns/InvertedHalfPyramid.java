package Patterns;
public class InvertedHalfPyramid {
    public static void createInvertedHalfPyramid(int rows) 
    {
        for (int i=1;i<=rows;i++){
        //For Space 
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
        //For Star
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    } 
    public static void main(String[] args) {
        int rows=5;
        createInvertedHalfPyramid(rows);
    }   
}
