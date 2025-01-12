package com.in28minutes.tips.nonaccess.package1;

class Player {
	private String name;
	private static int count = 0;

	public Player(String name) {
		super();
		this.name = name;
		count++;
	}

//	public int getCount() {
	static public int getCount() {
//		System.out.println(name);
//		System.out.println(getName());
		return count;
	}

	public String getName() {
		System.out.println(count);
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class StaticModifierRunner {

	public static void main(String[] args) {
		Player player1 = new Player("Ronaldo");
		System.out.println(Player.getCount());
		
		Player player2 = new Player("Federer");
//		System.out.println(player1.getCount());
//		System.out.println(player2.getCount());
		System.out.println(Player.getCount());
	}
}
