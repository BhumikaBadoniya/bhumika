public class primeNO {
    public static void main(String[] args) {
        int n=4;
        int a=0;
        for(int i=2;i<n;i++){
            if(n%i==0)
            a++;
        }
        if(a==0){
            System.out.println("The no. is prime");
        }else{
            System.out.println("The no is not prime");
        }
    }
}
     