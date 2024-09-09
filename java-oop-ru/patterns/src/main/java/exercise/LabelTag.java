package exercise;

// BEGIN
class LabelTag implements TagInterface {
    private String text;

    private TagInterface tag;	

    LabelTag(String text, TagInterface tag) {
		this.text = text;
		this.tag = tag;
    }

    public String render() {
	return "<label>" + text + tag.render() + "</label>";
    }
}
// END
