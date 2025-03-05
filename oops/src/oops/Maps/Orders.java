package oops.Maps;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
class Order{
	private int id;
	private String Name;
	private int price;
	private String Month;
	private int year;
	private String City;
	private String Category;
	private int Qty;
	
	public Order() {
		
	}
	public Order(int id,String Name,int price,String Month,int year,String City,String Category,int Qty) {
		this.id=id;
		this.Name=Name;
		this.price=price;
		this.Month=Month;
		this.year=year;
		this.City=City;
		this.Category=Category;
		this.Qty=Qty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getMonth() {
		return Month;
	}
	public void setMonth(String month) {
		Month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getQty() {
		return Qty;
	}
	public void setQty(int qty) {
		Qty = qty;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", Name=" + Name + ", price=" + price + ", Month=" + Month + ", year=" + year
				+ ", City=" + City + ", Category=" + Category + ", Qty=" + Qty + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(Category, City, Month, Name, Qty, id, price, year);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(Category, other.Category) && Objects.equals(City, other.City)
				&& Objects.equals(Month, other.Month) && Objects.equals(Name, other.Name) 
				&& Qty == other.Qty
				&& id == other.id && price == other.price && year == other.year;
	}

}
public class Orders{
	    //1.To find the highest Quantity order
		public static void getHighestQuantity(List<Order> OrderInfo) {
			Optional<Order> highestOrder = OrderInfo.stream().
					max(Comparator.comparing(Order :: getQty));
			//optional is used to ignore the null pointer exception.
			Order hghOrd = highestOrder.get();
			System.out.println("The Highest Order Quantity : ");
			System.out.println("-----------------------------------");
			System.out.println("ID : "+hghOrd.getId());
			System.out.println("Name : "+hghOrd.getName());
			System.out.println("Category : "+hghOrd.getCategory());
			System.out.println("Price : "+hghOrd.getPrice());
			System.out.println("Quantity : "+hghOrd.getQty());
		}
		
		//2.To find out category wise orders
		public static void getCategorywiseOrder(List<Order> OrderInfo) {
			Map<String, List<Order>> ctgOrd = OrderInfo.stream().
					collect(Collectors.groupingBy(Order :: getCategory));
			for(String k : ctgOrd.keySet()) {
				System.out.println("Category :: "+k);
				List<Order> ctg = ctgOrd.get(k);
				for(Order ct : ctg) {
					System.out.println(ct);
				}
			}
		}
		
		//3.To print max price
		public static void getMaxPrice(List<Order> OrderInfo) {
			Optional<Order> maxPrice = OrderInfo.stream().
					max(Comparator.comparing(Order :: getPrice));
			Order maxPrc = maxPrice.get();//moving data from optional class to Order class;
			System.out.println("The Maximum Price : ");
			System.out.println("=========================================");
			System.out.println("ID : "+maxPrc.getId());
			System.out.println("Name : "+maxPrc.getName());
			System.out.println("Category : "+maxPrc.getCategory());
			System.out.println("Price : "+maxPrc.getPrice());
		}
		
		//4.Average monthly spending in cake
		public static void getAvg(List<Order> OrderInfo) {
			Map<String, Double> avgSpend=OrderInfo.stream().
					collect(Collectors.groupingBy(Order :: getCategory,Collectors.
							averagingDouble(Order :: getPrice )));
			System.out.println("The Average of each Category : ");
			System.out.println("=========================================");
			avgSpend.forEach((k,v)->System.out.println(k+" "+v));
		}
		
		//5.find minimum order price in the total orders
		public static void getMinOrderPrice(List<Order> OrderInfo) {
			Optional<Order> minPrice = OrderInfo.stream().
					min(Comparator.comparing(Order :: getPrice));
			Order minPrc = minPrice.get();
			System.out.println("The Minimum Price : ");
			System.out.println("=====================================");
			System.out.println("ID : "+minPrc.getId());
			System.out.println("Name : "+minPrc.getName());
			System.out.println("Category : "+minPrc.getCategory());
			System.out.println("Price : "+minPrc.getPrice());
		}
		
		//6.find out the first order of the customer
		public static void getFirstOrder(List<Order> OrderInfo) {
			Optional<Order> firstOrder = OrderInfo.stream().
					sorted(Comparator.comparing(Order :: getName)).findFirst();
			Order fstOrder = firstOrder.get();
			System.out.println("First Order : ");
			System.out.println("=====================================");
			System.out.println("ID : "+fstOrder.getId());
			System.out.println("Name : "+fstOrder.getName());
			System.out.println("Category : "+fstOrder.getCategory());
		}
		
	public static void main(String[] args) {
		List<Order> OrderInfo=new ArrayList<Order>();
	      OrderInfo.add(new Order(101,"Keerthi",450,"Feb",2021,"Neyveli","Cake",2));
	      OrderInfo.add(new Order(110,"Koushi",900,"Nov",2024,"Chennai","Chocolate",7));
	      OrderInfo.add(new Order(141,"Kishore",320,"Oct",2021,"Neyveli","Cake",2));
	      OrderInfo.add(new Order(132,"Siva",730,"Jan",2022,"Pune","Cake",5));
	      OrderInfo.add(new Order(165,"Sudha",380,"Sept",2009,"Mumbai","Biscuits",6));
	      OrderInfo.add(new Order(137,"Dharun",310,"Apr",2007,"Hyderabad","Biscuits",6));
	      OrderInfo.add(new Order(139,"Suresh",950,"Sept",2006,"Villupuram","Cake",8));
	      OrderInfo.add(new Order(138,"Babu",630,"Apr",2008,"Delhi","Biscuits",3));
	      
	      Orders.getHighestQuantity(OrderInfo);
	      System.out.println();
	      Orders.getCategorywiseOrder(OrderInfo);
	      System.out.println();
	      Orders.getMaxPrice(OrderInfo);
	      System.out.println();
	      Orders.getAvg(OrderInfo);
	      System.out.println();
	      Orders.getMinOrderPrice(OrderInfo);
	      System.out.println();
	      Orders.getFirstOrder(OrderInfo);
	      System.out.println();
	      
	}
}
