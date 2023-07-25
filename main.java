public class main {
    public static void main(String[] args) {

        // A obj = new A();
        // B obj2 = new B();
        // System.out.println(obj);
        // System.out.println(obj2);
        A obj = new A();
        System.out.println(obj);
        obj = new B();
        System.out.println(obj);
        // obj's type stil remains A

    }
}

class A {

}

class B extends A {

}
