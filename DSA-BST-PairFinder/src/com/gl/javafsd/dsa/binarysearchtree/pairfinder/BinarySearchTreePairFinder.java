package com.gl.javafsd.dsa.binarysearchtree.pairfinder;

import java.util.HashSet;
import java.util.Set;

public class BinarySearchTreePairFinder {

	private BinarySearchTree binarySearchTree;
	private boolean found;

	public BinarySearchTreePairFinder(BinarySearchTree binarySearchTree) {

		this.binarySearchTree = binarySearchTree;
	}

	public void findPair(int sum) {

		Set<Integer> nodes = new HashSet<>();

		findPairInternal(binarySearchTree.getRoot(), sum, nodes);

		if (!found) {
			System.out.println("Sum = " + sum);
			System.out.println("Nodes are not found");
		}
	}

	boolean findPairInternal(BinarySearchTreeNode aNode, int sum, Set<Integer> nodes) {

		if (aNode == null) {
			return false;
		}

		found = findPairInternal(aNode.getLeftNode(), sum, nodes);

		if (found) {
			return true;
		}

		int differenceValue = (sum - aNode.getData());

		if (nodes.contains(differenceValue)) {

			found = true;

			System.out.println("Sum = " + sum );
			System.out.println("Pair is (" + aNode.getData() + "," + differenceValue + ")");
			return found;

		} else {

			nodes.add(aNode.getData());
		}

		if (!found) {

			return findPairInternal(aNode.getRightNode(), sum, nodes);
		} else {
			return true;
		}
	}
}