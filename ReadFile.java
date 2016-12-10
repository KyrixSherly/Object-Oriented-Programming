package com.sd.io;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void print() {
		try {
			Scanner sc=new Scanner(new File("test.txt"));
			String line=sc.nextLine();
			System.out.println(line);
	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		print();
	}
}