public class basics {

    // Java uses unicode not ascii
    // Data types => primitive and non-primitive
    // primitive => int, float, char, boolean
    // int => int, long, short, byte
    // float => float, double -> float x = 5.6f, double y = 5.6 (Default)
    // char => used for single character -> char x = 'k'

    public static void main(String[] args) {

        // Part 1
        // Variables

        int x = 5; // size => 4 bytes
        long lo = 998; // 8 bytes
        short sh = 45; // 2 bytes
        byte by = 27; // 1 byte = 8 bits

        float fl = 6.5f; // 4 bytes
        double dou = 6.75; // 8 bytes

        char ch = 'k'; // 2 bytes = 16 bits

        boolean y = true; // 1 byte = 8 bits

        // Part 2
        // Type conversion and casting

        byte b = 127;
        // int a = 256;
        int a = 5;
        // b = a => false
        // a = b => true -> range is wider
        // To change explicitly which means casting
        b = (byte) a; // => true -> if a value is within b's range, if greater then modulo of max
        // range is assigned

        // Part 3
        // relational conditionals

        int c = 5;
        int d = 10;
        int e = 12;
        int f = 20;

        boolean res = c < d && e > f;
        // boolean res = c < d & e > f;
        // boolean res = c < d | e > f;
        // boolean res = c < d || e > f;
        // & checks both the boolean values irrespective of any values even if first
        // value is false (if any value is false then res is false),
        // && gives results faster because it knows that the result is false if first
        // value is false (it doesn't checks second value)
        // vice versa for ||
        System.out.println(!res);

        // Part 4
        // if, else
        if (c > d) {
            System.out.println(c);
        } else if (e < f) {
            System.out.println(e);
        } else {
            System.out.println(d);
        }
        int results = c > d ? c : d;

        // Part 5
        // Switch statements
        int num = 2;

        switch (num) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thrusday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        }

        // Part 6
        // While, Do while, For loops

        int i = 1;
        while (i <= 5) {
            System.out.println("Hey " + i);
            int j = 1;
            while (j <= 2) {
                System.out.println("Hi " + j);
                j++;
            }
            i++;
        }

        int j = 2;
        do {
            System.out.println(j);
        } while (j < 2);

        for (int k = 0; k <= 5; k++) {
            System.out.println(i);
        }
        int k = 1;
        for (; k <= 5;) {
            //
        }
        k++;
    }
}
