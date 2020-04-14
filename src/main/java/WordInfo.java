public class WordInfo {
    private String word;
    private int worCount;

    public WordInfo(String value, int worCount) {
        this.word = value;
        this.worCount = worCount;
    }

    public String getWord() {
        return this.word;
    }

    public int getWordCount() {
        return this.worCount;
    }
}
