package book;

import java.util.Hashtable;
import java.util.Vector;


public class Library {
	private Hashtable<String, Book> numlist;
	private Hashtable<String, Book> namelist;
	private Hashtable<String, Vector<Book>> authorlist;
	private Hashtable<String, Vector<Book>> presslist;
	private Hashtable<String, Book> datelist;

	public Hashtable<String, Book> getnumlist() {
		return numlist;
	}

	public Hashtable<String, Book> getnamelist() {
		return namelist;
	}

	public Hashtable<String, Vector<Book>> getauthorlist() {
		return authorlist;
	}

	public Hashtable<String, Vector<Book>> getpresslist() {
		return presslist;
	}

	public Hashtable<String, Book> getdatelist() {
		return datelist;
	}

	public Library() {
		numlist = new Hashtable<String, Book>();
		namelist = new Hashtable<String, Book>();
		authorlist = new Hashtable<String, Vector<Book>>();
		presslist = new Hashtable<String, Vector<Book>>();
		datelist = new Hashtable<String, Book>();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	public void addBook(Book aBook) {
		numlist.put(aBook.getNum(), aBook);
		namelist.put(aBook.getName(), aBook);
		if (!authorlist.containsKey(aBook.getAuthor())) {
			authorlist.put(aBook.getAuthor(), new Vector<Book>());
		}
		authorlist.get(aBook.getAuthor()).add(aBook);
		if (!presslist.containsKey(aBook.getPress())) {
			presslist.put(aBook.getPress(), new Vector<Book>());
		}
		presslist.get(aBook.getPress()).add(aBook);
			datelist.put(aBook.getDate(), aBook);
	}
	private void removeBook (Book aBook){
		numlist.remove(aBook.getNum());
        namelist.remove(aBook.getName());
        authorlist.get(aBook.getAuthor()).remove(aBook);
        if(authorlist.get(aBook.getAuthor()).isEmpty()){
        	authorlist.remove(aBook.getAuthor());
        }
        presslist.get(aBook.getPress()).remove(aBook);
        if(presslist.get(aBook.getPress()).isEmpty()){
        	presslist.remove(aBook.getPress());
        }
        datelist.remove(aBook.getDate());		
	}
	public boolean removeBook(String aName){
		if (namelist.get(aName)==null) {
			return false;
		}else{
			removeBook(namelist.get(aName));
		    return true;
		}
	}
}
