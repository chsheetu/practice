package com.miit;

//printing 1 to 100 using FOR loop
public class PrintNumbers {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);

		}
		//printing 1 to 100 using WHILE loop
		int i = 1;
		while (i < 101) {
			System.out.println(i);
			i = i + 1;
		}
		//printing 1 to 100 using DOWHILE loop

		int j = 1;
		do {
			System.out.println(j);
			j=j+1;
		} while (j < 101);
	}

}
