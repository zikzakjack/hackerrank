package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int query = in.nextInt();
		if (query >= 0 && query <= 500) {
			for (int i = 0; i < query; i++) {
				int a = in.nextInt();
				int b = in.nextInt();
				int n = in.nextInt();
				if ((a >= 0 && a <= 50) && (b >= 0 && b <= 50) && (n >= 0 && n <= 15)) {
					int subQuery = 0;
					for (int z = 0; z < n; z++) {
						subQuery = subQuery + (int) (Math.pow(2, z) * b);
						System.out.print(a + subQuery + " ");
					}
					System.out.println();
				}
			}
			in.close();
		}
	}

}
