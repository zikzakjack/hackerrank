package org.zikzakjack.hackerrank;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaEndOfFile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=1;
		while (scanner.useDelimiter("\\r\n").hasNextLine()) {
			String line = scanner.useDelimiter("\\r\n").nextLine();
			System.out.println(i++ + " " + line);
		}
		scanner.close();
	}

}
