import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void Min3Numbers() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter array size");
        int sz = in.nextInt();
        Integer arr[] = new Integer[sz];
        for (int i = 0; i < sz; i++)
            arr[i] = in.nextInt();
        Collections.sort(Arrays.asList(arr));
        System.out.println("Minimum 3 Numbers are :");
        for (int i = 0; i < 3 && i < sz; i++)
            System.out.println(arr[i]);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose Function Number:");
        System.out.println("1. Get minimum 3 numbers");
        int reply = in.nextInt();
        switch (reply) {
            case 1:
                Min3Numbers();
                break;
        }
    }
}
