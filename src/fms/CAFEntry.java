package fms;

import java.util.Scanner;

public class CAFEntry {
	private int broadBand,landLine;
	CAFEntry(int broadBand, int landLine){
		this.broadBand = broadBand;
		this.landLine = landLine;
	}
	public int getbroadBand() {
		return broadBand;
	}
	public int getlandLIne() {
		return landLine;
	}
	
	public void setbroadBand(int broadBand) {
		this.broadBand = broadBand;
	}
	
	public void setlandLine(int landLine) {
		this.landLine = landLine;
	}
	
	public String toString() {
		return broadBand + " " + landLine;
		
	}
	
	public static CAFEntry connection() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the broadband connection needed : ");
		int broadBand = sc.nextInt();
		System.out.print("Enter the landline connection needed : ");
		int landLine = sc.nextInt();
		CAFEntry caf = new CAFEntry(broadBand,landLine);
		return caf;
	}
}
