package FileSystemSearch;

import java.io.File;
import java.util.LinkedList;
import java.util.Queue;

/**
 * FileSystemSearcher class provides a utility method to search for a file in a filesystem starting
 * from a specified directory using the BFS algorithm.
 */
public class FileSystemSearcher {

  /**
   * Searches for a file in the filesystem starting from a given directory using BFS.
   *
   * @param startPath The starting directory from where the search will begin.
   * @param fileName The name of the file to search for.
   * @return The absolute path of the found file, or null if the file is not found.
   *     <p>Time Complexity: - Best Case: O(1) if the file is in the start directory. -
   *     Average/Worst Case: O(N) where N is the total number of files/directories.
   *     <p>Space Complexity: - O(N) for storing directory paths in the queue in the worst case.
   */
  public static String searchFile(String startPath, String fileName) {
    File startDir = new File(startPath);

    // Return null if start path does not exist or is not a directory
    if (!startDir.exists() || !startDir.isDirectory()) {
      return null;
    }

    // Queue for BFS traversal
    Queue<File> queue = new LinkedList<>();
    queue.add(startDir);

    // Perform BFS
    while (!queue.isEmpty()) {
      File current = queue.poll();

      // List all files in the current directory
      File[] files = current.listFiles();
      if (files == null) continue; // Skip if unable to list files (e.g., permissions issue)

      for (File file : files) {
        // Check if we found the target file
        if (file.isFile() && file.getName().equals(fileName)) {
          return file.getAbsolutePath();
        }
        // Add directories to queue for further exploration
        else if (file.isDirectory()) {
          queue.add(file);
        }
      }
    }

    // Return null if file not found
    return null;
  }
}
