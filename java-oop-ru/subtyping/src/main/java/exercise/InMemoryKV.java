package exercise;

import java.util.Map;
import java.util.HashMap;

// BEGIN
class InMemoryKV implements KeyValueStorage {
    private Map<String, String> map;

    InMemoryKV(Map<String, String> defaultMap) {
        map = new HashMap<>(defaultMap);
    }

    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    public void set(String key, String value) {
        map.put(key, value);
    }

    public void unset(String key) {
        map.remove(key);
    }

    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
}

// END
