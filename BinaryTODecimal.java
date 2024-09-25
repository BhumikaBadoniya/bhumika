public class BinaryTODecimal {
    public static void main(String[] args) {
        long m = 100;
        int i = 0, decimal = 0;
        long no = m;
        long remainder;
        while (m != 0) {
            remainder = m % 10;
            m = m/ 10;
            decimal += remainder * Math.pow(2, i);
            ++i;

        }System.out.println(decimal);

    }
}