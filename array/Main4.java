package array;

public class Main4 {
    public static void main(String[] args) {
        // 배열 요소의 문자 출력
        String[] arr = {"H", "E", "L", "L", "O"};

        for (String str : arr) {
            System.out.printf(str);
        }

        System.out.println("");
        // 역순으로 새 배열 만들기
        String[] reverse = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reverse[(reverse.length - 1) - i] = arr[i];
        }

        for (String str2 : reverse) {
            System.out.printf(str2);
        }
    }
}
