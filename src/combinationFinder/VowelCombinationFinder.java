package combinationFinder;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * VowelCombinationFinder class provides a utility method to find all unique combinations of a
 * string that start and end with a vowel.
 */
public class VowelCombinationFinder {

  /**
   * Finds all unique combinations of the given string that start and end with a vowel.
   *
   * @param input The input string for which combinations are to be found.
   * @return List<String> List of unique combinations that start and end with a vowel.
   *     <p>Time Complexity (Worst): O(n!), as it generates all permutations. Auxiliary Space
   *     Complexity: O(n * n!), considering storage of combinations.
   */
  public static List<String> findVowelCombinations(String input) {
    Set<String> results = new HashSet<>();
    findCombinations(input.toCharArray(), 0, results);

    List<String> filteredResults = new ArrayList<>();
    for (String combination : results) {
      if (startsAndEndsWithVowel(combination)) {
        filteredResults.add(combination);
      }
    }
    return filteredResults;
  }

  /**
   * Helper method to recursively generate all combinations of the input string.
   *
   * @param chars Array of characters of the input string.
   * @param index Current index for swapping characters.
   * @param results Set to store unique combinations.
   */
  private static void findCombinations(char[] chars, int index, Set<String> results) {
    if (index == chars.length) {
      results.add(new String(chars));
      return;
    }

    for (int i = index; i < chars.length; i++) {
      swap(chars, index, i);
      findCombinations(chars, index + 1, results);
      swap(chars, index, i); // Backtrack
    }
  }

  /**
   * Checks if a string starts and ends with a vowel.
   *
   * @param str The string to check.
   * @return true if the string starts and ends with a vowel, false otherwise.
   */
  private static boolean startsAndEndsWithVowel(String str) {
    return isVowel(str.charAt(0)) && isVowel(str.charAt(str.length() - 1));
  }

  /**
   * Helper method to check if a character is a vowel.
   *
   * @param ch Character to check.
   * @return true if the character is a vowel, false otherwise.
   */
  private static boolean isVowel(char ch) {
    return "AEIOUaeiou".indexOf(ch) != -1;
  }

  /**
   * Helper method to swap two characters in an array.
   *
   * @param chars Array of characters.
   * @param i Index of the first character.
   * @param j Index of the second character.
   */
  private static void swap(char[] chars, int i, int j) {
    char temp = chars[i];
    chars[i] = chars[j];
    chars[j] = temp;
  }
}
