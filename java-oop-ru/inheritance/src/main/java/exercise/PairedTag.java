package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
class PairedTag extends Tag {

    private String title;
    private String body;
    private List<Tag> tags;

    PairedTag(String title, Map<String, String> data, String body, List<Tag> tags) {
	super(data);
	this.title = title;
	this.tags = tags;
        this.body = body;
    }

    public String toString() {
	var listString = tags.stream()
		.map(Tag :: toString)
	        .collect(Collectors.joining(""));
	if (super.toString().equals("")) {
	    return String.format("<%s>%s%s</%s>", title, body, listString, title);
	} else {    
            return String.format("<%s %s>%s%s</%s>", title, super.toString(), body, listString, title);
	}
    }
}    

// END
