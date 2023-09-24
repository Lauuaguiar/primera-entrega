public class GetShortestWord {
    // Método para obtener la palabra más corta
    public static String getShortestWord(String word1, String word2) {
        if (word1.length() <= word2.length()) {
            return word1;
        } else {
            return word2;
        }
    }

    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        String shortest = getShortestWord(word1, word2);
        System.out.println("The shortest word is: " + shortest);
    }
}
