import java.util.Scanner;

public class celciusToFehreneit {
    public static void main(String[] args) {
        float celcius;
        Scanner sc=new Scanner(System.in);
        celcius=sc.nextFloat();
        float fehreneit=((celcius*9)/5)+32;
        System.out.println("into F "+ fehreneit);
    }
}
