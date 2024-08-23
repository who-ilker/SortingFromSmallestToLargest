import java.util.Scanner;       // sorting from smallest to largest
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.print("Enter the size of array: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        getElementOfArray(array);

        int[] newSortedArray = sortElementsSmallestToLargest(array);
        System.out.println(Arrays.toString(newSortedArray));

    }
    static int[] sortElementsSmallestToLargest(int[] array) {
        int[] sortedArray = Arrays.copyOf(array, array.length);
        int temp;

        for(int i = 0; i < sortedArray.length; i++)
            for(int k = i + 1; k < sortedArray.length; k++)
                if(sortedArray[i] > sortedArray[k]){
                   temp = sortedArray[i];
                   sortedArray[i] = sortedArray[k];
                   sortedArray[k] = temp;
                }
        
        return sortedArray;
    }
    static void getElementOfArray(int[] array){
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < array.length; ++i) {
            System.out.print(( i+1) +". elements: ");
            array[i] = scanner.nextInt();
        }
    }

}