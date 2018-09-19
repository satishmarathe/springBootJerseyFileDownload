package com.filedownload.model;

public class Book {

	private String oid;
	private String name;
	private String author;
	
	
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	@Override
	public String toString() {
		return "Book [oid=" + oid + ", name=" + name + ", author=" + author + "]";
	}
	
	
}
