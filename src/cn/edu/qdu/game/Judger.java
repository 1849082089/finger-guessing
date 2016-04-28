package cn.edu.qdu.game;

import java.util.Scanner;

public class Judger {
	private int total=0;

	private Person person=new Person();
	private Computer computer=new Computer();;

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public void startGame(){
		System.out.println("***************");
		System.out.println("** ��ȭ ,��ʼ   **");
		System.out.println("***************");
		System.out.println("��ȭ���� 1.����  2.ʯͷ  3.��");
	}
	public void askName(){
		computer.inputName();
		person.inputName();
		
		System.out.println(person.name+" VS "+computer.name+" ��ս");
	}
	public void playGame(){
		String yn=null;
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("Ҫ��ʼ��   ��Y/N��");
		String a=input.nextLine();
		System.out.println();
		if(a.equalsIgnoreCase("N")){
			System.out.println("ϵͳ�˳�");
		}else{
			do{
			total++;
			person.myFist();
			computer.myFist();
			
			System.out.println("���ȭ��"+person.fist);
			System.out.println(computer.name+"��ȭ��"+computer.fist);
			if((person.equals("����")&&computer.equals("ʯͷ"))||(person.equals("ʯͷ")&&computer.equals("��"))||(person.equals("��")&&computer.equals("����"))){
				System.out.println("������");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}else if(person.fist==computer.fist){
				System.out.println("ƽ��");
			}else{
				System.out.println("��Ӯ��");
				person.setWinningTimes(person.getWinningTimes()+1);;
				
			}
			System.out.println("�Ƿ�ʼ��һ�֣�Y/N��");
			yn=input.nextLine();
			}while(yn.equalsIgnoreCase("Y"));
		}
		
	}
	public void finalResult(){
		System.out.println(computer.name+"VS"+person.name);
		System.out.println("��ս������ "+total);
		System.out.println();
		System.out.println("����          �÷�");
		System.out.println(person.name+"    "+person.getWinningTimes());
		System.out.println(computer.name+"    "+computer.getWinningTimes());
		System.out.println();
		if(person.getWinningTimes()>computer.getWinningTimes()){
			
			System.out.println("�������Ӯ��");
		}else
		System.out.println("�����������");
	}

}
