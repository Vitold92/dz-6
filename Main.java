import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] strings = {"мама", "папа", "їж їжак желе"};
        char[] uniqueCharacters = findUniqueCharacters(strings);
        System.out.println(Arrays.toString(uniqueCharacters));
    }

    public static char[] findUniqueCharacters(String[] strings) {
        Set<Character> uniqueCharacters = new HashSet<>();
        int count = 0;

        for (String str : strings) {
            int[] charCount = new int[Character.MAX_VALUE + 1];
            boolean allEven = true;

            for (char c : str.toCharArray()) {
                charCount[c]++;
            }

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (charCount[c] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }

            if (allEven) {
                count++;

                for (char c : str.toCharArray()) {
                    if (!uniqueCharacters.contains(c)) {
                        uniqueCharacters.add(c);
                    }
                }

                if (count == 2) {
                    break;
                }
            }
        }

        char[] result = new char[uniqueCharacters.size()];
        int index = 0;
        for (char c : uniqueCharacters) {
            result[index++] = c;
        }

        return result;
    }
}
