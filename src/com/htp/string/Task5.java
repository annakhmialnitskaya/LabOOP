package com.htp.string;

public class Task5 {

	public static void main(String[] args) {

		String str = ("��� �� ��������� ������ ����������� ������� ��� �������� �������������� ����������� ������ ���������� ����������");
		String input = ("��");
		String simbol = ("��");
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
