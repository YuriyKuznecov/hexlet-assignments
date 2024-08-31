package exercise;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

// BEGIN
class App {

    public static void swapKeyValue(KeyValueStorage storage) {
        var maps = storage.toMap();
	var keys = maps.keySet();
	for (var key : keys) {
            var value = maps.get(key);
	    storage.set(value, key);
	    storage.unset(key);
	}
    }
}

// END
