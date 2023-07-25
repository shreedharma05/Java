public class arrays {
    public static void main(String[] args) {

        // Part 1
        // Arrays

        int nums[] = { 2, 3, 4, 6 };
        // int nums[] = new int[4]
        nums[1] = 8;
        System.out.println(nums[1]);
        for (int i = 0; i < 4; i++) {
            System.out.println(nums[i]);
        }

        // Part 2
        // Multi-dimentional array

        int num[][] = new int[3][4];

        // double rand = Math.random();
        // seeding random values in array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                num[i][j] = (int) (Math.random() * 10);
            }
        }
        // printing 2D array - For loop
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }
        // printing 2D array - Enhanced For loop
        for (int i[] : num) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Part 3
        // Jagged array - the inner arrays are of different lengths

        int num1[][] = new int[3][];
        num1[0] = new int[3];
        num1[1] = new int[4];
        num1[2] = new int[2];

        for (int i = 0; i < num1.length; i++) {
            for (int j = 0; j < num1[i].length; j++) {
                num1[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i[] : num1) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // 3D Array
        // int num2[][][] = new int[4][4][4];
        // System.out.println(num2);

        // You can't increse size of array after declaration
        // what you can do is create a bigger array and copy the old smaller array.

        // Part 4
        // Array of objects

        Student s1 = new Student();
        s1.name = "Trek";
        s1.rollNo = 01;
        s1.marks = 97;

        Student s2 = new Student();
        s2.name = "Den";
        s2.rollNo = 02;
        s2.marks = 89;

        Student s3 = new Student();
        s3.name = "Ana";
        s3.rollNo = 02;
        s3.marks = 92;

        Student students[] = new Student[3];

        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].rollNo + ") " + students[i].name + " : " + students[i].marks);
        }

        for (Student s : students) {
            System.out.println(s.rollNo + "] " + s.name + " : " + s.marks);
        }
    }
}

class Student {
    int rollNo;
    String name;
    int marks;
}