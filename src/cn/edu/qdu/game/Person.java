package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	String name = null;
	String fist=null;
	public String inputName(){
		Scanner input=new Scanner(System.in);
		System.out.println("���������������");
		name=input.nextLine();
		return name;
	}
	public String myFist(){
		Scanner input=new Scanner(System.in);
		System.out.println("���ȭ�� 1.����  2.ʯͷ  3.������������Ӧ���֣�");
		int a=input.nextInt();
		switch (a) {
		case 1:
			fist= "����";
			break;
		case 2:
			fist= "ʯͷ";
			break;
		case 3:
			fist= "��";
			break;
		default:
			System.out.println("�������");
			break;
		}
		return fist;
	}

}
