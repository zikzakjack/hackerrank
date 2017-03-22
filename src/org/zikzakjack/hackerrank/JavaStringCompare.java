package org.zikzakjack.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringCompare {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    String superString = scanner.next();
    int subStrLength = scanner.nextInt();
    scanner.close();

    String[] array = new String[superString.length() - subStrLength + 1];

    for (int i = 0; i < superString.length() - subStrLength + 1; i++) {
//      System.out.println(i + " : " + superString.substring(i, i + subStrLength));
      array[i] = superString.substring(i, i + subStrLength);
    }
    Arrays.sort(array);
    System.out.println(array[0]);
    System.out.println(array[array.length - 1]);
  }

}
