import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    static int[] intArr;
    static char[] charArr;
    static int size;
    static boolean isChar = false;   // false = integer, true = char

    private static void printMenu() {
        System.out.println("Choose the number of operation you want to execute:");
        System.out.println("1-\tMost repeated value");
        System.out.println("2-\tSort");
        System.out.println("3-\tShuffle");
        System.out.println("4-\tFind the largest prime");
        System.out.println("5-\tFind the smallest prime");
        System.out.println("6-\tCheck palindrome");
        System.out.println("7-\tCheck sorted");
        System.out.println("8-\tCount primes");
        System.out.println("9-\tReverse array");
        System.out.println("10-\tShift array");
        System.out.println("11-\tDistinct array");
        System.out.println("12-\tGet the maximum 3 numbers");
        System.out.println("13-\tGet the minimum 3 numbers");
        System.out.println("14-\tGet average");
        System.out.println("15-\tGet median");
        System.out.println("16-\tReturn only primes");
        System.out.println("17-\tZero if less than zero");
        System.out.println("18-\tExecute All");
        System.out.println("19-\tExit");
        System.out.println("\t************************\t");
    }

    public static void getMin3Numbers() {
        if (isChar) {
            Arrays.sort(charArr);
            System.out.print("Minimum 3 characters are: ");
            for (int i = 0; i < 3 && i < size; i++)
                System.out.print(charArr[i] + " ");
            System.out.println();
        } else {
            Arrays.sort(intArr);
            System.out.print("Minimum 3 numbers are: ");
            for (int i = 0; i < 3 && i < size; i++)
                System.out.print(intArr[i] + " ");
            System.out.println();
        }
    }

    public static int smallestPrime(Integer ary[]) {
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
        while (true) {
            try {
                printMenu();
                int choice = in.nextInt();
                if (choice == 19) break;

                System.out.println("Enter The number of the input type:\n1- Character\n2- Integer");
                int type = in.nextInt();
                if (type == 1) {
                    isChar = true;
                }
                System.out.print("Enter The Size of the Array: ");
                size = in.nextInt();
                System.out.println("Enter " + size + " Elements of the array");
                if (isChar) {
                    charArr = new char[size];
                    for (int i = 0; i < size; i++) {
                        charArr[i] = in.next().charAt(0);
                    }
                } else {
                    intArr = new int[size];
                    for (int i = 0; i < size; i++) {
                        intArr[i] = in.nextInt();
                    }
                }

                switch (choice) {
                    case 13:
                        getMin3Numbers();
                        break;
                    case 18: // Execute All
                        getMin3Numbers();
                        break;
                }
            }catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input");
                break;
            }
        }


    }
}
