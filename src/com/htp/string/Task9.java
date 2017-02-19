package com.htp.string;

public class Task9 {

	public static void main(String[] args) {
		String str = ("Ехал Грека через реку, видит Грека в реке рак, сунул Грека руку в реку, рак за руку Грека цап");
		str = str.replaceAll("[^ a-zA-ZА-Яа-яёЁ]+", "");
		String[] array = str.split("[\\s]");
		 
		for(String word:array ){
			int counter=0;
			for (String secondWord : array) {
				if(word.equals(secondWord)){
					counter++;
				}
			}	
			System.out.println("Слово '"+word+"' встречается "+counter+" раз.");
		}

	}

}
