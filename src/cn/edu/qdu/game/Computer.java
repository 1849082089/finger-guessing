package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player{
	String fist=null;
	String name = null;
	public String inputName(){
		Scanner input=new Scanner(System.in);
		System.out.println("请选择对方角色（1.刘备  2.孙权  3.曹操）");
		int a=input.nextInt();//用户输入的数字
		switch (a) {
		case 1:
			name= "刘备";
			break;
		case 2:
			name= "孙权";
			break;
		case 3:
			name= "曹操";
			break;
		default:
			System.out.println("输入错误");
			break;
		}
		return name;
	}
	public String myFist(){
		Random r=new Random();
		int m=r.nextInt(3)+1;
		switch (m) {
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
