public class oops05 {
    public static void main(String[] args) {

        // Part 1 - Enum
        Status p = Status.Failed;
        // .values() -> converts to an array
        Status[] s = Status.values();
        System.out.println(p);
        System.out.println(s[0]);
        // .ordinal() -> returns index
        for (Status v : s) {
            System.out.println(v + " : " + v.ordinal());
        }

        switch (p) {
            case Running:
                System.out.println("All Good..");
                break;
            case Failed:
                System.out.println("Please try again!");
                break;
            case Pending:
                System.out.println("Please wait..");
                break;
            default:
                System.out.println("Done.");
        }

        // Part 2 - Enum class
        for (Laptops lap : Laptops.values()) {
            System.out.println(lap + " : " + lap.getPrice());
        }

    }
}

// Part 1
// Status is a class by default and Failed, Running, Pending, Success are
// objects of Status.
// They have an index starting from 0.
enum Status {
    // by default public, static and final
    Failed, Running, Pending, Success
}

// Part 2
enum Laptops {
    Macbook(1800), Aero(1300), Spectre(1800), XPS(2000), Ideapad();

    private int price;

    // Private constructor works because objects are created inside the class.
    private Laptops() {
        this.price = 500;
    }

    private Laptops(int price) {
        this.price = price;
        System.out.println(this.name());
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}