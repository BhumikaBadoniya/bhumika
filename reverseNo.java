public class reverseNo {
    public static void main(String[] args) {
        int m= 654;
        int rev=0,no;
        while(m!=0){
            no=m%10;
            rev=(rev*10)+no;
            m=m/10;
        }
        System.out.println(rev);
    }
}
