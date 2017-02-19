package com.htp.string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task19 {

	public static void main(String[] args) {
		String str = ("eхал грека че7рез рек!у, в5идит грека в р8еке ра*к, су9нул грека ру4ку в р7еку, рак за ру89ку грека ц8ап");
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
		String patternString = ".*[^ a-zA-ZА-Яа-яёЁ].*";
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(s);
		return matcher.matches();
	}

	public static String firstUpperCase(String word) {
		if (word == null || word.isEmpty())
			return "";// или return word;
		return word.substring(0, 1).toUpperCase() + word.substring(1);
	}
}
