import java.util.Scanner;

public class Homework04 {
    public static final double PI = 3.14;
    public static Scanner key = new Scanner(System.in);
    public static double[] myArray;

    public static double[] getArray() {
        System.out.println("How many circles do you want to enter?");
        int numbers = key.nextInt();
        key.nextLine();
        myArray = new double[numbers];  // Ensure myArray is correctly initialized

        for (int i = 0; i < numbers; i++) {
            System.out.println("Enter the radius of the circle " + i + ":");
            int radius = key.nextInt();
            key.nextLine();
            double area = PI * Math.pow(radius, 2);
            myArray[i] = area;
            System.out.println(area);
        }
        return myArray;
    }

    public static void SMALLTOBIG() {
        for (int i = 0; i < myArray.length; i++) {
            int MINIndex = i;
            double smallest = myArray[i];

            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] < smallest) {
                    smallest = myArray[j];
                    MINIndex = j;
                }
            }

            if (smallest < myArray[i]) {
                double temp = myArray[i];
                myArray[i] = myArray[MINIndex];
                myArray[MINIndex] = temp;
            }
        }

        System.out.println("Smallest to largest:");
        for (double v : myArray) {
            System.out.print(v + "\t");
        }
        System.out.println();
    }

    public static void LARGETOSMALL() {
        for (int i = 0; i < myArray.length; i++) {
            int MINIndex = i;
            double largest = myArray[i];

            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[j] > largest) {
                    largest = myArray[j];
                    MINIndex = j;
                }
            }

            if (largest > myArray[i]) {
                double temp = myArray[i];
                myArray[i] = myArray[MINIndex];
                myArray[MINIndex] = temp;
            }
        }

        System.out.println("Largest to smallest:");
        for (double v : myArray) {
            System.out.print(v + "\t");
        }
        System.out.println();
    }

    public static void UnqiueCircle() {
        double[] newArray = myArray; // shallow copy, still points to the same array

        for (int i = 0; i < myArray.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (myArray[i] == myArray[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.print(myArray[i] + "\t");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        System.out.println("How many circles do you want to enter?");
        myArray = getArray(); // Ensure we ask for circles first
        
        boolean quit = false;
        while (!quit) {
            System.out.println("Enter 2, 3, 4, or 5");
            int UserInput = key.nextInt();
            key.nextLine();

            switch (UserInput) {
                case 2:
                    SMALLTOBIG();
                    break;
                case 3:
                    LARGETOSMALL();
                    break;
                case 4:
                    UnqiueCircle();
                    break;
                case 5:
                    quit = true;
                    break;
                default:
                    System.out.println("Invalid Option");
                    break;
            }
        }
    }
}


			
		
		

	


