package fms;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin {
	public void adminScreen() throws IOException {
		List<OneClickOneCaf> Oc = new ArrayList<OneClickOneCaf>(); 
		Scanner s = new Scanner(System.in);
		int ch;
		do {
		System.out.println("------------------------------");
		System.out.println("1. CAF Entry");
		System.out.println("2. Account");
		System.out.println("Choose what you gone uh do..");
		ch = s.nextInt();
		switch(ch) {
			case 1:
				Oc = OneClickOneCaf.CustomerDetails();
				System.out.println(Oc);
				break;
			case 2:
				DummyAccount.dummy();
				break;
			default:System.out.println("Choose anyone option");
			break;
			}
		}while(ch!=0);
	}

}

