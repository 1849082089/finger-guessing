package cn.edu.qdu.game;

import java.util.Random;
import java.util.Scanner;

public class Computer extends Player{
	String fist=null;
	String name = null;
	public String inputName(){
		Scanner input=new Scanner(System.in);
		System.out.println("��ѡ��Է���ɫ��1.����  2.��Ȩ  3.�ܲ٣�");
		int a=input.nextInt();//�û����������
		switch (a) {
		case 1:
			name= "����";
			break;
		case 2:
			name= "��Ȩ";
			break;
		case 3:
			name= "�ܲ�";
			break;
		default:
			System.out.println("�������");
			break;
		}
		return name;
	}
	public String myFist(){
		Random r=new Random();
		int m=r.nextInt(3)+1;
		switch (m) {
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
