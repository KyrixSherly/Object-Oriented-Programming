package com.sd.game;

import java.util.Scanner;
import java.util.Random;

public class Game {
	public static void main(String[] args) {
		while(true) {
			int comNum = (int) (Math.random()*6)+1;
			int userNum = (int) (Math.random()*6)+1;
			int rule = 0;
			System.out.println("Choose the Game!");

			Scanner sc = new Scanner(System.in);
			String userYutt;
			String comYutt;

			try{
				rule = sc.nextInt();
				if(rule==2) {
					System.out.println("Game Ends");
					sc.close();
					break;
				}
			}
			catch (Exception e){
				rule = 2;
				System.out.println("You didn't enter the number.");
			}
			if(rule>1) {
				System.out.println("Please enter 0 or 1");
				continue;
			}
			switch(rule) {
				case 0 :
				System.out.println("Dice Game");
				if (userNum > comNum) {
					System.out.println("You are win");
					System.out.printf("Computer : %s, You : %s",comNum,userNum);
				} else if (userNum==comNum) {
					System.out.println("Draw");
					System.out.printf("Computer : %s, You : %s",comNum,userNum);
				} else {
					System.out.println("You are lose");
					System.out.printf("Computer : %s, You : %s",comNum,userNum);
				}
				break;
				case 1 :
				System.out.println("Korean Traditional Game");
				if (userNum==1 && comNum==1) {
						userYutt = "BBackdo";
						comYutt = "BBackdo";
					} else if (userNum==1 && comNum==2) {
						userYutt = "BBackdo";
						comYutt = "Do";
					} else if (userNum==1 && comNum==3) {
						userYutt = "BBackdo";
						comYutt = "Gae";
					} else if (userNum==1 &&  comNum==4) {
						userYutt = "BBackdo";
						comYutt = "Gurl";
					} else if (userNum==1 &&  comNum==5) {
						userYutt = "BBackdo";
						comYutt = "Yutt";
					} else if(userNum==1 &&  comNum==6) {
						userYutt = "BBackdo";
						comYutt = "Mo";
					} else if (userNum==2 && comNum==1) {
						userYutt = "Do";
						comYutt = "BBackdo";
					} else if (userNum==2 && comNum==2) {
						userYutt = "Do";
						comYutt = "Do";
					} else if (userNum==2 && comNum==3) {
						userYutt = "Do";
						comYutt = "Gae";
					} else if (userNum==2 &&  comNum==4) {
						userYutt = "Do";
						comYutt = "Gurl";
					} else if (userNum==2 &&  comNum==5) {
						userYutt = "Do";
						comYutt = "Yutt";
					} else if(userNum==2 &&  comNum==6) {
						userYutt = "Do";
						comYutt = "Mo";
					} else if (userNum==3 && comNum==1) {
						userYutt = "Gae";
						comYutt = "BBackdo";
					} else if (userNum==3 && comNum==2) {
						userYutt = "Gae";
						comYutt = "Do";
					} else if (userNum==3 && comNum==3) {
						userYutt = "Gae";
						comYutt = "Gae";
					} else if (userNum==3 &&  comNum==4) {
						userYutt = "Gae";
						comYutt = "Gurl";
					} else if (userNum==3 &&  comNum==5) {
						userYutt = "Gae";
						comYutt = "Yutt";
					} else if(userNum==3 &&  comNum==6) {
						userYutt = "Gae";
						comYutt = "Mo";
					} else if (userNum==4 && comNum==1) {
						userYutt = "Gurl";
						comYutt = "BBackdo";
					} else if (userNum==4 && comNum==2) {
						userYutt = "Gurl";
						comYutt = "Do";
					} else if (userNum==4 && comNum==3) {
						userYutt = "Gurl";
						comYutt = "Gae";
					} else if (userNum==4 &&  comNum==4) {
						userYutt = "Gurl";
						comYutt = "Gurl";
					} else if (userNum==4 &&  comNum==5) {
						userYutt = "Gurl";
						comYutt = "Yutt";
					} else if(userNum==4 &&  comNum==6) {
						userYutt = "Gurl";
						comYutt = "Mo";
					} else if (userNum==5 && comNum==1) {
						userYutt = "Yutt";
						comYutt = "BBackdo";
					} else if (userNum==5 && comNum==2) {
						userYutt = "Yutt";
						comYutt = "Do";
					} else if (userNum==5 && comNum==3) {
						userYutt = "Yutt";
						comYutt = "Gae";
					} else if (userNum==5 &&  comNum==4) {
						userYutt = "Yutt";
						comYutt = "Gurl";
					} else if (userNum==5 &&  comNum==5) {
						userYutt = "Yutt";
						comYutt = "Yutt";
					} else if(userNum==5 &&  comNum==6) {
						userYutt = "Yutt";
						comYutt = "Mo";
					} else if (userNum==6 && comNum==1) {
						userYutt = "Mo";
						comYutt = "BBackdo";
					} else if (userNum==6 && comNum==2) {
						userYutt = "Mo";
						comYutt = "Do";
					} else if (userNum==6 && comNum==3) {
						userYutt = "Mo";
						comYutt = "Gae";
					} else if (userNum==6 &&  comNum==4) {
						userYutt = "Mo";
						comYutt = "Gurl";
					} else if (userNum==6 &&  comNum==5) {
						userYutt = "Mo";
						comYutt = "Yutt";
					} else {
						userYutt = "Mo";
						comYutt = "Mo";
					}
				if (userNum > comNum) {
					System.out.println("You are win");
					System.out.printf("Computer : %s, You : %s",comYutt,userYutt);
				} else if (userNum==comNum) {
					System.out.println("Draw");
					System.out.printf("Computer : %s, You : %s",comYutt,userYutt);
				} else {
					System.out.println("You are lose");
					System.out.printf("Computer : %s, You : %s",comYutt,userYutt);
				}
				break;
			}
		}
	}
}