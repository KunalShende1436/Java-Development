public class SolidRhombus {
    public static void Solid_Rhombus(int n){
        for(int i=1;i<=n;i++){
            // Printing Spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // Printing Stars
            for(int j=1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5; 
        Solid_Rhombus(n);
    }
}
