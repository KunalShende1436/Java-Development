package Basic_Programs;
public class PrimeInRange {
    public static boolean isPrime(int n)
    {
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n % i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n)
    {
        for(int i=2;i<=n;i++){
            if(isPrime(i))
            {
                System.out.print(i + "\t");
            }

        }
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("Prime numbers in range 1 to " + n + " are:");
        primeInRange(n);
    }
}
