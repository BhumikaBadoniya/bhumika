interface InterfaceA {
    void methodA1();
    void methodA2();
}

interface InterfaceB {
    void methodB1();
    void methodB2();
}

interface InterfaceC {
    void methodC1();
    void methodC2();
}

interface NewInterface extends InterfaceA, InterfaceB, InterfaceC {
    void newMethod();
}

class ConcreteClass {
    public void concreteMethod() {
        System.out.println("Concrete class method");
    }
}

class MyClass extends ConcreteClass implements NewInterface {
    @Override
    public void methodA1() {
        System.out.println("methodA1");
    }

    @Override
    public void methodA2() {
        System.out.println("methodA2");
    }

    @Override
    public void methodB1() {
        System.out.println("methodB1");
    }

    @Override
    public void methodB2() {
        System.out.println("methodB2");
    }

    @Override
    public void methodC1() {
        System.out.println("methodC1");
    }

    @Override
    public void methodC2() {
        System.out.println("methodC2");
    }

    @Override
    public void newMethod() {
        System.out.println("newMethod");
    }
}

public class A2Q18{
    public static void handleInterfaceA(InterfaceA obj) {
        obj.methodA1();
        obj.methodA2();
    }

    public static void handleInterfaceB(InterfaceB obj) {
        obj.methodB1();
        obj.methodB2();
    }

    public static void handleInterfaceC(InterfaceC obj) {
        obj.methodC1();
        obj.methodC2();
    }

    public static void handleNewInterface(NewInterface obj) {
        obj.newMethod();
        obj.methodA1();
        obj.methodB1();
        obj.methodC1();
    }

    public static void main(String[] args) {
        MyClass myObject = new MyClass();

        System.out.println("Handling InterfaceA:");
        handleInterfaceA(myObject);
        System.out.println();

        System.out.println("Handling InterfaceB:");
        handleInterfaceB(myObject);
        System.out.println();

        System.out.println("Handling InterfaceC:");
        handleInterfaceC(myObject);
        System.out.println();

        System.out.println("Handling NewInterface:");
        handleNewInterface(myObject);
    }
}

