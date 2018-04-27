package testerClasses;

import labUtils.Utils;
import treeClasses.LinkedTree;

public class linkedTreeCloneTester {
	
	public static void main(String args[]){
		
		// Testing LinkedTree...
		LinkedTree<Integer> linkedTree = new LinkedTree<>();
		LinkedTree<Integer> linkTreeClone = null;
		try{ linkTreeClone = linkedTree.clone(); }
		catch(Exception e){ e.printStackTrace(); }
		Utils.displayTree("The tree is: ", linkedTree); 
		Utils.displayTree("The tree is: ", linkTreeClone); 
		linkedTree = Utils.buildExampleTreeAsLinkedTree();
		try {
			linkTreeClone = linkedTree.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Utils.displayTree("The tree is: ", linkedTree); 
		Utils.displayTree("The tree is: ", linkTreeClone); 
		

		
	}
}
