package oops.Files;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class exp4 {
	public static void main(String[] args) {
		List<String> data=null;
		try(Stream<String> strm=Files.lines(Paths.get("src/chartest.txt"))){
			strm.forEach(System.out::println);
			data=strm.filter
			(str->str.startsWith("c")).
			map(String::toUpperCase).toList();
			System.out.println(data);
		}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
		
	}
	
