package homework;

public class BoardExample {

	public static void main(String[] args) {
		Board board1 = new Board() ;
		
		Board board2 = new Board(3) ;
		Board board3 =new Board("title") ;
		
		Board board4 = new Board(3,"title") ;
		Board board5 =new Board("title",3) ;
		Board board6 =new Board("title","content") ;
		
		Board board7 =new Board(3,"title","content") ;
		Board board8 =new Board("title",3,"content") ;
		Board board9 =new Board("title","content",3) ;
		Board asd =new Board("title","content","writer") ;

		
		Board boasdard1 =new Board(3,"title", "content", "writer") ;
		Board df =new Board("title",3, "content", "writer") ;
		Board boaasdrd1 =new Board("title", "content",3, "writer") ;
		Board boaasdard1 =new Board("title", "content","writer",3)  ;
		Board bosadard1 =new Board("title", "content", "writer", "date") ;
		
		
		Board bodaard1 =new Board(3,"title", "content", "writer", "date") ;
		Board boasdrd1 =new Board("title", 3, "content", "writer", "date") ;
		Board bodfgard1 =new Board("title", "content", 3, "writer", "date") ;
		Board basoaasdrd1 =new Board("title", "content", "writer", 3, "date") ;
		Board boxcard1 =new Board("title", "content", "writer", "date", 3) ;
	}

}
