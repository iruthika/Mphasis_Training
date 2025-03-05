package oops;

import java.util.Comparator;
import java.util.Objects;
import java.util.TreeSet;

class Books implements Comparable<Books>{
	private int id;
	private String name;
	private String Author;
	private int price;
	public Books() {
		
	}
	public Books(int id,String name,String Author,int price) {
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
		return Objects.equals(Author, other.getAuthor()) && id == other.getId() && Objects.equals(name, other.getName())
				&& price == other.getPrice();
	}
	@Override
	public int compareTo(Books o) {
		return this.id-o.id;
	}
	class NameComparator1 implements Comparator<Books>{
		@Override
		public int compare(Books o1, Books o2) {
			return o1.getName().compareTo(o2.getName());
		}
	}
	
}
public class SetUsingTree{
	public static void main(String[] args) {
		TreeSet<Books>data=new TreeSet<>();
		data.add(new Books(101,"Once in a life","Dharun",2000));
		data.add(new Books(105,"Cricket Fan","nirmala",3200));
		data.add(new Books(100,"Peaceful memories","Keerthi",5200));
		data.add(new Books(103,"Experience","dhaya",2000));
		data.add(new Books(401,"Day to day","Karthika",950));
		data.add(new Books(55,"Be good Do good","Devika",500));
		data.add(new Books(10,"Life is simple","Divi",100));
		
		System.out.println("Data Before Sorting:");
		data.forEach(book->System.out.println(book.getId()+" "+book.getName()+"-"+book.getAuthor()+" "+book.getPrice()+" "));
		System.out.println();
		System.out.println("Filtered Data less than 3000:");
		data.parallelStream().filter(bk->bk.getPrice()<3000).forEach(bk->System.out.println(bk.getId()+" "+bk.getName()+"-"+bk.getAuthor()+" "+bk.getPrice()+" "));
		System.out.println();
		System.out.println("Filtered Data BTW 1000 to 6000:");
		data.parallelStream().filter(bk->bk.getPrice()>=1000 && bk.getPrice() <=6000).forEach(bk->System.out.println(bk.getId()+" "+bk.getName()+"-"+bk.getAuthor()+" "+bk.getPrice()+" "));
		System.out.println();
		System.out.println("Printing only the data which starts from Small letter");
		
	}
}
