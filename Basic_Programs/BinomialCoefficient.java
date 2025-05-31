package Basic_Programs;
public class BinomialCoefficient {
    public static int Fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }    
    public static int Binomial(int n,int r)
    {
        int n_fact=Fact(n);
        int r_fact=Fact(r);
        int n_r_fact=Fact(n-r);
        int coe;
        coe=n_fact/(r_fact*n_r_fact);
        return coe;
    } 
    public static void main(String[] args) {
        int n=5;
        int r=2;
        System.out.println("Binomial Coefficient of " + n + "C" + r + " is: " + Binomial(n, r));
    }
}
