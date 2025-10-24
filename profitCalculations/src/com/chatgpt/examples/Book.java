package com.chatgpt.examples;

public class Book {
     private String title;
     Book(String title){
    	 this.title=title;
     }
     
	
	public String getTitle() {
		return title;
	}


	 public void setTitle(String title) {
		 this.title = title;
	 }


	public String toString() {
		return "Book [title=" + title + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b1= new Book("ok");
		System.out.println(b1.toString());
		Book b2 =b1;
	     b2.setTitle("Junaid");
	     System.out.println(b2.getTitle());
	     System.out.println(b1.toString());

	}

}
