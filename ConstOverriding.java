
    class area {
        double length;
        double breadth;
    
        area(double length, double breadth) {
            this.length = length;
            this.breadth = breadth;
        }
    
        area(double length) {
            this.length = breadth=length;
        }
        area(){
            length=1;
            breadth=1;
        }
        double Area2() {
            return length*breadth;
        }
    }
    
    public class ConstOverriding {
        public static void main(String[] args) {
            area ob = new area(5, 9);
            area ob1 = new area(12);
            area ob2 = new area();
            double Area;
            Area = ob.Area2();
            System.out.println(Area);
            Area = ob1.Area2();
            System.out.println(Area);
            Area = ob2.Area2();
            System.out.println(Area);
        }
    }
    

