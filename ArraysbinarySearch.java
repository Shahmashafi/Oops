import java.util.Arrays;
import java.util.Scanner;
public class ArraysbinarySearch
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " elements of the array:");
        for (int i = 0; i < size; i++) 
        {
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.print("Enter the element to search: ");
        int target = scanner.nextInt();
        int result = Arrays.binarySearch(array, target);
        if (result >= 0) 
        {
            System.out.println("Element found at index: " + result);
        } 
          else 
          {
            System.out.println("Element not found.");
         }
    }
}

