package Algorithm;

public class Pair<K, V> {
    private final K key;
    private final V value;
    public Pair(K k, V v) {
        key = k;
        value = v;
    }
    public K getKey() {
        return getFirst();
    }
    public V getValue() {
        return getSecond();
    }
    public K getFirst() {
        return key;
    }
    public V getSecond() {
        return value;
    }
    @Override
    public int hashCode() {
        int result = key == null ? 0 : key.hashCode();

        final int h = value == null ? 0 : value.hashCode();
        result = 37 * result + h ^ (h >>> 16);

        return result;
    }

    @Override
    public String toString() {
        return "[" + getKey() + ", " + getValue() + "]";
    }
}