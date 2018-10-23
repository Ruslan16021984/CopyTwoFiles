package com.gmal.carbit3333333;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class MyFileCopy {
	private String words;
	private File fileOne;
	private File fileTwo;
	private File targetFile;

	

	public MyFileCopy(File fileOne, File fileTwo, File targetFile) {
		super();
		this.fileOne = fileOne;
		this.fileTwo = fileTwo;
		this.targetFile = targetFile;
	}
	public void result() {
		copy(fileOne, fileTwo);
		
		try (PrintWriter writer = new PrintWriter(targetFile)) {

			writer.write(this.words);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void copy(File fileOne, File fileTwo) {
		String s = "";
		String[] oneArray = null;
		String[] twoArray = null;
		StringBuilder builder = new StringBuilder();
		try (BufferedReader readerOne = new BufferedReader(new FileReader(fileOne));
				BufferedReader readerTwo = new BufferedReader(new FileReader(fileTwo))) {
			String arg = "";

			for (; (arg = readerOne.readLine()) != null;) {
				oneArray = arg.split(" ");
				System.out.println(Arrays.toString(oneArray));
			}
			for (; (arg = readerTwo.readLine()) != null;) {
				twoArray = arg.split(" ");
				System.out.println(Arrays.toString(twoArray));
			}
			
			choseWords(oneArray, twoArray);
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}

	}

	private String choseWords(String[] array1, String[]array2) {
		String words = "";
		int count;
		for (int i = 0; i < array1.length; i++) {
			count =0;
			for (int j = 0; j < array2.length; j++) {
				if(array1[i].equals(array2[j]) && count<=1){
					words+=array1[i] + " ";
					count+=1;
					System.out.println(words);
				}
			}
			
		}

		this.words = words;
		return this.words;

	}

}
