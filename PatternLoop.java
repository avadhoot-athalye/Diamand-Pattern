package org.src.java;

public class PatternLoop {

	public static void main(String[] args) {
		//row
		for (int i = 1; i < 6; i++) {
			//traverse through column
			for (int j = 5; j > 0; j--) {
				if(j > i) {
					System.out.print("   ");
				} else {
					System.out.print(j + "  ");
				}
			} //j closed
			
//			right half
			for(int j = 2; j <= i; j++ ) {
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		for (int i = 5; i > 0; i--) {
			for (int j = 5; j > 0; j--) {
				if (j < i) {
					System.out.print(j + "  ");
				} else {
					System.out.print("   ");
				}
		}
			for (int j = 2; j < i; j++) {
				System.out.print(j + "  ");
			}
			System.out.println();
					
		}
			
			
		}
	
	}

