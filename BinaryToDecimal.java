public class BinaryToDecimal {
    public static void findDecimal(int BinaryNum)
    {
        int power=0;
        int dec=0;

        while(BinaryNum>0){
            int LD= BinaryNum % 10;
            dec+= LD* (int)Math.pow(2,power);
            power++; 

            BinaryNum= BinaryNum/10;
        }

        System.out.println("Decimal number is: " + dec);
    }
    public static void main(String[] args) {
        int BinaryNum=101;
        System.out.println("Binary number is: " + BinaryNum);
        findDecimal(BinaryNum);
    }
}
