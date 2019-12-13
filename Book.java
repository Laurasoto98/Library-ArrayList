package lab03;


public class Book {

	  private long isbn;
	  private String author;
	  private String title;

	  public Book(long isbn, String author, String title) {
		  
	    this.isbn = isbn;
	    this.author = author;
	    this.title = title;
	  }

	  // return the author
	  public String getAuthor() {
	    return this.author;
	  }

	  // return the ISBN
	  public long getIsbn() {
	    return this.isbn;
	  }

	  // return the title
	  public String getTitle() {
	    return this.title;
	  }

	  /**
	   * Two books are considered equal if they have the same ISBN, author, and
	   * title.
	   * 
	   * @param other --
	   *          the object begin compared with "this"
	   * @return true if "other" is a Book and is equal to "this", false otherwise
	   */
	  
	  public boolean equals(Object other) {
	
				if(!(other instanceof Book)) {
					
					return false;
					
				}
				else {
					
				Book b = (Book) other; 
				
					if(b.getIsbn() == this.getIsbn() && b.getAuthor() == this.getAuthor() && b.getTitle() == this.getTitle()) {
					
						return true;
					}
				
					else {
						
						return false;
					}
				
				}
	  }
	  
	  /**
	   * Returns a string representation of the book.
	   */
	  
	  public String toString() {
	    return isbn + ", " + author + ", \"" + title + "\"";
	  }
	}