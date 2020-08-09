/**
 * -Write a method called reverse() with an int array as a parameter.

-The method should not return any value. In other words, the method is allowed to modify the array parameter.

-In main() test the reverse() method and print the array both reversed and non-reversed.

-To reverse the array, you have to swap the elements, so that the first element is swapped with the last element and so on.

-For example, if the array is {1, 2, 3, 4, 5}, then the reversed array is {5, 4, 3, 2, 1}.


Tip:
	-Create a new console project with the name ReverseArrayChallenge
 */
public class ReverseArray {

    public static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == 0)
                System.out.print(array[i]);
            else
                System.out.print(", " + array[i]);
        }
        System.out.print("]\n");
    }

    public static void reverse(int[] array) {
        System.out.print("Original Array: ");
        printArray(array);
        int length = array.length / 2;
        for (int i = 0; i < length; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.print("New Array: ");
        printArray(array);
    }

    public static void main(String[] args) {
        int[] array = new int[] {1,2,3, 4};
        reverse(array);
    }
}