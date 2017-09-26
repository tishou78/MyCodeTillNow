package FilesAndExceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Demo {

	public static void main(String[] args) throws IOException {

		File myDir = new File("D:\\myDir");
		myDir.mkdir();
		File file = new File(myDir, "myTempFile.txt");
		file.createNewFile();
	
		PrintWriter writer = new PrintWriter(file);
		writer.println("bye" + System.lineSeparator());
		writer.println("Hello word" + System.lineSeparator());
		writer.println("My name is Tisho" + System.lineSeparator());
		writer.flush();
		writer.close();
		
		FileReader fr = new FileReader(file);
		BufferedReader reader = new BufferedReader(fr);
		
		String s;
		while ((s = reader.readLine()) != null) {
			System.out.println(s);
		}
		reader.close();
		file.delete();
		myDir.delete();
		

	}

}
