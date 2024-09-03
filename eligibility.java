import java.util.Scanner;

public class eligibility {
    public static void main(String[] args) {
        float Marks_of_mathematics,Marks_of_physics,Marks_of_chemistry;
        Scanner sc=new Scanner(System.in);
        Marks_of_mathematics=sc.nextFloat();
        Marks_of_chemistry=sc.nextFloat();
        Marks_of_physics=sc.nextFloat();
        float Total_marks=Marks_of_chemistry+Marks_of_mathematics+Marks_of_physics;
        if(Marks_of_mathematics>=60 &&Marks_of_chemistry>=50&&Marks_of_physics>=40 && Total_marks>=200)  {
            System.out.println("eligible");
        }else{
            System.out.println("not eligible");
        }
    }
}
