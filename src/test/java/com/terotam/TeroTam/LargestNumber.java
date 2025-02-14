package com.terotam.TeroTam;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class LargestNumber {

	public static void main(String[] args) {
		
		

		int a = 400;
		int b = 1320;
		int c = Math.max(a, b);
		System.out.println(c); // output: 1320
		if (a > b) {
			System.out.println(" A is greater number"); // output : b is greeter number
		} else {
			System.out.println("B is getter number ");
		}
		int d = a > b ? a : b;
		System.out.println(d + " is greter"); // Output : 1320 is greeter

		String j = "JiVan ManoHar GawaNde";
		int lower = 0;
		int upper = 0;
		for (int i = 0; i < j.length(); i++) {
			char ch = j.charAt(i);
			if (ch >= 65 && ch <= 90) {
				upper++;
			} else {
				lower++;
			}

		}
		System.out.println(lower);
		System.out.println(upper);

		String input = "Hello World!";

		// Variables to count uppercase and lowercase characters
		int upperCount = 0;
		int lowerCount = 0;

		// Iterate through the string to check each character
		for (int i = 0; i < j.length(); i++) {
			char ch = j.charAt(i);

			// Check if the character is uppercase
			if (Character.isUpperCase(ch)) {
				upperCount++;
			}
			// Check if the character is lowercase
			else if (Character.isLowerCase(ch)) {
				lowerCount++;
			}
		}

		// Display the results
		System.out.println("Uppercase characters count: " + upperCount);
		System.out.println("Lowercase characters count: " + lowerCount);
	}

	

}
