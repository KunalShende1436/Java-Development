package Patterns;
public class HollowRhombus {
    public static void Hollow_Rhombus(int n){
        for(int i=1;i<=n;i++){
            // Printing Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Printing Stars and Spaces
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        Hollow_Rhombus(n);
    }
}
