package hash;

/**
 * Created by son on 2019-10-28.
 * @param <K> the type of keys maintained by this map
 * @param <V> the type of mapped values
 */
public interface Map<K, V> {
    int size();
    V put(K key, V value);
    V get(K key);
    int remove(K key);
}
