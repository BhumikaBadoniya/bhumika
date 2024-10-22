class ietDavv{
    String nameOfUniversity="DAVV";
    String college="IET";
   public void print(){
        System.out.println(college+"-"+nameOfUniversity);
        System.out.println();
    }
}
class IT extends ietDavv{
    int TotalStudents=140;
    int hostelers=70;
    int localite=50;
    public void print1(){
        System.out.println("total no. of Student in it branch : "+TotalStudents);
        System.out.println("No. of hostelers in it branch: "+hostelers);
        System.out.println("No. of localite in it branch: "+localite);
        System.out.println();
    }
}
class ITb extends IT{
    int TotalStudents=80;
    int hostelers=45;
    int localite=35;
   public  void print2(){
    System.out.println("total no. of Student in it, section b: "+TotalStudents);
        System.out.println("No. of hostelers in it, section b: "+hostelers);
        System.out.println("No. of localite in it, section b: "+localite);
   }
}
public class A2Q13 {
    public static void main(String[] args) {
        ITb a=new ITb();
        a.print();
        a.print1();
        a.print2();
    }
}
