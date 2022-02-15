package fms;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Account extends OneClickOneCaf{

	Account(String CustomerName, String CustomerFatherName, int dd, int mm, int yy, String Nationality,long CustomerPhoneNumber, String CustomerHouseNo, String CustomerVillage, String CustomerCity,String CustomerDistrict, String CustomerState) {
		super(CustomerName, CustomerFatherName, dd, mm, yy, Nationality, CustomerPhoneNumber, CustomerHouseNo, CustomerVillage,CustomerCity, CustomerDistrict, CustomerState);
	}
	
	public static void Customer(List<OneClickOneCaf> customerAccount) throws FileNotFoundException {
			Scanner sc =  new Scanner(System.in);
			int ch;
			do {
				System.out.println("1. Display Customer Account");
				System.out.println("2. Search Customer Account");
				System.out.println("3. Delete Customer Account");
				System.out.println("4. Update Customer Account");
				ch = Integer.parseInt(sc.nextLine());
				switch(ch) {
					/////////////Display//////////////
				case 1:{
					System.out.println("---------------------------------------------");
					DummyAccount.dummy();
					Iterator<OneClickOneCaf> i = customerAccount.iterator();
					while(i.hasNext()) {
						OneClickOneCaf c = i.next();
						System.out.println(c + " " + c.getCAFEntry());
					}
					System.out.println("---------------------------------------------");
					break;
				}
					
					////////////SEARCH/////////////////
				case 2:{
					boolean found = false;
					System.out.println("Enter CustomerName to Search : ");
					String CustomerName = sc.nextLine();
					System.out.println("---------------------------------------------");
					Iterator<OneClickOneCaf> i = customerAccount.iterator();
					while(i.hasNext()) {
						OneClickOneCaf c = i.next();
						if(c.getCustomerName().equals(CustomerName)) {
							System.out.println(c + " " + c.getCAFEntry() );
							found = true;
						}
					}
					if(!found) {
						System.out.println("Customer Record not found.");
					}
					System.out.println("---------------------------------------------");
					break;
				}
					
					//////////////DELETE///////////////////
				case 3:{
					boolean found = false;
					System.out.println("Enter CustomerName to Delete : ");
					String CName = sc.nextLine();
					System.out.println("---------------------------------------------");
					Iterator<OneClickOneCaf> i = customerAccount.iterator();
					while(i.hasNext()) {
						OneClickOneCaf c = i.next();
						if(c.getCustomerName().equals(CName)) {
							i.remove();
							found = true;
						}
					}
					if(!found) {
						System.out.println("Customer Record not found.");
					}
					else {
						System.out.println("Customer Record is deleted Successfully.");
					}
					System.out.println("---------------------------------------------");
					break;
				}
					
					//////////////UPDATE///////////////
				case 4:{
					boolean found = false;
					System.out.println("Enter CustomerName to Update : ");
					String CName = sc.nextLine();
					ListIterator<OneClickOneCaf> CustomerUpdate = customerAccount.listIterator(); 
					while(CustomerUpdate.hasNext()) {
						OneClickOneCaf c = CustomerUpdate.next();
						if(c.getCustomerName().equals(CName)) {//switch case
							System.out.print("Enter CustomerFatherName : ");
							String CustomerFatherName = sc.nextLine();
							System.out.print("Enter Custome DOB : ");
							int dd = Integer.parseInt(sc.nextLine());
							int mm = Integer.parseInt(sc.nextLine());
							int yy = Integer.parseInt(sc.nextLine());
							System.out.print("Enter CustomerNationality : ");
							String Nationality = sc.nextLine();
							System.out.print("Enter CustomerPhoneNumber : ");
							long CustomerPhoneNumber = Long.parseLong(sc.nextLine());
							System.out.print("Enter CustomerHouseNo : ");
							String CustomerHouseNo = sc.nextLine();
							System.out.print("Enter CustomerVillage : ");
							String CustomerVillage = sc.nextLine();
							System.out.print("Enter CustomerCity : ");
							String CustomerCity = sc.nextLine();
							System.out.print("Enter CustomerDistrict : ");
							String CustomerDistrict = sc.nextLine();
							System.out.print("Enter CustomerState : ");
							String CustomerState = sc.nextLine();
							OneClickOneCaf a = new OneClickOneCaf(CName,CustomerFatherName,dd,mm,yy,Nationality,CustomerPhoneNumber,CustomerHouseNo, CustomerVillage, CustomerCity, CustomerDistrict, CustomerState);
							CAFEntry ce = CAFEntry.connection(); 
							a.setCAFEntry(ce);
							CustomerUpdate.set(a);
							
							found = true;
						}
					}
					if(!found) {
						System.out.println("Customer Record not found.");
					}
					else {
						System.out.println("Customer Record is Updated Successfully.");
					}
					break;
				}
					
				}
			}while(ch!=0);
		}
}
