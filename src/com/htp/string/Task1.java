package com.htp.string;

public class Task1 {

	public static void main(String[] args) {

		String str = "Мороз и солнце - день чудесный.";
		String [] text=str.split(" ");
		int k = 2;
		char newChar = 'A';
		char[] word;
		for (int i = 0; i < text.length; i++) {
			if (text[i].length() >= k) {
				word = text[i].toCharArray();
				word[k - 1] = newChar;
				text[i] = String.copyValueOf(word);
			}
		}

		for (String s : text) {
			System.out.println(s);
		}
	}

}
