package balanceString;

public class Test {
  public static void main(String[] args) {
    String input1 = "([{}])"; // Balanced
    String input2 = "([({})])"; // Balanced
    String input3 = "[(])"; // Not balanced
    String input4 = "(({{[[]]}}))"; // Balanced
    String input5 = "({[)]}"; // Not balanced

    // Check each input string for balance
    System.out.println("Input 1 is balanced: " + BalancedStringChecker.isBalanced(input1));
    System.out.println("Input 2 is balanced: " + BalancedStringChecker.isBalanced(input2));
    System.out.println("Input 3 is balanced: " + BalancedStringChecker.isBalanced(input3));
    System.out.println("Input 4 is balanced: " + BalancedStringChecker.isBalanced(input4));
    System.out.println("Input 5 is balanced: " + BalancedStringChecker.isBalanced(input5));
  }
}
