package bitset;

import java.util.BitSet;

public class BitSet1 {
	// main
	public static void main(String[] args) {
		// creating objects
		BitSet bits1 = new BitSet(16);
		BitSet bits2 = new BitSet(16);
		
		// loop
		for(int i = 0; i < 16; i++) {
			if((i%2) == 0) bits1.set(i);
			if((i%5) != 0) bits2.set(i);
		}
		// print statement
		System.out.println("Initial pattern in bits1: ");
		System.out.println(bits1);
		System.out.println("\n Initial pattern in bits2: ");
		System.out.println(bits2);
		// AND
		bits2.and(bits1);
		System.out.println("\n bits2 AND bits1: ");
		System.out.println(bits2);
		// OR
		bits2.or(bits1);
		System.out.println("\n bits2 OR bits1: ");
		System.out.println(bits2);
		// XOR
		bits2.xor(bits1);
		System.out.println("\n bits2 XOR bits1: ");
		System.out.println(bits2);
	}

}
