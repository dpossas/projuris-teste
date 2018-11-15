package br.com.projuris;

public class MyFindArrayTest {
	public static void main(String[] args) {
		MyFindArray myFindArray = new MyFindArray();
		int index = -1;

		int[] arrayA1 = new int[] { 4, 9, 3, 7, 8 };
		int[] arrayA2 = new int[] { 3, 7 };

		index = myFindArray.findArray(arrayA1, arrayA2);
		System.out.println("#1");
		System.out.println(index);
		System.out.println("");

		int[] arrayB1 = { 1, 3, 5 };
		int[] arrayB2 = { 1 };

		index = myFindArray.findArray(arrayB1, arrayB2);
		System.out.println("#2");
		System.out.println(index);
		System.out.println("");

		int[] arrayC1 = { 7, 8, 9 };
		int[] arrayC2 = { 8, 9, 10 };

		index = myFindArray.findArray(arrayC1, arrayC2);
		System.out.println("#3");
		System.out.println(index);
		System.out.println("");

		int[] arrayD1 = { 4, 9, 3, 7, 8, 3, 7, 1 };
		int[] arrayD2 = { 3, 7 };

		index = myFindArray.findArray(arrayD1, arrayD2);
		System.out.println("#4");
		System.out.println(index);
		System.out.println("");
	}
}
