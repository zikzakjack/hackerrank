package org.zikzakjack.hackerrank;

import java.util.Scanner;

public class JavaStaticInitializerBlock {

	static int B;
	static int H;
	static boolean flag;

	static {
		Scanner scanner = new Scanner(System.in);
		B = scanner.nextInt();
		H = scanner.nextInt();
		scanner.close();
		if ((B <= 0 || H <= 0)) {
			System.out.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		} else if (B <= 100 && H <= 100) {
			flag = true;
		}
	}

	public static void main(String[] args) {
		if (flag) {
			int area = B * H;
			System.out.println(area);
		}

	}

}
