package hotel;

import java.util.Scanner;

import javaProgram.Deserts;
import javaProgram.Drinks;
import javaProgram.Main_Course;
import javaProgram.Staters;

public class Menu {
	public void display() {
		System.out.println("Welcome to xyz hotel..");
		String order;
		int choice,menu;
		System.out.println(" Here is your Menu Please check ...");
		Scanner sc = new Scanner(System.in);
		System.out.println("Select your Menu");
		System.out.println("1.Stater");
		System.out.println("2.Main Courses");
		System.out.println("3.Deserts");
		System.out.println("4.Drinks");
		menu = sc.nextInt();
		switch(menu) {
		case 1:
			Staters staters = new Staters();
			staters.foodInfo();
			//System.out.println("Staters");
			break;
		case 2:
			Main_Course mc = new Main_Course();
			mc.foodInfo();
			System.out.println("Main Courses");
			break;
		case 3:
			Deserts d = new Deserts();
			d.foodInfo();
			System.out.println("Deserts");
			break;
		case 4:
			Drinks dr = new Drinks();
			dr.foodInfo();
			System.out.println("Drinks");
			break;
		default:
			System.out.println("Not Available...Try something else");
		
		}
		
		

	}

}
