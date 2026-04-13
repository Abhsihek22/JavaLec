package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestCase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties Prop = new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\config\\object.properties");
		Prop.load(fis);
		

		System.out.println(Prop.getProperty("name"));
		
		System.out.println(Prop.getProperty("Age"));
		System.out.println(System.getProperty("user.dir"));

	}

}
