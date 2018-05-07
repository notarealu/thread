import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Queue2 {
	
	public static LinkedList<Car> addCar(LinkedList<Car> list, Car car){
			list.add(car);

		return list;
		
	}
	
	public List<Car> removeCar(List<Car> list){
		
		list.remove(0);
		
		return list;
	}
	
	public void sizeOfLine(List<Car> list){
		
		System.out.println(list.size());
		
	}
	
	public Car peekFirstCar(List<Car> list) {
		
		if (list.isEmpty()) {
			return null;
		}
		
		else
			return list.get(0);
		
	}
}