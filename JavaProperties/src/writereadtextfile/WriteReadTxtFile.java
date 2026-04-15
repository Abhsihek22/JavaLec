package writereadtextfile;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriteReadTxtFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        // Creating an Txt file
		File file=new File("D:\\Rahul Arora\\Files for Parcts\\Mytextfile.txt");
		file.createNewFile();
		
		//Writing in a txt file 
		
		FileWriter fw=new FileWriter("D:\\Rahul Arora\\Files for Parcts\\Mytextfile.txt");
		BufferedWriter filewriter=new BufferedWriter(fw);
		
		filewriter.write("Hello World");
		filewriter.newLine();
		filewriter.write("Welcome to Java Programming");
		filewriter.write("This is a text file.");
		filewriter.newLine();
		filewriter.write("Have a great day!");
		filewriter.write("There two courses lauched in Way2Automation");
		filewriter.newLine();
		filewriter.write("1. Selenium WebDriver with Java");
		filewriter.newLine();
		filewriter.write("2. API Testing with Rest Assured");
		filewriter.flush();
		
		
		//Reading a txt file
		
		FileReader fr=new FileReader("D:\\Rahul Arora\\Files for Parcts\\Mytextfile.txt");
		BufferedReader filereader=new BufferedReader(fr);
		
		//looping use to read the file
		
		String i="";
		while((i=filereader.readLine())!=null)
		{
			System.out.println(i);
		}
		
		filereader.close();
	}

}
