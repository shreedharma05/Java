package others;

public class oops02 {
    public static void main(String[] args) {

        // Part 1 - super() and this()

        // B obj = new B();
        B obj = new B(5);
        // Every non inherited class inherites Object class by default

        // Part 2 - Anonymous objects
        // new C();
        new C().show(); // This object can be accessed only at creation (only once)

        // Part 3 - Inheritance
        VeryAdvCalc obj1 = new VeryAdvCalc();
        int r1 = obj1.add(2, 2);
        int r2 = obj1.sub(4, 2);
        int r3 = obj1.mul(2, 3);
        int r4 = obj1.div(4, 1);
        double r5 = obj1.pow(4, 4);

        System.out.println(r1 + " " + r2 + " " + r3 + " " + r4 + " " + r5);

        // Part 4 - Method Overriding
        E obj2 = new E();
        obj2.show();

        // Part 5 - Access Modifiers
        // public int z = 99;
        // public - accessible outside the package
        // private - accessible only within the class
        // default - accessible within the package
        // protected - accessible outside the package
        // only if the class is subclass

        // Part - 6
        // Dynamic method dispatch - polymorphism

//        X obj3 = new X();
//        obj3.show();

        // class Y inherits X and class Z inherits X, so objects of Y and Z can be a
        // type of X as well.
        // objects of class Y can be a type of X if and only Y inherits X.
        // same goes for Z and X.

//        obj3 = new Y();
//        obj3.show();

//        obj3 = new Z();
//        obj3.show();

// Typecasting - Upcasting
        X obj3 = new Y(); // creating an object from derived class with a type of base class.
        obj3.show1(); // type is upcasted.
//        obj3.show2(); // Doesn't work because its reference is to base class and not derived class.

// Typecsting - Downcasting
        Y obj03 = (Y) obj3; // changing the type to derived class from base class.
        obj03.show2(); // works because its reference is to derived class and not to base class.

        // part - 7
        // final keyword - variable, class, method
        final int g = 8; // -> remains constant forever

    }
}

// Part 1

// class B inherits class A and class A inherits class Object -> Multilevel
// inheritance

class A {
    public A() {
        // This super() calls the constructor of Object class
        super(); // -> This line stays in every constructor by default
        System.out.println("in A");
    }

    public A(int N) {
        System.out.println("in A int");
    }
}

class B extends A {
    public B() {
        // super(); // -> This line calls the constructor of parent class
        super(0);
        System.out.println("in B");
    }

    public B(int N) {
        this(); // -> this() executes the constructor of its own class, this() and super() won't
                // go together - anyone at a constructor.
        // super(N);
        System.out.println("in B int");
    }
}

// Part 2
class C {
    public C() {
        System.out.println("Object created");
    }

    public void show() {
        System.out.println("Showing anonymous object");
    }
}

// Part 3

class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }

    public int sub(int n1, int n2) {
        return n1 - n2;
    }
}

class AdvCalc extends Calc {
    public int mul(int n1, int n2) {
        return n1 * n2;
    }

    public int div(int n1, int n2) {
        return n1 / n2;
    }
}

class VeryAdvCalc extends AdvCalc {
    public double pow(int n1, int n2) {
        return (Math.pow(n1, n2));
    }
}

// Part 4
class D {
    public void show() {
        System.out.println("Showing in A");
    }

    public void config() {
        System.out.println("Config in A");
    }
}

class E extends D {
    public void show() {
        System.out.println("Showing in B");
    }
}

// Part 6
class X {
    public void show() {
        System.out.println("In X show");
    }
    public void show1() {
        System.out.println("In X show");
    }
}

class Y extends X {
    public void show() {
        System.out.println("In Y show");
    }
    public void show2() {
        System.out.println("In Y show");
    }
}

class Z extends X {
    public void show() {
        System.out.println("In Z show");
    }
}

// Part 7
// final class Comp{ // -> final keyword stops inheritance of this class
// void show() {
// System.out.println("in Comp show");
// }
// }

// class lap extends Comp{

// }

class Comp {
    final void show() { // -> final keyword stops overloading for this method
        System.out.println("in Comp show");
    }
}

class lap extends Comp {
//    void show() {
//        System.out.println("in lap show");
//    }
}