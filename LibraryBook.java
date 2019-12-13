package lab03;

import java.util.GregorianCalendar;


public class LibraryBook extends Book{
	
	String bookHolder;
	GregorianCalendar calendar;
	
	
	public LibraryBook(long isbn, String author, String title) {
		
		super(isbn, author, title);	
		
	}
	
	public String getHolder() {
		
		return bookHolder;
	}
	
	public GregorianCalendar getDueDate() {
		
		
		return calendar;
	}
	public void checkin() {
		
		bookHolder = null;
		calendar.clear();
		
	}
	
	public void checkout(String holder, GregorianCalendar dueDate) {
		
		bookHolder = holder;
		calendar =  dueDate;
		
	}	
	
	

}
