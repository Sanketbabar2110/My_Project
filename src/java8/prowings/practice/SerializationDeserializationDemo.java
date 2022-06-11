package java8.prowings.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class subRiver implements Serializable {
	String name;

	public subRiver(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "subRiver [name=" + name + "]";
	}
}

public class SerializationDeserializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		subRiver river = new subRiver("Ganga");
		
		File f = new File("Rivers.ser");
		f.createNewFile();
		
		FileOutputStream fos = new FileOutputStream("Rivers.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(river);
		
		FileInputStream fis = new FileInputStream("Rivers.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		subRiver r1 = (subRiver) ois.readObject();
		oos.close();
		ois.close();
		System.out.println(r1);
	}
}































