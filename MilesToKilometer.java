import java.util.Scanner;

public class MilesToKilometer {
    public static void main(String[] args) {
        double miles,kilometer;
        Scanner sc=new Scanner(System.in);
        miles=sc.nextInt();
        kilometer=miles*1.609;
        System.out.println("Miles to kilometer "+kilometer);
    }
}
