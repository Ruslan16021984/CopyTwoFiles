package com.gmal.carbit3333333;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		MyFileCopy myCopy = new MyFileCopy();
		File fileOne = new File("E:\\Работа\\Увви\\a.txt");
		File fileTwo = new File("E:\\Работа\\Увви\\b.txt");
		File target = new File("ab.txt");
		String copy = myCopy.copy(fileOne, fileTwo);
		myCopy.result(copy, target);

	}

}
