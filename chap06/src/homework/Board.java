package homework;

public class Board {
	String title;
	String content;
	String writer;
	String date;
	int hitcount;
	
	public Board() {}
	
	public Board(int hitcount) {}
	public Board(String title) {}
	
	public Board(int hitcount,String title) {}
	public Board(String title,int hitcount) {}
	public Board(String title,String content) {}
	
	public Board(int hitcount,String title,String content) {}
	public Board(String title,int hitcount,String content) {}
	public Board(String title,String content,int hitcount) {}
	public Board(String title,String content,String writer) {}

	
	public Board(int hitcount,String title, String content, String writer) {}
	public Board(String title,int hitcount, String content, String writer) {}
	public Board(String title, String content,int hitcount, String writer) {}
	public Board(String title, String content,String writer,int hitcount)  {}
	public Board(String title, String content, String writer, String date) {}
	
	
	public Board(int hitcount,String title, String content, String writer, String date) {}
	public Board(String title, int hitcount, String content, String writer, String date) {}
	public Board(String title, String content, int hitcount, String writer, String date) {}
	public Board(String title, String content, String writer, int hitcount, String date) {}
	public Board(String title, String content, String writer, String date, int hitcount) {}

}
