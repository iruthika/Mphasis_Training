package oops.Files;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;

public class exp2 {
	public static void main(String[] args) {
		Path srcpath=Paths.get("src/bytetest.txt");
		Path targetPath=Paths.get("src/chartest.txt");
		try {
			Path path=Files.copy(srcpath, 
			targetPath, StandardCopyOption.REPLACE_EXISTING);
			
			System.out.println("Target file location :-"+path);
			System.out.println("Copied content: "+new String(Files.readAllBytes(path)));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
