import java.util.Scanner;

public class fehrenheitToCelcius {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float fehreneit=sc.nextFloat();
        float celcius=((fehreneit-32)*5)/9;
        System.out.println("into celcius "+ celcius);
    }
}
