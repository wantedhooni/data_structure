package collections.list.multiThread;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * 통장 클래스
 */
public class BankBook {
    public List<Integer> vector = new Vector<>(); // 동기화 보장
    public List<Integer> arrayList = new ArrayList<>(); // 동기화 보장하지 않음

    public int getAmount() {
        return this.vector.size();
    }
}
