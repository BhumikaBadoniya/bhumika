import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        int n=26;
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        if(n%m==0){
            System.out.println("The no. is divisible by "+m);
        }else{
            System.out.println("The no. is not divisible by "+m);
        }
    }
}
