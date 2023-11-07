package collections.set;

import java.util.HashSet;
import java.util.Set;

public class duplicateSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        int[] datas = {1, 2, 3, 1, 2, 4};
        for (int data : datas) {
            System.out.println(String.format("데이터 %s을(를) 삽입합니다.", data));
            if (set.contains(data)) {
                System.out.println(String.format("\n%s은(는) 중복 데이터입니다.\n", data));
            }
            set.add(data);
        }
        System.out.println("");

        System.out.println("[HashSet에 데이터 삽입 후 결과]");
        System.out.println("  HashSet 결과: " + set);
    }
}
