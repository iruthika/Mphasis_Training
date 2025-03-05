package oops.Files;

import java.io.File;
import java.io.FileOutputStream;

public class ByteStream {
	public static void main(String[] args) {
		FileOutputStream fout=null;
		try {
		File file=new File("src/bytetest.txt");
		fout=new FileOutputStream(file);
		String msg = "This is an example";
		fout.write(msg.getBytes());//getBytes converts string object to array of Bytes;
		System.out.println("done");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try {
				if(fout==null){
					fout.close();
					}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
