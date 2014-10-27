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
    	return ("��ţ�"+this.num+"\n"+"������"+this.name+"\n"+"���ߣ�"+this.author+"\n"+"�����磺"+this.press+"\n"+"�������ڣ�"+this.date+"\n\n");
    }

}
