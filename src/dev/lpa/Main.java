package dev.lpa;

import java.util.Arrays;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        // Create an unsorted Array
        int[] unsortedArray = getRandomArray(10);
        System.out.println("Unsorted random numbers: ");
        System.out.println(Arrays.toString(unsortedArray));

        // Make a copy of unsortedArray before sort it
        int[] sortedArray = Arrays.copyOf(unsortedArray, unsortedArray.length);
        // Sort the numbers
        Arrays.sort(sortedArray);
        System.out.println("Sorted numbers: ");
        System.out.println(Arrays.toString(sortedArray));
    }
    // Create a method RandomArray
    private static int[] getRandomArray(int len) {
        // Return random numbers
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}
