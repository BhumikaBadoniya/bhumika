import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        int grade;
        char a='A',b='B',c='C',d='D',e='E',f='F';
        Scanner sc=new Scanner(System.in);
        grade=sc.nextInt();
        if(grade>=90){
            System.out.println(a);
        }else if(grade>=80){
            System.out.println(b);
        }else if(grade>=70){
            System.out.println(c);
        }else if (grade>=60){
            System.out.println(d);
        }else if(grade>=40){
            System.out.println(e);
        }else if(grade<40){
            System.out.println(f);
        }
    }
}
