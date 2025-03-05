package oops;

import java.util.HashSet;
import java.util.Objects;

class Book{
	private int id;
	private String name;
	private String Author;
	private int price;
	public Book() {
		
	}
	public Book(int id,String name,String Author,int price) {
		this.Author=Author;
		this.id=id;
		this.name=name;
		this.price=price;
	}
	//right click>source>generate getter setter;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	//right click>source>generate hashcode() and equals;
	
	@Override
	public int hashCode() {
		return Objects.hash(Author, id, name, price);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(Author, other.Author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}
	
}
public class setTwo {
	public static void main(String[] args) {
	HashSet<Book>data=new HashSet<>();
		
		data.add(new Book(101,"Once in a life","Dharun",2000));
		data.add(new Book(105,"Cricket Fan","nirmala",3200));
		data.add(new Book(100,"Peaceful memories","Keerthi",5200));
		data.add(new Book(103,"Experience","dhaya",2000));
		data.add(new Book(401,"Day to day","Karthika",950));
		data.add(new Book(55,"Be good Do good","Devika",500));
		data.add(new Book(10,"Life is simple","Divi",100));
		
		System.out.println("Data Before Sorting:");
		data.forEach(book->System.out.println(book.getId()+" "+book.getName()+"-"+book.getAuthor()+" "+book.getPrice()+" "));
		System.out.println();
		System.out.println("Filtered Data less than 3000:");
		data.parallelStream().filter(bk->bk.getPrice()<3000).forEach(bk->System.out.println(bk.getId()+" "+bk.getName()+"-"+bk.getAuthor()+" "+bk.getPrice()+" "));
		System.out.println();
		System.out.println("Filtered Data BTW 1000 to 6000:");
		data.parallelStream().filter(bk->bk.getPrice()>=1000 && bk.getPrice() <=6000).forEach(bk->System.out.println(bk.getId()+" "+bk.getName()+"-"+bk.getAuthor()+" "+bk.getPrice()+" "));
		System.out.println();
		System.out.println("Printing only the data which strats from Small letter");
		
	}
}
