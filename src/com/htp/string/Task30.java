package com.htp.string;

import java.util.Arrays;

public class Task30 {

	public static void main(String[] args) {
		String str = ("Ехал Грека через реку, видит Грека в реке рак, сунул Грека руку в реку, рак за руку Грека цап");
		str = str.replaceAll("[^ a-zA-ZА-Яа-яёЁ]+", "");
		String[] array = str.split("[\\s]");
		Arrays.sort(array);

		for (String word : array) {
			System.out.print(word + " ");
		}
	}

}
