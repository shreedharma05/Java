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
    }
}

// Status is a class by default and Failed, Running, Pending, Success are
// objects of Status.
// They have an index starting from 0.
enum Status {
    Failed, Running, Pending, Success
}