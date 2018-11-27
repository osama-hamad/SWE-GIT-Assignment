import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }

    public int smallestPrime(int ary[]) {
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
}
