package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaStdinAndStdoutII {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
//		System.out.println(scan.delimiter());
		int i = scan.nextInt();
		double d = scan.nextDouble();
		String s = scan.useDelimiter("\\r\n").next();
		scan.close();
		System.out.println("String: " + s);
		System.out.println("Double: " + d);
		System.out.println("Int: " + i);
	}

}
//Welcome to HackerRank's Java tutorials!
