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

public class oops3 {
    public static void main(String[] args) {
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

    }
}
