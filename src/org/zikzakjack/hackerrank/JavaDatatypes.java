package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaDatatypes {

	public static void main(String[] args) {
		// System.out.println((-Math.pow(2, 7)) + " * byte " + (Math.pow(2, 7)-1));
		Scanner sc = new Scanner(System.in);
		int query = sc.nextInt();
		for (int i = 0; i < query; i++) {
			try {
				long testNo = sc.nextLong();
				System.out.println(testNo + " can be fitted in:");
				if (testNo >= -Math.pow(2, 7) && testNo <= Math.pow(2, 7) - 1)
					System.out.println("* byte");
				if (testNo >= -Math.pow(2, 15) && testNo <= Math.pow(2, 15) - 1)
					System.out.println("* short");
				if (testNo >= -Math.pow(2, 31) && testNo <= Math.pow(2, 31) - 1)
					System.out.println("* int");
				if (testNo >= -Math.pow(2, 63) && testNo <= Math.pow(2, 63) - 1)
					System.out.println("* long");
			} catch (Exception e) {
				System.out.println(sc.next() + " can't be fitted anywhere.");
			}

		}
	}

}
