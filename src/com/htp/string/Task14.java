package com.htp.string;

public class Task14 {

	public static void main(String[] args) {
		String str = ("�� ��������� �� ����, ����������� ������� ��� �������� ��������������, ����������� ������ ���������� ����������.");
		str = str.replaceAll("[^ a-zA-Z�-��-���]+", "");
		String[] array = str.split("[\\s]");
		int max = array[0].length();
		int min = array[0].length();
		for (String word : array) {
			if (word.length() > max) {
				max = word.length();
			}
			if (word.length() < min) {
				min = word.length();
			}
		}
		StringBuilder sbMax = new StringBuilder("����� � ������������ ������ (" + max + "):");
		StringBuilder sbMin = new StringBuilder("����� � ����������� ������ (" + min + "):");

		for (String word : array) {
			if (word.length() == max) {
				sbMax.append(word + " ");
			}
			if (word.length() == min) {
				sbMin.append(word + " ");
			}
		}

		System.out.println(sbMax);
		System.out.println(sbMin);

	}

}
