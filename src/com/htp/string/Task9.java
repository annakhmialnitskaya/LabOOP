package com.htp.string;

public class Task9 {

	public static void main(String[] args) {
		String str = ("���� ����� ����� ����, ����� ����� � ���� ���, ����� ����� ���� � ����, ��� �� ���� ����� ���");
		str = str.replaceAll("[^ a-zA-Z�-��-���]+", "");
		String[] array = str.split("[\\s]");
		 
		for(String word:array ){
			int counter=0;
			for (String secondWord : array) {
				if(word.equals(secondWord)){
					counter++;
				}
			}	
			System.out.println("����� '"+word+"' ����������� "+counter+" ���.");
		}

	}

}
