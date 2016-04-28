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
		System.out.println("** 猜拳 ,开始   **");
		System.out.println("***************");
		System.out.println("出拳规则： 1.剪刀  2.石头  3.布");
	}
	public void askName(){
		computer.inputName();
		person.inputName();
		
		System.out.println(person.name+" VS "+computer.name+" 对战");
	}
	public void playGame(){
		String yn=null;
		Scanner input=new Scanner(System.in);
		System.out.println();
		System.out.println("要开始吗？   （Y/N）");
		String a=input.nextLine();
		System.out.println();
		if(a.equalsIgnoreCase("N")){
			System.out.println("系统退出");
		}else{
			do{
			total++;
			person.myFist();
			computer.myFist();
			
			System.out.println("你出拳："+person.fist);
			System.out.println(computer.name+"出拳："+computer.fist);
			if((person.equals("剪刀")&&computer.equals("石头"))||(person.equals("石头")&&computer.equals("布"))||(person.equals("布")&&computer.equals("剪刀"))){
				System.out.println("你输了");
				computer.setWinningTimes(computer.getWinningTimes()+1);
			}else if(person.fist==computer.fist){
				System.out.println("平局");
			}else{
				System.out.println("你赢了");
				person.setWinningTimes(person.getWinningTimes()+1);;
				
			}
			System.out.println("是否开始下一轮（Y/N）");
			yn=input.nextLine();
			}while(yn.equalsIgnoreCase("Y"));
		}
		
	}
	public void finalResult(){
		System.out.println(computer.name+"VS"+person.name);
		System.out.println("对战次数： "+total);
		System.out.println();
		System.out.println("姓名          得分");
		System.out.println(person.name+"    "+person.getWinningTimes());
		System.out.println(computer.name+"    "+computer.getWinningTimes());
		System.out.println();
		if(person.getWinningTimes()>computer.getWinningTimes()){
			
			System.out.println("结果：你赢了");
		}else
		System.out.println("结果：你输了");
	}

}
