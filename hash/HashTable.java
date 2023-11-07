package hash;

/**
 * Created by son on 2019-10-28.
 * separate chaining 방식
 * LinkedList
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
class HashTable<K, V> implements hash.Map<K, V> {
    private static final int DEFAULT_CAPACITY = 13;
    private int size;
    private Node<K, V>[] table;

    HashTable(final int capacity) {
        table = new Node[capacity];
        size = capacity;
    }

    HashTable() {
        table = new Node[DEFAULT_CAPACITY];
        size = DEFAULT_CAPACITY;
    }

    private int hash(Object key) {
        int hash = key.hashCode() % size;
        if (hash < 0) {
            hash *= -1;
        }
        return hash;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public V put(K key, V value) {
        int hash = hash(key);
        Node<K, V> node = table[hash];

        // key에 대한 노드가 등록되어 있는지 찾음
        while (node != null) {
            if (node.getKey().equals(key)) {
                return null;
            }
            node = node.next;
        }

        Node<K, V> temp = new Node<K, V>(key, value, table[hash]);
        table[hash] = temp;
        return null;
    }

    @Override
    public V get(K key) {
        int hash = hash(key); // key에 대한 hash 값
        Node<K, V> node = table[hash]; // hash를 통해 찾을 데이터의 노드

        while (node != null) {
            if (node.getKey().equals(key)) {
                return node.getValue();
            }
            node = node.next;
        }
        return null;
    }

    @Override
    public int remove(K key) {
        int hash = hash(key);
        Node<K, V> node = table[hash];
        Node<K, V> temp = node;

        while (node != null) {
            // 제거 될 노드 기준의 앞 뒤 노드를 연결하고 노드를 제거한다.
            if (node.getKey().equals(key)) {
                temp.next = node.next;
                node = null;
                break;
            }
            node = node.next;
        }

        return 0;
    }
}
