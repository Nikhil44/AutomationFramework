package rest.api.testing;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Rectangle implements Serializable {

	private double height;
	private double width;

	public Rectangle(double height, double width) {
		this.height = height;
		this.width = width;
	}
public static void main(String[] args) {
	Rectangle rect = new Rectangle(18,78);
	SerializeToFile(rect, "Serialized");
	
	
			DeSerializeFromFileToObject("Serialized");
	System.out.println("Rect area is " + rect.Area());
}
	
	
	public double Area() {
		return height * width;
	}

	public double Perimeter() {
		return 2 * (height + width);
	}


	public static void SerializeToFile(Object classObject, String FileName) {
		
		
		try {
			FileOutputStream fileStream = new FileOutputStream(FileName);
			ObjectOutputStream onbjectStream = new ObjectOutputStream(fileStream);
			onbjectStream.writeObject(classObject);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
			
		}
		
		
	}
	public static Object  DeSerializeFromFileToObject(String fileName) {
		
		
		try {
			FileInputStream fileStream = new FileInputStream(fileName);
			ObjectInputStream objectStream = new ObjectInputStream(fileStream);
			Object deserializeObject =objectStream.readObject();
			objectStream.close();
			fileStream.close();
			 return deserializeObject;
		}catch(FileNotFoundException e) {
			
			e.printStackTrace();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
		
		
		
	}
	
	}
