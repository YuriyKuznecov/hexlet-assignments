package exercise;

// BEGIN
public class ReversedSequence implements CharSequence {
    private final String word;

    public ReversedSequence(String word) {
        this.word = word;
    }

    private String reverseString() {
        StringBuilder result = new StringBuilder();
        for (var i = word.length() - 1; i >= 0; i--) {
            result.append(word.charAt(i));
        }
        return result.toString();
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {
        var result = reverseString();
        return result.charAt(index);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        var reverse = reverseString();
        return reverse.substring(start, end);
    }

    @Override
    public String toString() {
	var reverse = reverseString();
	return reverse;
    }
}

// END
