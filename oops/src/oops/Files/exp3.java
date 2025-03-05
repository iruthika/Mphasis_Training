package oops.Files;

import java.io.FileWriter;

public class exp3 {
	public static void main(String[] args) {
		try(FileWriter fw= new FileWriter("src/resourcetest.txt")){
			fw.write("This is a simple try with resources.");
			System.out.println("Done.");
			fw.flush();//to release data on to the file;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
