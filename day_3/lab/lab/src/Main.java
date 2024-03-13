import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6, 7, 7, 1, 1, 8};

        printArray(intArray);
        System.out.println(findElementInArray(intArray, 3));
        System.out.println(findElementInArray(intArray, 1111111));
        System.out.println(countOccurrences(intArray, 1));
        System.out.println(countOccurrences(intArray, 7));
        System.out.println(countOccurrences(intArray, 11111111));
        System.out.println(findMaxValue(intArray));
        System.out.println(Arrays.toString(reverseArray(intArray)));
    }

    public static void printArray (int[] input) {
        System.out.println(Arrays.toString(input));
    }

    public static boolean findElementInArray (int[] input, int findMe) {
        for (int i = 0; input.length > i; i++) {
            if (input[i] == findMe) {
                return (true);
            }
        }

        return (false);
    }

    public static int countOccurrences (int[] input, int findAmount) {
        int tally = 0;
        for (int i = 0; input.length > i; i++) {
            if (input[i] == findAmount) {
                tally++;
            }
        }

        return (tally);
    }

    public static int findMaxValue (int[] input) {
        int maxValue = 0;
        for (int i = 0; input.length > i; i++) {
            if (input[i] > maxValue) {
                maxValue = input[i];
            }
        }

        return (maxValue);
    }

    public static int[] reverseArray (int[] input) {
        int index;
        int output[] = new int[input.length];

        for (int i = input.length - 1; i >= 0; i--) {
            index = input[i];
            output[input.length - 1 - i] = index;
        }

        return (output);
    }
}