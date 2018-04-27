package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedBinaryTree;

public class LinkedBinaryTreeCloneTester {

	public static void main(String[] args) {
		
		// Testing LinkedBinaryTree...
		LinkedBinaryTree<Integer> linkedBinaryTree = new LinkedBinaryTree<>();
		LinkedBinaryTree<Integer> linkedBinaryTreeclone = null;
		try{ linkedBinaryTreeclone = linkedBinaryTree .clone(); }
		catch(Exception e){ e.printStackTrace(); }
		Utils.displayTree("The tree is: ", linkedBinaryTree ); 
		Utils.displayTree("The tree is: ", linkedBinaryTreeclone); 
		linkedBinaryTree  = Utils.buildExampleTreeAsLinkedBinaryTree();
		try {
			linkedBinaryTreeclone =  linkedBinaryTree .clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Utils.displayTree("The tree is: ", linkedBinaryTree ); 
		Utils.displayTree("The tree is: ", linkedBinaryTreeclone); 
		
	}
}
