package algorithm.shell;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        int[] arr = new int[]{32, 29, 15, 20, 41, 10, 30, 22, 1};

        shellSort.sort(arr);
        System.out.println("쉘 정렬 완료 후: " + Arrays.toString(arr));
    }
}
