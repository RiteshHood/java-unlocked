public class UtilityMethods {

    static int square(int num) {
        return num * num;
    }

    static boolean isEven(int num) {
        return num % 2 == 0;
    }

    static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    static void greet(String name) {
        System.out.println("Welcome " + name);
    }

    public static void main(String[] args) {

        greet("Ritesh");

        System.out.println("Square: " + square(5));

        System.out.println("Is Even: " + isEven(10));

        System.out.println("Max: " + max(20, 50));
    }
}