package com.sd.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteFile {
	public static void Print() {
		try {
			FileWriter fw=new FileWriter("testwrite.txt");
			fw.write("test");
			fw.close();
	
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}
	public static void main(String[] args) {
		Print();
	}
}