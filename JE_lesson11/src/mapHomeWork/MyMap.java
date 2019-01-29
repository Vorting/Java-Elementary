package mapHomeWork;

import java.util.*;

class MyMap<K, V> implements MapInt<K, V>, Map<K, V> {
    public static void main(String[] args) {
        Map<String, String> stringMap =
                Collections.unmodifiableMap(new MyMap<>());

        System.out.println(stringMap.put("Ivanov","Dima"));
    }

    private static class Entry<K, V> implements Map.Entry<K, V> {
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        K key;
        V value;
        Entry<K, V> next;

        @Override
        public K getKey() {
            return key;
        }

        @Override
        public V getValue() {
            return value;
        }

        @Override
        public V setValue(V value) {
            return null;
        }
    }

    private List<Entry<K, V>> buckets = new ArrayList<>(bucketCount);
    private int count = 0;
    private static int bucketCount = 16;

    @Override
    public int size() {
        return count;
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public boolean containsKey(Object key) {
        return get(key) == null;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    @Override
    public V get(Object key) {
        V result = null;
        int hash = key.hashCode();
        Entry<K, V> kvEntry = buckets.get(hash);
        if (kvEntry != null) {
            Entry<K, V> currentEntry = kvEntry;
            while (currentEntry.next != null) {
                if (currentEntry.key.equals(key)) {
                    result = currentEntry.value;
                    break;
                }
                currentEntry = currentEntry.next;
            }
        }
        return result;
    }

    @Override
    public V put(K key, V value) {
        V result = null;
        // TODO: 27.01.2019 Check arg
        int hash = key.hashCode();
        //if (hash > 0 && hash < Integer.MAX_VALUE / bucketCount)
        //hash %= bucketCount;

        Entry<K, V> kvEntry = buckets.get(hash);
        if (kvEntry == null) {
            kvEntry = new Entry<>(key, value);
            buckets.add(hash, kvEntry);
        } else {
            Entry<K, V> currentEntry = kvEntry;
            boolean isReplaced = false;
            while (currentEntry.next != null) {
                if (currentEntry.key.equals(key)) {
                    result = currentEntry.value;
                    currentEntry.value = value;
                    isReplaced = true;
                    break;
                }
                currentEntry = currentEntry.next;
            }
            if (!isReplaced) {
                currentEntry.next = new Entry<>(key, value);
                count++;
            }
        }
        return result;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {
        buckets.clear();
        count = 0;
    }

    @Override
    public Set<K> keySet() {
        Set<K> result = new HashSet<>();

        for (Entry<K, V> entry : buckets) {
            if (entry != null) {
                Entry<K, V> currentEntry = entry;
                while (currentEntry.next != null) {
                    result.add(currentEntry.key);
                    currentEntry = currentEntry.next;
                }
            }
        }
        return result;
    }

    @Override
    public Collection<V> values() {
        Collection<V> result = new ArrayList<>();
        for (Entry<K, V> entry : buckets) {
            if (entry != null) {
                Entry<K, V> currentEntry = entry;
                while (currentEntry.next != null) {
                    result.add(currentEntry.value);
                    currentEntry = currentEntry.next;
                }
            }
        }
        return result;
    }

    @Override
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> result = new HashSet<>();
        for (Entry<K, V> entry : buckets) {
            if (entry != null) {
                Entry<K, V> currentEntry = entry;
                while (currentEntry.next != null) {
                    result.add(currentEntry);
                    currentEntry = currentEntry.next;
                }
            }
        }
        return result;
    }
}

