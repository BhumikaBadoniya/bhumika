public class LeapYear {
    public static void main(String[] args) {
        int year=2000;
        if((year%400==0) || (year%4==0&&year%100!=0)){
            System.out.println("this year is leap year");
        }else {
            System.out.println("the year is not leap year");
        }
    }
}
