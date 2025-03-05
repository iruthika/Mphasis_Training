package oops.Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class exp1 {
public static void main(String[] args) {
	Path path=Paths.get("src/bytetest.txt");
	//File file=new file("src/bytetest.txt");
	try {
		byte[] bs=Files.readAllBytes(path);
		List<String>linesData =Files.readAllLines(path);
		System.out.println("Reading byte: "+new String(bs));
		System.out.println("Reading List of lines: "+linesData);;
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	
}
}
