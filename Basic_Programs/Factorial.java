package Basic_Programs;
public class Factorial {

    public static int Fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 4 is: " + Fact(4));
    }
}
