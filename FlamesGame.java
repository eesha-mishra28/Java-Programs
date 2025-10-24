import java.util.ArrayList;
import java.util.Scanner;

public class FlamesGame {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Input names
    System.out.print("Enter first name: ");
    String name1 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

    System.out.print("Enter second name: ");
    String name2 = sc.nextLine().replaceAll("\\s", "").toLowerCase();

    // Cancel common letters
    StringBuilder sb1 = new StringBuilder(name1);
    StringBuilder sb2 = new StringBuilder(name2);

    for (int i = 0; i < sb1.length(); i++) {
      char ch = sb1.charAt(i);
      int index = sb2.indexOf(String.valueOf(ch));
      if (index != -1) {
        sb1.deleteCharAt(i);
        sb2.deleteCharAt(index);
        i--; // Adjust index after deletion
      }
    }

    // Count of unmatched letters
    int count = sb1.length() + sb2.length();

    // FLAMES list
    ArrayList<Character> flames = new ArrayList<>();
    for (char c : "FLAMES".toCharArray()) {
      flames.add(c);
    }

    // Eliminate letters until one remains
    int index = 0;
    while (flames.size() > 1) {
      index = (index + count - 1) % flames.size();
      flames.remove(index);
    }

    // Output result
    char result = flames.get(0);
    String relationship = switch (result) {
      case 'F' -> "Friend";
      case 'L' -> "Love";
      case 'A' -> "Affection";
      case 'M' -> "Marriage";
      case 'E' -> "Enemy";
      case 'S' -> "Siblings";
      default -> "Unknown";
    };

    System.out.println("Relationship: " + relationship);
  }
}