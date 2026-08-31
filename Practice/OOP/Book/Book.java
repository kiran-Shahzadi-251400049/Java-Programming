import java.util.Scanner;
public class Book{
	private int bookId;
	private int pages;
	private double price;


//Constructors

	public Book(){
		bookId=0;
		pages=0;
		price=0;
	}//Default Constructor

	public Book(int id){
		bookId=id;
	}//1-Argument Constructor

	public Book(int id, int p){
		bookId=id;
		pages=p;
	}//2-Argument Constructor

	public Book(int id, int p, double pr){
		bookId=id;
		pages=p;
		price=pr;
	}//3-Argument Constructor

	public Book(Book b){
		b.bookId = this.bookId;
		b.pages = this.pages;
		b.price = this.price;
	}//Copy Constructor

	public void display(){
		System.out.println("BookId = "+bookId);
		System.out.println("Pages = "+pages);
		System.out.print("Price = "+price);
	}//display

//Setters

	public void setBookId(int b){
		bookId=b;
	}//set-day

	public void setPages(int p){
		pages=p;
	}//set-day

	public void setPrice(double pr){
		price=pr;
	}//set-day

//Getters

	public int getBookId(){
		return bookId;
	}//get-bookId

	public int getPages(){
		return pages;
	}//get-page

	public double getPrice(){
		return price;
	}//get-price

//Member Methods
	public boolean isLarger(Book b){
		if(this.pages>b.pages){
			return true;
		}
		else{			
			return false;
		}	
	}//isLarger

	public boolean isExpensive(Book b){
		if(this.price>b.price){
			return true;
		}
		else{			
			return false;
		}	
	}//isExpensive

	public void Copy(Book b){
		b.bookId = this.bookId;
		b.pages = this.pages;
		b.price = this.price;
	}//Copy

	public String toString(){
		return "Book ID: "+bookId +", Pages: "+pages +"Price: "+price;
	}//toString

	public boolean isEqual(Book b){
		if(this.bookId==b.bookId && this.pages==b.pages && this.price==b.pages){
			return true;
		}
		else{
			return false;
		}
	}//isEqual

	public Book create(Book b){
		Book bk= new Book();
		bk.bookId = this.bookId + b.bookId;
		bk.pages = this.pages + b.pages;
		bk.price = this.price + b.price;
		return bk;
	}//create


}//class-book