import java.util.Scanner;

public class pascal {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }int a=1;
            for(int j=1;j<=i;j++){
                
                System.out.print(a);
                a++;
            }
            a--;
            for(int j=2;j<=i;j++){
                a--;
                System.out.print(a);
            }
            System.out.println();
            
        }
        
    } 
}
