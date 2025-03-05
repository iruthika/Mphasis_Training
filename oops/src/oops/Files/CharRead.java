package oops.Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class CharRead {
	public static void main(String[] args) {
		FileReader fr=null;
		BufferedReader br=null;
		try {
		fr=new FileReader("src/chartest.txt");
		br=new BufferedReader(fr);
		System.out.println(br.readLine());
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			try {
				
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
