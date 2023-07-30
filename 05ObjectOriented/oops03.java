public class oops3 {
        public static void main(String[] args) {

                // Part 1 - Object class
                Laptop obj1 = new Laptop();

                obj1.brand = "Apple";
                obj1.price = 799;

                // System.out.println(obj); //-> while printing, by default obj.toString() (in
                // built method in Object class which is inherited by default) is
                // printed.
                // But, what if i override toString() method?
                // System.out.println(obj.toString());

                Laptop obj2 = new Laptop();

                obj2.brand = "Apple";
                obj2.price = 799;

                // System.out.println(obj1.equals(obj2)); // -> equals is a method in Object
                // class
                // we can even over ride equals() method.
                System.out.println(obj1.equals(obj2));

                // Part 2 - Wrapper class

                int n = 5; // primitve type
                // Integer n1 = new Integer(n); // object type
                Integer n1 = n; // short hand syntax - autoboxing
                // which means, boxing your primtive type to an object type.
                // int n2 = n1.intValue(); // back to primitve type
                int n2 = n1; // short hand syntex - auto unboxing
                // which means, unboxing your object type to primitive type.

                String str = new String("12");
                int num = Integer.parseInt(str);
                System.out.println(num * 2);

                // Part 3 - Abstract class
                Wagonr obj3 = new Wagonr();
                obj3.playMusic();
                obj3.drive();

                // Part 4 - Inner class - (outer classes cannot be static)
                A obj4 = new A();
                obj4.show();

                // create object of inner class
                A.B obj5 = obj4.new B();
                obj5.config();
                // Inner classes can be static
                A.C obj6 = new A.C();
                obj6.config();

                // Part 5 - Anonymous inner class
                D obj7 = new D() {
                        // This block of code is the anonymous inner class
                        public void show() {
                                System.out.println("In new class show");
                        }
                };
                obj7.show();

                // Part 6 - Abstract and Anonymous inner class
                // they can go together
                E obj8 = new E() {
                        public void show() {
                                System.out.println("In E show");
                        }

                        public void config() {
                                System.out.println("In E config");
                        }
                };
                // Here, we actually creating an object from anonymous class and not abstract
                // class.
                obj8.show();
                obj8.config();
        }
}

// Part 1
class Laptop {
        String brand;
        int price;

        // over ride by us
        // public String toString() {
        // return "Hey..";
        // }

        // public boolean equals(Laptop that) {
        // return (this.brand.equals(that.brand) && this.price == that.price);
        // }

        // over ride by IDE
        // use over ride by IDE for best practices.

}

// Part 3

abstract class Car {
        // abstract method has declaration but not implementation.
        public abstract void drive();

        // Non abstract methods
        public void playMusic() {
                System.out.println("Music plays...");
        }
}

class Wagonr extends Car { // concrete class - which inherits abstract class
        public void drive() {
                System.out.println("Wagonr Driving...");
        }
}

// Part 4

class A {
        public void show() {
                System.out.println("In A showing");
        }

        class B {
                public void config() {
                        System.out.println("In B config");
                }
        }

        static class C {
                public void config() {
                        System.out.println("In C config");
                }
        }
}

// Part 5
class D {
        public void show() {
                System.out.println("In D show");
        }
}

// Part 6
abstract class E {
        abstract public void show();

        abstract public void config();
}