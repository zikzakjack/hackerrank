package org.zikzakjack.hackerrank.days;

import java.util.Scanner;

public class Day01 {

  public static void main(String[] args) {
    int i = 4;
    double d = 4.0;
    String s = "HackerRank ";

    Scanner scan = new Scanner(System.in);

    int input1;
    double input2;
    String input3;

    input1 = scan.nextInt();
    input2 = scan.nextDouble();
    input3 = scan.useDelimiter(System.getProperty("line.separator")).next();

    System.out.println(i + input1);
    System.out.println(d + input2);
    System.out.println(s + input3);
    scan.close();

  }

}
