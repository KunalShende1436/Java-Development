public class PrimeOrNot {
    public static void Prime(int n)
    {
        for(int i=2;i<n;i++){
            if(n % i==0){
                System.out.println(n + " is not a prime number.");
                return;
            }
            else{
                System.out.println(n + " is a prime number.");
                return;
            }   
        }    
    }
    public static void main(String[] args) {
        int n=5;
        Prime(n);
        n=4;
        Prime(n);
    }
}
