import java.util.*;

public class Main {

    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        int c = 15;

        System.out.println("Largest: " + process(a, b, c));
    }

    private static int process(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}