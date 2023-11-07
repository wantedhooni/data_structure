package hash;

/**
 * Created by son on 2019-10-28.
 * 연결 리스트를 구성하기 위한 기본 단위
 */
public class Node<K, V> {
    private K key;
    private V value;
    protected Node<K, V> next;

    Node(K key, V value, Node<K, V> next) {
        this.key = key;
        this.value = value;
        this.next = next;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    public int hashCode() {
        return key.hashCode();
    }
}
