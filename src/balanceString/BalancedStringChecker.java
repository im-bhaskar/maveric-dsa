package balanceString;

import java.util.Stack;

/**
 * BalancedStringChecker class provides a utility method to check if a given string of braces is
 * balanced. A balanced string means all braces close in the correct hierarchy/order in which they
 * were opened.
 */
public class BalancedStringChecker {

  /**
   * Checks if the input string has balanced braces.
   *
   * @param input The input string containing braces to be checked for balance.
   * @return true if the string is balanced, otherwise false.
   *     <p>Time Complexity: O(n) - We process each character of the input string once. Space
   *     Complexity: O(n) - In the worst case, all opening braces are stored in the stack.
   */
  public static boolean isBalanced(String input) {
    Stack<Character> stack = new Stack<>();

    // Iterate through each character in the input string
    for (char ch : input.toCharArray()) {
      // Push any opening brace onto the stack
      if (ch == '(' || ch == '{' || ch == '[') {
        stack.push(ch);
      }
      // For closing braces, check and pop from the stack
      else if (ch == ')' || ch == '}' || ch == ']') {
        // If stack is empty or top of stack does not match the corresponding opening brace, return
        // false
        if (stack.isEmpty() || !isMatchingPair(stack.pop(), ch)) {
          return false;
        }
      }
    }

    // Return true if stack is empty (all braces matched), otherwise false
    return stack.isEmpty();
  }

  /**
   * Helper method to check if the characters are matching braces.
   *
   * @param open The opening brace.
   * @param close The closing brace.
   * @return true if they form a matching pair, otherwise false.
   */
  private static boolean isMatchingPair(char open, char close) {
    return (open == '(' && close == ')')
        || (open == '{' && close == '}')
        || (open == '[' && close == ']');
  }
}
