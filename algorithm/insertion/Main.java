package algorithm.insertion;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();

        int[] arr = new int[]{7, 2, 9, 3, 1};
        insertionSort.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
