
public class DecimalTobinary  {
    public static void main(String[] args) {
        int m=5;
        int remainder,binary=0,no=m;
        for(int i=1;i<m-1;i++){
        remainder=no%2;
        binary= (binary*10)+remainder;
        no=no/2;}
        System.out.println(binary);
    }

}