package com.htp.string;

public class Task4 {

	public static void main(String[] args) {

		String str = "мама мыла раму";
		int k = 3;
		String s = "ёѕ»“≈–";
		String s1 = str.substring(0, k);
		String s2 = str.substring(k, str.length());
		String result = s1 + s + s2;
		System.out.println(result);

	}

}
