import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void getMin3Numbers(Integer[] arr) {
        Arrays.sort(arr);
        System.out.println("Minimum 3 Numbers are :");
        for (int i = 0; i < 3 && i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static int smallestPrime(int ary[]) {
        int smallest, low = 0, high = ary.length - 1, mid;
        Arrays.sort(ary);

        int key = 2; //or 3 or 5 or 7 or 11 or ... p
        //Binary search
        while (low <= high) {
            mid = (low + high) / 2;
            if (ary[mid] > key) {
                high = mid - 1;
            } else if (ary[mid] < key) {
                low = mid + 1;
            } else {
                smallest = ary[mid];
                return smallest;
            }


        }
        smallest = -1;
        return smallest;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int sz = in.nextInt();
        System.out.print("Enter array values: ");
        Integer arr[] = new Integer[sz];
        for (int i = 0; i < sz; i++)
            arr[i] = in.nextInt();
        System.out.println("Choose Function Number:");
        System.out.println("1. Get minimum 3 numbers" + "2. Get");
        int reply = in.nextInt();
        while (true) {
            switch (reply) {
                case 1:
                    getMin3Numbers(arr);
                    break;

                case 18:

            }
        }
    }
}
