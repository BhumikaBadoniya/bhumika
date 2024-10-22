 class distance{
    public double D;
    distance(double D){
        this.D=D;
    }
    public void travelTime(){
        int Speed=60;
        double time=D/Speed;
        System.out.println("Time taken to cover the distance when the speed is 60 miles per hour: "+ time);
    }
}
 class DistanceMKS extends distance{
    
   public  DistanceMKS(double D){
        super(D);
    }
    public void travelTime(){
        int speed=100;
        double time=D/speed;
        System.out.println("Time taken to cover the distance when the speed is 100 km per hour: "+time);
    }
}
public class A2Q12 {
    public static void main(String[] args) {
        distance d=new distance(120);
        d.travelTime();
        DistanceMKS D=new DistanceMKS(200);
        D.travelTime();
    }
}
