package com.htp.string;

public class Task5 {

	public static void main(String[] args) {

		String str = ("Уже со следующей недели температура воздуха под влиянием скандинавского антициклона начнет постепенно понижаться");
		String input = ("РА");
		String simbol = ("ра");
		String[] array = str.split("[\\s]");
		StringBuilder sb = new StringBuilder();
		for (String word : array) {
			sb.append(word);
			if (word.endsWith(simbol)) {
				sb.append(input);
			}
			sb.append(" ");
		}
		System.out.println(sb);
	}

}
