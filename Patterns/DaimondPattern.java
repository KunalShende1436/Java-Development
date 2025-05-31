package Patterns;
public class DaimondPattern {
    public static void Daimond(int n)
    {
        for(int i=1;i<=n;i++)
        {
            // Printing Spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // Printing Stars
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n;i>=1;i--)
        {
            // Printing Spaces
            for(int j=1;j<=n-i;j++)
            {
                System.out.print(" ");
            }
            // Printing Stars
            for(int j=1;j<=2*(i-1)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 4; 
        Daimond(n);
    }
}
