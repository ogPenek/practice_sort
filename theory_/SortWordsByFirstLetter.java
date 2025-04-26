import java.util.Arrays;
import java.util.Comparator;

public class SortWordsByFirstLetter {
    public static String[] sortWords(String[] words) {
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Character.toLowerCase(s1.charAt(0)) - Character.toLowerCase(s2.charAt(0));
            }
        });
        return words;
    }

    public static void main(String[] args) {
        String[] words = {"banana", "Apple", "cherry", "avocado"};
        words = sortWords(words);
        System.out.println(Arrays.toString(words));
        // Вивід: [Apple, avocado, banana, cherry]
    }
}

