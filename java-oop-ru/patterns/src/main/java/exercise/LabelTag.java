package exercise;

// BEGIN
class LabelTag implements TagInterface {
        private String text;

        private TagInterface tag;	

	LabelTag(String text, TagInterface tag) {
		this.word = word;
		this.tag = tag;
	}

	public String render() {
		return "<Label>" + text + tag.render() + "</Label>";
	}
}
// END
