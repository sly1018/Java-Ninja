package bitset;

import java.util.*;

public class BConst {
	// main
	public static void main(String args[]) {
		// creating objects
		BitSet bs1 = new BitSet(); // no value
		BitSet bs2 = new BitSet(16);
		
		// set bits
		bs1.set(0);
		bs1.set(1);
		bs1.set(2);
		bs1.set(4);
		
		bs2.set(4);
		bs2.set(6);
		bs2.set(5);
		bs2.set(1);
		bs2.set(2);
		bs2.set(3);
		
		// print out
		System.out.println("bs1: " + bs1);
		System.out.println("b2: " + bs2);
	}
}
