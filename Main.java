import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"мама", "папа", "їж їжак желе"};
        Set<Character> uniqueCharacters = findUniqueCharacters(strings);
        System.out.println(uniqueCharacters);
    }

    public static Set<Character> findUniqueCharacters(String[] strings) {
        Set<Character> uniqueCharacters = new HashSet<>();

        for (String word : strings) {
            Set<Character> wordCharacters = new HashSet<>();

            for (char c : word.toCharArray()) {
                wordCharacters.add(c);
            }

            uniqueCharacters.addAll(wordCharacters);
        }

        return uniqueCharacters;
    }
}
