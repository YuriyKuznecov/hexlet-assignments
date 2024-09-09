package exercise;

import java.util.stream.Collectors;
import java.util.Map;

// BEGIN
import java.util.ArrayList;

class Tag {

    private Map<String, String> data;

    Tag(Map<String, String> data) {
        this.data = data;
    }

    public String toString() {
	    var results = new ArrayList<String>();
	    data.forEach((key, value) -> results.add(String.format("%s=\"%s\"", key, value)));
	    return results.stream()
		.collect(Collectors.joining(" "));

    }	
}

// END
