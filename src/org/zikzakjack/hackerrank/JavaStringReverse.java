package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaStringReverse {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String A = sc.next();
    sc.close();
    String reverse = "";
    for (int i = A.length() - 1; i >= 0; i--) {
      reverse += A.charAt(i);
    }
    System.out.println(A.equalsIgnoreCase(reverse) ? "Yes" : "No");
  }

}
