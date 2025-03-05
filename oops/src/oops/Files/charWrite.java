package oops.Files;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class charWrite {
	public static void main(String[] args) {
		FileWriter fw=null;
		BufferedWriter bw=null;
		try {
			fw=new FileWriter("src/chartest.txt");
		    bw =new BufferedWriter(fw);
		String msg ="This is a Sample msg";
		bw.write(msg);	
		System.out.println("done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				bw.close();//first close bw then fw;
				fw.close();
				
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
