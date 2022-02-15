package fms;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner login = new Scanner(System.in);
		String Name,Password;
		System.out.print("Username : ");
		Name = login.nextLine();
		System.out.print("Password : ");
		Password = login.nextLine();
		if((Name.equals("Siva")) && (Password.equals("1234"))) {
			System.out.println("Welcome " + Name + "....");
			Admin admin = new Admin();
			
			admin.adminScreen();
		}
		else {
			System.out.println("Login Invalid");
			System.exit(0);
		}
	}
}
