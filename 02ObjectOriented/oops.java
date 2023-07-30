public class oops {
    public static void main(String[] args) {

        // Part 1
        // Class and Objects

        Calculator obj = new Calculator();
        int num1, num2;
        num1 = 2;
        num2 = 4;
        int result = obj.add(num1, num2);
        System.out.println(result);

        // Part 2
        // Methods

        Computer obj2 = new Computer();
        obj2.playmusic();
        String pen = obj2.penGetter(20);
        System.out.println(pen);

        // Part 3
        // Method overloading

        Calculator obj3 = new Calculator();
        System.out.println(obj3.add(5, 10));
        System.out.println(obj3.add(5, 10, 20));
        System.out.println(obj3.add(5, 10.002));

        // Types of memory (data area) - stack and heap
        // each and every method has its own stack
        // local variables (declared inside methods) gets stored in stack.
        // instance variables belong to a class not to a method
        // A method's stack has two partitions, one contains its local variable's name
        // and
        // other has their values (Representations below).
        // obj, obj2, obj3 are not objects they are variables refering to objects.
        // All objects are stored inside the heap memory.
        // The objects again has two partitions (similar to stack), one contains all
        // instance variables (declared outside methods but inside class)
        // and other has all method declaration available.
        // As obj, obj1, obj2 are variables they go in stack memory (under which they
        // are declared Ex: main method)
        // with address location of objects in the heap memory as values
        //
        // Stack : main
        // _________
        // |key |val |
        // |obj3|105 | -> 105 is address location of obj3 in heap memory.
        // |num2| 4 |
        // |num1| 2 |
        // |obj |101 |
        // __________

        // Part 4
        // Static variable

        Phone obj4 = new Phone();
        obj4.brand = "Apple";
        obj4.price = 1500;
        // obj4.name = "Smartphone";
        Phone.name = "Smartphone";

        Phone obj5 = new Phone();
        obj5.brand = "Samsung";
        obj5.price = 1700;
        // obj5.name = "Smartphone";

        obj4.show();
        obj5.show();

        // static variables belongs to a class and not to an object, so it should be
        // reffered via class name and not object's name.
        // static variable means a common variable shared by all objects
        // if you change its value then it is reflected everywere.
        // static variables have thier own space in JVM and not stored in heap memory.

        // Part 5
        // static block

        // static variables should go inside static block.
        // while creating an object we have to give required parameters in
        // constructor method but it doesn't makes sense to pass static variable in
        // constructor so it has its own block called static block.

        // when first object gets created, first the class loads (ones for all objects)
        // and then object gets
        // instantiated, when object gets instantiated the constructor executes only
        // once for each object.
        // when class loads the static bolck executes. as the class loads only once the
        // static block also executes only once.
        // JVM has a class loader where all the classes gets loaded
        // class loads only once and that too if an object gets created, if objects
        // aren't created then class doesn't loads, if it doesn't loads then static
        // block
        // doesn't executes.

        // To load your class without creating object,
        // "Class" keyword has a method "forName", used to load your class which
        // ultimately results
        // in execution of static block
        // Class.forName(className: "Phone");

        // Part 6
        // static method

        // static method belongs to class and not to objects
        // static methods can be called using class's name and not object's name
        // static method can have access to static variables but not to instance
        // varibles which belongs to objects.
        // but, if an object is passed as parameter to static method then the static
        // method has access to the object's instance variables.

        Phone obj6 = new Phone();
        obj6.brand = "Nothing";
        obj6.price = 800;
        Phone.show2(obj6);
        // here, the static method show2 has access to obj6's instance variables.

        // In case of main method being static :
        // main method is the starting point of execution (executes first)
        // if it is not static then it won't get execute until and unless an object is
        // created under the class,
        // if the starting point of the execution didn't start then how can you create
        // an object.
        // you can't even create any object without executing main method so, this leads
        // to a deadlock.

        // Part 7
        // Encapsulation

        Human obj7 = new Human();
        // System.out.println(obj7.age);
        // System.out.println(obj7.name);
        obj7.setAge(50);
        obj7.setName("Joel");

        // Part 8
        // Constructor, constructor overloading and parameterized constructor
        Human obj8 = new Human();
        System.out.println(obj8.getName() + " : " + obj8.getAge());
        Human obj9 = new Human(14, "Ellie");
        System.out.println(obj9.getName() + " : " + obj9.getAge());
    }
}

class Calculator {

    // Part 1
    public int add(int a, int b) {
        return (a + b);
    }

    // Part3 - Method overloading
    public int add(int a, int b, int c) {
        return (a + b + c);
    }

    public double add(int a, double b) {
        return (a + b);
    }
}

class Computer {

    // Part 2
    public void playmusic() {
        System.out.println("Music Plays..");
    }

    public String penGetter(int amount) {
        if (amount >= 10) {
            return "Pen";
        }
        return "Need more money!";
    }
}

class Phone {
    // Part 4

    String brand;
    int price;
    static String name;

    // Part 5

    static {
        name = "Phone";
    }

    public Phone() {
        // String brand = "Apple"; //
        // int price = 200; //
    }

    // Part 6

    // instance method
    public void show() {
        System.out.println(brand + " " + price + " " + name);
    }

    // static method
    public static void show1() {
        // System.out.println(brand + " " + price + " " + name);
    }

    public static void show2(Phone obj) {
        System.out.println(obj.brand + " " + obj.price + " " + name);
    }
}

class Human {

    // Part 8
    public Human() {
        age = 34;
        name = "Tess";
    }

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Part 7
    private int age;
    private String name;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}