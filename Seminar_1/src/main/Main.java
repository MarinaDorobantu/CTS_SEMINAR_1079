package main;

import classes.Zoo;
import classes.Zookeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("Seminar 1");
		Zookeeper keeper = new Zookeeper("Dani");
		Zoo zoo = new Zoo();
		zoo.setZookeeper(keeper);
	}

}
