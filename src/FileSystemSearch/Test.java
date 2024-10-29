package FileSystemSearch;

public class Test {
  public static void main(String[] args) {
    String filePath = FileSystemSearcher.searchFile("C:/Users/MyDocuments", "targetFile.txt");
    if (filePath != null) {
      System.out.println("File found at: " + filePath);
    } else {
      System.out.println("File not found.");
    }
  }
}
