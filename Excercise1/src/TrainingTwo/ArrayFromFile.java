package TrainingTwo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class ArrayFromFile {
	public static void main(String args[]){
		

		List<Integer> list1 = new ArrayList<Integer>();
		List<Integer> list2 = new ArrayList<Integer>();
		List<Integer> list3 = new ArrayList<Integer>();
		List<Integer> list4 = new ArrayList<Integer>();
		File file1 = new File("D:\\FileArray1.txt");
		File file2 = new File("D:\\FileArray2.txt");
		File file3 = new File("D:\\FileArray3.txt");
		BufferedReader reader = null;

		try {
		    reader = new BufferedReader(new FileReader(file1));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
		        list1.add(Integer.parseInt(text));
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}

		
		try {
		    reader = new BufferedReader(new FileReader(file2));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
		        list2.add(Integer.parseInt(text));
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}
		try {
		    reader = new BufferedReader(new FileReader(file3));
		    String text = null;

		    while ((text = reader.readLine()) != null) {
		        list3.add(Integer.parseInt(text));
		    }
		} catch (FileNotFoundException e) {
		    e.printStackTrace();
		} catch (IOException e) {
		    e.printStackTrace();
		} finally {
		    try {
		        if (reader != null) {
		            reader.close();
		        }
		    } catch (IOException e) {
		    }
		}
		list3.removeAll(list1);
		list3.removeAll(list2);
		list4.addAll(list3);
		try{
		    PrintWriter writer = new PrintWriter("D:\\FileArray4.txt");
		    writer.println(list4);
		    
		    writer.close();
		} catch (Exception e) {
		   System.out.println("Exception occured: " + e);
		}
	

	}
}
