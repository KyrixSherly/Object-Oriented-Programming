package com.sd.io;
import java.util.Scanner;

public class CircleAreaMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("radius.");
		double r=sc.nextDouble();
		double area=Math.PI*Math.pow(r,2);
		System.out.printf("r:%.2f area:%.2f",r,area);
	}
}