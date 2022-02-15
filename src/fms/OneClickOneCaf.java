package fms;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class OneClickOneCaf {
	private String CustomerName,CustomerFatherName,Nationality,CustomerHouseNo,CustomerVillage,CustomerCity,CustomerDistrict,CustomerState;
	private int dd,mm,yy;
	private CAFEntry c;
	private long CustomerPhoneNumber;
	
	OneClickOneCaf(String CustomerName, String CustomerFatherName, int dd, int mm, int yy, String Nationality, long CustomerPhoneNumber, String CustomerHouseNo, String CustomerVillage, String CustomerCity, String CustomerDistrict, String CustomerState){
		this.CustomerName = CustomerName;
		this.CustomerFatherName = CustomerFatherName;
		this.dd = dd;
		this.mm = mm;
		this.yy = yy;
		this.Nationality = Nationality;
		this.CustomerPhoneNumber = CustomerPhoneNumber;
		this.CustomerHouseNo = CustomerHouseNo;
		this.CustomerVillage = CustomerVillage;
		this.CustomerCity = CustomerCity;
		this.CustomerDistrict = CustomerDistrict;
		this.CustomerState = CustomerState;
	}
	
	public String getCustomerName() {
		return CustomerName;
	}
	public String getCustomerFatherName() {
		return CustomerFatherName;
	}
	public int getdd() {
		return dd;
	}
	public int getmm() {
		return mm;
	}
	public int getyy() {
		return yy;
	}
	public String getNationality() {
		return Nationality;
	}
	public long getCustomerPhoneNumber() {
		return CustomerPhoneNumber;
	}
	public String getCustomerHouseNo( ) {
		return CustomerHouseNo;
	}
	public String getCustomerVillage() {
		return CustomerVillage;
	}
	public String getCustomerCity() {
		return CustomerCity;
	}
	public String getCustomerDistrict() {
		return CustomerDistrict;
	}
	public String getCustomerState() {
		return CustomerState;
	}
	
	public CAFEntry getCAFEntry() {
		return this.c;
	}
	
	public void setCAFEntry(CAFEntry c) {
		this.c = c;
	}
	
	public String toString() {
		return CustomerName + " " + CustomerFatherName + " " + dd + " " + mm + " " + yy + " " + Nationality + " " + CustomerPhoneNumber + " " + CustomerHouseNo + " " + CustomerVillage + " " + CustomerCity + " " + CustomerDistrict + " " + CustomerState;
	}
	
	public static List<OneClickOneCaf> CustomerDetails() throws FileNotFoundException {
			List<OneClickOneCaf> customer = new ArrayList<OneClickOneCaf>();
			Scanner s = new Scanner(System.in);
			Scanner s1 = new Scanner(System.in);
			int ch;
			do {
				System.out.println("---------------------------");
				System.out.println("1. Enter Customer Details : ");
				System.out.println("2. View Customer Details : ");
				ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("---------------------------");
				System.out.println("Enter CustomerName : ");
				String CustomerName = s1.nextLine();
				System.out.println("Enter CustomerFatherName : ");
				String CustomerFatherName = s1.nextLine();
				System.out.println("Enter Customer DOB : ");
				int dd = s.nextInt();
				int mm = s.nextInt();
				int yy = s.nextInt();
				System.out.println("Enter CustomerNationality : ");
				String Nationality = s1.nextLine();
				System.out.println("Enter CustomerPhoneNumber : ");
				long CustomerPhoneNumber = s.nextLong();
				System.out.println("Enter CustomerHouseNo : ");
				String CustomerHouseNo = s1.nextLine();
				System.out.println("Enter CustomerVillage : ");
				String CustomerVillage = s1.nextLine();
				System.out.println("Enter CustomerCity : ");
				String CustomerCity = s1.nextLine();
				System.out.println("Enter CustomerDistrict : ");
				String CustomerDistrict = s1.nextLine();
				System.out.println("Enter CustomerState : ");
				String CustomerState = s1.nextLine();
				OneClickOneCaf a = new OneClickOneCaf(CustomerName,CustomerFatherName,dd,mm,yy,Nationality,CustomerPhoneNumber,CustomerHouseNo, CustomerVillage, CustomerCity, CustomerDistrict, CustomerState);
				CAFEntry c = CAFEntry.connection(); 
				a.setCAFEntry(c);
				customer.add(a);
				break;
			case 2:Account.Customer(customer);
			break;
			default:System.out.println("Choose anyone option");
			break;
			}
			System.out.println("---------------------------");
			}while(ch!=0);
			return customer;	
		}
	}
