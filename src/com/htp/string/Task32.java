package com.htp.string;

public class Task32 {

	public static void main(String[] args) {
		String str = ("Ехал Грека через реку, видит Грека в реке рак, сунул Грека руку в реку, рак за руку Грека цап");
		String toFind = "Грека";
		str = str.replaceAll("[^ a-zA-ZА-Яа-яёЁ]+", "");
		String[] array = str.split("[\\s]");

		int counter = 0;
		for (String word : array) {
			if (toFind.equals(word)) {
				counter++;
			}
		}
		System.out.println("Слово '" + toFind + "' встречается " + counter + " раз.");

	}

}
