package cn.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player{
	String fist=null;
	public void inputName(){
		Scanner input=new Scanner(System.in);
		System.out.println("���������������");
		String name=input.nextLine();
		setPlayName(name);
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
