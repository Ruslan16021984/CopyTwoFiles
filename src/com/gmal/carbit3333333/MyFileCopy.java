package com.gmal.carbit3333333;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFileCopy {

	public static String copy(File fileOne, File fileTwo) {
		String s = "";
		StringBuilder builder = new StringBuilder();
		try (BufferedReader readerOne = new BufferedReader(new FileReader(fileOne));
				BufferedReader readerTwo = new BufferedReader(new FileReader(fileTwo))){
			String arg = "";

			for (; (arg = readerOne.readLine())!=null;) {
				builder.append(arg);
			}
			for (; (arg = readerTwo.readLine())!=null;) {
				builder.append(arg);
				
			}
			String[] array = builder.toString().split(" ");
			choseWords(array);
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		return builder.toString();
	
	}
	public static void result(String words, File torget) {
		try (PrintWriter writer = new PrintWriter("ab.txt");){

			writer.write(words);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	private static String choseWords(String[] array) {
		String words= "";
		int count;
		for (int i = 0; i < array.length; i++) {
			count =0;
			for (int j = 0; j < array.length; j++) {
				if(array[i]==array[j] && count<2) {
					words+= array[i]+" ";
					count++;
					
				}
			}
		}
		return words;
		//System.out.println(words);
	}
	
}
