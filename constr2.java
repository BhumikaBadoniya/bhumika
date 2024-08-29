class color{
    int z=23;
    color(int a,int b){
       int z=a*b;
    }
}
public class constr2 {
    public static void main(String[] args) {
        color ob = new color(2,3);
        System.out.println(ob.z);
    }
}
