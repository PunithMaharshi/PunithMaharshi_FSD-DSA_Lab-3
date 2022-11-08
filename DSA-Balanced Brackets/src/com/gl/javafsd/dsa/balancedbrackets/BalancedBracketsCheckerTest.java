package com.gl.javafsd.dsa.balancedbrackets;

public class BalancedBracketsCheckerTest {

	public static void main(String[] args) {

		System.out.println("1) Entered String ([[{}]])");
		test("([[{}]])");
		System.out.println("2) Entered String ([[{}]]))");
		test("([[{}]]))");
		System.out.println("3) Entered String []");

		test("[]");

	}

	static void test(String brackets) {

		BalancedBracketsChecker checker = new BalancedBracketsChecker(brackets);

		boolean result = checker.check();
		if (result) {

			System.out.println("The entered String has Balanced Brackets");
		} else {
			System.out.println("The entered Strings do not contain Balanced Brackets");
		}
	}
}
