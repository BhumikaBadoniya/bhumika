class area {
    double length;
    double breadth;

    area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

   
    double Area2() {
        return length*breadth;
    }
}

public class ConstArgu {
    public static void main(String[] args) {
        area ob = new area(5, 9);
       double Area;
        Area = ob.Area2();
        System.out.println(Area);
       
    }
}
