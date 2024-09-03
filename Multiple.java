import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        int n = 10;
        int m;
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        for (int i = 0; i <= m; i++) {
            if (i % n == 0) {
                System.out.print(i +" ");
            }
        }
    }
}
