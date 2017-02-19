package com.htp.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task19 {

	public static void main(String[] args) {
		String str = ("e��� ����� ��7��� ���!�, �5���� ����� � �8��� ��*�, ��9��� ����� ��4�� � �7���, ��� �� ��89�� ����� �8��");
		String[] array = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (String word : array) {
			if (hasNotOnlyLetters(word)) {
				sb.append(word);
			} else {
				sb.append(firstUpperCase(word));
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}

	public static boolean hasNotOnlyLetters(String s) {
		String patternString = ".*[^ a-zA-Z�-��-���].*";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(s);
		return matcher.matches();
	}

	public static String firstUpperCase(String word) {
		if (word == null || word.isEmpty())
			return "";// ��� return word;
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
}
