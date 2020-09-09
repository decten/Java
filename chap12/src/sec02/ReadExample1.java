package sec02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class ReadExample1 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/Test1.txt");
		
		while(true) {
			int data = reader.read();
			if (data == -1)
				break;
			System.out.println((char)data);
		}
		reader.close();
	}

}
