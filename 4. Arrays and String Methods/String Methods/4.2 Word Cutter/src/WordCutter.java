public class WordCutter {
    // Método para cortar la palabra a la mitad
    public static String cutInHalf(String word) {
        int length = word.length();
        int halfLength = length / 2;
        return word.substring(0, halfLength);
    }

    public static void main(String[] args) {
        String inputWord = "example";
        String halfWord = cutInHalf(inputWord);
        System.out.println("Half of the word is: " + halfWord);
    }
}
