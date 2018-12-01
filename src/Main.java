import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {

    private static int[] intArr;
    private static char[] charArr;
    private static int size;
    private static boolean isChar = false;   // false = integer, true = char

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

    private static void getMin3Numbers() {
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

    private static int getSmallestPrime() {
        if(isChar)
            return 0;
        Arrays.sort(intArr);
        int length = intArr.length;
        for(int i =0; i< length; i++)
        {
            boolean flag = false;//For signaling for the number prime or not
            for(int j = 2; j <= Math.floor(Math.sqrt(intArr[i])); j++)
           {
               if(intArr[i] % j == 0)//Not prime
               {
                   if(intArr[i] == 2)
                       return intArr[i];
                   flag = true;
                   break;
               }
           }
            if(!flag)
                if(intArr[i]!=1)
                    return intArr[i];
        }
        return -1;
    }
 private static void Maximum3Numbers()
    {
        if(isChar){
            Arrays.sort(charArr);
            System.out.println("Maximum 3 characters are: ");
            for(int i=size-1;i>size-4&& i >=0;i--)
                System.out.print(charArr[i]+" "); 
            System.out.println();
        }
        else
        {
            Arrays.sort(intArr);
            System.out.println("Maximum 3 Numbers are: ");
            for(int i=size-1;i>size-4&& i >=0;i--)
                System.out.print(intArr[i]+" ");
            System.out.println();
        }
    }
    private static void smallestPrime()
    {
        int x = getSmallestPrime();
        if(x == 0)
            System.out.println("Sorry, no prime numbers in characters.");
        else if(x == -1)
            System.out.println("No prime number in this list.");
        else
            System.out.println("Smallest prime is: " + x);
    }
 private static void returnPrime()
    {
        int arr[]=new int[size];
        if (isChar)
        {
            for (int i=0;i<size;i++)
                arr[i]=charArr[i]-'0';
        }
        else
        {
            for (int i=0;i<size;i++)
                arr[i]=intArr[i];
        }
        System.out.print("Prime Numbers:");
        boolean flage;
        for (int j=0;j<arr.length;j++)
        {
            flage=false;
            for (int i = 2; i <= arr[j]/2; i++)
            {
                if (arr[j] % i == 0)
                    flage=true;
            }
            if (flage==false&&arr[j]>1)
                System.out.print(arr[j]+" ");
        }
        System.out.println();
    }

	public static int median() {
        
	Arrays.sort(intArr);
       if (intArr.length % 2 !=0)
       { 
           System.out.println("The median is:" + intArr[intArr.length/2]);
       }
       else {
           System.out.println("The median is:" + (intArr[intArr.length/2]+intArr[intArr.length/2-1])/2.0);
       }

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
                    case 5:
                        smallestPrime();
                        break;
            	   case 12:
                	Maximum3Numbers();
                	break;
                    case 13:
                        getMin3Numbers();
                        break;
		    case 15:
			median();
			break;
                    case 16:
                        returnPrime();
                        break;    
                    case 18: // Execute All
                        smallestPrime();//5
                        Maximum3Numbers();//12
                        getMin3Numbers();//13
                        returnPrime();//16
                        break;
                }
            }catch (InputMismatchException e)
            {
                System.out.println("Please enter a valid input.");
                break;
            }
        }


    }
}
