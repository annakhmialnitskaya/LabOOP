package com.htp.string;

public class Task8 {

	public static void main(String[] args) {
		String str = ("��� �� ��������� (������ ����������� �������) ��� �������� �������������� �����������  ������ ���������� ����������");
		String result=str.replaceAll("\\([^)]+\\)", ""); 
		System.out.println(result);

	}

}
