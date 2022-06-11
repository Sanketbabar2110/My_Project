package java8.prowings.practice;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class ReflectionAPI {
	public static void main(String[] args) throws Exception {
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(19);
		myList.add(null);
		System.out.println("size -------> "+ myList.size());
		System.out.println("capacity ---> "+getCapacity(myList));
	}
	static int getCapacity(ArrayList<Integer> list) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		Field field = ArrayList.class.getDeclaredField("elementData");
		field.setAccessible(true);
		int capacity = ((Object[])field.get(list)).length;
		return capacity;
	}
}
