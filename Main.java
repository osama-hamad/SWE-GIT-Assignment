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
    
    public static void Most_repeated_value(Integer arr[])
    {
	

	int count = 1, tempCount;
	  int value = arr[0];
	  int temp = 0;
	  for (int i = 0; i < (arr.length - 1); i++)
	  {
	    temp = arr[i];
	    tempCount = 0;
	    for (int j = 1; j < arr.length; j++)
	    {
	      if (temp == arr[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      value = temp;
	      count = tempCount;
	    }
	  }
	  System.out.println("most repeated value is "+value);
	  System.out.println();

    
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
        while (true) {
            System.out.println("1. Get minimum 3 numbers" + "2. Get smallest prime"+" 3. most repeated value");


            System.out.println("19. Exit");
            int reply = in.nextInt();
            if (reply == 19) break;//Breaks out of while loop
            switch (reply) {
                case 1:
                    getMin3Numbers(arr);
                    break;

                case 2:
                    int smallestp = smallestPrime(arr);
                    System.out.println("Smallest prime is: " + smallestp);
                    break;
                case 3:
                	Most_repeated_value(arr);
                	break;

                case 18://Execute all functions

            }
        }
    }
}
