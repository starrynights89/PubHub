package examples.pubhub.model;

public class Tag extends Book {
	
	private String isbn13;			// International Standard Book Number, unique
	private String tag;
	
	private byte[] content;
	
	// Default constructor
	public Tag() {
		this.isbn13 = null;
		this.tag = null;
		this.content = null;
	}
	
	public String getIsbn13() {
		return isbn13;
	}

	public void setIsbn13(String isbn13) {
		this.isbn13 = isbn13;
	}
	
	public String getTag() {
		return tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}
	
	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}
}
