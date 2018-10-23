package com.gmal.carbit3333333;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File fileOne = new File("E:\\Работа\\Увви\\a.txt");
		File fileTwo = new File("E:\\Работа\\Увви\\b.txt");
		File target = new File("ab.txt");

		MyFileCopy myCopy = new MyFileCopy(fileOne, fileTwo, target);
		myCopy.result();
	}

}
