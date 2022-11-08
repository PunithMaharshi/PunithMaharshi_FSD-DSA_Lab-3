package com.gl.javafsd.dsa.binarysearchtree.pairfinder;

public class BinarySearchTreePairFinderTest {

	public static void main(String[] args) {

		pairFinderTest(130);
		pairFinderTest(83);
		pairFinderTest(70);
		pairFinderTest(10);

	}

	static void pairFinderTest(int sum) {

		BinarySearchTree sampleTree2 = BinarySearchTreeTest.sampleBinaryTree1();

		BinarySearchTreePairFinder finder = new BinarySearchTreePairFinder(sampleTree2);

		finder.findPair(sum);

		System.out.println("--------------------------------------");
	}
}