public class InvertedStarPattern {
    public static void main(String[] args) {
       int lines=4;
       for(int i=1;i<=lines;i++){
        
        for(int star=1;star<=lines-i+1;star++){
            System.out.print("*");
        }
        System.out.println();
       } 
    }    
}
