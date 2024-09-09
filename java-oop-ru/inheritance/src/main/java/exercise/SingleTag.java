package exercise;

import java.util.Map;

// BEGIN
class SingleTag extends Tag {
	private String title;

	SingleTag(String title, Map<String, String> data) {
	    super(data);
	    this.title = title;
	}

	public String toString() {
	    if (super.toString().equals("")) {
	        return String.format("<%s>", title);
	    } else {
                return String.format("<%s %s>", title, super.toString());
	    }
	}
}

// END
