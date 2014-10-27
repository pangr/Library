package book;

public class Book {
	private String num, name, press, date,author;

	Book(String num, String name, String press, String date,String author) {
		this.num = num;
		this.name = name;
		this.press = press;
		this.date = date;
		this.author = author;
	}
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	public void setNum(String num) {
		this.num = num;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPress(String press) {
		this.press = press;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getNum() {
		return num;
	}
    public String getName() {
		return name;
	}

	public String getPress() {
		return press;
	}

	public String getDate() {
		return date;
	}

	public String getAuthor() {
		return author;
	}
    @Override
    public String toString() {
    	// TODO Auto-generated method stub
    	return ("编号："+this.num+"\n"+"书名："+this.name+"\n"+"作者："+this.author+"\n"+"出版社："+this.press+"\n"+"出版日期："+this.date+"\n\n");
    }

}
