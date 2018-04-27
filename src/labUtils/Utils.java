package labUtils;

import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
	Position<Integer> p1 = t.addRoot(4);
		
		Position<Integer>c2 = t.addChild(p1, 9);
		
		t.addChild(c2, 7);
		t.addChild(c2, 10);
		
		Position<Integer>c1 = t.addChild(p1, 20);
		Position<Integer> grandC2 = t.addChild(c1, 15);
		Position<Integer> grandC1 = t.addChild(c1, 21);
		Position<Integer> gGrandC1 = t.addChild(grandC1, 40);
		t.addChild(gGrandC1, 30);
		t.addChild(gGrandC1, 45);
	    t.addChild(grandC2, 12);
		Position<Integer> gGrandC2 = t.addChild(grandC2, 17);
		t.addChild(gGrandC2, 19);
		
		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
	Position<Integer> p1 = t.addRoot(4);
		
	//fix the order in which they are appearing
		Position<Integer>c1 = t.addLeft(p1, 9);
		
		t.addLeft(c1, 7);
		t.addRight(c1, 10);
		
		Position<Integer>c2 = t.addRight(p1, 20);
		Position<Integer> grandC3 = t.addLeft(c2, 15);
		Position<Integer> grandC4 = t.addRight(c2, 21);
		Position<Integer> gGrandC3 = t.addLeft(grandC4, 40);
		t.addLeft(gGrandC3, 30);
		t.addRight(gGrandC3, 45);
		t.addLeft(grandC3, 12);
Position<Integer> gGrandC2 = t.addRight(grandC3, 17);
	t.addLeft(gGrandC2, 19);
		

	
		return t; 
	
	
	
	}


}
