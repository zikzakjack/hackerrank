package org.zikzakjack.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

public class JavaStringTokens {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    scan.close();
    s = s.trim();
    if (s.length() == 0) {
      System.out.println(0);
      return;
    } else {
      String[] tokens = s.trim().split("[ !,?._'@]+");
      System.out.println(tokens.length);
      // for (String token : tokens)
      // System.out.println(token);
      Arrays.stream(tokens).forEach(System.out::println);
    }
  }

}
