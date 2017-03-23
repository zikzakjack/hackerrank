package org.zikzakjack.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaRegex2DuplicateWords {

  public static void main(String[] args) {

//  hackerrank regex 
    String regex = "(\\b\\w+\\b)(\\s+\\1\\b)+";
//    String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";
    Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

    Scanner in = new Scanner(System.in);
    int numSentences = Integer.parseInt(in.nextLine());

    while (numSentences-- > 0) {
      String input = in.nextLine();

      Matcher m = p.matcher(input);

      // Check for subsequences of input that match the compiled pattern
      while (m.find()) {
        input = input.replaceAll(m.group(), m.group(1));
      }

      // Prints the modified sentence.
      System.out.println(input);
    }

    in.close();
  }

}

// http://docs.oracle.com/javase/6/docs/api/java/util/regex/Pattern.html
// http://stackoverflow.com/questions/9147270/regex-in-java-for-finding-duplicate-consecutive-words
// http://stackoverflow.com/questions/23720217/removing-consecutive-duplicates-words-out-of-text-using-regex-and-displaying-the
