package com.htp.string;

public class Task7 {

	public static void main(String[] args) {
		String str = ("��� �� ���������.������,����������� �������,��� ��������2.�������������� �����������./������ !���������� ����������!$");
		String result = str.replaceAll("[^ a-zA-Z�-��-���]+", " ");
		System.out.println(result);

	}

}
