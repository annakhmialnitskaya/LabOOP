package com.htp.string;

public class Task32 {

	public static void main(String[] args) {
		String str = ("���� ����� ����� ����, ����� ����� � ���� ���, ����� ����� ���� � ����, ��� �� ���� ����� ���");
		String toFind = "�����";
		str = str.replaceAll("[^ a-zA-Z�-��-���]+", "");
		String[] array = str.split("[\\s]");

		int counter = 0;
		for (String word : array) {
			if (toFind.equals(word)) {
				counter++;
			}
		}
		System.out.println("����� '" + toFind + "' ����������� " + counter + " ���.");

	}

}
