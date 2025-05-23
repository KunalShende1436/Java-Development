public class DecimalToBinary {
    public static void findBinary(int DecimalNum){
        int BinaryNum=0;
        int power=0;

        while(DecimalNum>0){
            int remainder= DecimalNum%2;

            BinaryNum+= remainder*(int)Math.pow(10,power);
            power++;
            DecimalNum= DecimalNum/2;
        }
        System.out.println("Binary number is: " + BinaryNum);
    }
    public static void main(String[] args) {
        int DecimalNum=11;
        System.out.println("Decimal number is: " + DecimalNum);
        findBinary(DecimalNum);
    }
}
