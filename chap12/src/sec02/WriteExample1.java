package sec02;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws IOException {
		Writer writer = new FileWriter("C:/Temp/Test1.txt");
		
		char a ='A';
		char b ='B';
		char c ='C';
		
		writer.write(a);
		writer.write(b);
		writer.write(c);
		
		writer.flush();
		writer.close();
	}

}
