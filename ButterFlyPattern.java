public class ButterFlyPattern {
    public static void Butterfly_Pattern(int n) {
        //1st Half
        for(int i=1;i<=n;i++){
            //Printing Stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Printing Spaces-2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Printing Stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd Half
        for(int i=n;i>=1;i--){
            //Printing Stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //Printing Spaces-2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //Printing Stars-i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        Butterfly_Pattern(n);
    }
}
