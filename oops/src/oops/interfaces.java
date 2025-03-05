import java.util.Arrays;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = {3, 5, 1, 9, 2, 8, 4};

        // Reverse the array
        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));

        // Find max and min values
        int max = findMax(array);
        int min = findMin(array);

        System.out.println("Maximum Value: " + max);
        System.out.println("Minimum Value: " + min);
    }

    public static void reverseArray(int[] array) {
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int 