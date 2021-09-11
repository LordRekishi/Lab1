package se.iths.java21.patrik.lab1.tools;

public class DynamicArray {
    private String[] words = new String[1];
    private int count = 0;

    public void add(String word) {
        if (count == words.length)
            grow();
        words[count++] = word;
    }

    private void grow() {
        String[] newArray = new String[words.length + 1];
        System.arraycopy(words, 0, newArray, 0, words.length);
        words = newArray;
    }

    public String removeLast() {
        if (count == 0)
            return "0";
        return words[--count];
    }

    public int length() {
        return count;
    }

    public String get(int index) {
        return words[index];
    }

    public String[] get() {
        return words;
    }

}
