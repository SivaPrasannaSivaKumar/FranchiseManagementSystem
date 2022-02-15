package fms;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DummyAccount {

	public static void dummy() throws FileNotFoundException {
			// TODO Auto-generated method stub
			File dummy = new File("C:\\Users\\sivap\\Documents\\DummyText.txt");
			Scanner scan = new Scanner(dummy);
			while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
	}
}
