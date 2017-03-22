package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaRegex {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while (in.hasNext()) {
      String IP = in.next();
      System.out.println(IP.matches(new MyRegex().pattern));
    }
    in.close();
  }

}


class MyRegex {

  String pattern = "^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";

}
//https://www.mkyong.com/regular-expressions/how-to-validate-ip-address-with-regular-expression/