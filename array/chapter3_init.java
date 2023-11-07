package array;
import java.util.Arrays;

public class chapter3_init {
    public static void main(String[] args) {
        int[] arr1 = new int[1]; // (1) 선언과 동시에 0으로 초기화
        int[] arr2 = new int[]{1, 2, 3}; // (2) 배열 생성 시, 크기를 지정하지 않고 저장 할 요소만 명시한다.
        int[] arr3 = {1, 2, 3, 4, 5}; // (3) 저장 할 요소만 명시하는 방법

        System.out.println("arr1: " + Arrays.toString(arr1) + ", length: " + arr1.length);
        System.out.println("arr2: " + Arrays.toString(arr2) + ", length: " + arr2.length);
        System.out.println("arr3: " + Arrays.toString(arr3) + ", length: " + arr3.length);
    }
}
