class num {
    int number;

    public num(int number) {
        this.number = number;
    }

    public void showNum() {
        System.out.println(number);
    }
}

class hexNum extends num {
    public hexNum(int number) {
        super(number);
    }
    public void showNum(){
        System.out.println("Hexadecimal: " + Integer.toHexString(number).toUpperCase());
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class A2Q11 {
    public static void main(String[] args) {
        num num = new num(17);
        num.showNum();
        hexNum hexNum = new hexNum(17);
        hexNum.showNum();
    }
}
