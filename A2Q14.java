class color{
    String nameOfColor;
    color(String nameOfColor){
        this.nameOfColor=nameOfColor;
    }
    void print(){
        System.out.println(nameOfColor);
    }
}
public class A2Q14 {
    public static void main(String[] args) {
        color c=new color("red");
        c.print();

    }
}
