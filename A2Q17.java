class sum{
int no;
sum(int no){
    this.no=no;
}
void SumOfDigit(){
int remainder;
int consecutive=0;
for(int i =0;i<3;i++){
    remainder =no%100;
    consecutive=consecutive+remainder;
    no=no/10;
}
System.out.println(consecutive);
}
}
public class A2Q17 {
    public static void main(String[] args) {
        sum s=new sum(2415);
        s.SumOfDigit();
    }
}
