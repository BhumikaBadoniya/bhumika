class a{
    void m1(){
        System.out.println("i am devil of this world");
    }
}
class b extends a{
    void m1(){
        System.out.println("I am iron man ");
    }
}
public class methOverri {
    public static void main(String[] args) {
       a a=new a();
       a.m1();
        b b=new b();
        b.m1();

    }
}
