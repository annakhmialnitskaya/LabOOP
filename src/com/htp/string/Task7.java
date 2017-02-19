package com.htp.string;

public class Task7 {

	public static void main(String[] args) {
		String str = ("Уже со следующей.недели,температура воздуха,под влиянием2.скандинавского антициклона./начнет !постепенно понижаться!$");
		String result = str.replaceAll("[^ a-zA-ZА-Яа-яёЁ]+", " ");
		System.out.println(result);

	}

}
