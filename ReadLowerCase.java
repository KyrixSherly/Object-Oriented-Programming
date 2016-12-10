package com.sd.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadLowerCase {
	public static void lowerPrint() {
		try {
			Scanner sc=new Scanner(new File("test.txt"));
			String line=sc.nextLine();
			System.out.println(line.toLowerCase());
	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		lowerPrint();
	}
}