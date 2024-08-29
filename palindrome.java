import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
     String s1;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the String");
      s1=sc.nextLine();
     String rev="";
     int length=s1.length();
    for(int i=0;i<=length-1;i++)   
     rev = rev+s1.charAt(i);
     if(s1.equals(rev)){
        System.out.println("The String is palindrome");
     }else{
        System.out.println("The String is not palindrome");
     }
    }   
}
