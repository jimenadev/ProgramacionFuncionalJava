package main;

public class Book {

	private String title;
	private int copies;
	
	public Book(String title, int copies) {
		super();
		this.title = title;
		this.copies = copies;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}
	
}
