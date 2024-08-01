public class number {
    public static void main(String[] args) {
        int n = 77;
        if (n % 2 == 0) {
            System.out.println("The number is even");

        } else {
            System.out.println("The number is odd");
        }
        int m = 5;
        int a = 0;
        for (int i = 2; i < m; i++) {
            if (m % i == 0) {
                a++;
            }
        }
        if (a == 0) {
            System.out.println("The no. is prime");
        }
        int b=5;
        int fact=1;
        for(int i=1;i<=b;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
    }

}
