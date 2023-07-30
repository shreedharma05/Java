public class Annotations {
    public static void main(String[] args) {

        // Part - 1
        // Annotations
        // Annotations are used reduce logical errors.
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();

        // Part - 2
        // Annotations - Functional interfaces
        // Anonymous inner function
        // X obj1 = new X() {
        // public void show() {
        // System.out.println("in X show");
        // }
        // };
        // obj1.show();

        // Part - 3
        // Lambda Expression
        // instead of anonymous inner function for functional interfaces you can use
        // lambda expression (works only for funtional interfaces)
        X obj1 = (i, j) -> i + j;
        System.out.println(obj1.show(5, 5));
    }
}

// @Deprecated // -> indicates not to use this class (cause its deprecated)
class A {
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In A show");
    }
}

class B extends A {
    @Override // -> checks if properly overrided
    public void showTheDataWhichBelongsToThisClass() {
        System.out.println("In B show");
    }
}

// Functional Interface - which contains only single method declaration
@FunctionalInterface
interface X {
    public int show(int i, int j);
}

// class C implements X {
// public void show() {
// System.out.println("in C show");
// }
// }