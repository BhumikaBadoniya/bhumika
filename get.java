class abc{
    private String s1="apple";

public String get(){
    return s1;
}
}
public class get {
    public static void main(String[] args) {
         
        abc o1 =new abc();
        System.out.println(o1.get());
    }
}
