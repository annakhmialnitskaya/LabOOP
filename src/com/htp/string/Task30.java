package com.htp.string;

import java.util.Arrays;

public class Task30 {

	public static void main(String[] args) {
		String str = ("���� ����� ����� ����, ����� ����� � ���� ���, ����� ����� ���� � ����, ��� �� ���� ����� ���");
		str = str.replaceAll("[^ a-zA-Z�-��-���]+", "");
		String[] array = str.split("[\\s]");
		Arrays.sort(array);

		for (String word : array) {
			System.out.print(word + " ");
		}
	}

}
