class area {
    double length;
    double breadth;

    area() {
        length = 10;
        breadth = 20;
    }

    double Area1() {
        return length * breadth;
    }
}

public class ConstZeroArgu {
    public static void main(String[] args) {
        area ob = new area();
        double Area=ob.Area1();
        System.out.println(Area);

    }
}
