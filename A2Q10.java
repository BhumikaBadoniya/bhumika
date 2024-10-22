class vehicle{
    int regnNumber,Speed;
    String color,ownerName;
    void showData(){
        System.out.println("this is a vehicle class");
    }
}
class bus extends vehicle{
    private int routeNo;
    bus(int regnNumber,int Speed,String color,String ownerNme){
        super.regnNumber=regnNumber;
        super.Speed=Speed;
        super.color=color;
        super.ownerName=ownerNme;
    }
    void showData(){
        System.out.println("The regnumber of bus is:"+regnNumber);
        System.out.println("The speed of bus is:"+Speed);
        System.out.println("The color of bus is:"+color);
        System.out.println("The owner's name of bus is:"+ownerName);
    }
}
class car extends vehicle{
    private int routeNo;
    car(int regnNumber,int Speed,String color,String ownerNme){
        super.regnNumber=regnNumber;
        super.Speed=Speed;
        super.color=color;
        super.ownerName=ownerNme;
    }
    void showData(){
        System.out.println("The regnumber of car is:"+regnNumber);
        System.out.println("The speed of car is:"+Speed);
        System.out.println("The color of car is:"+color);
        System.out.println("The owner's name of car is:"+ownerName);
    }
}
public class A2q10 {
    public static void main(String[] args) {
        bus bus=new bus(12,24,"blue","bhumika");
        bus.showData();
        car car=new car(11,54,"red","kanishka");
        car.showData();
    }
}
