package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaLoopsI {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		scanner.close();
		if (no >=2 && no <= 20) {
			for (int i=1; i<=10; i++)
				System.out.println(no + " x " + i + " = " + (no*i));
		}
	}

}
