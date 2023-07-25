public class strings {

    public static void main(String[] args) {
        // Part 1
        // Strings

        // String is a class and not a primitive data type
        // So, we usally create objects with it
        String name = new String("Shreedharma");
        // String name = "Shreedharma" -> Shorthand
        System.out.println("Name : " + name);
        System.out.println(name.charAt(name.length() - 1));
        String name2 = "Shreedharma";
        name = name + " Kr";

        // There is something called "string constant pool" in heap memory where all
        // strings get stored
        // For Ex: "Shreedharma" gets stored in there.
        // when creation of name2 begins, the "string constant pool" is searched for the
        // same value of name2,
        // if available, then reference of it is stored in name2
        // if not, then new constant is created in pool and reference of it is stored in
        // name2.
        // So, name and name2 are variables refering to same string object present in
        // "string constant pool".
        // by default String is immutable in java
        // in line 14, name variable no longer have reference to "Shreedharma" but, to a
        // new string object "Shreedharma Kr" which is created in the "string constant
        // pool".
        // if nothing points towards "Shreedharma" then it is available for garbage
        // collection.

        // Part 2
        // StringBuffer

        StringBuffer name3 = new StringBuffer("Paul Walker ");
        // StringBuffer is mutable
        // while creation, StringBuffer offers a capacity of 16 extra (16 + length of
        // string you
        // give) to avoid reallocation of data in memory in a situation where value of
        // it occupies more sapce than capacity when changed or edited.
        name3.append(name2);
        String str = name3.toString(); // => converts to type String
        System.out.println(name3.reverse());
    }
}