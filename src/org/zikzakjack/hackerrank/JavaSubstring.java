package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaSubstring {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String S = in.next();
    int start = in.nextInt();
    int end = in.nextInt();
    in.close();

    System.out.println((end > S.length()-1) ? S.substring(start) : S.substring(start, end));
  }

}
