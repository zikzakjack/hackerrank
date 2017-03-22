package org.zikzakjack.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaAnagrams {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String b = scan.next();
    scan.close();
    boolean ret = isAnagram(a, b);
    System.out.println((ret) ? "Anagrams" : "Not Anagrams");
  }

  static boolean isAnagram(String a, String b) {
    if (a.length() != b.length()) {
      return false;
    } else {
      a = a.toLowerCase();
      b = b.toLowerCase();
      char[] aArr = a.toCharArray();
      char[] bArr = b.toCharArray();

      Arrays.sort(aArr);
      Arrays.sort(bArr);
//       System.out.println(aArr);
//       System.out.println(bArr);
      return new String(aArr).equals(new String(bArr));
    }
  }
}
