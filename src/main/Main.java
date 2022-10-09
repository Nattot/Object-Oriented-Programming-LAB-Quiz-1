package main;

import java.util.Scanner;
import java.util.Vector;

import icecream.IceCream;

import java.util.Random;

public class Main {

	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	
	void viewcream(Vector<IceCream> vecream) {
		if(vecream.isEmpty()) {
			System.out.println("No Ice Cream");
			System.out.println("Press Enter to Continue...");
			return;
		}
		System.out.println("=============================================================================================");
		System.out.println("| ID	| Name						| Size		| Toppings						| Price		|");
		System.out.println("=============================================================================================");
		for(IceCream iceCream : vecream) {
			System.out.print("| %s	| %s						| %s		| %s						| %s		|\n", iceCream.getID(), iceCream.getName(), iceCream.getSize(), iceCream.getTopping(), iceCream.getPrice());
		}
	}
	
	void addcream(Vector<IceCream> vecream) {
		String randchar = "1234567890";
		char rand;
		int randSize = randchar.length();
		String tempID ="IC";
		for(int i=0; i<3; i++) {
			rand = randchar.charAt(random.nextInt(randSize));
			tempID += rand;
		}
		IceCream creamID = new IceCream(tempID);
		
		String Name=null;
		int flag=0;
		do {
			if(flag==1) {
				System.out.println("Name must not be empty");
			}
			try {
				System.out.print("Input Ice Cream Name: ");
				Name=scan.nextLine();
			}
			catch(Exception e) {
				Name=null;
				scan.nextLine();
			}
			flag=1;
		}while(Name.isEmpty());
		
		String Size;
		flag=0;
		do {
			if(flag==1) {
				System.out.println("Size must be between Small, Medium, or Large");
			}
			try {
				System.out.print("Choose Ice Cream Size [Small | Medium | Large] : ");
				Size=scan.nextLine();
			}
			catch(Exception e) {
				Size=null;
				scan.nextLine();
			}
			flag=1;
		}while(!Size.equals("Small") || !Size.equals("Medium") || !Size.equals("Large"));
		
		int top=69;
		flag=0;
		do {
			if(flag==1) {
				System.out.println("Please choose topping between 0-3");
			}
			try {
				System.out.println("1. Chocolate - 2000");
				System.out.println("2. Vanilla - 3000");
				System.out.println("3. Strawberry - 3500");
				System.out.print("Pick topping [1-3] [0 to skip] : ");
				top=scan.nextInt();
			}
			catch(Exception e) {
				top=69;
				scan.nextLine();
			}
			flag=1;
		}while(top<0 || top>3);
	}
	
	public Main() {
		// TODO Auto-generated constructor stub
		Vector<IceCream> vecream = new Vector<>();
		int menu=0;
		int flag=0;
		do {
			System.out.println("Ice Cream Shop");
			System.out.println("1. View Ice Cream");
			System.out.println("2. Add Ice Cream");
			System.out.println("3. Delete Ice Cream");
			System.out.println("4. Exit");
			System.out.print("Choose :");
			flag=0;
			do {
				if(flag==1) {
					System.out.println("Must Select Menu between 1-4");
				}
				try {
					menu=scan.nextInt();
					scan.nextLine();
				}
				catch(Exception e) {
					menu=0;
					scan.nextLine();
				}
				flag=1;
			}while(menu<1 || menu>4);
			switch(menu) {
				case 1:{
					viewcream(vecream);
					scan.nextLine();
				}break;
				
				case 2:{
					addcream(vecream);
					scan.nextLine();
				}break;
				
				case 3:{
					viewcream(vecream);
					System.out.println("Choose Ice Cream ID to be deleted ['cancel' to cancel']: ");
					scan.nextLine();
				}break;
			}
		}while (menu!=4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
