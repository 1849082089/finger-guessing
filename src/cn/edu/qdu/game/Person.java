package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	String name = null;
	String fist=null;
	public String inputName(){
		Scanner input=new Scanner(System.in);
		System.out.println("请输入你的姓名：");
		name=input.nextLine();
		return name;
	}
	public String myFist(){
		Scanner input=new Scanner(System.in);
		System.out.println("请出拳： 1.剪刀  2.石头  3.布（请输入相应数字）");
		int a=input.nextInt();
		switch (a) {
		case 1:
			fist= "剪刀";
			break;
		case 2:
			fist= "石头";
			break;
		case 3:
			fist= "布";
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		return fist;
	}

}
