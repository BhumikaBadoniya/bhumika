import java.util.Scanner;

abstract class ThreeDObjects {
    public abstract double wholeSurfaceArea();

    public abstract double volume();
}

class box extends ThreeDObjects {

    double l, b, h;

    box(double l, double b, double h) {
        this.l = l;
        this.b = b;
        this.h = h;
    }

    @Override
    public double wholeSurfaceArea() {
        return 2 * (l * b + b * h + h * l);

    }

    @Override
    public double volume() {
        return l * b * h;
    }
}

class cube extends ThreeDObjects {
    double a;

    cube(double a) {
        this.a = a;
    }

    public double wholeSurfaceArea() {
        return 6 * a * a;
    }

    public double volume() {
        return a * a * a;
    }
}

class cylinder extends ThreeDObjects {
    double l, r;

    cylinder(double l, double r) {
        this.l = l;
        this.r = r;
    }

    public double wholeSurfaceArea() {
        return 2 * Math.PI * r * (r + l);
    }

    public double volume() {
        return Math.PI * r * r * l;
    }
}

class cone extends ThreeDObjects {
    double r, h;

    cone(double r, double l) {
        this.r = r;
        this.h = h;
    }

    public double wholeSurfaceArea() {
        return Math.PI * r * (r + Math.sqrt(h * h + r * r));
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * r * r * h;
    }
}

public class a2q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the dimensions of box");
        box box = new box(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
        System.out.println("The whole surface area of box: " + box.wholeSurfaceArea());
        System.out.println("The volume of box:" + box.volume());

        System.out.println("Enter the dimensions of cube");
        cube cube = new cube(sc.nextDouble());
        System.out.println("The whole surface area of cube: " + cube.wholeSurfaceArea());
        System.out.println("The volume of cube:" + cube.volume());

        System.out.println("Enter the dimensions of cylinder");
        cylinder cylinder = new cylinder(sc.nextDouble(), sc.nextDouble());
        System.out.println("The whole surface area of cylinder: " + cylinder.wholeSurfaceArea());
        System.out.println("The volume of cylinder:" + cylinder.volume());

        System.out.println("Enter the dimensions of cone ");
        cone cone = new cone(sc.nextDouble(), sc.nextDouble());
        System.out.println("The whole surface area of cylinder: " + cone.wholeSurfaceArea());
        System.out.println("The volume of cone :" + cone.volume());
        sc.close();
    }
}