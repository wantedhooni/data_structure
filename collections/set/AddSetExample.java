package collections.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class AddSetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        int[] datas = {10, 20, 40, 50, 30, 60, 90, 80, 70, 100};
        for (int data : datas) {
            set.add(data);
            treeSet.add(data);
            linkedHashSet.add(data);
        }

        System.out.println("[Set클래스의 데이터 삽입 후 결과]");
        System.out.println("  HashSet 결과: " + set);
        System.out.println("  TreeSet 결과: " + treeSet);
        System.out.println("  LinkedHashSet 결과: " + linkedHashSet);
    }
}
