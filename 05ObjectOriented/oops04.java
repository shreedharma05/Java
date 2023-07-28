public class oops04 {
//    Part 1 - Need of Interface
//    class - class -> extends
//    class - interface -> implements
//    interface - interface -> extends
    
    public static void main(String[] args){
        Computer lap = new Laptop();
        Computer desk = new Desktop();

        Developer emp = new Developer();
//        This will be tightly coupled, if devapp takes parameter of type Laptop or Desktop (Anyone).
//        This concept of dynamic method dispatch through interfaces made it a loosely coupled architecture.
        emp.devApp(desk);
    }
}

// Part 1
// An Interface is a contract that defines a set of methods/properties a class must implements
// It is necessary to implement all methods in an interface to implement an interface, but not necessary for abstract class
// Abstract class can have non abstract methods/properties.
// A class can implement multiple interfaces but not extend multiple abstract classes.
// we can achieve multiple inheritance through interfaces.

interface Computer{
//    All methods in an interface are public and abstract by default.
    void code();
//    void debug();
    
//    All variables in an interface are final and static by default
//    because, intefaces don't have a memory in stack.
    int age = 12;
    String state = "California";
}

interface Demo extends Computer {
    
}

//abstract class Computer{
//    public abstract void code();
//}

class Demo1 implements Computer, Demo{
    public void code(){
        
    }
}

class Laptop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run");
    }
}
class Desktop implements Computer{
    public void code(){
        System.out.println("Code, Compile, Run, Faster");
    }
}
// 
class Developer{
//    devApp method has an argument of type Computer, similar to dynamic method dispatch
//    As Laptop class and Desktop class implements Computer interface,
//    those object created from them can be of type Computer itself.
    public void devApp(Computer sys) {
        sys.code();
    }
}



