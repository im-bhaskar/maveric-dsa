package combinationFinder;

import java.util.List;

public class Test {
  public static void main(String[] args) {
    String input = "bace";

    // Call the findVowelCombinations method from VowelCombinationFinder
    List<String> vowelCombinations = VowelCombinationFinder.findVowelCombinations(input);

    // Print out the results
    System.out.println("Combinations that start and end with a vowel:");
    for (String combination : vowelCombinations) {
      System.out.println(combination);
    }
  }
}
