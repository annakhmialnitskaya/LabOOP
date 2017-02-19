package com.htp.string;

public class Task8 {

	public static void main(String[] args) {
		String str = ("Уже со следующей (недели температура воздуха) под влиянием скандинавского антициклона  начнет постепенно понижаться");
		String result=str.replaceAll("\\([^)]+\\)", ""); 
		System.out.println(result);

	}

}
