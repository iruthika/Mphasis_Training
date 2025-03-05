package oops.Files;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SerialDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner((System.in));
		System.out.println("Enter ID: ");
		int id=sc.nextInt();
		System.out.println("Enter Name: ");
		String name=sc.next();
		System.out.println("Enter City: ");
		String city=sc.next();
		System.out.println("Enter PinCode: ");
		int pincode=sc.nextInt();
		CUstomer cusObj=new CUstomer(id,name,city,pincode);
		FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		ObjectOutputStream objout=null;
		try {
			fout=new FileOutputStream("src/customer.txt");
			bout=new BufferedOutputStream(fout);
			objout=new ObjectOutputStream(bout);
			objout.writeObject(cusObj);
			System.out.println("Done.");
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				objout.close();
				bout.close();
				fout.close();
		
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
