package exercise;

// BEGIN
class InputTage implements TagInterface {

	private String type;
	private String value;

	InputTage(String type, String value) {
		this.type = type;
		this.value = value;
	}

	public String render() {
		return String.format("<input type=\"%s\" value=\"%s\">", type, value);
	}
// END
