package com.terotam.TeroTam;

public class StringAndStringBuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = new String("Jivan");
		s.concat("Gawande");
		System.out.println(s);
		
		StringBuffer sb = new StringBuffer ("Pavan");
		sb.append("Gawande");
		System.out.println(sb);

		String s1 = new String ("Jivan");
		String s2 = new String ("Jivan");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		String a = "Jivan Gawande";
		String b = "";
		
		for ( int i = 0; i<a.length();i++) {
			char ah = a.charAt(i);
			b = ah+b;
		}
		System.out.println(b);
		
		String bn = " Bharat Mata Ki Jay";
		String bm = "";
		
		
		for (int i=0; i<bn.length(); i++) {
			char bh = bn.charAt(i);
			bm = bh+ bm;
		}
		System.out.println(bm);
		
		 String inputString = "Bharat Mata Ki Jay";
	        
	        // Split the string into words
	        String[] words = inputString.split(" ");
	        
	        // Reverse the second word manually using a loop
	        String secondWord = words[3];
	        StringBuilder reversedSecondWord = new StringBuilder();
	        
	        for (int i = secondWord.length() - 1; i >= 0; i--) {
	            reversedSecondWord.append(secondWord.charAt(i));
	        }
	        
	        // Replace the second word with its reversed version
	        words[3] = reversedSecondWord.toString();
	        
	        // Join the words back together
	        String result = String.join(" ", words);
	        
	        // Print the result
	        System.out.println("Result: " + result);
		
		
	}

}
