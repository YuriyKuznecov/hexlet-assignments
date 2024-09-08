package exercise;

// BEGIN
import java.util.Map;
import java.util.HashMap;

class FileKV implements KeyValueStorage {
    private Map<String, String> map;
    private String pathFile;

    FileKV(String pathFile, Map<String, String> defaultMap) {
	    this.pathFile = pathFile;
	    map = new HashMap<>(defaultMap);
	    map.putAll(readStorage(pathFile));
	    writeStorage(map);
    }

    private Map<String, String> readStorage(String pathFile) {
	    String json = Utils.readFile(pathFile);
	    return Utils.deserialize(json);
    }

    private void writeStorage(Map<String, String> map) {
	    String json = Utils.serialize(map);
	    Utils.writeFile(pathFile, json);
    }

    public String get(String key, String defaultValue) {
	    return map.getOrDefault(key, defaultValue);
    }

    public void set(String key, String value) {
        map.put(key, value);
	writeStorage(map);
    }

    public void unset(String key) {
        map.remove(key);
	writeStorage(map);
    }

    public Map<String, String> toMap() {
        return readStorage(pathFile);
    }
}

// END
