public class fibonacci {
    public static void main(String[] args) {
        int m=1,n=2,c=10;
        for(int i=0;i<c;i++){
            int y=m+n;
            System.out.print(y+ " ");
            m=n;
            n=y;
        }
    }
}
